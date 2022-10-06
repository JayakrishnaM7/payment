package com.ibm.org.model.regularycompliance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.regularycompliance.RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestRegulatoryComplianceAssessmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-06T13:23:48.095Z[GMT]")

public class RequestRegulatoryComplianceAssessmentResponse   {
  @JsonProperty("RegulatoryComplianceAssessment")
  private RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryComplianceAssessment;

  public RequestRegulatoryComplianceAssessmentResponse regulatoryComplianceAssessment(RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryComplianceAssessment) {
    this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
    return this;
  }

  /**
   * Get regulatoryComplianceAssessment
   * @return regulatoryComplianceAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment getRegulatoryComplianceAssessment() {
    return regulatoryComplianceAssessment;
  }

  public void setRegulatoryComplianceAssessment(RequestRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryComplianceAssessment) {
    this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestRegulatoryComplianceAssessmentResponse requestRegulatoryComplianceAssessmentResponse = (RequestRegulatoryComplianceAssessmentResponse) o;
    return Objects.equals(this.regulatoryComplianceAssessment, requestRegulatoryComplianceAssessmentResponse.regulatoryComplianceAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryComplianceAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestRegulatoryComplianceAssessmentResponse {\n");
    
    sb.append("    regulatoryComplianceAssessment: ").append(toIndentedString(regulatoryComplianceAssessment)).append("\n");
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
