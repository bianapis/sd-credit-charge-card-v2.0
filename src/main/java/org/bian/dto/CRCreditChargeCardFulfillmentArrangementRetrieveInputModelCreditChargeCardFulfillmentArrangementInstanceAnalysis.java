package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis
 */
public class CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceAnalysis   {
  private String creditChargeCardFulfillmentArrangementInstanceAnalysisReference = null;

  private String creditChargeCardFulfillmentArrangementInstanceAnalysisReportType = null;

  private String creditChargeCardFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return creditChargeCardFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceAnalysisReference() {
    return creditChargeCardFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceAnalysisReference(String creditChargeCardFulfillmentArrangementInstanceAnalysisReference) {
    this.creditChargeCardFulfillmentArrangementInstanceAnalysisReference = creditChargeCardFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditChargeCardFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceAnalysisParameters() {
    return creditChargeCardFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceAnalysisParameters(String creditChargeCardFulfillmentArrangementInstanceAnalysisParameters) {
    this.creditChargeCardFulfillmentArrangementInstanceAnalysisParameters = creditChargeCardFulfillmentArrangementInstanceAnalysisParameters;
  }


}

