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
  * An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.
 **/
@Schema(description="An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.")
public class BrandedFoodObjectCalorieConversionFactor   {
  
  @Schema(description = "The multiplication factor for protein")
 /**
   * The multiplication factor for protein  
  **/
  private BigDecimal proteinValue = null;
  
  @Schema(description = "The multiplication factor for fat")
 /**
   * The multiplication factor for fat  
  **/
  private BigDecimal fatValue = null;
  
  @Schema(description = "The multiplication factor for carbohydrates")
 /**
   * The multiplication factor for carbohydrates  
  **/
  private BigDecimal carbohydrateValue = null;
 /**
   * The multiplication factor for protein
   * @return proteinValue
  **/
  @JsonProperty("protein_value")
  public BigDecimal getProteinValue() {
    return proteinValue;
  }

  public void setProteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
  }

  public BrandedFoodObjectCalorieConversionFactor proteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
    return this;
  }

 /**
   * The multiplication factor for fat
   * @return fatValue
  **/
  @JsonProperty("fat_value")
  public BigDecimal getFatValue() {
    return fatValue;
  }

  public void setFatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
  }

  public BrandedFoodObjectCalorieConversionFactor fatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
    return this;
  }

 /**
   * The multiplication factor for carbohydrates
   * @return carbohydrateValue
  **/
  @JsonProperty("carbohydrate_value")
  public BigDecimal getCarbohydrateValue() {
    return carbohydrateValue;
  }

  public void setCarbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
  }

  public BrandedFoodObjectCalorieConversionFactor carbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectCalorieConversionFactor {\n");
    
    sb.append("    proteinValue: ").append(toIndentedString(proteinValue)).append("\n");
    sb.append("    fatValue: ").append(toIndentedString(fatValue)).append("\n");
    sb.append("    carbohydrateValue: ").append(toIndentedString(carbohydrateValue)).append("\n");
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
