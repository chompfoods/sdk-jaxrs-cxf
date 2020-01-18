package io.swagger.model;

import io.swagger.model.BrandedFoodObjectNutrientsUsda;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

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
  * An object containing nutrient information from each source
 **/
@Schema(description="An object containing nutrient information from each source")
public class IngredientObjectNutrients   {
  
  @Schema(description = "An array containing an object for each nutrient data point as found in the USDA database")
 /**
   * An array containing an object for each nutrient data point as found in the USDA database  
  **/
  private List<BrandedFoodObjectNutrientsUsda> usda = null;
 /**
   * An array containing an object for each nutrient data point as found in the USDA database
   * @return usda
  **/
  @JsonProperty("usda")
  public List<BrandedFoodObjectNutrientsUsda> getUsda() {
    return usda;
  }

  public void setUsda(List<BrandedFoodObjectNutrientsUsda> usda) {
    this.usda = usda;
  }

  public IngredientObjectNutrients usda(List<BrandedFoodObjectNutrientsUsda> usda) {
    this.usda = usda;
    return this;
  }

  public IngredientObjectNutrients addUsdaItem(BrandedFoodObjectNutrientsUsda usdaItem) {
    this.usda.add(usdaItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectNutrients {\n");
    
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