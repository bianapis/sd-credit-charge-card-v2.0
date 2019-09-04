package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentExecuteInputModelRepaymentInstanceRecordRepaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQRepaymentExecuteInputModelRepaymentInstanceRecord
 */
public class BQRepaymentExecuteInputModelRepaymentInstanceRecord   {
  private BQRepaymentExecuteInputModelRepaymentInstanceRecordRepaymentTransaction repaymentTransaction = null;


  /**
   * Get repaymentTransaction
   * @return repaymentTransaction
  **/

  public BQRepaymentExecuteInputModelRepaymentInstanceRecordRepaymentTransaction getRepaymentTransaction() {
    return repaymentTransaction;
  }

  public void setRepaymentTransaction(BQRepaymentExecuteInputModelRepaymentInstanceRecordRepaymentTransaction repaymentTransaction) {
    this.repaymentTransaction = repaymentTransaction;
  }


}

