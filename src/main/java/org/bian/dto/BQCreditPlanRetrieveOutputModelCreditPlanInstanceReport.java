package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditPlanRetrieveOutputModelCreditPlanInstanceReport
 */
public class BQCreditPlanRetrieveOutputModelCreditPlanInstanceReport   {
  private Object creditPlanInstanceReportRecord = null;

  private String creditPlanInstanceReportType = null;

  private String creditPlanInstanceReportParameters = null;

  private Object creditPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditPlanInstanceReportRecord
  **/

  public Object getCreditPlanInstanceReportRecord() {
    return creditPlanInstanceReportRecord;
  }

  public void setCreditPlanInstanceReportRecord(Object creditPlanInstanceReportRecord) {
    this.creditPlanInstanceReportRecord = creditPlanInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditPlanInstanceReportType
  **/

  public String getCreditPlanInstanceReportType() {
    return creditPlanInstanceReportType;
  }

  public void setCreditPlanInstanceReportType(String creditPlanInstanceReportType) {
    this.creditPlanInstanceReportType = creditPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return creditPlanInstanceReportParameters
  **/

  public String getCreditPlanInstanceReportParameters() {
    return creditPlanInstanceReportParameters;
  }

  public void setCreditPlanInstanceReportParameters(String creditPlanInstanceReportParameters) {
    this.creditPlanInstanceReportParameters = creditPlanInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditPlanInstanceReport
  **/

  public Object getCreditPlanInstanceReport() {
    return creditPlanInstanceReport;
  }

  public void setCreditPlanInstanceReport(Object creditPlanInstanceReport) {
    this.creditPlanInstanceReport = creditPlanInstanceReport;
  }


}

