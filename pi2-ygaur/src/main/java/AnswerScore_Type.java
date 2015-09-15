
/* First created by JCasGen Mon Sep 14 19:23:23 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Inherited from MyAnnotation. This class is an annotation for all the answer scores
Members:
->AnswerID: The answer to which this score is. 
->Score: The score for the overlap.
 * Updated by JCasGen Mon Sep 14 21:13:00 EDT 2015
 * @generated */
public class AnswerScore_Type extends MyAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerScore_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerScore_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerScore(addr, AnswerScore_Type.this);
  			   AnswerScore_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerScore(addr, AnswerScore_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerScore.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AnswerScore");
 
  /** @generated */
  final Feature casFeat_AnswerID;
  /** @generated */
  final int     casFeatCode_AnswerID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnswerID(int addr) {
        if (featOkTst && casFeat_AnswerID == null)
      jcas.throwFeatMissing("AnswerID", "AnswerScore");
    return ll_cas.ll_getStringValue(addr, casFeatCode_AnswerID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswerID(int addr, String v) {
        if (featOkTst && casFeat_AnswerID == null)
      jcas.throwFeatMissing("AnswerID", "AnswerScore");
    ll_cas.ll_setStringValue(addr, casFeatCode_AnswerID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Score;
  /** @generated */
  final int     casFeatCode_Score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getScore(int addr) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "AnswerScore");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, float v) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "AnswerScore");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnswerScore_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_AnswerID = jcas.getRequiredFeatureDE(casType, "AnswerID", "uima.cas.String", featOkTst);
    casFeatCode_AnswerID  = (null == casFeat_AnswerID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerID).getCode();

 
    casFeat_Score = jcas.getRequiredFeatureDE(casType, "Score", "uima.cas.Float", featOkTst);
    casFeatCode_Score  = (null == casFeat_Score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Score).getCode();

  }
}



    