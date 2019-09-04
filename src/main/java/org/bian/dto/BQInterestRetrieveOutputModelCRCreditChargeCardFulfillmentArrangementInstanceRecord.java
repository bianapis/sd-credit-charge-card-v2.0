package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordLinkedAccounts;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord
 */
public class BQInterestRetrieveOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String customerReference = null;

  private String partyReference = null;

  private String accountCurrency = null;

  private String secondaryBillingCurrency = null;

  private String taxReference = null;

  private String restrictionOptionSetting = null;

  private CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions configurationOptions = null;

  private CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts = null;

  private CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the credit/charge card account product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the card account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the legal entity (typically the customer) 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The primary account currency 
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: Required for dual currency accounts 
   * @return secondaryBillingCurrency
  **/

  public String getSecondaryBillingCurrency() {
    return secondaryBillingCurrency;
  }

  public void setSecondaryBillingCurrency(String secondaryBillingCurrency) {
    this.secondaryBillingCurrency = secondaryBillingCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * Get configurationOptions
   * @return configurationOptions
  **/

  public CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions getConfigurationOptions() {
    return configurationOptions;
  }

  public void setConfigurationOptions(CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions configurationOptions) {
    this.configurationOptions = configurationOptions;
  }


  /**
   * Get linkedAccounts
   * @return linkedAccounts
  **/

  public CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

