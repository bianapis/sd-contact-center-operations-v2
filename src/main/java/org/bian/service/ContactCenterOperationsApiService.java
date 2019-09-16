/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ContactCenterOperationsApiService {

	SDContactCenterOperationsActivateOutputModel activate(SDContactCenterOperationsActivateInputModel request);
	
	SDContactCenterOperationsConfigureOutputModel configure(String sdReferenceId, SDContactCenterOperationsConfigureInputModel request);
	
	BQAssignmentControlOutputModel controlAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentControlInputModel request);
	
	CRContactCenterAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRContactCenterAdministrativePlanControlInputModel request);
	
	CRContactCenterAdministrativePlanCreateOutputModel create(String sdReferenceId, CRContactCenterAdministrativePlanCreateInputModel request);
	
	BQAssignmentCreateOutputModel createAssignment(String sdReferenceId, String crReferenceId, BQAssignmentCreateInputModel request);
	
	BQTroubleshootingCreateOutputModel createTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingCreateInputModel request);
	
	CRContactCenterAdministrativePlanExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRContactCenterAdministrativePlanExecuteInputModel request);
	
	SDContactCenterOperationsFeedbackOutputModel feedback(String sdReferenceId, SDContactCenterOperationsFeedbackInputModel request);
	
	BQAssignmentRequestOutputModel requestAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentRequestInputModel request);
	
	BQPeakLoadRequestOutputModel requestPeakload(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPeakLoadRequestInputModel request);
	
	BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request);
	
	CRContactCenterAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRContactCenterAdministrativePlanRequestInputModel request);
	
	BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPeakLoadRetrieveOutputModel retrievePeakload(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRContactCenterAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDContactCenterOperationsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRContactCenterAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRContactCenterAdministrativePlanUpdateInputModel request);
	
	BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request);
	
	BQPeakLoadUpdateOutputModel updatePeakload(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPeakLoadUpdateInputModel request);
	
	BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request);
	
}
