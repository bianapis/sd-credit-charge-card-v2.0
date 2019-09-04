package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionExchangeInputModelCardTransactionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCardTransactionExchangeInputModel
 */
public class BQCardTransactionExchangeInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String cardTransactionInstanceReference = null;

  private Object cardTransactionExchangeActionTaskRecord = null;

  private BQCardTransactionExchangeInputModelCardTransactionExchangeActionRequest cardTransactionExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Transaction instance 
   * @return cardTransactionInstanceReference
  **/

  public String getCardTransactionInstanceReference() {
    return cardTransactionInstanceReference;
  }

  public void setCardTransactionInstanceReference(String cardTransactionInstanceReference) {
    this.cardTransactionInstanceReference = cardTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return cardTransactionExchangeActionTaskRecord
  **/

  public Object getCardTransactionExchangeActionTaskRecord() {
    return cardTransactionExchangeActionTaskRecord;
  }

  public void setCardTransactionExchangeActionTaskRecord(Object cardTransactionExchangeActionTaskRecord) {
    this.cardTransactionExchangeActionTaskRecord = cardTransactionExchangeActionTaskRecord;
  }


  /**
   * Get cardTransactionExchangeActionRequest
   * @return cardTransactionExchangeActionRequest
  **/

  public BQCardTransactionExchangeInputModelCardTransactionExchangeActionRequest getCardTransactionExchangeActionRequest() {
    return cardTransactionExchangeActionRequest;
  }

  public void setCardTransactionExchangeActionRequest(BQCardTransactionExchangeInputModelCardTransactionExchangeActionRequest cardTransactionExchangeActionRequest) {
    this.cardTransactionExchangeActionRequest = cardTransactionExchangeActionRequest;
  }


}

