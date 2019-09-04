package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteInputModel
 */
public class BQServiceFeesExecuteInputModel   {
  private String creditChargeCardFulfillmentArrangementInstanceReference = null;

  private String serviceFeesInstanceReference = null;

  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord = null;

  private Object serviceFeesExecuteActionTaskRecord = null;

  private BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance 
   * @return serviceFeesInstanceReference
  **/

  public String getServiceFeesInstanceReference() {
    return serviceFeesInstanceReference;
  }

  public void setServiceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
  }


  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(BQServiceFeesExecuteInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return serviceFeesExecuteActionTaskRecord
  **/

  public Object getServiceFeesExecuteActionTaskRecord() {
    return serviceFeesExecuteActionTaskRecord;
  }

  public void setServiceFeesExecuteActionTaskRecord(Object serviceFeesExecuteActionTaskRecord) {
    this.serviceFeesExecuteActionTaskRecord = serviceFeesExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQServiceFeesExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

