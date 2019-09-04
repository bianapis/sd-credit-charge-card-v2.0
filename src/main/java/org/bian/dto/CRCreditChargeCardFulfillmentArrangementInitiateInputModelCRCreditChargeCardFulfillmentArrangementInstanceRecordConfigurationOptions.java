package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions
 */
public class CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions   {
  private String creditChargeCardFulfillmentArrangementOptionSetting = null;


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

