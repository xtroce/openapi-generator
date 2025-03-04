/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * Model for testing model with \&quot;_class\&quot; property
 */
@JsonPropertyOrder({
  ClassModel.JSON_PROPERTY_PROPERTY_CLASS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
public class ClassModel {
  public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
  @javax.annotation.Nullable
  private String propertyClass;

  public ClassModel() { 
  }

  public ClassModel propertyClass(@javax.annotation.Nullable String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPropertyClass() {
    return propertyClass;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyClass(@javax.annotation.Nullable String propertyClass) {
    this.propertyClass = propertyClass;
  }


  /**
   * Return true if this ClassModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassModel {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

