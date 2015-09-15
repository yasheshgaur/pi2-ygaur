

/* First created by JCasGen Mon Sep 14 19:23:22 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Inherited from MyAnnotation.
This class is an annotation for the questions. 
Members:
->QuestionID: string which uniquely identifies a question. 
For eg., the questions can have IDs like 'Q1', 'Q2' .. etc. 
This ID will be sufficient to distinguish it from an answer as well 
 * Updated by JCasGen Mon Sep 14 21:12:59 EDT 2015
 * XML source: /Users/Yash/git/pi2-ygaur/pi2-ygaur/src/main/resources/pi2-ygaur-typesystem.xml
 * @generated */
public class Question extends MyAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: QuestionID

  /** getter for QuestionID - gets A string that uniquely charachterizes this question.
   * @generated
   * @return value of the feature 
   */
  public String getQuestionID() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuestionID == null)
      jcasType.jcas.throwFeatMissing("QuestionID", "Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_QuestionID);}
    
  /** setter for QuestionID - sets A string that uniquely charachterizes this question. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuestionID(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuestionID == null)
      jcasType.jcas.throwFeatMissing("QuestionID", "Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_QuestionID, v);}    
  }

    