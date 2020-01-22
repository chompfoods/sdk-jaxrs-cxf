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
  * Serving information from the USDA
 **/
@Schema(description="Serving information from the USDA")
public class BrandedFoodObjectServingUsda   {
  
  @Schema(description = "Serving size")
 /**
   * Serving size  
  **/
  private String size = null;
  
  @Schema(description = "Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)")
 /**
   * Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)  
  **/
  private String measurementUnit = null;
  
  @Schema(description = "Serving size description")
 /**
   * Serving size description  
  **/
  private String sizeFulltext = null;
 /**
   * Serving size
   * @return size
  **/
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public BrandedFoodObjectServingUsda size(String size) {
    this.size = size;
    return this;
  }

 /**
   * Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)
   * @return measurementUnit
  **/
  @JsonProperty("measurement_unit")
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectServingUsda measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

 /**
   * Serving size description
   * @return sizeFulltext
  **/
  @JsonProperty("size_fulltext")
  public String getSizeFulltext() {
    return sizeFulltext;
  }

  public void setSizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
  }

  public BrandedFoodObjectServingUsda sizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServingUsda {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    sizeFulltext: ").append(toIndentedString(sizeFulltext)).append("\n");
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
