package io.swagger.model;

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

public class BrandedFoodObjectNutrientsChomp   {
  
  @Schema(description = "Nutrient name")
 /**
   * Nutrient name  
  **/
  private String name = null;
  
  @Schema(description = "The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)")
 /**
   * The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)  
  **/
  private String measurementUnit = null;
  
  @Schema(description = "Amount of the nutrient per 100g of food")
 /**
   * Amount of the nutrient per 100g of food  
  **/
  private BigDecimal per100g = null;
  
  @Schema(description = "Nutrient value per serving")
 /**
   * Nutrient value per serving  
  **/
  private BigDecimal perServing = null;
  
  @Schema(description = "Total nutrient value")
 /**
   * Total nutrient value  
  **/
  private BigDecimal total = null;
 /**
   * Nutrient name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandedFoodObjectNutrientsChomp name(String name) {
    this.name = name;
    return this;
  }

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

  public BrandedFoodObjectNutrientsChomp measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

 /**
   * Amount of the nutrient per 100g of food
   * @return per100g
  **/
  @JsonProperty("per_100g")
  public BigDecimal getPer100g() {
    return per100g;
  }

  public void setPer100g(BigDecimal per100g) {
    this.per100g = per100g;
  }

  public BrandedFoodObjectNutrientsChomp per100g(BigDecimal per100g) {
    this.per100g = per100g;
    return this;
  }

 /**
   * Nutrient value per serving
   * @return perServing
  **/
  @JsonProperty("per_serving")
  public BigDecimal getPerServing() {
    return perServing;
  }

  public void setPerServing(BigDecimal perServing) {
    this.perServing = perServing;
  }

  public BrandedFoodObjectNutrientsChomp perServing(BigDecimal perServing) {
    this.perServing = perServing;
    return this;
  }

 /**
   * Total nutrient value
   * @return total
  **/
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public BrandedFoodObjectNutrientsChomp total(BigDecimal total) {
    this.total = total;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrientsChomp {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    perServing: ").append(toIndentedString(perServing)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
