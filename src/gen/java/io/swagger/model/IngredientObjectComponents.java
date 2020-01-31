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
  * An object containing information on a specific component of this food item
 **/
@Schema(description="An object containing information on a specific component of this food item")
public class IngredientObjectComponents   {
  
  @Schema(description = "The kind of component, e.g. bone")
 /**
   * The kind of component, e.g. bone  
  **/
  private String name = null;
  
  @Schema(description = "The weight of the component as a percentage of the total weight of the food")
 /**
   * The weight of the component as a percentage of the total weight of the food  
  **/
  private BigDecimal pctWeight = null;
  
  @Schema(description = "The weight of the component in grams")
 /**
   * The weight of the component in grams  
  **/
  private BigDecimal gramWeight = null;
  
  @Schema(description = "Whether the component is refuse, i.e. not edible")
 /**
   * Whether the component is refuse, i.e. not edible  
  **/
  private Boolean isRefuse = null;
  
  @Schema(description = "The number of obersvations on which the measure is based")
 /**
   * The number of obersvations on which the measure is based  
  **/
  private Integer dataPoints = null;
 /**
   * The kind of component, e.g. bone
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientObjectComponents name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The weight of the component as a percentage of the total weight of the food
   * @return pctWeight
  **/
  @JsonProperty("pct_weight")
  public BigDecimal getPctWeight() {
    return pctWeight;
  }

  public void setPctWeight(BigDecimal pctWeight) {
    this.pctWeight = pctWeight;
  }

  public IngredientObjectComponents pctWeight(BigDecimal pctWeight) {
    this.pctWeight = pctWeight;
    return this;
  }

 /**
   * The weight of the component in grams
   * @return gramWeight
  **/
  @JsonProperty("gram_weight")
  public BigDecimal getGramWeight() {
    return gramWeight;
  }

  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }

  public IngredientObjectComponents gramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
    return this;
  }

 /**
   * Whether the component is refuse, i.e. not edible
   * @return isRefuse
  **/
  @JsonProperty("is_refuse")
  public Boolean isIsRefuse() {
    return isRefuse;
  }

  public void setIsRefuse(Boolean isRefuse) {
    this.isRefuse = isRefuse;
  }

  public IngredientObjectComponents isRefuse(Boolean isRefuse) {
    this.isRefuse = isRefuse;
    return this;
  }

 /**
   * The number of obersvations on which the measure is based
   * @return dataPoints
  **/
  @JsonProperty("data_points")
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public IngredientObjectComponents dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectComponents {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pctWeight: ").append(toIndentedString(pctWeight)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    isRefuse: ").append(toIndentedString(isRefuse)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
