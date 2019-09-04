package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBillingExecuteInputModelBillingInstanceRecordBillingTransaction
 */
public class BQBillingExecuteInputModelBillingInstanceRecordBillingTransaction   {
  private String billingTransactionParty = null;

  private String billingTransactionAddress = null;

  private String billingTransactionPeriod = null;

  private String billingTransactionStatementReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target for the invoice, typically the card holder 
   * @return billingTransactionParty
  **/

  public String getBillingTransactionParty() {
    return billingTransactionParty;
  }

  public void setBillingTransactionParty(String billingTransactionParty) {
    this.billingTransactionParty = billingTransactionParty;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The billing address (can vary from the customer home address) 
   * @return billingTransactionAddress
  **/

  public String getBillingTransactionAddress() {
    return billingTransactionAddress;
  }

  public void setBillingTransactionAddress(String billingTransactionAddress) {
    this.billingTransactionAddress = billingTransactionAddress;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The period (from-to) covered by the invoice 
   * @return billingTransactionPeriod
  **/

  public String getBillingTransactionPeriod() {
    return billingTransactionPeriod;
  }

  public void setBillingTransactionPeriod(String billingTransactionPeriod) {
    this.billingTransactionPeriod = billingTransactionPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an associated statement (that is included in the generated invoice) 
   * @return billingTransactionStatementReference
  **/

  public String getBillingTransactionStatementReference() {
    return billingTransactionStatementReference;
  }

  public void setBillingTransactionStatementReference(String billingTransactionStatementReference) {
    this.billingTransactionStatementReference = billingTransactionStatementReference;
  }


}

