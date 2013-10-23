
/* First created by JCasGen Mon Oct 21 21:15:06 CEST 2013 */
package net.hitsujiwool.uima;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Oct 23 09:14:33 CEST 2013
 * @generated */
public class Target_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Target_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Target_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Target(addr, Target_Type.this);
  			   Target_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Target(addr, Target_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Target.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.hitsujiwool.uima.Target");
 
  /** @generated */
  final Feature casFeat_tstring;
  /** @generated */
  final int     casFeatCode_tstring;
  /** @generated */ 
  public String getTstring(int addr) {
        if (featOkTst && casFeat_tstring == null)
      jcas.throwFeatMissing("tstring", "net.hitsujiwool.uima.Target");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tstring);
  }
  /** @generated */    
  public void setTstring(int addr, String v) {
        if (featOkTst && casFeat_tstring == null)
      jcas.throwFeatMissing("tstring", "net.hitsujiwool.uima.Target");
    ll_cas.ll_setStringValue(addr, casFeatCode_tstring, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tboolean;
  /** @generated */
  final int     casFeatCode_tboolean;
  /** @generated */ 
  public boolean getTboolean(int addr) {
        if (featOkTst && casFeat_tboolean == null)
      jcas.throwFeatMissing("tboolean", "net.hitsujiwool.uima.Target");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_tboolean);
  }
  /** @generated */    
  public void setTboolean(int addr, boolean v) {
        if (featOkTst && casFeat_tboolean == null)
      jcas.throwFeatMissing("tboolean", "net.hitsujiwool.uima.Target");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_tboolean, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tfloat;
  /** @generated */
  final int     casFeatCode_tfloat;
  /** @generated */ 
  public float getTfloat(int addr) {
        if (featOkTst && casFeat_tfloat == null)
      jcas.throwFeatMissing("tfloat", "net.hitsujiwool.uima.Target");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_tfloat);
  }
  /** @generated */    
  public void setTfloat(int addr, float v) {
        if (featOkTst && casFeat_tfloat == null)
      jcas.throwFeatMissing("tfloat", "net.hitsujiwool.uima.Target");
    ll_cas.ll_setFloatValue(addr, casFeatCode_tfloat, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tbyte;
  /** @generated */
  final int     casFeatCode_tbyte;
  /** @generated */ 
  public byte getTbyte(int addr) {
        if (featOkTst && casFeat_tbyte == null)
      jcas.throwFeatMissing("tbyte", "net.hitsujiwool.uima.Target");
    return ll_cas.ll_getByteValue(addr, casFeatCode_tbyte);
  }
  /** @generated */    
  public void setTbyte(int addr, byte v) {
        if (featOkTst && casFeat_tbyte == null)
      jcas.throwFeatMissing("tbyte", "net.hitsujiwool.uima.Target");
    ll_cas.ll_setByteValue(addr, casFeatCode_tbyte, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tdouble;
  /** @generated */
  final int     casFeatCode_tdouble;
  /** @generated */ 
  public double getTdouble(int addr) {
        if (featOkTst && casFeat_tdouble == null)
      jcas.throwFeatMissing("tdouble", "net.hitsujiwool.uima.Target");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_tdouble);
  }
  /** @generated */    
  public void setTdouble(int addr, double v) {
        if (featOkTst && casFeat_tdouble == null)
      jcas.throwFeatMissing("tdouble", "net.hitsujiwool.uima.Target");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_tdouble, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tinteger;
  /** @generated */
  final int     casFeatCode_tinteger;
  /** @generated */ 
  public int getTinteger(int addr) {
        if (featOkTst && casFeat_tinteger == null)
      jcas.throwFeatMissing("tinteger", "net.hitsujiwool.uima.Target");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tinteger);
  }
  /** @generated */    
  public void setTinteger(int addr, int v) {
        if (featOkTst && casFeat_tinteger == null)
      jcas.throwFeatMissing("tinteger", "net.hitsujiwool.uima.Target");
    ll_cas.ll_setIntValue(addr, casFeatCode_tinteger, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tshort;
  /** @generated */
  final int     casFeatCode_tshort;
  /** @generated */ 
  public short getTshort(int addr) {
        if (featOkTst && casFeat_tshort == null)
      jcas.throwFeatMissing("tshort", "net.hitsujiwool.uima.Target");
    return ll_cas.ll_getShortValue(addr, casFeatCode_tshort);
  }
  /** @generated */    
  public void setTshort(int addr, short v) {
        if (featOkTst && casFeat_tshort == null)
      jcas.throwFeatMissing("tshort", "net.hitsujiwool.uima.Target");
    ll_cas.ll_setShortValue(addr, casFeatCode_tshort, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tlong;
  /** @generated */
  final int     casFeatCode_tlong;
  /** @generated */ 
  public long getTlong(int addr) {
        if (featOkTst && casFeat_tlong == null)
      jcas.throwFeatMissing("tlong", "net.hitsujiwool.uima.Target");
    return ll_cas.ll_getLongValue(addr, casFeatCode_tlong);
  }
  /** @generated */    
  public void setTlong(int addr, long v) {
        if (featOkTst && casFeat_tlong == null)
      jcas.throwFeatMissing("tlong", "net.hitsujiwool.uima.Target");
    ll_cas.ll_setLongValue(addr, casFeatCode_tlong, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tstringarray;
  /** @generated */
  final int     casFeatCode_tstringarray;
  /** @generated */ 
  public int getTstringarray(int addr) {
        if (featOkTst && casFeat_tstringarray == null)
      jcas.throwFeatMissing("tstringarray", "net.hitsujiwool.uima.Target");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tstringarray);
  }
  /** @generated */    
  public void setTstringarray(int addr, int v) {
        if (featOkTst && casFeat_tstringarray == null)
      jcas.throwFeatMissing("tstringarray", "net.hitsujiwool.uima.Target");
    ll_cas.ll_setRefValue(addr, casFeatCode_tstringarray, v);}
    
   /** @generated */
  public String getTstringarray(int addr, int i) {
        if (featOkTst && casFeat_tstringarray == null)
      jcas.throwFeatMissing("tstringarray", "net.hitsujiwool.uima.Target");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tstringarray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tstringarray), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tstringarray), i);
  }
   
  /** @generated */ 
  public void setTstringarray(int addr, int i, String v) {
        if (featOkTst && casFeat_tstringarray == null)
      jcas.throwFeatMissing("tstringarray", "net.hitsujiwool.uima.Target");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tstringarray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tstringarray), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tstringarray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Target_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tstring = jcas.getRequiredFeatureDE(casType, "tstring", "uima.cas.String", featOkTst);
    casFeatCode_tstring  = (null == casFeat_tstring) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tstring).getCode();

 
    casFeat_tboolean = jcas.getRequiredFeatureDE(casType, "tboolean", "uima.cas.Boolean", featOkTst);
    casFeatCode_tboolean  = (null == casFeat_tboolean) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tboolean).getCode();

 
    casFeat_tfloat = jcas.getRequiredFeatureDE(casType, "tfloat", "uima.cas.Float", featOkTst);
    casFeatCode_tfloat  = (null == casFeat_tfloat) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tfloat).getCode();

 
    casFeat_tbyte = jcas.getRequiredFeatureDE(casType, "tbyte", "uima.cas.Byte", featOkTst);
    casFeatCode_tbyte  = (null == casFeat_tbyte) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tbyte).getCode();

 
    casFeat_tdouble = jcas.getRequiredFeatureDE(casType, "tdouble", "uima.cas.Double", featOkTst);
    casFeatCode_tdouble  = (null == casFeat_tdouble) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tdouble).getCode();

 
    casFeat_tinteger = jcas.getRequiredFeatureDE(casType, "tinteger", "uima.cas.Integer", featOkTst);
    casFeatCode_tinteger  = (null == casFeat_tinteger) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tinteger).getCode();

 
    casFeat_tshort = jcas.getRequiredFeatureDE(casType, "tshort", "uima.cas.Short", featOkTst);
    casFeatCode_tshort  = (null == casFeat_tshort) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tshort).getCode();

 
    casFeat_tlong = jcas.getRequiredFeatureDE(casType, "tlong", "uima.cas.Long", featOkTst);
    casFeatCode_tlong  = (null == casFeat_tlong) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tlong).getCode();

 
    casFeat_tstringarray = jcas.getRequiredFeatureDE(casType, "tstringarray", "uima.cas.StringArray", featOkTst);
    casFeatCode_tstringarray  = (null == casFeat_tstringarray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tstringarray).getCode();

  }
}



    