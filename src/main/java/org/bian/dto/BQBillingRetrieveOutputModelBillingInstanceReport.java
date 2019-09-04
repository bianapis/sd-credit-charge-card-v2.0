package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveOutputModelBillingInstanceReport
 */
public class BQBillingRetrieveOutputModelBillingInstanceReport   {
  private Object billingInstanceReportRecord = null;

  private String billingInstanceReportType = null;

  private String billingInstanceReportParameters = null;

  private Object billingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return billingInstanceReportRecord
  **/

  public Object getBillingInstanceReportRecord() {
    return billingInstanceReportRecord;
  }

  public void setBillingInstanceReportRecord(Object billingInstanceReportRecord) {
    this.billingInstanceReportRecord = billingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return billingInstanceReportType
  **/

  public String getBillingInstanceReportType() {
    return billingInstanceReportType;
  }

  public void setBillingInstanceReportType(String billingInstanceReportType) {
    this.billingInstanceReportType = billingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return billingInstanceReportParameters
  **/

  public String getBillingInstanceReportParameters() {
    return billingInstanceReportParameters;
  }

  public void setBillingInstanceReportParameters(String billingInstanceReportParameters) {
    this.billingInstanceReportParameters = billingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return billingInstanceReport
  **/

  public Object getBillingInstanceReport() {
    return billingInstanceReport;
  }

  public void setBillingInstanceReport(Object billingInstanceReport) {
    this.billingInstanceReport = billingInstanceReport;
  }


}

