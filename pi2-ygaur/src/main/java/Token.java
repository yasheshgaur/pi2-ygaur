

/* First created by JCasGen Mon Sep 14 19:23:23 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Inherited from MyAnnotation. This is an annotation for the Tokens
Members:
->SentenceID: The QuestionID or AnswerID to which this token belongs.
->TokenID: The sequence number of the token within the SentenceID. Useful when adjaceny information is requried while calculating NGrams. 

Combination of SentenceID and TokenID uniquely charachterizes the Token 
 * Updated by JCasGen Mon Sep 14 21:13:00 EDT 2015
 * XML source: /Users/Yash/git/pi2-ygaur/pi2-ygaur/src/main/resources/pi2-ygaur-typesystem.xml
 * @generated */
public class Token extends MyAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Token(JCas jcas, int begin, int end) {
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

  /** getter for SentenceID - gets AnswerID or QuestionID to which this token belongs.
   * @generated
   * @return value of the feature 
   */
  public String getSentenceID() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_SentenceID);}
    
  /** setter for SentenceID - sets AnswerID or QuestionID to which this token belongs. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceID(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_SentenceID, v);}    
   
    
  //*--------------*
  //* Feature: TokenID

  /** getter for TokenID - gets The sequence number of the token within that SentenceID
   * @generated
   * @return value of the feature 
   */
  public int getTokenID() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenID == null)
      jcasType.jcas.throwFeatMissing("TokenID", "Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_TokenID);}
    
  /** setter for TokenID - sets The sequence number of the token within that SentenceID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenID(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenID == null)
      jcasType.jcas.throwFeatMissing("TokenID", "Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_TokenID, v);}    
  }

    