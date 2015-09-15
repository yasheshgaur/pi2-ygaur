
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** This is a super class for all the defined annotations. Every other class will inherit from this.
It will contain: 
->ComponentID: The name of the component that produced it.
->Confidence: A float value in (0,1) which shows the confidence of ComponentID in the annotation.
 * Updated by JCasGen Mon Sep 14 21:12:59 EDT 2015
 * @generated */
public class MyAnnotation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MyAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MyAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MyAnnotation(addr, MyAnnotation_Type.this);
  			   MyAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MyAnnotation(addr, MyAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MyAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("MyAnnotation");
 
  /** @generated */
  final Feature casFeat_ComponentID;
  /** @generated */
  final int     casFeatCode_ComponentID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComponentID(int addr) {
        if (featOkTst && casFeat_ComponentID == null)
      jcas.throwFeatMissing("ComponentID", "MyAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ComponentID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComponentID(int addr, String v) {
        if (featOkTst && casFeat_ComponentID == null)
      jcas.throwFeatMissing("ComponentID", "MyAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_ComponentID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Confidence;
  /** @generated */
  final int     casFeatCode_Confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "MyAnnotation");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "MyAnnotation");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MyAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ComponentID = jcas.getRequiredFeatureDE(casType, "ComponentID", "uima.cas.String", featOkTst);
    casFeatCode_ComponentID  = (null == casFeat_ComponentID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ComponentID).getCode();

 
    casFeat_Confidence = jcas.getRequiredFeatureDE(casType, "Confidence", "uima.cas.Float", featOkTst);
    casFeatCode_Confidence  = (null == casFeat_Confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Confidence).getCode();

  }
}



    