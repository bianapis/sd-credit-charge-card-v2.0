package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord
 */
public class CRCreditChargeCardFulfillmentArrangementRetrieveInputModelCreditChargeCardFulfillmentArrangementInstanceReportRecord   {
  private String creditChargeCardFulfillmentArrangementInstanceReportReference = null;

  private String creditChargeCardFulfillmentArrangementInstanceReportType = null;

  private String creditChargeCardFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditChargeCardFulfillmentArrangementInstanceReportReference
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReportReference() {
    return creditChargeCardFulfillmentArrangementInstanceReportReference;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReportReference(String creditChargeCardFulfillmentArrangementInstanceReportReference) {
    this.creditChargeCardFulfillmentArrangementInstanceReportReference = creditChargeCardFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditChargeCardFulfillmentArrangementInstanceReportType
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReportType() {
    return creditChargeCardFulfillmentArrangementInstanceReportType;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReportType(String creditChargeCardFulfillmentArrangementInstanceReportType) {
    this.creditChargeCardFulfillmentArrangementInstanceReportType = creditChargeCardFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return creditChargeCardFulfillmentArrangementInstanceReportParameters
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReportParameters() {
    return creditChargeCardFulfillmentArrangementInstanceReportParameters;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReportParameters(String creditChargeCardFulfillmentArrangementInstanceReportParameters) {
    this.creditChargeCardFulfillmentArrangementInstanceReportParameters = creditChargeCardFulfillmentArrangementInstanceReportParameters;
  }


}

