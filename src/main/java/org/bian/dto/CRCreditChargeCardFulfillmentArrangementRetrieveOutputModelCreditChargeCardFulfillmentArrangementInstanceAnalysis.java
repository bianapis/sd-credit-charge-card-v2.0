package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis
 */
public class CRCreditChargeCardFulfillmentArrangementRetrieveOutputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis   {
  private String creditChargeCardFulfillmentArrangementInstanceAnalysisData = null;

  private String creditChargeCardFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object creditChargeCardFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditChargeCardFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceAnalysisData() {
    return creditChargeCardFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceAnalysisData(String creditChargeCardFulfillmentArrangementInstanceAnalysisData) {
    this.creditChargeCardFulfillmentArrangementInstanceAnalysisData = creditChargeCardFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditChargeCardFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceAnalysisReportType() {
    return creditChargeCardFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceAnalysisReportType(String creditChargeCardFulfillmentArrangementInstanceAnalysisReportType) {
    this.creditChargeCardFulfillmentArrangementInstanceAnalysisReportType = creditChargeCardFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return creditChargeCardFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCreditChargeCardFulfillmentArrangementInstanceAnalysisReport() {
    return creditChargeCardFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceAnalysisReport(Object creditChargeCardFulfillmentArrangementInstanceAnalysisReport) {
    this.creditChargeCardFulfillmentArrangementInstanceAnalysisReport = creditChargeCardFulfillmentArrangementInstanceAnalysisReport;
  }


}

