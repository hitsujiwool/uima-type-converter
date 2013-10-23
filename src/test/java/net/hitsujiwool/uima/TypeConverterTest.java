package net.hitsujiwool.uima;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import junit.framework.TestCase;
import net.hitsujiwool.uima.Source;
import net.hitsujiwool.uima.Target;
import org.apache.commons.lang.StringUtils;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;
import org.uimafit.factory.AnalysisEngineFactory;
import org.uimafit.util.JCasUtil;

public class TypeConverterTest extends TestCase {
  
  private AnalysisEngine ae;
  private JCas jCas;
    
  public void testStringConverter() throws Exception {
    List<String> values = Arrays.asList("a", "b", "c");
    this.prepareEngine("src.test.desc.StringConverter");
    this.setValues("sstring", values);
    this.runEngine();
    this.assertEqualFeatureValue(jCas, "sstring", "tstring");    
  };
  
  public void testBooleanConverter() throws Exception {
    List<Boolean> values = Arrays.asList(true, false, true);
    this.prepareEngine("src.test.desc.BooleanConverter");
    this.setValues("sboolean", values);
    this.runEngine();
    this.assertEqualFeatureValue(jCas, "sboolean", "tboolean");
  }
  
  public void testFloatConverter() throws Exception {
    List<Float> values = Arrays.asList(1F, 2F, 3F);
    this.prepareEngine("src.test.desc.FloatConverter");
    this.setValues("sfloat", values);
    this.runEngine();
    this.assertEqualFeatureValue(jCas, "sfloat", "tfloat");    
  }
  
  public void testDoubleConverter() throws Exception {
    List<Double> values = Arrays.asList(0.1, 0.2, 0.3);
    this.prepareEngine("src.test.desc.DoubleConverter");
    this.setValues("sdouble", values);
    this.runEngine();
    this.assertEqualFeatureValue(jCas, "sdouble", "tdouble");        
  }
  
  public void testByteConverter() throws Exception {
    Byte[] arr = { 1, 2, 3 };
    List<Byte> values = Arrays.asList(arr);
    this.prepareEngine("src.test.desc.ByteConverter");
    this.setValues("sbyte", values);
    this.runEngine();
    this.assertEqualFeatureValue(jCas, "sbyte", "tbyte");    
  }

  public void testShortConverter() throws Exception {
    Short[] arr = { 1, 2, 3 };
    List<Short> values = Arrays.asList(arr);
    this.prepareEngine("src.test.desc.ShortConverter");
    this.setValues("sshort", values);
    this.runEngine();
    this.assertEqualFeatureValue(jCas, "sshort", "tshort");    
  }

  public void testLongConverter() throws Exception {
    List<Long> values = Arrays.asList(1L, 2L, 3L);
    this.prepareEngine("src.test.desc.LongConverter");
    this.setValues("slong", values);
    this.runEngine();
    this.assertEqualFeatureValue(jCas, "slong", "tlong");
  }

  public void testIntegerConverter() throws Exception {
    List<Integer> values = Arrays.asList(1, 2, 3);
    this.prepareEngine("src.test.desc.IntegerConverter");
    this.setValues("sinteger", values);
    this.runEngine();
    this.assertEqualFeatureValue(jCas, "sinteger", "tinteger");        
  }  
  
  public void testStringArrayConverter() throws Exception {
    this.prepareEngine("src.test.desc.StringArrayConverter");    
    StringArray arr = new StringArray(jCas, 2);
    arr.set(0, "a");
    arr.set(1, "b");    
    StringArray arr2 = new StringArray(jCas, 2);
    arr.set(0, "c");
    arr.set(1, "e");
    List<StringArray> values = Arrays.asList(arr, arr2);
    this.setValues("sstringarray", values);
    this.runEngine();
    this.assertEqualFeatureValue(jCas, "sstringarray", "tstringarray");    
  }
    
  private void prepareEngine(String desc) throws Exception {
    this.ae = AnalysisEngineFactory.createAnalysisEngine(desc);
    this.jCas = this.ae.newJCas();
  }
  
  private void runEngine() throws Exception {
    this.ae.process(this.jCas);
  }
  
  private void setValues(String featureName, List<?> values) {
    Iterator<?> iter = values.iterator();
    int i = 0;
    while (iter.hasNext()) {
      Object val = iter.next();     
      Class<?> clazz = null; 
      try {
        clazz = (Class<?>) val.getClass().getField("TYPE").get(null);
      } catch (NoSuchFieldException e) {
        clazz = val.getClass();
      } catch (IllegalAccessException e) {
        this.failedToTest(e);
      }
      try {
        Method method = Source.class.getMethod("set" + StringUtils.capitalize(featureName), clazz);
        Source s = new Source(this.jCas);   
        s.setSboolean(new Boolean(true));
        s.setBegin(i);
        s.setEnd(++i);
        method.invoke(s, val);
        s.addToIndexes();
      } catch (NoSuchMethodException e) {
        this.failedToTest(e);
      } catch (IllegalAccessException e) {
        this.failedToTest(e);        
      } catch (InvocationTargetException e) {
        this.failedToTest(e);
      }
    }
  }
  
  private void assertEqualFeatureValue(JCas jCas, String sourceFeatureName, String targetFeatureName) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    List<Object> inputs = new ArrayList<Object>();
    for (Source s : JCasUtil.select(jCas, Source.class)) {
      Object val = Source.class.getMethod("get" + StringUtils.capitalize(sourceFeatureName)).invoke(s);
      inputs.add(val);
    }
        
    List<Object> outputs = new ArrayList<Object>();
    for (Target t : JCasUtil.select(jCas, Target.class)) {
      Object val = Target.class.getMethod("get" + StringUtils.capitalize(targetFeatureName)).invoke(t);
      outputs.add(val);
    }
    System.out.println(inputs);
    System.out.println(outputs);    
    assertTrue(inputs.equals(outputs));
  }
  
  private void failedToTest(Exception e) {
    fail("Failed to execute Test. " + e.getMessage());
  }
  
  @Override
  protected void tearDown() {
    this.jCas = null;
    this.ae = null;
  }
 
}
