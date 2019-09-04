package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordAssociations;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordLinkedAccounts;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord
 */
public class BQIssuedDeviceInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String customerReference = null;

  private String partyReference = null;

  private String bankBranchLocationReference = null;

  private String allowedAccess = null;

  private CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions configurationOptions = null;

  private BQIssuedDeviceInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordAssociations associations = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the card account for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines allowed access paths/channels supported (e.g. POS, ATM, Local/International, Merchant Categories) 
   * @return allowedAccess
  **/

  public String getAllowedAccess() {
    return allowedAccess;
  }

  public void setAllowedAccess(String allowedAccess) {
    this.allowedAccess = allowedAccess;
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
   * Get associations
   * @return associations
  **/

  public BQIssuedDeviceInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(BQIssuedDeviceInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
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

