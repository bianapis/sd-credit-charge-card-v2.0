package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentRetrieveOutputModelRepaymentInstanceRecordRepaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveOutputModelRepaymentInstanceRecord
 */
public class BQRepaymentRetrieveOutputModelRepaymentInstanceRecord   {
  private BQRepaymentRetrieveOutputModelRepaymentInstanceRecordRepaymentTransaction repaymentTransaction = null;


  /**
   * Get repaymentTransaction
   * @return repaymentTransaction
  **/

  public BQRepaymentRetrieveOutputModelRepaymentInstanceRecordRepaymentTransaction getRepaymentTransaction() {
    return repaymentTransaction;
  }

  public void setRepaymentTransaction(BQRepaymentRetrieveOutputModelRepaymentInstanceRecordRepaymentTransaction repaymentTransaction) {
    this.repaymentTransaction = repaymentTransaction;
  }


}

