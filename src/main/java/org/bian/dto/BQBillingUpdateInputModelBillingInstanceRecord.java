package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingUpdateInputModelBillingInstanceRecordBillingTransaction;

import javax.validation.Valid;
  
/**
 * BQBillingUpdateInputModelBillingInstanceRecord
 */
public class BQBillingUpdateInputModelBillingInstanceRecord   {
  private String billingParameters = null;

  private BQBillingUpdateInputModelBillingInstanceRecordBillingTransaction billingTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the set-up for the billing processing (e.g. cycle date, type of billing, etc.) 
   * @return billingParameters
  **/

  public String getBillingParameters() {
    return billingParameters;
  }

  public void setBillingParameters(String billingParameters) {
    this.billingParameters = billingParameters;
  }


  /**
   * Get billingTransaction
   * @return billingTransaction
  **/

  public BQBillingUpdateInputModelBillingInstanceRecordBillingTransaction getBillingTransaction() {
    return billingTransaction;
  }

  public void setBillingTransaction(BQBillingUpdateInputModelBillingInstanceRecordBillingTransaction billingTransaction) {
    this.billingTransaction = billingTransaction;
  }


}

