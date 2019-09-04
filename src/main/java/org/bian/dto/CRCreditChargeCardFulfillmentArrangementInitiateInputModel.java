package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardFulfillmentArrangementInitiateInputModel
 */
public class CRCreditChargeCardFulfillmentArrangementInitiateInputModel   {
  private String creditChargeCardServicingSessionReference = null;

  private Object creditChargeCardFulfillmentArrangementInitiateActionRecord = null;

  private String creditChargeCardFulfillmentArrangementInstanceStatus = null;

  private CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return creditChargeCardServicingSessionReference
  **/

  public String getCreditChargeCardServicingSessionReference() {
    return creditChargeCardServicingSessionReference;
  }

  public void setCreditChargeCardServicingSessionReference(String creditChargeCardServicingSessionReference) {
    this.creditChargeCardServicingSessionReference = creditChargeCardServicingSessionReference;
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

  public CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord getCRCreditChargeCardFulfillmentArrangementInstanceRecord() {
    return cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }

  public void setCRCreditChargeCardFulfillmentArrangementInstanceRecord(CRCreditChargeCardFulfillmentArrangementInitiateInputModelCRCreditChargeCardFulfillmentArrangementInstanceRecord cRCreditChargeCardFulfillmentArrangementInstanceRecord) {
    this.cRCreditChargeCardFulfillmentArrangementInstanceRecord = cRCreditChargeCardFulfillmentArrangementInstanceRecord;
  }


}

