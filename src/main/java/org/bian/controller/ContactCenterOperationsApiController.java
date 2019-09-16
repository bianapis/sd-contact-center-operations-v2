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
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class ContactCenterOperationsApiController {

	@Autowired
	ContactCenterOperationsApiService service;
	
	@Administer.Activate
	public BianResponse<SDContactCenterOperationsActivateOutputModel> activate(@RequestBody BianRequest<SDContactCenterOperationsActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDContactCenterOperationsConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDContactCenterOperationsConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Control
	public BianResponse<BQAssignmentControlOutputModel> controlAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssignmentControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlAssignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Control
	public BianResponse<CRContactCenterAdministrativePlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRContactCenterAdministrativePlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Create
	public BianResponse<CRContactCenterAdministrativePlanCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRContactCenterAdministrativePlanCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Create
	public BianResponse<BQAssignmentCreateOutputModel> createAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAssignmentCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createAssignment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Administer.Create
	public BianResponse<BQTroubleshootingCreateOutputModel> createTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTroubleshootingCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createTroubleshooting(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Execute
	public BianResponse<CRContactCenterAdministrativePlanExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRContactCenterAdministrativePlanExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDContactCenterOperationsFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDContactCenterOperationsFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Request
	public BianResponse<BQAssignmentRequestOutputModel> requestAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssignmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestAssignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("peakload")
	@Administer.Request
	public BianResponse<BQPeakLoadRequestOutputModel> requestPeakload(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPeakLoadRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestPeakload(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Administer.Request
	public BianResponse<BQTroubleshootingRequestOutputModel> requestTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Request
	public BianResponse<CRContactCenterAdministrativePlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRContactCenterAdministrativePlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Retrieve
	public BianResponse<BQAssignmentRetrieveOutputModel> retrieveAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("peakload")
	@Administer.Retrieve
	public BianResponse<BQPeakLoadRetrieveOutputModel> retrievePeakload(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePeakload(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("troubleshooting")
	@Administer.Retrieve
	public BianResponse<BQTroubleshootingRetrieveOutputModel> retrieveTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Administer.Retrieve
	public BianResponse<CRContactCenterAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDContactCenterOperationsRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRContactCenterAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRContactCenterAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Update
	public BianResponse<BQAssignmentUpdateOutputModel> updateAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAssignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("peakload")
	@Administer.Update
	public BianResponse<BQPeakLoadUpdateOutputModel> updatePeakload(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPeakLoadUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePeakload(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Administer.Update
	public BianResponse<BQTroubleshootingUpdateOutputModel> updateTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
