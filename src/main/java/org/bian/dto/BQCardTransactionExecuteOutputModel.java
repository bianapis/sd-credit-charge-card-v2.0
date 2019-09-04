package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionExecuteOutputModelCardTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCardTransactionExecuteOutputModel
 */
public class BQCardTransactionExecuteOutputModel   {
  private BQCardTransactionExecuteOutputModelCardTransactionInstanceRecord cardTransactionInstanceRecord = null;

  private String cardTransactionExecuteActionTaskReference = null;

  private Object cardTransactionExecuteActionTaskRecord = null;

  private String cardTransactionExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get cardTransactionInstanceRecord
   * @return cardTransactionInstanceRecord
  **/

  public BQCardTransactionExecuteOutputModelCardTransactionInstanceRecord getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(BQCardTransactionExecuteOutputModelCardTransactionInstanceRecord cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Transaction instance execute service call 
   * @return cardTransactionExecuteActionTaskReference
  **/

  public String getCardTransactionExecuteActionTaskReference() {
    return cardTransactionExecuteActionTaskReference;
  }

  public void setCardTransactionExecuteActionTaskReference(String cardTransactionExecuteActionTaskReference) {
    this.cardTransactionExecuteActionTaskReference = cardTransactionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return cardTransactionExecuteActionTaskRecord
  **/

  public Object getCardTransactionExecuteActionTaskRecord() {
    return cardTransactionExecuteActionTaskRecord;
  }

  public void setCardTransactionExecuteActionTaskRecord(Object cardTransactionExecuteActionTaskRecord) {
    this.cardTransactionExecuteActionTaskRecord = cardTransactionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Transaction execute transaction/record 
   * @return cardTransactionExecuteRecordReference
  **/

  public String getCardTransactionExecuteRecordReference() {
    return cardTransactionExecuteRecordReference;
  }

  public void setCardTransactionExecuteRecordReference(String cardTransactionExecuteRecordReference) {
    this.cardTransactionExecuteRecordReference = cardTransactionExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

