

/* First created by JCasGen Mon Oct 21 21:11:45 CEST 2013 */
package net.hitsujiwool.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Wed Oct 23 09:14:35 CEST 2013
 * XML source: /Users/ryo/ttc/workspace/uima-type-converter/src/test/desc/types/SourceTypeSystem.xml
 * @generated */
public class Source extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Source.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Source() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Source(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Source(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Source(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: sstring

  /** getter for sstring - gets 
   * @generated */
  public String getSstring() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sstring == null)
      jcasType.jcas.throwFeatMissing("sstring", "net.hitsujiwool.uima.Source");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Source_Type)jcasType).casFeatCode_sstring);}
    
  /** setter for sstring - sets  
   * @generated */
  public void setSstring(String v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sstring == null)
      jcasType.jcas.throwFeatMissing("sstring", "net.hitsujiwool.uima.Source");
    jcasType.ll_cas.ll_setStringValue(addr, ((Source_Type)jcasType).casFeatCode_sstring, v);}    
   
    
  //*--------------*
  //* Feature: sboolean

  /** getter for sboolean - gets 
   * @generated */
  public boolean getSboolean() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sboolean == null)
      jcasType.jcas.throwFeatMissing("sboolean", "net.hitsujiwool.uima.Source");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Source_Type)jcasType).casFeatCode_sboolean);}
    
  /** setter for sboolean - sets  
   * @generated */
  public void setSboolean(boolean v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sboolean == null)
      jcasType.jcas.throwFeatMissing("sboolean", "net.hitsujiwool.uima.Source");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Source_Type)jcasType).casFeatCode_sboolean, v);}    
   
    
  //*--------------*
  //* Feature: sfloat

  /** getter for sfloat - gets 
   * @generated */
  public float getSfloat() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sfloat == null)
      jcasType.jcas.throwFeatMissing("sfloat", "net.hitsujiwool.uima.Source");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Source_Type)jcasType).casFeatCode_sfloat);}
    
  /** setter for sfloat - sets  
   * @generated */
  public void setSfloat(float v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sfloat == null)
      jcasType.jcas.throwFeatMissing("sfloat", "net.hitsujiwool.uima.Source");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Source_Type)jcasType).casFeatCode_sfloat, v);}    
   
    
  //*--------------*
  //* Feature: sbyte

  /** getter for sbyte - gets 
   * @generated */
  public byte getSbyte() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sbyte == null)
      jcasType.jcas.throwFeatMissing("sbyte", "net.hitsujiwool.uima.Source");
    return jcasType.ll_cas.ll_getByteValue(addr, ((Source_Type)jcasType).casFeatCode_sbyte);}
    
  /** setter for sbyte - sets  
   * @generated */
  public void setSbyte(byte v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sbyte == null)
      jcasType.jcas.throwFeatMissing("sbyte", "net.hitsujiwool.uima.Source");
    jcasType.ll_cas.ll_setByteValue(addr, ((Source_Type)jcasType).casFeatCode_sbyte, v);}    
   
    
  //*--------------*
  //* Feature: sdouble

  /** getter for sdouble - gets 
   * @generated */
  public double getSdouble() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sdouble == null)
      jcasType.jcas.throwFeatMissing("sdouble", "net.hitsujiwool.uima.Source");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Source_Type)jcasType).casFeatCode_sdouble);}
    
  /** setter for sdouble - sets  
   * @generated */
  public void setSdouble(double v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sdouble == null)
      jcasType.jcas.throwFeatMissing("sdouble", "net.hitsujiwool.uima.Source");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Source_Type)jcasType).casFeatCode_sdouble, v);}    
   
    
  //*--------------*
  //* Feature: sinteger

  /** getter for sinteger - gets 
   * @generated */
  public int getSinteger() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sinteger == null)
      jcasType.jcas.throwFeatMissing("sinteger", "net.hitsujiwool.uima.Source");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Source_Type)jcasType).casFeatCode_sinteger);}
    
  /** setter for sinteger - sets  
   * @generated */
  public void setSinteger(int v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sinteger == null)
      jcasType.jcas.throwFeatMissing("sinteger", "net.hitsujiwool.uima.Source");
    jcasType.ll_cas.ll_setIntValue(addr, ((Source_Type)jcasType).casFeatCode_sinteger, v);}    
   
    
  //*--------------*
  //* Feature: sshort

  /** getter for sshort - gets 
   * @generated */
  public short getSshort() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sshort == null)
      jcasType.jcas.throwFeatMissing("sshort", "net.hitsujiwool.uima.Source");
    return jcasType.ll_cas.ll_getShortValue(addr, ((Source_Type)jcasType).casFeatCode_sshort);}
    
  /** setter for sshort - sets  
   * @generated */
  public void setSshort(short v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sshort == null)
      jcasType.jcas.throwFeatMissing("sshort", "net.hitsujiwool.uima.Source");
    jcasType.ll_cas.ll_setShortValue(addr, ((Source_Type)jcasType).casFeatCode_sshort, v);}    
   
    
  //*--------------*
  //* Feature: slong

  /** getter for slong - gets 
   * @generated */
  public long getSlong() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_slong == null)
      jcasType.jcas.throwFeatMissing("slong", "net.hitsujiwool.uima.Source");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Source_Type)jcasType).casFeatCode_slong);}
    
  /** setter for slong - sets  
   * @generated */
  public void setSlong(long v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_slong == null)
      jcasType.jcas.throwFeatMissing("slong", "net.hitsujiwool.uima.Source");
    jcasType.ll_cas.ll_setLongValue(addr, ((Source_Type)jcasType).casFeatCode_slong, v);}    
   
    
  //*--------------*
  //* Feature: sstringarray

  /** getter for sstringarray - gets 
   * @generated */
  public StringArray getSstringarray() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sstringarray == null)
      jcasType.jcas.throwFeatMissing("sstringarray", "net.hitsujiwool.uima.Source");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_sstringarray)));}
    
  /** setter for sstringarray - sets  
   * @generated */
  public void setSstringarray(StringArray v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sstringarray == null)
      jcasType.jcas.throwFeatMissing("sstringarray", "net.hitsujiwool.uima.Source");
    jcasType.ll_cas.ll_setRefValue(addr, ((Source_Type)jcasType).casFeatCode_sstringarray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sstringarray - gets an indexed value - 
   * @generated */
  public String getSstringarray(int i) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sstringarray == null)
      jcasType.jcas.throwFeatMissing("sstringarray", "net.hitsujiwool.uima.Source");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_sstringarray), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_sstringarray), i);}

  /** indexed setter for sstringarray - sets an indexed value - 
   * @generated */
  public void setSstringarray(int i, String v) { 
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_sstringarray == null)
      jcasType.jcas.throwFeatMissing("sstringarray", "net.hitsujiwool.uima.Source");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_sstringarray), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_sstringarray), i, v);}
  }

    