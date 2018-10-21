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
import org.bian.annotation.functionalpattern.Track;

@BianRestController
public class FinancialAccountingApiController {

	@Autowired
	FinancialAccountingApiService service;
	
	@Track.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("bookings")
	@Track.Record
	public BianResponse<RecordFinancialAccountResponse> recordBookings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BookingBase> bianRequest) {
		return BianResponse.forSuccess(service.recordBookings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Track.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Track.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Track.Retrieve
	public BianResponse<RetrieveFinancialBookingLogResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("bookings")
	@Track.Retrieve
	public BianResponse<BookingBaseWithIdAndRoot> retrieveBookings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBookings(crReferenceId, bqReferenceId));
	}
	
	@BQ("reporting")
	@Track.Retrieve
	public BianResponse<ReportingBaseWithIdAndRoot> retrieveReporting(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReporting(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Track.Retrieve
	public BianResponse<UpdateBaseWithIdAndRoot> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Track.Update
	public BianResponse<UpdateBaseWithIdAndRoot> updateUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<UpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.updateUpdates(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
