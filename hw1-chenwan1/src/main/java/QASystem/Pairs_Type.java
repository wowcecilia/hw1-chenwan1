
/* First created by JCasGen Tue Sep 10 22:35:27 EDT 2013 */
package QASystem;

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

/** Pairs of ...
 * Updated by JCasGen Wed Sep 11 00:20:15 EDT 2013
 * @generated */
public class Pairs_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Pairs_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Pairs_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Pairs(addr, Pairs_Type.this);
  			   Pairs_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Pairs(addr, Pairs_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Pairs.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("QASystem.Pairs");
 
  /** @generated */
  final Feature casFeat_Question;
  /** @generated */
  final int     casFeatCode_Question;
  /** @generated */ 
  public String getQuestion(int addr) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "QASystem.Pairs");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Question);
  }
  /** @generated */    
  public void setQuestion(int addr, String v) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "QASystem.Pairs");
    ll_cas.ll_setStringValue(addr, casFeatCode_Question, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Pairs_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Question = jcas.getRequiredFeatureDE(casType, "Question", "uima.cas.String", featOkTst);
    casFeatCode_Question  = (null == casFeat_Question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Question).getCode();

  }
}



    