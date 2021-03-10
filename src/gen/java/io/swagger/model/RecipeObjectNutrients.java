package io.swagger.model;

import io.swagger.model.RecipeObjectNutrientsCalories;
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
  * An object containing nutrient information for this recipe
 **/
@Schema(description="An object containing nutrient information for this recipe")
public class RecipeObjectNutrients   {
  
  @Schema(description = "An array containing information for calories found in this recipe")
 /**
   * An array containing information for calories found in this recipe  
  **/
  private List<RecipeObjectNutrientsCalories> calories = null;
  
  @Schema(description = "An array containing information for this recipe's daily recommended value of certain nutrients")
 /**
   * An array containing information for this recipe's daily recommended value of certain nutrients  
  **/
  private List<RecipeObjectNutrientsCalories> dailyValues = null;
  
  @Schema(description = "An array containing information for fat found in this recipe")
 /**
   * An array containing information for fat found in this recipe  
  **/
  private List<RecipeObjectNutrientsCalories> fat = null;
  
  @Schema(description = "An array containing information for carbs found in this recipe")
 /**
   * An array containing information for carbs found in this recipe  
  **/
  private List<RecipeObjectNutrientsCalories> carbs = null;
  
  @Schema(description = "An array containing information for vitamins found in this recipe")
 /**
   * An array containing information for vitamins found in this recipe  
  **/
  private List<RecipeObjectNutrientsCalories> vitamins = null;
 /**
   * An array containing information for calories found in this recipe
   * @return calories
  **/
  @JsonProperty("calories")
  public List<RecipeObjectNutrientsCalories> getCalories() {
    return calories;
  }

  public void setCalories(List<RecipeObjectNutrientsCalories> calories) {
    this.calories = calories;
  }

  public RecipeObjectNutrients calories(List<RecipeObjectNutrientsCalories> calories) {
    this.calories = calories;
    return this;
  }

  public RecipeObjectNutrients addCaloriesItem(RecipeObjectNutrientsCalories caloriesItem) {
    this.calories.add(caloriesItem);
    return this;
  }

 /**
   * An array containing information for this recipe&#x27;s daily recommended value of certain nutrients
   * @return dailyValues
  **/
  @JsonProperty("daily_values")
  public List<RecipeObjectNutrientsCalories> getDailyValues() {
    return dailyValues;
  }

  public void setDailyValues(List<RecipeObjectNutrientsCalories> dailyValues) {
    this.dailyValues = dailyValues;
  }

  public RecipeObjectNutrients dailyValues(List<RecipeObjectNutrientsCalories> dailyValues) {
    this.dailyValues = dailyValues;
    return this;
  }

  public RecipeObjectNutrients addDailyValuesItem(RecipeObjectNutrientsCalories dailyValuesItem) {
    this.dailyValues.add(dailyValuesItem);
    return this;
  }

 /**
   * An array containing information for fat found in this recipe
   * @return fat
  **/
  @JsonProperty("fat")
  public List<RecipeObjectNutrientsCalories> getFat() {
    return fat;
  }

  public void setFat(List<RecipeObjectNutrientsCalories> fat) {
    this.fat = fat;
  }

  public RecipeObjectNutrients fat(List<RecipeObjectNutrientsCalories> fat) {
    this.fat = fat;
    return this;
  }

  public RecipeObjectNutrients addFatItem(RecipeObjectNutrientsCalories fatItem) {
    this.fat.add(fatItem);
    return this;
  }

 /**
   * An array containing information for carbs found in this recipe
   * @return carbs
  **/
  @JsonProperty("carbs")
  public List<RecipeObjectNutrientsCalories> getCarbs() {
    return carbs;
  }

  public void setCarbs(List<RecipeObjectNutrientsCalories> carbs) {
    this.carbs = carbs;
  }

  public RecipeObjectNutrients carbs(List<RecipeObjectNutrientsCalories> carbs) {
    this.carbs = carbs;
    return this;
  }

  public RecipeObjectNutrients addCarbsItem(RecipeObjectNutrientsCalories carbsItem) {
    this.carbs.add(carbsItem);
    return this;
  }

 /**
   * An array containing information for vitamins found in this recipe
   * @return vitamins
  **/
  @JsonProperty("vitamins")
  public List<RecipeObjectNutrientsCalories> getVitamins() {
    return vitamins;
  }

  public void setVitamins(List<RecipeObjectNutrientsCalories> vitamins) {
    this.vitamins = vitamins;
  }

  public RecipeObjectNutrients vitamins(List<RecipeObjectNutrientsCalories> vitamins) {
    this.vitamins = vitamins;
    return this;
  }

  public RecipeObjectNutrients addVitaminsItem(RecipeObjectNutrientsCalories vitaminsItem) {
    this.vitamins.add(vitaminsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectNutrients {\n");
    
    sb.append("    calories: ").append(toIndentedString(calories)).append("\n");
    sb.append("    dailyValues: ").append(toIndentedString(dailyValues)).append("\n");
    sb.append("    fat: ").append(toIndentedString(fat)).append("\n");
    sb.append("    carbs: ").append(toIndentedString(carbs)).append("\n");
    sb.append("    vitamins: ").append(toIndentedString(vitamins)).append("\n");
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
