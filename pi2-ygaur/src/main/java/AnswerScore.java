

/* First created by JCasGen Mon Sep 14 19:23:23 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Inherited from MyAnnotation. This class is an annotation for all the answer scores
Members:
->AnswerID: The answer to which this score is. 
->Score: The score for the overlap.
 * Updated by JCasGen Mon Sep 14 21:13:00 EDT 2015
 * XML source: /Users/Yash/git/pi2-ygaur/pi2-ygaur/src/main/resources/pi2-ygaur-typesystem.xml
 * @generated */
public class AnswerScore extends MyAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);
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
  protected AnswerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnswerScore(JCas jcas, int begin, int end) {
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

  /** getter for AnswerID - gets The ID to the answer for which this score is.
   * @generated
   * @return value of the feature 
   */
  public String getAnswerID() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_AnswerID == null)
      jcasType.jcas.throwFeatMissing("AnswerID", "AnswerScore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_AnswerID);}
    
  /** setter for AnswerID - sets The ID to the answer for which this score is. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswerID(String v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_AnswerID == null)
      jcasType.jcas.throwFeatMissing("AnswerID", "AnswerScore");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_AnswerID, v);}    
   
    
  //*--------------*
  //* Feature: Score

  /** getter for Score - gets The score assigned by the NGram overlapper
   * @generated
   * @return value of the feature 
   */
  public float getScore() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "AnswerScore");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets The score assigned by the NGram overlapper 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(float v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "AnswerScore");
    jcasType.ll_cas.ll_setFloatValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_Score, v);}    
  }

    