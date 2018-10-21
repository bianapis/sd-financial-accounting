/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FinancialAccountingApiService {

	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	RecordFinancialAccountResponse recordBookings(String crReferenceId, String bqReferenceId, BookingBase request);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	RetrieveFinancialBookingLogResponse retrieve(String crReferenceId);
	
	BookingBaseWithIdAndRoot retrieveBookings(String crReferenceId, String bqReferenceId);
	
	ReportingBaseWithIdAndRoot retrieveReporting(String crReferenceId, String bqReferenceId);
	
	UpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	UpdateBaseWithIdAndRoot updateUpdates(String crReferenceId, String bqReferenceId, UpdateBase request);
	
}
