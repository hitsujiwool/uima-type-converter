

/* First created by JCasGen Mon Oct 21 21:15:06 CEST 2013 */
package net.hitsujiwool.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Wed Oct 23 09:14:33 CEST 2013
 * XML source: /Users/ryo/ttc/workspace/uima-type-converter/src/test/desc/types/TargetTypeSystem.xml
 * @generated */
public class Target extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Target.class);
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
  protected Target() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Target(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Target(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Target(JCas jcas, int begin, int end) {
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
  //* Feature: tstring

  /** getter for tstring - gets 
   * @generated */
  public String getTstring() {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tstring == null)
      jcasType.jcas.throwFeatMissing("tstring", "net.hitsujiwool.uima.Target");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Target_Type)jcasType).casFeatCode_tstring);}
    
  /** setter for tstring - sets  
   * @generated */
  public void setTstring(String v) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tstring == null)
      jcasType.jcas.throwFeatMissing("tstring", "net.hitsujiwool.uima.Target");
    jcasType.ll_cas.ll_setStringValue(addr, ((Target_Type)jcasType).casFeatCode_tstring, v);}    
   
    
  //*--------------*
  //* Feature: tboolean

  /** getter for tboolean - gets 
   * @generated */
  public boolean getTboolean() {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tboolean == null)
      jcasType.jcas.throwFeatMissing("tboolean", "net.hitsujiwool.uima.Target");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Target_Type)jcasType).casFeatCode_tboolean);}
    
  /** setter for tboolean - sets  
   * @generated */
  public void setTboolean(boolean v) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tboolean == null)
      jcasType.jcas.throwFeatMissing("tboolean", "net.hitsujiwool.uima.Target");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Target_Type)jcasType).casFeatCode_tboolean, v);}    
   
    
  //*--------------*
  //* Feature: tfloat

  /** getter for tfloat - gets 
   * @generated */
  public float getTfloat() {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tfloat == null)
      jcasType.jcas.throwFeatMissing("tfloat", "net.hitsujiwool.uima.Target");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Target_Type)jcasType).casFeatCode_tfloat);}
    
  /** setter for tfloat - sets  
   * @generated */
  public void setTfloat(float v) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tfloat == null)
      jcasType.jcas.throwFeatMissing("tfloat", "net.hitsujiwool.uima.Target");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Target_Type)jcasType).casFeatCode_tfloat, v);}    
   
    
  //*--------------*
  //* Feature: tbyte

  /** getter for tbyte - gets 
   * @generated */
  public byte getTbyte() {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tbyte == null)
      jcasType.jcas.throwFeatMissing("tbyte", "net.hitsujiwool.uima.Target");
    return jcasType.ll_cas.ll_getByteValue(addr, ((Target_Type)jcasType).casFeatCode_tbyte);}
    
  /** setter for tbyte - sets  
   * @generated */
  public void setTbyte(byte v) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tbyte == null)
      jcasType.jcas.throwFeatMissing("tbyte", "net.hitsujiwool.uima.Target");
    jcasType.ll_cas.ll_setByteValue(addr, ((Target_Type)jcasType).casFeatCode_tbyte, v);}    
   
    
  //*--------------*
  //* Feature: tdouble

  /** getter for tdouble - gets 
   * @generated */
  public double getTdouble() {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tdouble == null)
      jcasType.jcas.throwFeatMissing("tdouble", "net.hitsujiwool.uima.Target");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Target_Type)jcasType).casFeatCode_tdouble);}
    
  /** setter for tdouble - sets  
   * @generated */
  public void setTdouble(double v) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tdouble == null)
      jcasType.jcas.throwFeatMissing("tdouble", "net.hitsujiwool.uima.Target");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Target_Type)jcasType).casFeatCode_tdouble, v);}    
   
    
  //*--------------*
  //* Feature: tinteger

  /** getter for tinteger - gets 
   * @generated */
  public int getTinteger() {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tinteger == null)
      jcasType.jcas.throwFeatMissing("tinteger", "net.hitsujiwool.uima.Target");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Target_Type)jcasType).casFeatCode_tinteger);}
    
  /** setter for tinteger - sets  
   * @generated */
  public void setTinteger(int v) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tinteger == null)
      jcasType.jcas.throwFeatMissing("tinteger", "net.hitsujiwool.uima.Target");
    jcasType.ll_cas.ll_setIntValue(addr, ((Target_Type)jcasType).casFeatCode_tinteger, v);}    
   
    
  //*--------------*
  //* Feature: tshort

  /** getter for tshort - gets 
   * @generated */
  public short getTshort() {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tshort == null)
      jcasType.jcas.throwFeatMissing("tshort", "net.hitsujiwool.uima.Target");
    return jcasType.ll_cas.ll_getShortValue(addr, ((Target_Type)jcasType).casFeatCode_tshort);}
    
  /** setter for tshort - sets  
   * @generated */
  public void setTshort(short v) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tshort == null)
      jcasType.jcas.throwFeatMissing("tshort", "net.hitsujiwool.uima.Target");
    jcasType.ll_cas.ll_setShortValue(addr, ((Target_Type)jcasType).casFeatCode_tshort, v);}    
   
    
  //*--------------*
  //* Feature: tlong

  /** getter for tlong - gets 
   * @generated */
  public long getTlong() {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tlong == null)
      jcasType.jcas.throwFeatMissing("tlong", "net.hitsujiwool.uima.Target");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Target_Type)jcasType).casFeatCode_tlong);}
    
  /** setter for tlong - sets  
   * @generated */
  public void setTlong(long v) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tlong == null)
      jcasType.jcas.throwFeatMissing("tlong", "net.hitsujiwool.uima.Target");
    jcasType.ll_cas.ll_setLongValue(addr, ((Target_Type)jcasType).casFeatCode_tlong, v);}    
   
    
  //*--------------*
  //* Feature: tstringarray

  /** getter for tstringarray - gets 
   * @generated */
  public StringArray getTstringarray() {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tstringarray == null)
      jcasType.jcas.throwFeatMissing("tstringarray", "net.hitsujiwool.uima.Target");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Target_Type)jcasType).casFeatCode_tstringarray)));}
    
  /** setter for tstringarray - sets  
   * @generated */
  public void setTstringarray(StringArray v) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tstringarray == null)
      jcasType.jcas.throwFeatMissing("tstringarray", "net.hitsujiwool.uima.Target");
    jcasType.ll_cas.ll_setRefValue(addr, ((Target_Type)jcasType).casFeatCode_tstringarray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tstringarray - gets an indexed value - 
   * @generated */
  public String getTstringarray(int i) {
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tstringarray == null)
      jcasType.jcas.throwFeatMissing("tstringarray", "net.hitsujiwool.uima.Target");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Target_Type)jcasType).casFeatCode_tstringarray), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Target_Type)jcasType).casFeatCode_tstringarray), i);}

  /** indexed setter for tstringarray - sets an indexed value - 
   * @generated */
  public void setTstringarray(int i, String v) { 
    if (Target_Type.featOkTst && ((Target_Type)jcasType).casFeat_tstringarray == null)
      jcasType.jcas.throwFeatMissing("tstringarray", "net.hitsujiwool.uima.Target");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Target_Type)jcasType).casFeatCode_tstringarray), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Target_Type)jcasType).casFeatCode_tstringarray), i, v);}
  }

    