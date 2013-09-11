

/* First created by JCasGen Wed Sep 11 18:55:48 EDT 2013 */
package chenwan1.QASystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 18:55:48 EDT 2013
 * XML source: /home/cecilia/git/hw1-chenwan1/hw1-chenwan1/src/main/resources/descriptors/typeSystemDescriptor.xml
 * @generated */
public class Features extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Features.class);
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
  protected Features() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Features(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Features(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Features(JCas jcas, int begin, int end) {
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
  //* Feature: Score

  /** getter for Score - gets 
   * @generated */
  public double getScore() {
    if (Features_Type.featOkTst && ((Features_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "chenwan1.QASystem.Features");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Features_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets  
   * @generated */
  public void setScore(double v) {
    if (Features_Type.featOkTst && ((Features_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "chenwan1.QASystem.Features");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Features_Type)jcasType).casFeatCode_Score, v);}    
  }

    