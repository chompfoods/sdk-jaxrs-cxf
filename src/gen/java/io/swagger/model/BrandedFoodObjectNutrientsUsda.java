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

public class BrandedFoodObjectNutrientsUsda   {
  
  @Schema(description = "Nutrient ID")
 /**
   * Nutrient ID  
  **/
  private Integer id = null;
  
  @Schema(description = "Nutrient name")
 /**
   * Nutrient name  
  **/
  private String name = null;
  
  @Schema(description = "Amount of the nutrient per 100g of food")
 /**
   * Amount of the nutrient per 100g of food  
  **/
  private BigDecimal per100g = null;
  
  @Schema(description = "The unit used for the measure of this nutrient")
 /**
   * The unit used for the measure of this nutrient  
  **/
  private String measurementUnit = null;
  
  @Schema(description = "Minimum nutrient value")
 /**
   * Minimum nutrient value  
  **/
  private BigDecimal min = null;
  
  @Schema(description = "Maximum nutrient value")
 /**
   * Maximum nutrient value  
  **/
  private BigDecimal max = null;
  
  @Schema(description = "Median nutrient value")
 /**
   * Median nutrient value  
  **/
  private BigDecimal median = null;
  
  @Schema(description = "Nutrient rank")
 /**
   * Nutrient rank  
  **/
  private Integer rank = null;
  
  @Schema(description = "Number of observations on which the value is based")
 /**
   * Number of observations on which the value is based  
  **/
  private Integer dataPoints = null;
  
  @Schema(description = "Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.")
 /**
   * Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.  
  **/
  private String footnote = null;
  
  @Schema(description = "Description of the nutrient source")
 /**
   * Description of the nutrient source  
  **/
  private String description = null;
 /**
   * Nutrient ID
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BrandedFoodObjectNutrientsUsda id(Integer id) {
    this.id = id;
    return this;
  }

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

  public BrandedFoodObjectNutrientsUsda name(String name) {
    this.name = name;
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

  public BrandedFoodObjectNutrientsUsda per100g(BigDecimal per100g) {
    this.per100g = per100g;
    return this;
  }

 /**
   * The unit used for the measure of this nutrient
   * @return measurementUnit
  **/
  @JsonProperty("measurement_unit")
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectNutrientsUsda measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

 /**
   * Minimum nutrient value
   * @return min
  **/
  @JsonProperty("min")
  public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public BrandedFoodObjectNutrientsUsda min(BigDecimal min) {
    this.min = min;
    return this;
  }

 /**
   * Maximum nutrient value
   * @return max
  **/
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public BrandedFoodObjectNutrientsUsda max(BigDecimal max) {
    this.max = max;
    return this;
  }

 /**
   * Median nutrient value
   * @return median
  **/
  @JsonProperty("median")
  public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public BrandedFoodObjectNutrientsUsda median(BigDecimal median) {
    this.median = median;
    return this;
  }

 /**
   * Nutrient rank
   * @return rank
  **/
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public BrandedFoodObjectNutrientsUsda rank(Integer rank) {
    this.rank = rank;
    return this;
  }

 /**
   * Number of observations on which the value is based
   * @return dataPoints
  **/
  @JsonProperty("data_points")
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public BrandedFoodObjectNutrientsUsda dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

 /**
   * Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.
   * @return footnote
  **/
  @JsonProperty("footnote")
  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  public BrandedFoodObjectNutrientsUsda footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

 /**
   * Description of the nutrient source
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BrandedFoodObjectNutrientsUsda description(String description) {
    this.description = description;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrientsUsda {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
