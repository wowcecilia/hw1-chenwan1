

/* First created by JCasGen Tue Sep 10 22:35:27 EDT 2013 */
package QASystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Pairs of ...
 * Updated by JCasGen Wed Sep 11 00:20:15 EDT 2013
 * XML source: /home/cecilia/git/hw1-chenwan1/hw1-chenwan1/src/main/resources/descriptors/Pairs.xml
 * @generated */
public class Pairs extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Pairs.class);
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
  protected Pairs() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Pairs(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Pairs(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Pairs(JCas jcas, int begin, int end) {
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
  //* Feature: Question

  /** getter for Question - gets Question string

   * @generated */
  public String getQuestion() {
    if (Pairs_Type.featOkTst && ((Pairs_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "QASystem.Pairs");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Pairs_Type)jcasType).casFeatCode_Question);}
    
  /** setter for Question - sets Question string
 
   * @generated */
  public void setQuestion(String v) {
    if (Pairs_Type.featOkTst && ((Pairs_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "QASystem.Pairs");
    jcasType.ll_cas.ll_setStringValue(addr, ((Pairs_Type)jcasType).casFeatCode_Question, v);}    
  }

    