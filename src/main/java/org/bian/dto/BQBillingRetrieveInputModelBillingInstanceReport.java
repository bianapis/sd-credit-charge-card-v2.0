package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveInputModelBillingInstanceReport
 */
public class BQBillingRetrieveInputModelBillingInstanceReport   {
  private String billingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return billingInstanceReportReference
  **/

  public String getBillingInstanceReportReference() {
    return billingInstanceReportReference;
  }

  public void setBillingInstanceReportReference(String billingInstanceReportReference) {
    this.billingInstanceReportReference = billingInstanceReportReference;
  }


}

