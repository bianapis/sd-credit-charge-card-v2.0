package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditPlanRetrieveOutputModelCreditPlanInstanceAnalysis
 */
public class BQCreditPlanRetrieveOutputModelCreditPlanInstanceAnalysis   {
  private Object creditPlanInstanceAnalysisRecord = null;

  private String creditPlanInstanceAnalysisReportType = null;

  private String creditPlanInstanceAnalysisParameters = null;

  private Object creditPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditPlanInstanceAnalysisRecord
  **/

  public Object getCreditPlanInstanceAnalysisRecord() {
    return creditPlanInstanceAnalysisRecord;
  }

  public void setCreditPlanInstanceAnalysisRecord(Object creditPlanInstanceAnalysisRecord) {
    this.creditPlanInstanceAnalysisRecord = creditPlanInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditPlanInstanceAnalysisReportType
  **/

  public String getCreditPlanInstanceAnalysisReportType() {
    return creditPlanInstanceAnalysisReportType;
  }

  public void setCreditPlanInstanceAnalysisReportType(String creditPlanInstanceAnalysisReportType) {
    this.creditPlanInstanceAnalysisReportType = creditPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditPlanInstanceAnalysisParameters
  **/

  public String getCreditPlanInstanceAnalysisParameters() {
    return creditPlanInstanceAnalysisParameters;
  }

  public void setCreditPlanInstanceAnalysisParameters(String creditPlanInstanceAnalysisParameters) {
    this.creditPlanInstanceAnalysisParameters = creditPlanInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return creditPlanInstanceAnalysisReport
  **/

  public Object getCreditPlanInstanceAnalysisReport() {
    return creditPlanInstanceAnalysisReport;
  }

  public void setCreditPlanInstanceAnalysisReport(Object creditPlanInstanceAnalysisReport) {
    this.creditPlanInstanceAnalysisReport = creditPlanInstanceAnalysisReport;
  }


}

