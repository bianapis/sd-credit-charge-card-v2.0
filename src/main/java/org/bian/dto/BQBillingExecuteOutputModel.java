package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingExecuteOutputModelBillingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBillingExecuteOutputModel
 */
public class BQBillingExecuteOutputModel   {
  private BQBillingExecuteOutputModelBillingInstanceRecord billingInstanceRecord = null;

  private String billingExecuteActionTaskReference = null;

  private Object billingExecuteActionTaskRecord = null;

  private String billingExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get billingInstanceRecord
   * @return billingInstanceRecord
  **/

  public BQBillingExecuteOutputModelBillingInstanceRecord getBillingInstanceRecord() {
    return billingInstanceRecord;
  }

  public void setBillingInstanceRecord(BQBillingExecuteOutputModelBillingInstanceRecord billingInstanceRecord) {
    this.billingInstanceRecord = billingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Billing instance execute service call 
   * @return billingExecuteActionTaskReference
  **/

  public String getBillingExecuteActionTaskReference() {
    return billingExecuteActionTaskReference;
  }

  public void setBillingExecuteActionTaskReference(String billingExecuteActionTaskReference) {
    this.billingExecuteActionTaskReference = billingExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return billingExecuteActionTaskRecord
  **/

  public Object getBillingExecuteActionTaskRecord() {
    return billingExecuteActionTaskRecord;
  }

  public void setBillingExecuteActionTaskRecord(Object billingExecuteActionTaskRecord) {
    this.billingExecuteActionTaskRecord = billingExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Billing execute transaction/record 
   * @return billingExecuteRecordReference
  **/

  public String getBillingExecuteRecordReference() {
    return billingExecuteRecordReference;
  }

  public void setBillingExecuteRecordReference(String billingExecuteRecordReference) {
    this.billingExecuteRecordReference = billingExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

