

/* First created by JCasGen Sun Sep 13 20:02:13 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This object contains annotation for the answers.
It will contains the floowing fields:
begin (int): where the annotation begins
end (int): where the annotation ends
IsCorrect (boolean): if the answer is correct
ComponentID (string): The name of the component which produced this annotation object
Confidence (float): Confidence value assigned by the component which produced this object
 * Updated by JCasGen Sun Sep 13 20:02:13 EDT 2015
 * XML source: /Users/Yash/git/pi2-ygaur/pi2-ygaur/src/main/resources/pi2-ygaur-typesystem.xml
 * @generated */
public class Answer extends Annotation {
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
  //* Feature: IsCorrect

  /** getter for IsCorrect - gets Stores boolean for: Is this answer correct?
   * @generated
   * @return value of the feature 
   */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_IsCorrect);}
    
  /** setter for IsCorrect - sets Stores boolean for: Is this answer correct? 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_IsCorrect, v);}    
   
    
  //*--------------*
  //* Feature: ComponentID

  /** getter for ComponentID - gets Contains the name of the component which created this annotation.
   * @generated
   * @return value of the feature 
   */
  public String getComponentID() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ComponentID == null)
      jcasType.jcas.throwFeatMissing("ComponentID", "Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_ComponentID);}
    
  /** setter for ComponentID - sets Contains the name of the component which created this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setComponentID(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ComponentID == null)
      jcasType.jcas.throwFeatMissing("ComponentID", "Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_ComponentID, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets Contains a float value between 0 and 1 which describes the confidence of the component.
   * @generated
   * @return value of the feature 
   */
  public float getConfidence() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "Answer");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets Contains a float value between 0 and 1 which describes the confidence of the component. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(float v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "Answer");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_Confidence, v);}    
  }

    