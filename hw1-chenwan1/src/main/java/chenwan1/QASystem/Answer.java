

/* First created by JCasGen Wed Sep 11 18:55:48 EDT 2013 */
package chenwan1.QASystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Type that hold an answer, with its string, score and correctness.
 * Updated by JCasGen Wed Sep 11 18:55:48 EDT 2013
 * XML source: /home/cecilia/git/hw1-chenwan1/hw1-chenwan1/src/main/resources/descriptors/typeSystemDescriptor.xml
 * @generated */
public class Answer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: Sentence

  /** getter for Sentence - gets Hold the raw sentence of the answer
   * @generated */
  public String getSentence() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "chenwan1.QASystem.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_Sentence);}
    
  /** setter for Sentence - sets Hold the raw sentence of the answer 
   * @generated */
  public void setSentence(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "chenwan1.QASystem.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_Sentence, v);}    
   
    
  //*--------------*
  //* Feature: Correctness

  /** getter for Correctness - gets Whether the answer is correct.
   * @generated */
  public boolean getCorrectness() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Correctness == null)
      jcasType.jcas.throwFeatMissing("Correctness", "chenwan1.QASystem.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_Correctness);}
    
  /** setter for Correctness - sets Whether the answer is correct. 
   * @generated */
  public void setCorrectness(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Correctness == null)
      jcasType.jcas.throwFeatMissing("Correctness", "chenwan1.QASystem.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_Correctness, v);}    
   
    
  //*--------------*
  //* Feature: Score

  /** getter for Score - gets The score for this answer, between [0, 1].
   * @generated */
  public double getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "chenwan1.QASystem.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets The score for this answer, between [0, 1]. 
   * @generated */
  public void setScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "chenwan1.QASystem.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_Score, v);}    
  }

    