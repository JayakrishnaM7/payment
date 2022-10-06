package com.ibm.org.model.partyrefdatadirectory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.partyrefdatadirectory.RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrievePartyReferenceDataDirectoryEntryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-06T13:23:50.101Z[GMT]")

public class RetrievePartyReferenceDataDirectoryEntryResponse   {
  @JsonProperty("PartyReferenceDataDirectoryEntry")
  private RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry;

  public RetrievePartyReferenceDataDirectoryEntryResponse partyReferenceDataDirectoryEntry(RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
    return this;
  }

  /**
   * Get partyReferenceDataDirectoryEntry
   * @return partyReferenceDataDirectoryEntry
  */
  @ApiModelProperty(value = "")

  @Valid

  public RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry getPartyReferenceDataDirectoryEntry() {
    return partyReferenceDataDirectoryEntry;
  }

  public void setPartyReferenceDataDirectoryEntry(RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePartyReferenceDataDirectoryEntryResponse retrievePartyReferenceDataDirectoryEntryResponse = (RetrievePartyReferenceDataDirectoryEntryResponse) o;
    return Objects.equals(this.partyReferenceDataDirectoryEntry, retrievePartyReferenceDataDirectoryEntryResponse.partyReferenceDataDirectoryEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReferenceDataDirectoryEntry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePartyReferenceDataDirectoryEntryResponse {\n");
    
    sb.append("    partyReferenceDataDirectoryEntry: ").append(toIndentedString(partyReferenceDataDirectoryEntry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

