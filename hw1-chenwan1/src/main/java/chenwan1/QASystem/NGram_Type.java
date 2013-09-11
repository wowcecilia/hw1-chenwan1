
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

/** 1-, 2-...gram of the sentence
 * Updated by JCasGen Wed Sep 11 18:55:48 EDT 2013
 * @generated */
public class NGram_Type extends Features_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGram(addr, NGram_Type.this);
  			   NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGram(addr, NGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("chenwan1.QASystem.NGram");
 
  /** @generated */
  final Feature casFeat_gramNum;
  /** @generated */
  final int     casFeatCode_gramNum;
  /** @generated */ 
  public int getGramNum(int addr) {
        if (featOkTst && casFeat_gramNum == null)
      jcas.throwFeatMissing("gramNum", "chenwan1.QASystem.NGram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_gramNum);
  }
  /** @generated */    
  public void setGramNum(int addr, int v) {
        if (featOkTst && casFeat_gramNum == null)
      jcas.throwFeatMissing("gramNum", "chenwan1.QASystem.NGram");
    ll_cas.ll_setIntValue(addr, casFeatCode_gramNum, v);}
    
  
 
  /** @generated */
  final Feature casFeat_grams;
  /** @generated */
  final int     casFeatCode_grams;
  /** @generated */ 
  public String getGrams(int addr) {
        if (featOkTst && casFeat_grams == null)
      jcas.throwFeatMissing("grams", "chenwan1.QASystem.NGram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_grams);
  }
  /** @generated */    
  public void setGrams(int addr, String v) {
        if (featOkTst && casFeat_grams == null)
      jcas.throwFeatMissing("grams", "chenwan1.QASystem.NGram");
    ll_cas.ll_setStringValue(addr, casFeatCode_grams, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_gramNum = jcas.getRequiredFeatureDE(casType, "gramNum", "uima.cas.Integer", featOkTst);
    casFeatCode_gramNum  = (null == casFeat_gramNum) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gramNum).getCode();

 
    casFeat_grams = jcas.getRequiredFeatureDE(casType, "grams", "uima.cas.String", featOkTst);
    casFeatCode_grams  = (null == casFeat_grams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_grams).getCode();

  }
}



    