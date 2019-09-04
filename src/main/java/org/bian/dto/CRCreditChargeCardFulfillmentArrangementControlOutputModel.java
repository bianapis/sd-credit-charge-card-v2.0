package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementControlOutputModel
 */
public class CRCreditChargeCardFulfillmentArrangementControlOutputModel   {
  private String creditChargeCardFulfillmentArrangementControlActionTaskReference = null;

  private Object creditChargeCardFulfillmentArrangementControlActionTaskRecord = null;

  private String creditChargeCardFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Charge Card Fulfillment Arrangement instance control processing service call 
   * @return creditChargeCardFulfillmentArrangementControlActionTaskReference
  **/

  public String getCreditChargeCardFulfillmentArrangementControlActionTaskReference() {
    return creditChargeCardFulfillmentArrangementControlActionTaskReference;
  }

  public void setCreditChargeCardFulfillmentArrangementControlActionTaskReference(String creditChargeCardFulfillmentArrangementControlActionTaskReference) {
    this.creditChargeCardFulfillmentArrangementControlActionTaskReference = creditChargeCardFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return creditChargeCardFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCreditChargeCardFulfillmentArrangementControlActionTaskRecord() {
    return creditChargeCardFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCreditChargeCardFulfillmentArrangementControlActionTaskRecord(Object creditChargeCardFulfillmentArrangementControlActionTaskRecord) {
    this.creditChargeCardFulfillmentArrangementControlActionTaskRecord = creditChargeCardFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return creditChargeCardFulfillmentArrangementControlActionResponse
  **/

  public String getCreditChargeCardFulfillmentArrangementControlActionResponse() {
    return creditChargeCardFulfillmentArrangementControlActionResponse;
  }

  public void setCreditChargeCardFulfillmentArrangementControlActionResponse(String creditChargeCardFulfillmentArrangementControlActionResponse) {
    this.creditChargeCardFulfillmentArrangementControlActionResponse = creditChargeCardFulfillmentArrangementControlActionResponse;
  }


}

