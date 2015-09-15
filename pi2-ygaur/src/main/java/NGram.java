

/* First created by JCasGen Mon Sep 14 19:23:23 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Inherited from MyAnnotation. This class is an annotation for all the NGrams
Members:
->SentenceID: The sentence (QuestionID or AnswerID) to which this NGram belongs.
 * Updated by JCasGen Mon Sep 14 21:13:00 EDT 2015
 * XML source: /Users/Yash/git/pi2-ygaur/pi2-ygaur/src/main/resources/pi2-ygaur-typesystem.xml
 * @generated */
public class NGram extends MyAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: SentenceID

  /** getter for SentenceID - gets The QuestionID or AnswerID that this NGram belongs.
   * @generated
   * @return value of the feature 
   */
  public String getSentenceID() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_SentenceID);}
    
  /** setter for SentenceID - sets The QuestionID or AnswerID that this NGram belongs. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceID(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_SentenceID, v);}    
  }

    