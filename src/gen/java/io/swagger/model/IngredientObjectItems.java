package io.swagger.model;

import io.swagger.model.BrandedFoodObjectCalorieConversionFactor;
import io.swagger.model.BrandedFoodObjectComponents;
import io.swagger.model.BrandedFoodObjectDietLabels;
import io.swagger.model.BrandedFoodObjectPortions;
import io.swagger.model.IngredientObjectNutrients;
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
  
  @Schema(description = "")
  private IngredientObjectNutrients nutrients = null;
  
  @Schema(description = "")
  private BrandedFoodObjectCalorieConversionFactor calorieConversionFactor = null;
  
  @Schema(description = "The multiplication factor used to calculate protein from nitrogen")
 /**
   * The multiplication factor used to calculate protein from nitrogen  
  **/
  private BigDecimal proteinConversionFactor = null;
  
  @Schema(description = "")
  private BrandedFoodObjectDietLabels dietLabels = null;
  
  @Schema(description = "An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)")
 /**
   * An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)  
  **/
  private List<BrandedFoodObjectComponents> components = null;
  
  @Schema(description = "An array of objects containing information on discrete amounts of a food found in this item")
 /**
   * An array of objects containing information on discrete amounts of a food found in this item  
  **/
  private List<BrandedFoodObjectPortions> portions = null;
  
  @Schema(description = "Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")")
 /**
   * Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")  
  **/
  private String commonName = null;
  
  @Schema(description = "A description of this item")
 /**
   * A description of this item  
  **/
  private String description = null;
  
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
   * Get nutrients
   * @return nutrients
  **/
  @JsonProperty("nutrients")
  public IngredientObjectNutrients getNutrients() {
    return nutrients;
  }

  public void setNutrients(IngredientObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  public IngredientObjectItems nutrients(IngredientObjectNutrients nutrients) {
    this.nutrients = nutrients;
    return this;
  }

 /**
   * Get calorieConversionFactor
   * @return calorieConversionFactor
  **/
  @JsonProperty("calorie_conversion_factor")
  public BrandedFoodObjectCalorieConversionFactor getCalorieConversionFactor() {
    return calorieConversionFactor;
  }

  public void setCalorieConversionFactor(BrandedFoodObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
  }

  public IngredientObjectItems calorieConversionFactor(BrandedFoodObjectCalorieConversionFactor calorieConversionFactor) {
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
   * Get dietLabels
   * @return dietLabels
  **/
  @JsonProperty("diet_labels")
  public BrandedFoodObjectDietLabels getDietLabels() {
    return dietLabels;
  }

  public void setDietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
  }

  public IngredientObjectItems dietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
    return this;
  }

 /**
   * An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
   * @return components
  **/
  @JsonProperty("components")
  public List<BrandedFoodObjectComponents> getComponents() {
    return components;
  }

  public void setComponents(List<BrandedFoodObjectComponents> components) {
    this.components = components;
  }

  public IngredientObjectItems components(List<BrandedFoodObjectComponents> components) {
    this.components = components;
    return this;
  }

  public IngredientObjectItems addComponentsItem(BrandedFoodObjectComponents componentsItem) {
    this.components.add(componentsItem);
    return this;
  }

 /**
   * An array of objects containing information on discrete amounts of a food found in this item
   * @return portions
  **/
  @JsonProperty("portions")
  public List<BrandedFoodObjectPortions> getPortions() {
    return portions;
  }

  public void setPortions(List<BrandedFoodObjectPortions> portions) {
    this.portions = portions;
  }

  public IngredientObjectItems portions(List<BrandedFoodObjectPortions> portions) {
    this.portions = portions;
    return this;
  }

  public IngredientObjectItems addPortionsItem(BrandedFoodObjectPortions portionsItem) {
    this.portions.add(portionsItem);
    return this;
  }

 /**
   * Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \&quot;BRAND&#x27;s Spicy Enchilada\&quot; the common name may be \&quot;Chicken enchilada\&quot;)
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
   * A description of this item
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IngredientObjectItems description(String description) {
    this.description = description;
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
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    portions: ").append(toIndentedString(portions)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
