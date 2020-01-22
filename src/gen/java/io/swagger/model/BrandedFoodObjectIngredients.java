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
  * An object containing this item's ingredients in order of highest value to least
 **/
@Schema(description="An object containing this item's ingredients in order of highest value to least")
public class BrandedFoodObjectIngredients   {
  
  @Schema(description = "This item's ingredients as seen on ChompThis.com")
 /**
   * This item's ingredients as seen on ChompThis.com  
  **/
  private String chomp = null;
  
  @Schema(description = "This branded food item's ingredients according to the USDA")
 /**
   * This branded food item's ingredients according to the USDA  
  **/
  private String usda = null;
 /**
   * This item&#x27;s ingredients as seen on ChompThis.com
   * @return chomp
  **/
  @JsonProperty("chomp")
  public String getChomp() {
    return chomp;
  }

  public void setChomp(String chomp) {
    this.chomp = chomp;
  }

  public BrandedFoodObjectIngredients chomp(String chomp) {
    this.chomp = chomp;
    return this;
  }

 /**
   * This branded food item&#x27;s ingredients according to the USDA
   * @return usda
  **/
  @JsonProperty("usda")
  public String getUsda() {
    return usda;
  }

  public void setUsda(String usda) {
    this.usda = usda;
  }

  public BrandedFoodObjectIngredients usda(String usda) {
    this.usda = usda;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectIngredients {\n");
    
    sb.append("    chomp: ").append(toIndentedString(chomp)).append("\n");
    sb.append("    usda: ").append(toIndentedString(usda)).append("\n");
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
