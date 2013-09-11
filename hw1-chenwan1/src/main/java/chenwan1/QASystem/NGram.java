

/* First created by JCasGen Wed Sep 11 18:55:48 EDT 2013 */
package chenwan1.QASystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 1-, 2-...gram of the sentence
 * Updated by JCasGen Wed Sep 11 18:55:48 EDT 2013
 * XML source: /home/cecilia/git/hw1-chenwan1/hw1-chenwan1/src/main/resources/descriptors/typeSystemDescriptor.xml
 * @generated */
public class NGram extends Features {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: gramNum

  /** getter for gramNum - gets indicate it's #-gram
   * @generated */
  public int getGramNum() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_gramNum == null)
      jcasType.jcas.throwFeatMissing("gramNum", "chenwan1.QASystem.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_gramNum);}
    
  /** setter for gramNum - sets indicate it's #-gram 
   * @generated */
  public void setGramNum(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_gramNum == null)
      jcasType.jcas.throwFeatMissing("gramNum", "chenwan1.QASystem.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_gramNum, v);}    
   
    
  //*--------------*
  //* Feature: grams

  /** getter for grams - gets 
   * @generated */
  public String getGrams() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_grams == null)
      jcasType.jcas.throwFeatMissing("grams", "chenwan1.QASystem.NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_grams);}
    
  /** setter for grams - sets  
   * @generated */
  public void setGrams(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_grams == null)
      jcasType.jcas.throwFeatMissing("grams", "chenwan1.QASystem.NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_grams, v);}    
  }

    