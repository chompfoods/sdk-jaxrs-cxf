package io.swagger.model;

import io.swagger.model.IngredientObjectCalorieConversionFactor;
import io.swagger.model.IngredientObjectComponents;
import io.swagger.model.IngredientObjectNutrients;
import io.swagger.model.IngredientObjectPortions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
  * An object containing information for this specific item.
 **/
@Schema(description="An object containing information for this specific item.")
public class IngredientObjectItems   {
  
  @Schema(description = "Item name as provided by brand owner or as shown on packaging")
 /**
   * Item name as provided by brand owner or as shown on packaging  
  **/
  private String name = null;
  
  @Schema(description = "")
  private List<String> categories = null;
  
  @Schema(description = "An array containing nutrient informatio objects for this food item")
 /**
   * An array containing nutrient informatio objects for this food item  
  **/
  private List<IngredientObjectNutrients> nutrients = null;
  
  @Schema(description = "")
  private IngredientObjectCalorieConversionFactor calorieConversionFactor = null;
  
  @Schema(description = "The multiplication factor used to calculate protein from nitrogen")
 /**
   * The multiplication factor used to calculate protein from nitrogen  
  **/
  private BigDecimal proteinConversionFactor = null;
  
  @Schema(description = "An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)")
 /**
   * An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)  
  **/
  private List<IngredientObjectComponents> components = null;
  
  @Schema(description = "An array of objects containing information on discrete amounts of a food found in this item")
 /**
   * An array of objects containing information on discrete amounts of a food found in this item  
  **/
  private List<IngredientObjectPortions> portions = null;
  
  @Schema(description = "Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")")
 /**
   * Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")  
  **/
  private String commonName = null;
  
  @Schema(description = "Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.")
 /**
   * Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.  
  **/
  private String footnote = null;
 /**
   * Item name as provided by brand owner or as shown on packaging
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientObjectItems name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public IngredientObjectItems categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public IngredientObjectItems addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * An array containing nutrient informatio objects for this food item
   * @return nutrients
  **/
  @JsonProperty("nutrients")
  public List<IngredientObjectNutrients> getNutrients() {
    return nutrients;
  }

  public void setNutrients(List<IngredientObjectNutrients> nutrients) {
    this.nutrients = nutrients;
  }

  public IngredientObjectItems nutrients(List<IngredientObjectNutrients> nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  public IngredientObjectItems addNutrientsItem(IngredientObjectNutrients nutrientsItem) {
    this.nutrients.add(nutrientsItem);
    return this;
  }

 /**
   * Get calorieConversionFactor
   * @return calorieConversionFactor
  **/
  @JsonProperty("calorie_conversion_factor")
  public IngredientObjectCalorieConversionFactor getCalorieConversionFactor() {
    return calorieConversionFactor;
  }

  public void setCalorieConversionFactor(IngredientObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
  }

  public IngredientObjectItems calorieConversionFactor(IngredientObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
    return this;
  }

 /**
   * The multiplication factor used to calculate protein from nitrogen
   * @return proteinConversionFactor
  **/
  @JsonProperty("protein_conversion_factor")
  public BigDecimal getProteinConversionFactor() {
    return proteinConversionFactor;
  }

  public void setProteinConversionFactor(BigDecimal proteinConversionFactor) {
    this.proteinConversionFactor = proteinConversionFactor;
  }

  public IngredientObjectItems proteinConversionFactor(BigDecimal proteinConversionFactor) {
    this.proteinConversionFactor = proteinConversionFactor;
    return this;
  }

 /**
   * An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
   * @return components
  **/
  @JsonProperty("components")
  public List<IngredientObjectComponents> getComponents() {
    return components;
  }

  public void setComponents(List<IngredientObjectComponents> components) {
    this.components = components;
  }

  public IngredientObjectItems components(List<IngredientObjectComponents> components) {
    this.components = components;
    return this;
  }

  public IngredientObjectItems addComponentsItem(IngredientObjectComponents componentsItem) {
    this.components.add(componentsItem);
    return this;
  }

 /**
   * An array of objects containing information on discrete amounts of a food found in this item
   * @return portions
  **/
  @JsonProperty("portions")
  public List<IngredientObjectPortions> getPortions() {
    return portions;
  }

  public void setPortions(List<IngredientObjectPortions> portions) {
    this.portions = portions;
  }

  public IngredientObjectItems portions(List<IngredientObjectPortions> portions) {
    this.portions = portions;
    return this;
  }

  public IngredientObjectItems addPortionsItem(IngredientObjectPortions portionsItem) {
    this.portions.add(portionsItem);
    return this;
  }

 /**
   * Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \&quot;BRAND&#x27;s Spicy Enchilada\&quot; the common name may be \&quot;Chicken enchilada\&quot;)
   * @return commonName
  **/
  @JsonProperty("common_name")
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public IngredientObjectItems commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

 /**
   * Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.
   * @return footnote
  **/
  @JsonProperty("footnote")
  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  public IngredientObjectItems footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectItems {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    calorieConversionFactor: ").append(toIndentedString(calorieConversionFactor)).append("\n");
    sb.append("    proteinConversionFactor: ").append(toIndentedString(proteinConversionFactor)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    portions: ").append(toIndentedString(portions)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
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
