

/* First created by JCasGen Tue Sep 10 09:56:17 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** QASystem.. just see
 * Updated by JCasGen Tue Sep 10 20:27:29 EDT 2013
 * XML source: /home/cecilia/git/hw1-chenwan1/hw1-chenwan1/src/main/resources/descriptors/QASystem.xml
 * @generated */
public class QASystem extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QASystem.class);
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
  protected QASystem() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QASystem(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QASystem(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QASystem(JCas jcas, int begin, int end) {
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
  //* Feature: model

  /** getter for model - gets model of classifier
   * @generated */
  public Annotation getModel() {
    if (QASystem_Type.featOkTst && ((QASystem_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "QASystem");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QASystem_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets model of classifier 
   * @generated */
  public void setModel(Annotation v) {
    if (QASystem_Type.featOkTst && ((QASystem_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "QASystem");
    jcasType.ll_cas.ll_setRefValue(addr, ((QASystem_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    