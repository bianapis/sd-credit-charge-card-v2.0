package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionExchangeInputModelCardTransactionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceExchangeInputModel
 */
public class BQIssuedDeviceExchangeInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String issuedDeviceInstanceReference = null;

  private Object issuedDeviceExchangeActionTaskRecord = null;

  private BQCardTransactionExchangeInputModelCardTransactionExchangeActionRequest issuedDeviceExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Credit Charge Card Fulfillment Arrangement instance 
   * @return creditChargeCardFulfillmentArrangementInstanceReference
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReference() {
    return creditChargeCardFulfillmentArrangementInstanceReference;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReference(String creditChargeCardFulfillmentArrangementInstanceReference) {
    this.creditChargeCardFulfillmentArrangementInstanceReference = creditChargeCardFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance 
   * @return issuedDeviceInstanceReference
  **/

  public String getIssuedDeviceInstanceReference() {
    return issuedDeviceInstanceReference;
  }

  public void setIssuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return issuedDeviceExchangeActionTaskRecord
  **/

  public Object getIssuedDeviceExchangeActionTaskRecord() {
    return issuedDeviceExchangeActionTaskRecord;
  }

  public void setIssuedDeviceExchangeActionTaskRecord(Object issuedDeviceExchangeActionTaskRecord) {
    this.issuedDeviceExchangeActionTaskRecord = issuedDeviceExchangeActionTaskRecord;
  }


  /**
   * Get issuedDeviceExchangeActionRequest
   * @return issuedDeviceExchangeActionRequest
  **/

  public BQCardTransactionExchangeInputModelCardTransactionExchangeActionRequest getIssuedDeviceExchangeActionRequest() {
    return issuedDeviceExchangeActionRequest;
  }

  public void setIssuedDeviceExchangeActionRequest(BQCardTransactionExchangeInputModelCardTransactionExchangeActionRequest issuedDeviceExchangeActionRequest) {
    this.issuedDeviceExchangeActionRequest = issuedDeviceExchangeActionRequest;
  }


}

