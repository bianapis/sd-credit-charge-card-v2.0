/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CreditChargeCardApiController {

	@Autowired
	CreditChargeCardApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDCreditChargeCardActivateOutputModel> activate(@RequestBody BianRequest<SDCreditChargeCardActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDCreditChargeCardConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCreditChargeCardConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRCreditChargeCardFulfillmentArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditChargeCardFulfillmentArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cardtransaction")
	@Fulfill.Exchange
	public BianResponse<BQCardTransactionExchangeOutputModel> exchangeCardtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCardTransactionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCardtransaction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("issueddevice")
	@Fulfill.Exchange
	public BianResponse<BQIssuedDeviceExchangeOutputModel> exchangeIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIssuedDeviceExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeIssueddevice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("billing")
	@Fulfill.Execute
	public BianResponse<BQBillingExecuteOutputModel> executeBilling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBillingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeBilling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("cardtransaction")
	@Fulfill.Execute
	public BianResponse<BQCardTransactionExecuteOutputModel> executeCardtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCardTransactionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeCardtransaction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("repayment")
	@Fulfill.Execute
	public BianResponse<BQRepaymentExecuteOutputModel> executeRepayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRepaymentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeRepayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Execute
	public BianResponse<BQServiceFeesExecuteOutputModel> executeServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDCreditChargeCardFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCreditChargeCardFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRCreditChargeCardFulfillmentArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCreditChargeCardFulfillmentArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("creditplan")
	@Fulfill.Initiate
	public BianResponse<BQCreditPlanInitiateOutputModel> initiateCreditplan(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCreditPlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCreditplan(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("issueddevice")
	@Fulfill.Initiate
	public BianResponse<BQIssuedDeviceInitiateOutputModel> initiateIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQIssuedDeviceInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateIssueddevice(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("creditplan")
	@Fulfill.Request
	public BianResponse<BQCreditPlanRequestOutputModel> requestCreditplan(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCreditPlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCreditplan(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("issueddevice")
	@Fulfill.Request
	public BianResponse<BQIssuedDeviceRequestOutputModel> requestIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIssuedDeviceRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestIssueddevice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRCreditChargeCardFulfillmentArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("billing")
	@Fulfill.Retrieve
	public BianResponse<BQBillingRetrieveOutputModel> retrieveBilling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBilling(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("cardtransaction")
	@Fulfill.Retrieve
	public BianResponse<BQCardTransactionRetrieveOutputModel> retrieveCardtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCardtransaction(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("creditplan")
	@Fulfill.Retrieve
	public BianResponse<BQCreditPlanRetrieveOutputModel> retrieveCreditplan(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCreditplan(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("interest")
	@Fulfill.Retrieve
	public BianResponse<BQInterestRetrieveOutputModel> retrieveInterest(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterest(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("issueddevice")
	@Fulfill.Retrieve
	public BianResponse<BQIssuedDeviceRetrieveOutputModel> retrieveIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIssueddevice(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("repayment")
	@Fulfill.Retrieve
	public BianResponse<BQRepaymentRetrieveOutputModel> retrieveRepayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRepayment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicefees")
	@Fulfill.Retrieve
	public BianResponse<BQServiceFeesRetrieveOutputModel> retrieveServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicefees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDCreditChargeCardRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRCreditChargeCardFulfillmentArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditChargeCardFulfillmentArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("billing")
	@Fulfill.Update
	public BianResponse<BQBillingUpdateOutputModel> updateBilling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBillingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBilling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("cardtransaction")
	@Fulfill.Update
	public BianResponse<BQCardTransactionUpdateOutputModel> updateCardtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCardTransactionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCardtransaction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("creditplan")
	@Fulfill.Update
	public BianResponse<BQCreditPlanUpdateOutputModel> updateCreditplan(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCreditPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCreditplan(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("issueddevice")
	@Fulfill.Update
	public BianResponse<BQIssuedDeviceUpdateOutputModel> updateIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIssuedDeviceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateIssueddevice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("repayment")
	@Fulfill.Update
	public BianResponse<BQRepaymentUpdateOutputModel> updateRepayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRepaymentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRepayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Update
	public BianResponse<BQServiceFeesUpdateOutputModel> updateServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
