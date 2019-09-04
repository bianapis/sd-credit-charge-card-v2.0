package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionUpdateInputModelCardTransactionInstanceRecordCardTransaction;

import javax.validation.Valid;
  
/**
 * BQCardTransactionUpdateInputModelCardTransactionInstanceRecord
 */
public class BQCardTransactionUpdateInputModelCardTransactionInstanceRecord   {
  private BQCardTransactionUpdateInputModelCardTransactionInstanceRecordCardTransaction cardTransaction = null;


  /**
   * Get cardTransaction
   * @return cardTransaction
  **/

  public BQCardTransactionUpdateInputModelCardTransactionInstanceRecordCardTransaction getCardTransaction() {
    return cardTransaction;
  }

  public void setCardTransaction(BQCardTransactionUpdateInputModelCardTransactionInstanceRecordCardTransaction cardTransaction) {
    this.cardTransaction = cardTransaction;
  }


}

