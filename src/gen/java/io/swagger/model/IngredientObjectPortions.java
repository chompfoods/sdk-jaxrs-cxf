package io.swagger.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;

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
  * An object containing information on a specific food portion found in this item
 **/
@Schema(description="An object containing information on a specific food portion found in this item")
public class IngredientObjectPortions   {
  
  @Schema(description = "The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)")
 /**
   * The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)  
  **/
  private String measurementUnit = null;
  
  @Schema(description = "Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.")
 /**
   * Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.  
  **/
  private String description = null;
  
  @Schema(description = "Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)")
 /**
   * Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)  
  **/
  private String modifier = null;
  
  @Schema(description = "The weight of the measure in grams")
 /**
   * The weight of the measure in grams  
  **/
  private BigDecimal gramWeight = null;
  
  @Schema(description = "The number of observations on which the measure is based")
 /**
   * The number of observations on which the measure is based  
  **/
  private Integer dataPoints = null;
  
  @Schema(description = "Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.")
 /**
   * Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.  
  **/
  private String footnote = null;
 /**
   * The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)
   * @return measurementUnit
  **/
  @JsonProperty("measurement_unit")
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public IngredientObjectPortions measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

 /**
   * Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IngredientObjectPortions description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)
   * @return modifier
  **/
  @JsonProperty("modifier")
  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public IngredientObjectPortions modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

 /**
   * The weight of the measure in grams
   * @return gramWeight
  **/
  @JsonProperty("gram_weight")
  public BigDecimal getGramWeight() {
    return gramWeight;
  }

  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }

  public IngredientObjectPortions gramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
    return this;
  }

 /**
   * The number of observations on which the measure is based
   * @return dataPoints
  **/
  @JsonProperty("data_points")
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public IngredientObjectPortions dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

 /**
   * Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.
   * @return footnote
  **/
  @JsonProperty("footnote")
  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  public IngredientObjectPortions footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectPortions {\n");
    
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
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
