package net.hitsujiwool.uima;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.UimaContext;

public class TypeConverter extends JCasAnnotator_ImplBase {

  public static final String MESSAGE_DIGEST = "net.hitsujiwool.uima.TypeConverter_Messages";

  private String sourceTypeName;

  private String targetTypeName;

  private Map<String, String> conversionMap;

  @Override
  public void initialize(UimaContext ctx) throws ResourceInitializationException {
    this.sourceTypeName = (String) ctx.getConfigParameterValue("sourceType");
    this.targetTypeName = (String) ctx.getConfigParameterValue("targetType");
    String[] conversionKeys = ctx.getConfigParameterNames("conversionMap");
    this.conversionMap = new HashMap<String, String>();
    for (String key : conversionKeys) {
      String val = (String) ctx.getConfigParameterValue("conversionMap", key);
      this.conversionMap.put(key, val);
    }
  }

  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {

    Type sourceType = this.getSourceAnnotationType(jCas);
    Type targetType = this.getTargetAnnotationType(jCas);

    if (sourceType == null) {
      throw new AnalysisEngineProcessException(MESSAGE_DIGEST, "source_type_not_found_error",
              new Object[] { this.sourceTypeName });
    }

    if (targetType == null) {
      throw new AnalysisEngineProcessException(MESSAGE_DIGEST, "target_type_not_found_error",
              new Object[] { this.targetTypeName });
    }

    AnnotationIndex<Annotation> index = jCas.getAnnotationIndex(sourceType);
    FSIterator<Annotation> iter = index.iterator();

    while (iter.hasNext()) {
      this.annotate(jCas, sourceType, targetType, iter.next());
    }
  }

  private void annotate(JCas jCas, Type sourceType, Type targetType, Annotation sourceAnnotation)
          throws AnalysisEngineProcessException {
    int begin = sourceAnnotation.getBegin();
    int end = sourceAnnotation.getEnd();
    AnnotationFS targetAnnotation = jCas.getCas().createAnnotation(
            this.getTargetAnnotationType(jCas), begin, end);

    try {
      for (Feature feature : sourceType.getFeatures()) {
        if (this.hasMapTarget(feature)) {
          Feature targetFeature = targetType.getFeatureByBaseName(this.conversionMap.get(feature
                  .getShortName()));
          if (feature.getRange().isPrimitive()) {            
            Object val = this.getFeatureValue(sourceAnnotation, feature);
            this.setFeatureValue(targetAnnotation, targetFeature, val);
          } else {
            targetAnnotation.setFeatureValue(targetFeature,
                    sourceAnnotation.getFeatureValue(feature));
          }
        }
      }
      jCas.addFsToIndexes(targetAnnotation);
    } catch (IllegalAccessException e) {
      throw new AnalysisEngineProcessException(e);
    } catch (InvocationTargetException e) {
      throw new AnalysisEngineProcessException(e);      
    } catch (NoSuchMethodException e) {
      throw new AnalysisEngineProcessException(e);
    } catch (ClassNotFoundException e) {
      throw new AnalysisEngineProcessException(e);
    }
  }

  private Object getFeatureValue(AnnotationFS anno, Feature f) throws NoSuchMethodException,
          InvocationTargetException, IllegalAccessException {
    Method getter = this.createGetter(anno, f);
    return getter.invoke(anno, f);
  }

  private void setFeatureValue(AnnotationFS anno, Feature f, Object val)
          throws NoSuchMethodException, InvocationTargetException, IllegalAccessException,
          ClassNotFoundException {
    Method setter = this.createSetter(anno, f);
    setter.invoke(anno, f, val);
  }

  private Method createGetter(Object obj, Feature f) throws NoSuchMethodException {
    String typeName = f.getRange().getShortName();
    return obj.getClass().getMethod("get" + this.adaptMethodName(typeName) + "Value", Feature.class);
  }

  private Method createSetter(Object obj, Feature feature) throws NoSuchMethodException,
          ClassNotFoundException {
    String typeName = feature.getRange().getShortName();
    Class<?> wrapperClass = Class.forName("java.lang." + typeName);
    Class<?> clazz = null;
    try {
      clazz = (Class<?>) wrapperClass.getField("TYPE").get(null);
    } catch (NoSuchFieldException e) {
      clazz = wrapperClass;
    } catch (IllegalAccessException e) {
    }
    return obj.getClass().getMethod("set" + this.adaptMethodName(typeName) + "Value", Feature.class, clazz);
  }

  private String adaptMethodName(String typeName) {
    if (typeName.equals("Integer")) {
      return "Int";
    }
    return typeName;
  }
  
  private Boolean hasMapTarget(Feature f) {
    return this.conversionMap.get(f.getShortName()) != null;
  }

  private Type getSourceAnnotationType(JCas jCas) {
    return jCas.getTypeSystem().getType(this.sourceTypeName);
  }

  private Type getTargetAnnotationType(JCas jCas) {
    return jCas.getTypeSystem().getType(this.targetTypeName);
  }

}
