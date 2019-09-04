package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordAssociations;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordStatementsSchedule;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord
 */
public class CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions configurationOptions = null;

  private CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordAssociations associations = null;

  private CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordDateType dateType = null;

  private CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordStatementsSchedule statementsSchedule = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
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

  public CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions getConfigurationOptions() {
    return configurationOptions;
  }

  public void setConfigurationOptions(CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions configurationOptions) {
    this.configurationOptions = configurationOptions;
  }


  /**
   * Get associations
   * @return associations
  **/

  public CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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


  /**
   * Get statementsSchedule
   * @return statementsSchedule
  **/

  public CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordStatementsSchedule getStatementsSchedule() {
    return statementsSchedule;
  }

  public void setStatementsSchedule(CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordStatementsSchedule statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
  }


}

