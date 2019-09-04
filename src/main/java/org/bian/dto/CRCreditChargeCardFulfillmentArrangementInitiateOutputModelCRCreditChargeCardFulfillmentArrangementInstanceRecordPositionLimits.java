package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits
 */
public class CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecordPositionLimits   {
  private String positionLimitValue = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The calculated position 
   * @return positionLimitValue
  **/

  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }


}

