package io.swagger.model;

import io.swagger.model.BrandedFoodObjectDietLabelsGlutenFree;
import io.swagger.model.BrandedFoodObjectDietLabelsVegan;
import io.swagger.model.BrandedFoodObjectDietLabelsVegetarian;
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
  * An object containing this item's compatibility grades for each supported diet
 **/
@Schema(description="An object containing this item's compatibility grades for each supported diet")
public class BrandedFoodObjectDietLabels   {
  
  @Schema(description = "")
  private BrandedFoodObjectDietLabelsVegan vegan = null;
  
  @Schema(description = "")
  private BrandedFoodObjectDietLabelsVegetarian vegetarian = null;
  
  @Schema(description = "")
  private BrandedFoodObjectDietLabelsGlutenFree glutenFree = null;
 /**
   * Get vegan
   * @return vegan
  **/
  @JsonProperty("vegan")
  public BrandedFoodObjectDietLabelsVegan getVegan() {
    return vegan;
  }

  public void setVegan(BrandedFoodObjectDietLabelsVegan vegan) {
    this.vegan = vegan;
  }

  public BrandedFoodObjectDietLabels vegan(BrandedFoodObjectDietLabelsVegan vegan) {
    this.vegan = vegan;
    return this;
  }

 /**
   * Get vegetarian
   * @return vegetarian
  **/
  @JsonProperty("vegetarian")
  public BrandedFoodObjectDietLabelsVegetarian getVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(BrandedFoodObjectDietLabelsVegetarian vegetarian) {
    this.vegetarian = vegetarian;
  }

  public BrandedFoodObjectDietLabels vegetarian(BrandedFoodObjectDietLabelsVegetarian vegetarian) {
    this.vegetarian = vegetarian;
    return this;
  }

 /**
   * Get glutenFree
   * @return glutenFree
  **/
  @JsonProperty("gluten_free")
  public BrandedFoodObjectDietLabelsGlutenFree getGlutenFree() {
    return glutenFree;
  }

  public void setGlutenFree(BrandedFoodObjectDietLabelsGlutenFree glutenFree) {
    this.glutenFree = glutenFree;
  }

  public BrandedFoodObjectDietLabels glutenFree(BrandedFoodObjectDietLabelsGlutenFree glutenFree) {
    this.glutenFree = glutenFree;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabels {\n");
    
    sb.append("    vegan: ").append(toIndentedString(vegan)).append("\n");
    sb.append("    vegetarian: ").append(toIndentedString(vegetarian)).append("\n");
    sb.append("    glutenFree: ").append(toIndentedString(glutenFree)).append("\n");
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
