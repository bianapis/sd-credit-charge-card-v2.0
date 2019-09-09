package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementInitiateOutputModel
 */
public class CRCreditChargeCardFulfillmentArrangementInitiateOutputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String creditChargeCardFulfillmentArrangementInitiateActionReference = null;

  private Object creditChargeCardFulfillmentArrangementInitiateActionRecord = null;

  private String creditChargeCardFulfillmentArrangementInstanceStatus = null;

  private CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Charge Card Fulfillment Arrangement instance 
   * @return creditChargeCardFulfillmentArrangementInstanceReference
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReference() {
    return creditChargeCardFulfillmentArrangementInstanceReference;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReference(String creditChargeCardFulfillmentArrangementInstanceReference) {
    this.creditChargeCardFulfillmentArrangementInstanceReference = creditChargeCardFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return creditChargeCardFulfillmentArrangementInitiateActionReference
  **/

  public String getCreditChargeCardFulfillmentArrangementInitiateActionReference() {
    return creditChargeCardFulfillmentArrangementInitiateActionReference;
  }

  public void setCreditChargeCardFulfillmentArrangementInitiateActionReference(String creditChargeCardFulfillmentArrangementInitiateActionReference) {
    this.creditChargeCardFulfillmentArrangementInitiateActionReference = creditChargeCardFulfillmentArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return creditChargeCardFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCreditChargeCardFulfillmentArrangementInitiateActionRecord() {
    return creditChargeCardFulfillmentArrangementInitiateActionRecord;
  }

  public void setCreditChargeCardFulfillmentArrangementInitiateActionRecord(Object creditChargeCardFulfillmentArrangementInitiateActionRecord) {
    this.creditChargeCardFulfillmentArrangementInitiateActionRecord = creditChargeCardFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Credit Charge Card Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return creditChargeCardFulfillmentArrangementInstanceStatus
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceStatus() {
    return creditChargeCardFulfillmentArrangementInstanceStatus;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceStatus(String creditChargeCardFulfillmentArrangementInstanceStatus) {
    this.creditChargeCardFulfillmentArrangementInstanceStatus = creditChargeCardFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get cRCreditChargeCardFulfillmentArrangementInstanceRecord
   * @return cRCreditChargeCardFulfillmentArrangementInstanceRecord
  **/

  @JsonProperty("cRCreditChargeCardFulfillmentArrangementInstanceRecord")
  public CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(CRCreditChargeCardFulfillmentArrangementInitiateOutputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


}

