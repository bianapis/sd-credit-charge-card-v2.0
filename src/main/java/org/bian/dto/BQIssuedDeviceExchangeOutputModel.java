package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceExchangeOutputModel
 */
public class BQIssuedDeviceExchangeOutputModel   {
  private String issuedDeviceExchangeActionTaskReference = null;

  private Object issuedDeviceExchangeActionTaskRecord = null;

  private String issuedDeviceExchangeActionResponse = null;

  private String issuedDeviceInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device instance exchange service call 
   * @return issuedDeviceExchangeActionTaskReference
  **/

  public String getIssuedDeviceExchangeActionTaskReference() {
    return issuedDeviceExchangeActionTaskReference;
  }

  public void setIssuedDeviceExchangeActionTaskReference(String issuedDeviceExchangeActionTaskReference) {
    this.issuedDeviceExchangeActionTaskReference = issuedDeviceExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return issuedDeviceExchangeActionTaskRecord
  **/

  public Object getIssuedDeviceExchangeActionTaskRecord() {
    return issuedDeviceExchangeActionTaskRecord;
  }

  public void setIssuedDeviceExchangeActionTaskRecord(Object issuedDeviceExchangeActionTaskRecord) {
    this.issuedDeviceExchangeActionTaskRecord = issuedDeviceExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return issuedDeviceExchangeActionResponse
  **/

  public String getIssuedDeviceExchangeActionResponse() {
    return issuedDeviceExchangeActionResponse;
  }

  public void setIssuedDeviceExchangeActionResponse(String issuedDeviceExchangeActionResponse) {
    this.issuedDeviceExchangeActionResponse = issuedDeviceExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Issued Device instance (e.g. accepted, rejected, verified) 
   * @return issuedDeviceInstanceStatus
  **/

  public String getIssuedDeviceInstanceStatus() {
    return issuedDeviceInstanceStatus;
  }

  public void setIssuedDeviceInstanceStatus(String issuedDeviceInstanceStatus) {
    this.issuedDeviceInstanceStatus = issuedDeviceInstanceStatus;
  }


}

