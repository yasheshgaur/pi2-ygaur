
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

/** Inherited from MyAnnotation. This class is an annotation for the answer type.
Members:
AnswerID: string that uniquely identifies this answer.
IsCorrect: boolean which says if the answer is a correct answer to the question.
QuestionID: the question to which this answer is a candidate answer.
 * Updated by JCasGen Mon Sep 14 21:13:00 EDT 2015
 * @generated */
public class Answer_Type extends MyAnnotation_Type {
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
  final Feature casFeat_AnswerID;
  /** @generated */
  final int     casFeatCode_AnswerID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnswerID(int addr) {
        if (featOkTst && casFeat_AnswerID == null)
      jcas.throwFeatMissing("AnswerID", "Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_AnswerID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswerID(int addr, String v) {
        if (featOkTst && casFeat_AnswerID == null)
      jcas.throwFeatMissing("AnswerID", "Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_AnswerID, v);}
    
  
 
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
  final Feature casFeat_QuestionID;
  /** @generated */
  final int     casFeatCode_QuestionID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getQuestionID(int addr) {
        if (featOkTst && casFeat_QuestionID == null)
      jcas.throwFeatMissing("QuestionID", "Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_QuestionID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuestionID(int addr, String v) {
        if (featOkTst && casFeat_QuestionID == null)
      jcas.throwFeatMissing("QuestionID", "Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_QuestionID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_AnswerID = jcas.getRequiredFeatureDE(casType, "AnswerID", "uima.cas.String", featOkTst);
    casFeatCode_AnswerID  = (null == casFeat_AnswerID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerID).getCode();

 
    casFeat_IsCorrect = jcas.getRequiredFeatureDE(casType, "IsCorrect", "uima.cas.Boolean", featOkTst);
    casFeatCode_IsCorrect  = (null == casFeat_IsCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_IsCorrect).getCode();

 
    casFeat_QuestionID = jcas.getRequiredFeatureDE(casType, "QuestionID", "uima.cas.String", featOkTst);
    casFeatCode_QuestionID  = (null == casFeat_QuestionID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_QuestionID).getCode();

  }
}



    