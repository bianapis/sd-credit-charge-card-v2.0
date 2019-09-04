package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentUpdateInputModelRepaymentInstanceRecordRepaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQRepaymentUpdateInputModelRepaymentInstanceRecord
 */
public class BQRepaymentUpdateInputModelRepaymentInstanceRecord   {
  private BQRepaymentUpdateInputModelRepaymentInstanceRecordRepaymentTransaction repaymentTransaction = null;


  /**
   * Get repaymentTransaction
   * @return repaymentTransaction
  **/

  public BQRepaymentUpdateInputModelRepaymentInstanceRecordRepaymentTransaction getRepaymentTransaction() {
    return repaymentTransaction;
  }

  public void setRepaymentTransaction(BQRepaymentUpdateInputModelRepaymentInstanceRecordRepaymentTransaction repaymentTransaction) {
    this.repaymentTransaction = repaymentTransaction;
  }


}

