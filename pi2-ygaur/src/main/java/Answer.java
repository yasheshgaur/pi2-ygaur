

/* First created by JCasGen Sun Sep 13 20:02:13 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Inherited from MyAnnotation. This class is an annotation for the answer type.
Members:
AnswerID: string that uniquely identifies this answer.
IsCorrect: boolean which says if the answer is a correct answer to the question.
QuestionID: the question to which this answer is a candidate answer.
 * Updated by JCasGen Mon Sep 14 21:13:00 EDT 2015
 * XML source: /Users/Yash/git/pi2-ygaur/pi2-ygaur/src/main/resources/pi2-ygaur-typesystem.xml
 * @generated */
public class Answer extends MyAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Answer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: AnswerID

  /** getter for AnswerID - gets Will have values like 'A1', 'A2'.. and will be enough to distinguish this from other questions as well. 
   * @generated
   * @return value of the feature 
   */
  public String getAnswerID() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_AnswerID == null)
      jcasType.jcas.throwFeatMissing("AnswerID", "Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_AnswerID);}
    
  /** setter for AnswerID - sets Will have values like 'A1', 'A2'.. and will be enough to distinguish this from other questions as well.  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswerID(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_AnswerID == null)
      jcasType.jcas.throwFeatMissing("AnswerID", "Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_AnswerID, v);}    
   
    
  //*--------------*
  //* Feature: IsCorrect

  /** getter for IsCorrect - gets Says if the answer is the answer to this question.
   * @generated
   * @return value of the feature 
   */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_IsCorrect);}
    
  /** setter for IsCorrect - sets Says if the answer is the answer to this question. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_IsCorrect, v);}    
   
    
  //*--------------*
  //* Feature: QuestionID

  /** getter for QuestionID - gets The question to which this answer is a candidate answer to.
   * @generated
   * @return value of the feature 
   */
  public String getQuestionID() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_QuestionID == null)
      jcasType.jcas.throwFeatMissing("QuestionID", "Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_QuestionID);}
    
  /** setter for QuestionID - sets The question to which this answer is a candidate answer to. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestionID(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_QuestionID == null)
      jcasType.jcas.throwFeatMissing("QuestionID", "Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_QuestionID, v);}    
  }

    