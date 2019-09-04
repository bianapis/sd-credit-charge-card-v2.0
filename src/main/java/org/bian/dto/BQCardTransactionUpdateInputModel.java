package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionUpdateInputModelCardTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCardTransactionUpdateInputModel
 */
public class BQCardTransactionUpdateInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String cardTransactionInstanceReference = null;

  private BQCardTransactionUpdateInputModelCardTransactionInstanceRecord cardTransactionInstanceRecord = null;

  private Object cardTransactionUpdateActionTaskRecord = null;

  private String cardTransactionUpdateActionRequest = null;


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
   * Get cardTransactionInstanceRecord
   * @return cardTransactionInstanceRecord
  **/

  public BQCardTransactionUpdateInputModelCardTransactionInstanceRecord getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(BQCardTransactionUpdateInputModelCardTransactionInstanceRecord cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardTransactionUpdateActionTaskRecord
  **/

  public Object getCardTransactionUpdateActionTaskRecord() {
    return cardTransactionUpdateActionTaskRecord;
  }

  public void setCardTransactionUpdateActionTaskRecord(Object cardTransactionUpdateActionTaskRecord) {
    this.cardTransactionUpdateActionTaskRecord = cardTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return cardTransactionUpdateActionRequest
  **/

  public String getCardTransactionUpdateActionRequest() {
    return cardTransactionUpdateActionRequest;
  }

  public void setCardTransactionUpdateActionRequest(String cardTransactionUpdateActionRequest) {
    this.cardTransactionUpdateActionRequest = cardTransactionUpdateActionRequest;
  }


}

