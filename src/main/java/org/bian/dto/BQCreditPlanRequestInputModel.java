package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditPlanRequestInputModelCreditPlanInstanceRecord;
import org.bian.dto.BQIssuedDeviceRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQCreditPlanRequestInputModel
 */
public class BQCreditPlanRequestInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String creditPlanInstanceReference = null;

  private BQCreditPlanRequestInputModelCreditPlanInstanceRecord creditPlanInstanceRecord = null;

  private Object creditPlanRequestActionTaskRecord = null;

  private BQIssuedDeviceRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Credit Charge Card Fulfillment Arrangement instance 
   * @return creditChargeCardFulfillmentArrangementInstanceReference
  **/

  public String getCreditChargeCardFulfillmentArrangementInstanceReference() {
    return creditChargeCardFulfillmentArrangementInstanceReference;
  }

  public void setCreditChargeCardFulfillmentArrangementInstanceReference(String creditChargeCardFulfillmentArrangementInstanceReference) {
    this.creditChargeCardFulfillmentArrangementInstanceReference = creditChargeCardFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Plan instance 
   * @return creditPlanInstanceReference
  **/

  public String getCreditPlanInstanceReference() {
    return creditPlanInstanceReference;
  }

  public void setCreditPlanInstanceReference(String creditPlanInstanceReference) {
    this.creditPlanInstanceReference = creditPlanInstanceReference;
  }


  /**
   * Get creditPlanInstanceRecord
   * @return creditPlanInstanceRecord
  **/

  public BQCreditPlanRequestInputModelCreditPlanInstanceRecord getCreditPlanInstanceRecord() {
    return creditPlanInstanceRecord;
  }

  public void setCreditPlanInstanceRecord(BQCreditPlanRequestInputModelCreditPlanInstanceRecord creditPlanInstanceRecord) {
    this.creditPlanInstanceRecord = creditPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return creditPlanRequestActionTaskRecord
  **/

  public Object getCreditPlanRequestActionTaskRecord() {
    return creditPlanRequestActionTaskRecord;
  }

  public void setCreditPlanRequestActionTaskRecord(Object creditPlanRequestActionTaskRecord) {
    this.creditPlanRequestActionTaskRecord = creditPlanRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQIssuedDeviceRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQIssuedDeviceRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

