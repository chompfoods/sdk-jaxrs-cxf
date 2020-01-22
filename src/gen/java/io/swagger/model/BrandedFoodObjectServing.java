package io.swagger.model;

import io.swagger.model.BrandedFoodObjectServingChomp;
import io.swagger.model.BrandedFoodObjectServingUsda;
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
  * An object containing serving information for this item
 **/
@Schema(description="An object containing serving information for this item")
public class BrandedFoodObjectServing   {
  
  @Schema(description = "")
  private BrandedFoodObjectServingChomp chomp = null;
  
  @Schema(description = "")
  private BrandedFoodObjectServingUsda usda = null;
 /**
   * Get chomp
   * @return chomp
  **/
  @JsonProperty("chomp")
  public BrandedFoodObjectServingChomp getChomp() {
    return chomp;
  }

  public void setChomp(BrandedFoodObjectServingChomp chomp) {
    this.chomp = chomp;
  }

  public BrandedFoodObjectServing chomp(BrandedFoodObjectServingChomp chomp) {
    this.chomp = chomp;
    return this;
  }

 /**
   * Get usda
   * @return usda
  **/
  @JsonProperty("usda")
  public BrandedFoodObjectServingUsda getUsda() {
    return usda;
  }

  public void setUsda(BrandedFoodObjectServingUsda usda) {
    this.usda = usda;
  }

  public BrandedFoodObjectServing usda(BrandedFoodObjectServingUsda usda) {
    this.usda = usda;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServing {\n");
    
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
