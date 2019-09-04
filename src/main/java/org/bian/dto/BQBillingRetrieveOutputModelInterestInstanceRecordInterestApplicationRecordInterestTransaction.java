package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction
 */
public class BQBillingRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction   {
  private String transactionInterestCharge = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The derived interest amount to be applied 
   * @return transactionInterestCharge
  **/

  public String getTransactionInterestCharge() {
    return transactionInterestCharge;
  }

  public void setTransactionInterestCharge(String transactionInterestCharge) {
    this.transactionInterestCharge = transactionInterestCharge;
  }


}

