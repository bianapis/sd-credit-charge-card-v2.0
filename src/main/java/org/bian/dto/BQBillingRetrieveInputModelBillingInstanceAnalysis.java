package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveInputModelBillingInstanceAnalysis
 */
public class BQBillingRetrieveInputModelBillingInstanceAnalysis   {
  private String billingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return billingInstanceAnalysisReference
  **/

  public String getBillingInstanceAnalysisReference() {
    return billingInstanceAnalysisReference;
  }

  public void setBillingInstanceAnalysisReference(String billingInstanceAnalysisReference) {
    this.billingInstanceAnalysisReference = billingInstanceAnalysisReference;
  }


}

