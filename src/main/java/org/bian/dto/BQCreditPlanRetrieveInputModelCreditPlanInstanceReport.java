package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditPlanRetrieveInputModelCreditPlanInstanceReport
 */
public class BQCreditPlanRetrieveInputModelCreditPlanInstanceReport   {
  private String creditPlanInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditPlanInstanceReportReference
  **/

  public String getCreditPlanInstanceReportReference() {
    return creditPlanInstanceReportReference;
  }

  public void setCreditPlanInstanceReportReference(String creditPlanInstanceReportReference) {
    this.creditPlanInstanceReportReference = creditPlanInstanceReportReference;
  }


}

