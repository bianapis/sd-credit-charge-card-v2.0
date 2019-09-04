package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions
 */
public class CRCreditChargeCardFulfillmentArrangementUpdateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions   {
  private String creditChargeCardFulfillmentArrangementOptionDefinition = null;

  private String creditChargeCardFulfillmentArrangementOptionSetting = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of a specific product feature provided as an option 
   * @return creditChargeCardFulfillmentArrangementOptionDefinition
  **/

  public String getCreditChargeCardFulfillmentArrangementOptionDefinition() {
    return creditChargeCardFulfillmentArrangementOptionDefinition;
  }

  public void setCreditChargeCardFulfillmentArrangementOptionDefinition(String creditChargeCardFulfillmentArrangementOptionDefinition) {
    this.creditChargeCardFulfillmentArrangementOptionDefinition = creditChargeCardFulfillmentArrangementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selected option value for this instance 
   * @return creditChargeCardFulfillmentArrangementOptionSetting
  **/

  public String getCreditChargeCardFulfillmentArrangementOptionSetting() {
    return creditChargeCardFulfillmentArrangementOptionSetting;
  }

  public void setCreditChargeCardFulfillmentArrangementOptionSetting(String creditChargeCardFulfillmentArrangementOptionSetting) {
    this.creditChargeCardFulfillmentArrangementOptionSetting = creditChargeCardFulfillmentArrangementOptionSetting;
  }


}

