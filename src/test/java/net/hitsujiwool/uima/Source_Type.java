
/* First created by JCasGen Mon Oct 21 21:11:45 CEST 2013 */
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
 * Updated by JCasGen Wed Oct 23 09:14:35 CEST 2013
 * @generated */
public class Source_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Source_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Source_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Source(addr, Source_Type.this);
  			   Source_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Source(addr, Source_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Source.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.hitsujiwool.uima.Source");
 
  /** @generated */
  final Feature casFeat_sstring;
  /** @generated */
  final int     casFeatCode_sstring;
  /** @generated */ 
  public String getSstring(int addr) {
        if (featOkTst && casFeat_sstring == null)
      jcas.throwFeatMissing("sstring", "net.hitsujiwool.uima.Source");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sstring);
  }
  /** @generated */    
  public void setSstring(int addr, String v) {
        if (featOkTst && casFeat_sstring == null)
      jcas.throwFeatMissing("sstring", "net.hitsujiwool.uima.Source");
    ll_cas.ll_setStringValue(addr, casFeatCode_sstring, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sboolean;
  /** @generated */
  final int     casFeatCode_sboolean;
  /** @generated */ 
  public boolean getSboolean(int addr) {
        if (featOkTst && casFeat_sboolean == null)
      jcas.throwFeatMissing("sboolean", "net.hitsujiwool.uima.Source");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_sboolean);
  }
  /** @generated */    
  public void setSboolean(int addr, boolean v) {
        if (featOkTst && casFeat_sboolean == null)
      jcas.throwFeatMissing("sboolean", "net.hitsujiwool.uima.Source");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_sboolean, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sfloat;
  /** @generated */
  final int     casFeatCode_sfloat;
  /** @generated */ 
  public float getSfloat(int addr) {
        if (featOkTst && casFeat_sfloat == null)
      jcas.throwFeatMissing("sfloat", "net.hitsujiwool.uima.Source");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_sfloat);
  }
  /** @generated */    
  public void setSfloat(int addr, float v) {
        if (featOkTst && casFeat_sfloat == null)
      jcas.throwFeatMissing("sfloat", "net.hitsujiwool.uima.Source");
    ll_cas.ll_setFloatValue(addr, casFeatCode_sfloat, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sbyte;
  /** @generated */
  final int     casFeatCode_sbyte;
  /** @generated */ 
  public byte getSbyte(int addr) {
        if (featOkTst && casFeat_sbyte == null)
      jcas.throwFeatMissing("sbyte", "net.hitsujiwool.uima.Source");
    return ll_cas.ll_getByteValue(addr, casFeatCode_sbyte);
  }
  /** @generated */    
  public void setSbyte(int addr, byte v) {
        if (featOkTst && casFeat_sbyte == null)
      jcas.throwFeatMissing("sbyte", "net.hitsujiwool.uima.Source");
    ll_cas.ll_setByteValue(addr, casFeatCode_sbyte, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sdouble;
  /** @generated */
  final int     casFeatCode_sdouble;
  /** @generated */ 
  public double getSdouble(int addr) {
        if (featOkTst && casFeat_sdouble == null)
      jcas.throwFeatMissing("sdouble", "net.hitsujiwool.uima.Source");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_sdouble);
  }
  /** @generated */    
  public void setSdouble(int addr, double v) {
        if (featOkTst && casFeat_sdouble == null)
      jcas.throwFeatMissing("sdouble", "net.hitsujiwool.uima.Source");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_sdouble, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sinteger;
  /** @generated */
  final int     casFeatCode_sinteger;
  /** @generated */ 
  public int getSinteger(int addr) {
        if (featOkTst && casFeat_sinteger == null)
      jcas.throwFeatMissing("sinteger", "net.hitsujiwool.uima.Source");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sinteger);
  }
  /** @generated */    
  public void setSinteger(int addr, int v) {
        if (featOkTst && casFeat_sinteger == null)
      jcas.throwFeatMissing("sinteger", "net.hitsujiwool.uima.Source");
    ll_cas.ll_setIntValue(addr, casFeatCode_sinteger, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sshort;
  /** @generated */
  final int     casFeatCode_sshort;
  /** @generated */ 
  public short getSshort(int addr) {
        if (featOkTst && casFeat_sshort == null)
      jcas.throwFeatMissing("sshort", "net.hitsujiwool.uima.Source");
    return ll_cas.ll_getShortValue(addr, casFeatCode_sshort);
  }
  /** @generated */    
  public void setSshort(int addr, short v) {
        if (featOkTst && casFeat_sshort == null)
      jcas.throwFeatMissing("sshort", "net.hitsujiwool.uima.Source");
    ll_cas.ll_setShortValue(addr, casFeatCode_sshort, v);}
    
  
 
  /** @generated */
  final Feature casFeat_slong;
  /** @generated */
  final int     casFeatCode_slong;
  /** @generated */ 
  public long getSlong(int addr) {
        if (featOkTst && casFeat_slong == null)
      jcas.throwFeatMissing("slong", "net.hitsujiwool.uima.Source");
    return ll_cas.ll_getLongValue(addr, casFeatCode_slong);
  }
  /** @generated */    
  public void setSlong(int addr, long v) {
        if (featOkTst && casFeat_slong == null)
      jcas.throwFeatMissing("slong", "net.hitsujiwool.uima.Source");
    ll_cas.ll_setLongValue(addr, casFeatCode_slong, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sstringarray;
  /** @generated */
  final int     casFeatCode_sstringarray;
  /** @generated */ 
  public int getSstringarray(int addr) {
        if (featOkTst && casFeat_sstringarray == null)
      jcas.throwFeatMissing("sstringarray", "net.hitsujiwool.uima.Source");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sstringarray);
  }
  /** @generated */    
  public void setSstringarray(int addr, int v) {
        if (featOkTst && casFeat_sstringarray == null)
      jcas.throwFeatMissing("sstringarray", "net.hitsujiwool.uima.Source");
    ll_cas.ll_setRefValue(addr, casFeatCode_sstringarray, v);}
    
   /** @generated */
  public String getSstringarray(int addr, int i) {
        if (featOkTst && casFeat_sstringarray == null)
      jcas.throwFeatMissing("sstringarray", "net.hitsujiwool.uima.Source");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sstringarray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sstringarray), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sstringarray), i);
  }
   
  /** @generated */ 
  public void setSstringarray(int addr, int i, String v) {
        if (featOkTst && casFeat_sstringarray == null)
      jcas.throwFeatMissing("sstringarray", "net.hitsujiwool.uima.Source");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sstringarray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sstringarray), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sstringarray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Source_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sstring = jcas.getRequiredFeatureDE(casType, "sstring", "uima.cas.String", featOkTst);
    casFeatCode_sstring  = (null == casFeat_sstring) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sstring).getCode();

 
    casFeat_sboolean = jcas.getRequiredFeatureDE(casType, "sboolean", "uima.cas.Boolean", featOkTst);
    casFeatCode_sboolean  = (null == casFeat_sboolean) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sboolean).getCode();

 
    casFeat_sfloat = jcas.getRequiredFeatureDE(casType, "sfloat", "uima.cas.Float", featOkTst);
    casFeatCode_sfloat  = (null == casFeat_sfloat) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sfloat).getCode();

 
    casFeat_sbyte = jcas.getRequiredFeatureDE(casType, "sbyte", "uima.cas.Byte", featOkTst);
    casFeatCode_sbyte  = (null == casFeat_sbyte) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sbyte).getCode();

 
    casFeat_sdouble = jcas.getRequiredFeatureDE(casType, "sdouble", "uima.cas.Double", featOkTst);
    casFeatCode_sdouble  = (null == casFeat_sdouble) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sdouble).getCode();

 
    casFeat_sinteger = jcas.getRequiredFeatureDE(casType, "sinteger", "uima.cas.Integer", featOkTst);
    casFeatCode_sinteger  = (null == casFeat_sinteger) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sinteger).getCode();

 
    casFeat_sshort = jcas.getRequiredFeatureDE(casType, "sshort", "uima.cas.Short", featOkTst);
    casFeatCode_sshort  = (null == casFeat_sshort) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sshort).getCode();

 
    casFeat_slong = jcas.getRequiredFeatureDE(casType, "slong", "uima.cas.Long", featOkTst);
    casFeatCode_slong  = (null == casFeat_slong) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_slong).getCode();

 
    casFeat_sstringarray = jcas.getRequiredFeatureDE(casType, "sstringarray", "uima.cas.StringArray", featOkTst);
    casFeatCode_sstringarray  = (null == casFeat_sstringarray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sstringarray).getCode();

  }
}



    