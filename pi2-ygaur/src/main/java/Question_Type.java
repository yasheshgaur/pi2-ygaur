
/* First created by JCasGen Mon Sep 14 19:23:22 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Inherited from MyAnnotation.
This class is an annotation for the questions. 
Members:
->QuestionID: string which uniquely identifies a question. 
For eg., the questions can have IDs like 'Q1', 'Q2' .. etc. 
This ID will be sufficient to distinguish it from an answer as well 
 * Updated by JCasGen Mon Sep 14 21:13:00 EDT 2015
 * @generated */
public class Question_Type extends MyAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Question");
 
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
      jcas.throwFeatMissing("QuestionID", "Question");
    return ll_cas.ll_getStringValue(addr, casFeatCode_QuestionID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuestionID(int addr, String v) {
        if (featOkTst && casFeat_QuestionID == null)
      jcas.throwFeatMissing("QuestionID", "Question");
    ll_cas.ll_setStringValue(addr, casFeatCode_QuestionID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_QuestionID = jcas.getRequiredFeatureDE(casType, "QuestionID", "uima.cas.String", featOkTst);
    casFeatCode_QuestionID  = (null == casFeat_QuestionID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_QuestionID).getCode();

  }
}



    