package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Animal
 */

@JsonIgnoreProperties(
  value = "className", // ignore manually set className, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the className to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "className", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = BigCat.class, name = "BigCat"),
  @JsonSubTypes.Type(value = Cat.class, name = "Cat"),
  @JsonSubTypes.Type(value = Dog.class, name = "Dog")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
public class Animal {

  private String className;

  private Optional<String> color = Optional.of("red");

  public Animal() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Animal(String className) {
    this.className = className;
  }

  public Animal className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
   */
  @NotNull 
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("className")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public Animal color(String color) {
    this.color = Optional.ofNullable(color);
    return this;
  }

  /**
   * Get color
   * @return color
   */
  
  @ApiModelProperty(value = "")
  @JsonProperty("color")
  public Optional<String> getColor() {
    return color;
  }

  public void setColor(Optional<String> color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Animal animal = (Animal) o;
    return Objects.equals(this.className, animal.className) &&
        Objects.equals(this.color, animal.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Animal {\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
  
  public static class Builder {

    private Animal instance;

    public Builder() {
      this(new Animal());
    }

    protected Builder(Animal instance) {
      this.instance = instance;
    }

    protected Builder copyOf(Animal value) { 
      this.instance.setClassName(value.className);
      this.instance.setColor(value.color);
      return this;
    }

    public Animal.Builder className(String className) {
      this.instance.className(className);
      return this;
    }
    
    public Animal.Builder color(String color) {
      this.instance.color(color);
      return this;
    }
    
    /**
    * returns a built Animal instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public Animal build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field (except for the default values).
  */
  public static Animal.Builder builder() {
    return new Animal.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Animal.Builder toBuilder() {
    Animal.Builder builder = new Animal.Builder();
    return builder.copyOf(this);
  }

}

