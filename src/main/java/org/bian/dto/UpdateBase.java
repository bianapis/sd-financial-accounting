package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * UpdateBase
 */
public class UpdateBase   {
  private String ledgerUpdatePurpose = null;

  private String ledgerUpdateEmployeeReference = null;

  private String ledgerUpdateDescription = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return ledgerUpdatePurpose
  **/

  public String getLedgerUpdatePurpose() {
    return ledgerUpdatePurpose;
  }

  public void setLedgerUpdatePurpose(String ledgerUpdatePurpose) {
    this.ledgerUpdatePurpose = ledgerUpdatePurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Employee reference ID, for audit purposes 
   * @return ledgerUpdateEmployeeReference
  **/

  public String getLedgerUpdateEmployeeReference() {
    return ledgerUpdateEmployeeReference;
  }

  public void setLedgerUpdateEmployeeReference(String ledgerUpdateEmployeeReference) {
    this.ledgerUpdateEmployeeReference = ledgerUpdateEmployeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return ledgerUpdateDescription
  **/

  public String getLedgerUpdateDescription() {
    return ledgerUpdateDescription;
  }

  public void setLedgerUpdateDescription(String ledgerUpdateDescription) {
    this.ledgerUpdateDescription = ledgerUpdateDescription;
  }


}

