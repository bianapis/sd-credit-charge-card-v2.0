package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveOutputModelBillingInstanceAnalysis
 */
public class BQBillingRetrieveOutputModelBillingInstanceAnalysis   {
  private Object billingInstanceAnalysisRecord = null;

  private String billingInstanceAnalysisReportType = null;

  private String billingInstanceAnalysisParameters = null;

  private Object billingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return billingInstanceAnalysisRecord
  **/

  public Object getBillingInstanceAnalysisRecord() {
    return billingInstanceAnalysisRecord;
  }

  public void setBillingInstanceAnalysisRecord(Object billingInstanceAnalysisRecord) {
    this.billingInstanceAnalysisRecord = billingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return billingInstanceAnalysisReportType
  **/

  public String getBillingInstanceAnalysisReportType() {
    return billingInstanceAnalysisReportType;
  }

  public void setBillingInstanceAnalysisReportType(String billingInstanceAnalysisReportType) {
    this.billingInstanceAnalysisReportType = billingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return billingInstanceAnalysisParameters
  **/

  public String getBillingInstanceAnalysisParameters() {
    return billingInstanceAnalysisParameters;
  }

  public void setBillingInstanceAnalysisParameters(String billingInstanceAnalysisParameters) {
    this.billingInstanceAnalysisParameters = billingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return billingInstanceAnalysisReport
  **/

  public Object getBillingInstanceAnalysisReport() {
    return billingInstanceAnalysisReport;
  }

  public void setBillingInstanceAnalysisReport(Object billingInstanceAnalysisReport) {
    this.billingInstanceAnalysisReport = billingInstanceAnalysisReport;
  }


}

