

/* First created by JCasGen Mon Sep 14 19:23:22 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This is a super class for all the defined annotations. Every other class will inherit from this.
It will contain: 
->ComponentID: The name of the component that produced it.
->Confidence: A float value in (0,1) which shows the confidence of ComponentID in the annotation.
 * Updated by JCasGen Mon Sep 14 21:12:59 EDT 2015
 * XML source: /Users/Yash/git/pi2-ygaur/pi2-ygaur/src/main/resources/pi2-ygaur-typesystem.xml
 * @generated */
public class MyAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MyAnnotation.class);
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
  protected MyAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MyAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MyAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MyAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: ComponentID

  /** getter for ComponentID - gets Name of the Annotator that produced this annotation.
   * @generated
   * @return value of the feature 
   */
  public String getComponentID() {
    if (MyAnnotation_Type.featOkTst && ((MyAnnotation_Type)jcasType).casFeat_ComponentID == null)
      jcasType.jcas.throwFeatMissing("ComponentID", "MyAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MyAnnotation_Type)jcasType).casFeatCode_ComponentID);}
    
  /** setter for ComponentID - sets Name of the Annotator that produced this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setComponentID(String v) {
    if (MyAnnotation_Type.featOkTst && ((MyAnnotation_Type)jcasType).casFeat_ComponentID == null)
      jcasType.jcas.throwFeatMissing("ComponentID", "MyAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((MyAnnotation_Type)jcasType).casFeatCode_ComponentID, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets Confidence of the annotator in producing this annotation.
   * @generated
   * @return value of the feature 
   */
  public float getConfidence() {
    if (MyAnnotation_Type.featOkTst && ((MyAnnotation_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "MyAnnotation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((MyAnnotation_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets Confidence of the annotator in producing this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(float v) {
    if (MyAnnotation_Type.featOkTst && ((MyAnnotation_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "MyAnnotation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((MyAnnotation_Type)jcasType).casFeatCode_Confidence, v);}    
  }

    