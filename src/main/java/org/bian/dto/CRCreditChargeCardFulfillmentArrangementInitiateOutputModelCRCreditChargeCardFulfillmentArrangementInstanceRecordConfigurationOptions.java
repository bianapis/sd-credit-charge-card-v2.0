package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions
 */
public class CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordConfigurationOptions   {
  private String creditChargeCardFulfillmentArrangementOptionDefinition = null;


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


}

