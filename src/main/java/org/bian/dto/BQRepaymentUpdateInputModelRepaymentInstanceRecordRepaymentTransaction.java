package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentUpdateInputModelRepaymentInstanceRecordRepaymentTransaction
 */
public class BQRepaymentUpdateInputModelRepaymentInstanceRecordRepaymentTransaction   {
  private String repaymentTransactionType = null;

  private String billingInstanceReference = null;

  private String repaymentTransactionPayerReference = null;

  private String repaymentTransactionPayerProductInstanceReference = null;

  private String repaymentTransactionPayerBankReference = null;

  private String repaymentTransactionAmount = null;

  private String repaymentTransactionCurrency = null;

  private String repaymentTransactionValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of repayment (e.g. scheduled repayment linked to associated billing record, ad-hoc repayment) 
   * @return repaymentTransactionType
  **/

  public String getRepaymentTransactionType() {
    return repaymentTransactionType;
  }

  public void setRepaymentTransactionType(String repaymentTransactionType) {
    this.repaymentTransactionType = repaymentTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated bill for which this can be full or partial repayment) 
   * @return billingInstanceReference
  **/

  public String getBillingInstanceReference() {
    return billingInstanceReference;
  }

  public void setBillingInstanceReference(String billingInstanceReference) {
    this.billingInstanceReference = billingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payer 
   * @return repaymentTransactionPayerReference
  **/

  public String getRepaymentTransactionPayerReference() {
    return repaymentTransactionPayerReference;
  }

  public void setRepaymentTransactionPayerReference(String repaymentTransactionPayerReference) {
    this.repaymentTransactionPayerReference = repaymentTransactionPayerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account where the payment is made from 
   * @return repaymentTransactionPayerProductInstanceReference
  **/

  public String getRepaymentTransactionPayerProductInstanceReference() {
    return repaymentTransactionPayerProductInstanceReference;
  }

  public void setRepaymentTransactionPayerProductInstanceReference(String repaymentTransactionPayerProductInstanceReference) {
    this.repaymentTransactionPayerProductInstanceReference = repaymentTransactionPayerProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payer's bank 
   * @return repaymentTransactionPayerBankReference
  **/

  public String getRepaymentTransactionPayerBankReference() {
    return repaymentTransactionPayerBankReference;
  }

  public void setRepaymentTransactionPayerBankReference(String repaymentTransactionPayerBankReference) {
    this.repaymentTransactionPayerBankReference = repaymentTransactionPayerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the repayment 
   * @return repaymentTransactionAmount
  **/

  public String getRepaymentTransactionAmount() {
    return repaymentTransactionAmount;
  }

  public void setRepaymentTransactionAmount(String repaymentTransactionAmount) {
    this.repaymentTransactionAmount = repaymentTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency used for the repayment 
   * @return repaymentTransactionCurrency
  **/

  public String getRepaymentTransactionCurrency() {
    return repaymentTransactionCurrency;
  }

  public void setRepaymentTransactionCurrency(String repaymentTransactionCurrency) {
    this.repaymentTransactionCurrency = repaymentTransactionCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The value date for the repayment transaction 
   * @return repaymentTransactionValueDate
  **/

  public String getRepaymentTransactionValueDate() {
    return repaymentTransactionValueDate;
  }

  public void setRepaymentTransactionValueDate(String repaymentTransactionValueDate) {
    this.repaymentTransactionValueDate = repaymentTransactionValueDate;
  }


}

