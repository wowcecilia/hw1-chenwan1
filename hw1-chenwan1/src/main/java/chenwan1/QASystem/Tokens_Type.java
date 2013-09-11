
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

/** 
 * Updated by JCasGen Wed Sep 11 18:55:48 EDT 2013
 * @generated */
public class Tokens_Type extends Features_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Tokens_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Tokens_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Tokens(addr, Tokens_Type.this);
  			   Tokens_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Tokens(addr, Tokens_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Tokens.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("chenwan1.QASystem.Tokens");
 
  /** @generated */
  final Feature casFeat_Tokens;
  /** @generated */
  final int     casFeatCode_Tokens;
  /** @generated */ 
  public int getTokens(int addr) {
        if (featOkTst && casFeat_Tokens == null)
      jcas.throwFeatMissing("Tokens", "chenwan1.QASystem.Tokens");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Tokens);
  }
  /** @generated */    
  public void setTokens(int addr, int v) {
        if (featOkTst && casFeat_Tokens == null)
      jcas.throwFeatMissing("Tokens", "chenwan1.QASystem.Tokens");
    ll_cas.ll_setRefValue(addr, casFeatCode_Tokens, v);}
    
  
 
  /** @generated */
  final Feature casFeat_length;
  /** @generated */
  final int     casFeatCode_length;
  /** @generated */ 
  public int getLength(int addr) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "chenwan1.QASystem.Tokens");
    return ll_cas.ll_getIntValue(addr, casFeatCode_length);
  }
  /** @generated */    
  public void setLength(int addr, int v) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "chenwan1.QASystem.Tokens");
    ll_cas.ll_setIntValue(addr, casFeatCode_length, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Tokens_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Tokens = jcas.getRequiredFeatureDE(casType, "Tokens", "uima.cas.StringList", featOkTst);
    casFeatCode_Tokens  = (null == casFeat_Tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Tokens).getCode();

 
    casFeat_length = jcas.getRequiredFeatureDE(casType, "length", "uima.cas.Integer", featOkTst);
    casFeatCode_length  = (null == casFeat_length) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_length).getCode();

  }
}



    