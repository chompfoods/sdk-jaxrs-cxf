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
  * An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet
 **/
@Schema(description="An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet")
public class BrandedFoodObjectDietFlags   {
  
  @Schema(description = "Ingredient name")
 /**
   * Ingredient name  
  **/
  private String ingredient = null;
  
  @Schema(description = "Description of the ingredient")
 /**
   * Description of the ingredient  
  **/
  private String ingredientDescription = null;
  
  @Schema(description = "Name of the diet with which this ingredient may not be compatible")
 /**
   * Name of the diet with which this ingredient may not be compatible  
  **/
  private String dietLabel = null;
  
  @Schema(description = "A description of if we believe this ingredient is compatible with the diet")
 /**
   * A description of if we believe this ingredient is compatible with the diet  
  **/
  private String isCompatible = null;
  
  @Schema(description = "A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility")
 /**
   * A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility  
  **/
  private Integer compatibilityLevel = null;
  
  @Schema(description = "A description of how we graded this ingredient for compatibility with the diet")
 /**
   * A description of how we graded this ingredient for compatibility with the diet  
  **/
  private String compatibilityDescription = null;
  
  @Schema(description = "Boolean representing if the ingredient is a known allergen")
 /**
   * Boolean representing if the ingredient is a known allergen  
  **/
  private Boolean isAllergen = null;
 /**
   * Ingredient name
   * @return ingredient
  **/
  @JsonProperty("ingredient")
  public String getIngredient() {
    return ingredient;
  }

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  public BrandedFoodObjectDietFlags ingredient(String ingredient) {
    this.ingredient = ingredient;
    return this;
  }

 /**
   * Description of the ingredient
   * @return ingredientDescription
  **/
  @JsonProperty("ingredient_description")
  public String getIngredientDescription() {
    return ingredientDescription;
  }

  public void setIngredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
  }

  public BrandedFoodObjectDietFlags ingredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
    return this;
  }

 /**
   * Name of the diet with which this ingredient may not be compatible
   * @return dietLabel
  **/
  @JsonProperty("diet_label")
  public String getDietLabel() {
    return dietLabel;
  }

  public void setDietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
  }

  public BrandedFoodObjectDietFlags dietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
    return this;
  }

 /**
   * A description of if we believe this ingredient is compatible with the diet
   * @return isCompatible
  **/
  @JsonProperty("is_compatible")
  public String getIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
  }

  public BrandedFoodObjectDietFlags isCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

 /**
   * A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility
   * @return compatibilityLevel
  **/
  @JsonProperty("compatibility_level")
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }

  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  public BrandedFoodObjectDietFlags compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

 /**
   * A description of how we graded this ingredient for compatibility with the diet
   * @return compatibilityDescription
  **/
  @JsonProperty("compatibility_description")
  public String getCompatibilityDescription() {
    return compatibilityDescription;
  }

  public void setCompatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
  }

  public BrandedFoodObjectDietFlags compatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
    return this;
  }

 /**
   * Boolean representing if the ingredient is a known allergen
   * @return isAllergen
  **/
  @JsonProperty("is_allergen")
  public Boolean isIsAllergen() {
    return isAllergen;
  }

  public void setIsAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
  }

  public BrandedFoodObjectDietFlags isAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietFlags {\n");
    
    sb.append("    ingredient: ").append(toIndentedString(ingredient)).append("\n");
    sb.append("    ingredientDescription: ").append(toIndentedString(ingredientDescription)).append("\n");
    sb.append("    dietLabel: ").append(toIndentedString(dietLabel)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    compatibilityDescription: ").append(toIndentedString(compatibilityDescription)).append("\n");
    sb.append("    isAllergen: ").append(toIndentedString(isAllergen)).append("\n");
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
