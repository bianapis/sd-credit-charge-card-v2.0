package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardTransactionExchangeOutputModel
 */
public class BQCardTransactionExchangeOutputModel   {
  private String cardTransactionExchangeActionTaskReference = null;

  private Object cardTransactionExchangeActionTaskRecord = null;

  private String cardTransactionExchangeActionResponse = null;

  private String cardTransactionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Transaction instance exchange service call 
   * @return cardTransactionExchangeActionTaskReference
  **/

  public String getCardTransactionExchangeActionTaskReference() {
    return cardTransactionExchangeActionTaskReference;
  }

  public void setCardTransactionExchangeActionTaskReference(String cardTransactionExchangeActionTaskReference) {
    this.cardTransactionExchangeActionTaskReference = cardTransactionExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return cardTransactionExchangeActionResponse
  **/

  public String getCardTransactionExchangeActionResponse() {
    return cardTransactionExchangeActionResponse;
  }

  public void setCardTransactionExchangeActionResponse(String cardTransactionExchangeActionResponse) {
    this.cardTransactionExchangeActionResponse = cardTransactionExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card Transaction instance (e.g. accepted, rejected, verified) 
   * @return cardTransactionInstanceStatus
  **/

  public String getCardTransactionInstanceStatus() {
    return cardTransactionInstanceStatus;
  }

  public void setCardTransactionInstanceStatus(String cardTransactionInstanceStatus) {
    this.cardTransactionInstanceStatus = cardTransactionInstanceStatus;
  }


}

