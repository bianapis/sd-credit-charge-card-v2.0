package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQIssuedDeviceInitiateOutputModelIssuedDeviceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateOutputModel
 */
public class BQIssuedDeviceInitiateOutputModel   {
  private BQIssuedDeviceInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;

  private String issuedDeviceInstanceReference = null;

  private String issuedDeviceInitiateActionReference = null;

  private Object issuedDeviceInitiateActionRecord = null;

  private String issuedDeviceInstanceStatus = null;

  private BQIssuedDeviceInitiateOutputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord = null;


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  public BQIssuedDeviceInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(BQIssuedDeviceInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance 
   * @return issuedDeviceInstanceReference
  **/

  public String getIssuedDeviceInstanceReference() {
    return issuedDeviceInstanceReference;
  }

  public void setIssuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return issuedDeviceInitiateActionReference
  **/

  public String getIssuedDeviceInitiateActionReference() {
    return issuedDeviceInitiateActionReference;
  }

  public void setIssuedDeviceInitiateActionReference(String issuedDeviceInitiateActionReference) {
    this.issuedDeviceInitiateActionReference = issuedDeviceInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return issuedDeviceInitiateActionRecord
  **/

  public Object getIssuedDeviceInitiateActionRecord() {
    return issuedDeviceInitiateActionRecord;
  }

  public void setIssuedDeviceInitiateActionRecord(Object issuedDeviceInitiateActionRecord) {
    this.issuedDeviceInitiateActionRecord = issuedDeviceInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Issued Device instance (e.g. initialised, pending, active) 
   * @return issuedDeviceInstanceStatus
  **/

  public String getIssuedDeviceInstanceStatus() {
    return issuedDeviceInstanceStatus;
  }

  public void setIssuedDeviceInstanceStatus(String issuedDeviceInstanceStatus) {
    this.issuedDeviceInstanceStatus = issuedDeviceInstanceStatus;
  }


  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  **/

  public BQIssuedDeviceInitiateOutputModelIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(BQIssuedDeviceInitiateOutputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }


}

