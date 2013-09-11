
/* First created by JCasGen Wed Sep 11 18:55:48 EDT 2013 */
package chenwan1.QASystem;

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

/** Type that hold an answer, with its string, score and correctness.
 * Updated by JCasGen Wed Sep 11 18:55:48 EDT 2013
 * @generated */
public class Answer_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("chenwan1.QASystem.Answer");
 
  /** @generated */
  final Feature casFeat_Sentence;
  /** @generated */
  final int     casFeatCode_Sentence;
  /** @generated */ 
  public String getSentence(int addr) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "chenwan1.QASystem.Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Sentence);
  }
  /** @generated */    
  public void setSentence(int addr, String v) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "chenwan1.QASystem.Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_Sentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Correctness;
  /** @generated */
  final int     casFeatCode_Correctness;
  /** @generated */ 
  public boolean getCorrectness(int addr) {
        if (featOkTst && casFeat_Correctness == null)
      jcas.throwFeatMissing("Correctness", "chenwan1.QASystem.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_Correctness);
  }
  /** @generated */    
  public void setCorrectness(int addr, boolean v) {
        if (featOkTst && casFeat_Correctness == null)
      jcas.throwFeatMissing("Correctness", "chenwan1.QASystem.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_Correctness, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Score;
  /** @generated */
  final int     casFeatCode_Score;
  /** @generated */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "chenwan1.QASystem.Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Score);
  }
  /** @generated */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "chenwan1.QASystem.Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Sentence = jcas.getRequiredFeatureDE(casType, "Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Sentence  = (null == casFeat_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentence).getCode();

 
    casFeat_Correctness = jcas.getRequiredFeatureDE(casType, "Correctness", "uima.cas.Boolean", featOkTst);
    casFeatCode_Correctness  = (null == casFeat_Correctness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Correctness).getCode();

 
    casFeat_Score = jcas.getRequiredFeatureDE(casType, "Score", "uima.cas.Double", featOkTst);
    casFeatCode_Score  = (null == casFeat_Score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Score).getCode();

  }
}



    