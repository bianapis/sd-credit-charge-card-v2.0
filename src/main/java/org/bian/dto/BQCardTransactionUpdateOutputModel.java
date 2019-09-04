package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionUpdateInputModelCardTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCardTransactionUpdateOutputModel
 */
public class BQCardTransactionUpdateOutputModel   {
  private BQCardTransactionUpdateInputModelCardTransactionInstanceRecord cardTransactionInstanceRecord = null;

  private String cardTransactionUpdateActionTaskReference = null;

  private Object cardTransactionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cardTransactionUpdateActionTaskReference
  **/

  public String getCardTransactionUpdateActionTaskReference() {
    return cardTransactionUpdateActionTaskReference;
  }

  public void setCardTransactionUpdateActionTaskReference(String cardTransactionUpdateActionTaskReference) {
    this.cardTransactionUpdateActionTaskReference = cardTransactionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

