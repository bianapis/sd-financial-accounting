package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.DateTimePeriod;

import javax.validation.Valid;
  
/**
 * ReportingBaseWithIdAndRoot
 */
public class ReportingBaseWithIdAndRoot   {
  private String financialLedgerServiceReference = null;

  private String subledgerReference = null;

  private String reportingServiceReference = null;

  private String ledgerReportType = null;

  private DateTimePeriod reportingPeriod = null;

  private Object report = null;

  private String reportingResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: SDR Reference ID 
   * @return financialLedgerServiceReference
  **/

  public String getFinancialLedgerServiceReference() {
    return financialLedgerServiceReference;
  }

  public void setFinancialLedgerServiceReference(String financialLedgerServiceReference) {
    this.financialLedgerServiceReference = financialLedgerServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the reference ID to the Financial Booking Log 
   * @return subledgerReference
  **/

  public String getSubledgerReference() {
    return subledgerReference;
  }

  public void setSubledgerReference(String subledgerReference) {
    this.subledgerReference = subledgerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the reference ID to the reporting service 
   * @return reportingServiceReference
  **/

  public String getReportingServiceReference() {
    return reportingServiceReference;
  }

  public void setReportingServiceReference(String reportingServiceReference) {
    this.reportingServiceReference = reportingServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return ledgerReportType
  **/

  public String getLedgerReportType() {
    return ledgerReportType;
  }

  public void setLedgerReportType(String ledgerReportType) {
    this.ledgerReportType = ledgerReportType;
  }


  /**
   * Get reportingPeriod
   * @return reportingPeriod
  **/

  public DateTimePeriod getReportingPeriod() {
    return reportingPeriod;
  }

  public void setReportingPeriod(DateTimePeriod reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: ledger statement 
   * @return report
  **/

  public Object getReport() {
    return report;
  }

  public void setReport(Object report) {
    this.report = report;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator 
   * @return reportingResult
  **/

  public String getReportingResult() {
    return reportingResult;
  }

  public void setReportingResult(String reportingResult) {
    this.reportingResult = reportingResult;
  }


}

