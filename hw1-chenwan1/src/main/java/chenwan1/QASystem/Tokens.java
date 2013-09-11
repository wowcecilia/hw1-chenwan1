

/* First created by JCasGen Wed Sep 11 18:55:48 EDT 2013 */
package chenwan1.QASystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;


/** 
 * Updated by JCasGen Wed Sep 11 18:55:48 EDT 2013
 * XML source: /home/cecilia/git/hw1-chenwan1/hw1-chenwan1/src/main/resources/descriptors/typeSystemDescriptor.xml
 * @generated */
public class Tokens extends Features {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Tokens.class);
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
  protected Tokens() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Tokens(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Tokens(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Tokens(JCas jcas, int begin, int end) {
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
  //* Feature: Tokens

  /** getter for Tokens - gets A list of strings, each of which are a token.
   * @generated */
  public StringList getTokens() {
    if (Tokens_Type.featOkTst && ((Tokens_Type)jcasType).casFeat_Tokens == null)
      jcasType.jcas.throwFeatMissing("Tokens", "chenwan1.QASystem.Tokens");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Tokens_Type)jcasType).casFeatCode_Tokens)));}
    
  /** setter for Tokens - sets A list of strings, each of which are a token. 
   * @generated */
  public void setTokens(StringList v) {
    if (Tokens_Type.featOkTst && ((Tokens_Type)jcasType).casFeat_Tokens == null)
      jcasType.jcas.throwFeatMissing("Tokens", "chenwan1.QASystem.Tokens");
    jcasType.ll_cas.ll_setRefValue(addr, ((Tokens_Type)jcasType).casFeatCode_Tokens, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: length

  /** getter for length - gets Length of the sentence
   * @generated */
  public int getLength() {
    if (Tokens_Type.featOkTst && ((Tokens_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "chenwan1.QASystem.Tokens");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Tokens_Type)jcasType).casFeatCode_length);}
    
  /** setter for length - sets Length of the sentence 
   * @generated */
  public void setLength(int v) {
    if (Tokens_Type.featOkTst && ((Tokens_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "chenwan1.QASystem.Tokens");
    jcasType.ll_cas.ll_setIntValue(addr, ((Tokens_Type)jcasType).casFeatCode_length, v);}    
  }

    