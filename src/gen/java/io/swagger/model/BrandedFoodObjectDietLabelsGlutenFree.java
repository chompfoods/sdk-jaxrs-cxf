package io.swagger.model;

import io.swagger.v3.oas.annotations.media.Schema;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
  * An object containing information on this item's compatibility with Gluten Free diets
 **/
@Schema(description="An object containing information on this item's compatibility with Gluten Free diets")
public class BrandedFoodObjectDietLabelsGlutenFree   {
  
  @Schema(description = "Diet name")
 /**
   * Diet name  
  **/
  private String name = null;
  
  @Schema(description = "Boolean describing if this item is compatible with this diet")
 /**
   * Boolean describing if this item is compatible with this diet  
  **/
  private Boolean isCompatible = null;
  
  @Schema(description = "Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility")
 /**
   * Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility  
  **/
  private Integer compatibilityLevel = null;
  
  @Schema(description = "Boolean that indicates if we are confident in how this item is graded for this diet")
 /**
   * Boolean that indicates if we are confident in how this item is graded for this diet  
  **/
  private Integer confidence = null;
  
  @Schema(description = "Description of our confidence that this item was graded correctly")
 /**
   * Description of our confidence that this item was graded correctly  
  **/
  private String confidenceDescription = null;
 /**
   * Diet name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandedFoodObjectDietLabelsGlutenFree name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Boolean describing if this item is compatible with this diet
   * @return isCompatible
  **/
  @JsonProperty("is_compatible")
  public Boolean isIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
  }

  public BrandedFoodObjectDietLabelsGlutenFree isCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

 /**
   * Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility
   * @return compatibilityLevel
  **/
  @JsonProperty("compatibility_level")
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }

  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  public BrandedFoodObjectDietLabelsGlutenFree compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

 /**
   * Boolean that indicates if we are confident in how this item is graded for this diet
   * @return confidence
  **/
  @JsonProperty("confidence")
  public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  public BrandedFoodObjectDietLabelsGlutenFree confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

 /**
   * Description of our confidence that this item was graded correctly
   * @return confidenceDescription
  **/
  @JsonProperty("confidence_description")
  public String getConfidenceDescription() {
    return confidenceDescription;
  }

  public void setConfidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
  }

  public BrandedFoodObjectDietLabelsGlutenFree confidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabelsGlutenFree {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    confidenceDescription: ").append(toIndentedString(confidenceDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
