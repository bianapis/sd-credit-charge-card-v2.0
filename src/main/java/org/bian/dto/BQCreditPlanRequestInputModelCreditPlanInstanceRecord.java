package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditPlanRequestInputModelCreditPlanInstanceRecord
 */
public class BQCreditPlanRequestInputModelCreditPlanInstanceRecord   {
  private String creditPlanType = null;

  private String creditPlanTerms = null;

  private String creditPlanAccountReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of credit plan (e.g. cash, credit, charge, balance transfer, promotions, securitized, etc.) 
   * @return creditPlanType
  **/

  public String getCreditPlanType() {
    return creditPlanType;
  }

  public void setCreditPlanType(String creditPlanType) {
    this.creditPlanType = creditPlanType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The range of terms applied to the pan (e.g. minimum payment, payment grace period, interest rate reference, installment plans, ‚Ä¶) 
   * @return creditPlanTerms
  **/

  public String getCreditPlanTerms() {
    return creditPlanTerms;
  }

  public void setCreditPlanTerms(String creditPlanTerms) {
    this.creditPlanTerms = creditPlanTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account where the credit plan is linked 
   * @return creditPlanAccountReference
  **/

  public String getCreditPlanAccountReference() {
    return creditPlanAccountReference;
  }

  public void setCreditPlanAccountReference(String creditPlanAccountReference) {
    this.creditPlanAccountReference = creditPlanAccountReference;
  }


}

