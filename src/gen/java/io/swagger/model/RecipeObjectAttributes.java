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
  * An object containing recipe attributes
 **/
@Schema(description="An object containing recipe attributes")
public class RecipeObjectAttributes   {
  
  @Schema(description = "The time it takes to prep this recipe")
 /**
   * The time it takes to prep this recipe  
  **/
  private String prepTime = null;
  
  @Schema(description = "The total time it takes to make this recipe")
 /**
   * The total time it takes to make this recipe  
  **/
  private String totalTime = null;
  
  @Schema(description = "The number of servings this recipe makes")
 /**
   * The number of servings this recipe makes  
  **/
  private String servings = null;
  
  @Schema(description = "The size of each serving")
 /**
   * The size of each serving  
  **/
  private String servingSize = null;
 /**
   * The time it takes to prep this recipe
   * @return prepTime
  **/
  @JsonProperty("prep_time")
  public String getPrepTime() {
    return prepTime;
  }

  public void setPrepTime(String prepTime) {
    this.prepTime = prepTime;
  }

  public RecipeObjectAttributes prepTime(String prepTime) {
    this.prepTime = prepTime;
    return this;
  }

 /**
   * The total time it takes to make this recipe
   * @return totalTime
  **/
  @JsonProperty("total_time")
  public String getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(String totalTime) {
    this.totalTime = totalTime;
  }

  public RecipeObjectAttributes totalTime(String totalTime) {
    this.totalTime = totalTime;
    return this;
  }

 /**
   * The number of servings this recipe makes
   * @return servings
  **/
  @JsonProperty("servings")
  public String getServings() {
    return servings;
  }

  public void setServings(String servings) {
    this.servings = servings;
  }

  public RecipeObjectAttributes servings(String servings) {
    this.servings = servings;
    return this;
  }

 /**
   * The size of each serving
   * @return servingSize
  **/
  @JsonProperty("serving_size")
  public String getServingSize() {
    return servingSize;
  }

  public void setServingSize(String servingSize) {
    this.servingSize = servingSize;
  }

  public RecipeObjectAttributes servingSize(String servingSize) {
    this.servingSize = servingSize;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectAttributes {\n");
    
    sb.append("    prepTime: ").append(toIndentedString(prepTime)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
    sb.append("    servingSize: ").append(toIndentedString(servingSize)).append("\n");
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
