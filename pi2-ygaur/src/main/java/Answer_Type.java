
/* First created by JCasGen Sun Sep 13 20:02:13 EDT 2015 */

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

/** This object contains annotation for the answers.
It will contains the floowing fields:
begin (int): where the annotation begins
end (int): where the annotation ends
IsCorrect (boolean): if the answer is correct
ComponentID (string): The name of the component which produced this annotation object
Confidence (float): Confidence value assigned by the component which produced this object
 * Updated by JCasGen Sun Sep 13 20:02:13 EDT 2015
 * @generated */
public class Answer_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
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
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Answer");
 
  /** @generated */
  final Feature casFeat_IsCorrect;
  /** @generated */
  final int     casFeatCode_IsCorrect;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsCorrect(int addr) {
        if (featOkTst && casFeat_IsCorrect == null)
      jcas.throwFeatMissing("IsCorrect", "Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_IsCorrect);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_IsCorrect == null)
      jcas.throwFeatMissing("IsCorrect", "Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_IsCorrect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ComponentID;
  /** @generated */
  final int     casFeatCode_ComponentID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComponentID(int addr) {
        if (featOkTst && casFeat_ComponentID == null)
      jcas.throwFeatMissing("ComponentID", "Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ComponentID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComponentID(int addr, String v) {
        if (featOkTst && casFeat_ComponentID == null)
      jcas.throwFeatMissing("ComponentID", "Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_ComponentID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Confidence;
  /** @generated */
  final int     casFeatCode_Confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "Answer");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "Answer");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_IsCorrect = jcas.getRequiredFeatureDE(casType, "IsCorrect", "uima.cas.Boolean", featOkTst);
    casFeatCode_IsCorrect  = (null == casFeat_IsCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_IsCorrect).getCode();

 
    casFeat_ComponentID = jcas.getRequiredFeatureDE(casType, "ComponentID", "uima.cas.String", featOkTst);
    casFeatCode_ComponentID  = (null == casFeat_ComponentID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ComponentID).getCode();

 
    casFeat_Confidence = jcas.getRequiredFeatureDE(casType, "Confidence", "uima.cas.Float", featOkTst);
    casFeatCode_Confidence  = (null == casFeat_Confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Confidence).getCode();

  }
}



    