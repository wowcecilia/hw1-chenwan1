
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

/** 
 * Updated by JCasGen Wed Sep 11 18:55:48 EDT 2013
 * @generated */
public class Features_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Features_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Features_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Features(addr, Features_Type.this);
  			   Features_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Features(addr, Features_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Features.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("chenwan1.QASystem.Features");
 
  /** @generated */
  final Feature casFeat_Score;
  /** @generated */
  final int     casFeatCode_Score;
  /** @generated */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "chenwan1.QASystem.Features");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Score);
  }
  /** @generated */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "chenwan1.QASystem.Features");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Features_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Score = jcas.getRequiredFeatureDE(casType, "Score", "uima.cas.Double", featOkTst);
    casFeatCode_Score  = (null == casFeat_Score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Score).getCode();

  }
}



    