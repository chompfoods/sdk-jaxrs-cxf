package io.swagger.model;


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

public class RecipeObjectNutrientsCalories   {
  
  @Schema(description = "Nutrient name")
 /**
   * Nutrient name  
  **/
  private String title = null;
  
  @Schema(description = "The amount of this nutrient in this recipe")
 /**
   * The amount of this nutrient in this recipe  
  **/
  private String value = null;
  
  @Schema(description = "The daily recommended percent total for this nutrient")
 /**
   * The daily recommended percent total for this nutrient  
  **/
  private String percent = null;
 /**
   * Nutrient name
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RecipeObjectNutrientsCalories title(String title) {
    this.title = title;
    return this;
  }

 /**
   * The amount of this nutrient in this recipe
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public RecipeObjectNutrientsCalories value(String value) {
    this.value = value;
    return this;
  }

 /**
   * The daily recommended percent total for this nutrient
   * @return percent
  **/
  @JsonProperty("percent")
  public String getPercent() {
    return percent;
  }

  public void setPercent(String percent) {
    this.percent = percent;
  }

  public RecipeObjectNutrientsCalories percent(String percent) {
    this.percent = percent;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectNutrientsCalories {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
