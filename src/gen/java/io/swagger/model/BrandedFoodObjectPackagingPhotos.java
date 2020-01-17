package io.swagger.model;

import io.swagger.model.BrandedFoodObjectPackagingPhotosFront;
import io.swagger.model.BrandedFoodObjectPackagingPhotosIngredients;
import io.swagger.model.BrandedFoodObjectPackagingPhotosNutrition;
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
  * A object containing a collection of photos of this item's packaging
 **/
@Schema(description="A object containing a collection of photos of this item's packaging")
public class BrandedFoodObjectPackagingPhotos   {
  
  @Schema(description = "")
  private BrandedFoodObjectPackagingPhotosFront front = null;
  
  @Schema(description = "")
  private BrandedFoodObjectPackagingPhotosNutrition nutrition = null;
  
  @Schema(description = "")
  private BrandedFoodObjectPackagingPhotosIngredients ingredients = null;
 /**
   * Get front
   * @return front
  **/
  @JsonProperty("front")
  public BrandedFoodObjectPackagingPhotosFront getFront() {
    return front;
  }

  public void setFront(BrandedFoodObjectPackagingPhotosFront front) {
    this.front = front;
  }

  public BrandedFoodObjectPackagingPhotos front(BrandedFoodObjectPackagingPhotosFront front) {
    this.front = front;
    return this;
  }

 /**
   * Get nutrition
   * @return nutrition
  **/
  @JsonProperty("nutrition")
  public BrandedFoodObjectPackagingPhotosNutrition getNutrition() {
    return nutrition;
  }

  public void setNutrition(BrandedFoodObjectPackagingPhotosNutrition nutrition) {
    this.nutrition = nutrition;
  }

  public BrandedFoodObjectPackagingPhotos nutrition(BrandedFoodObjectPackagingPhotosNutrition nutrition) {
    this.nutrition = nutrition;
    return this;
  }

 /**
   * Get ingredients
   * @return ingredients
  **/
  @JsonProperty("ingredients")
  public BrandedFoodObjectPackagingPhotosIngredients getIngredients() {
    return ingredients;
  }

  public void setIngredients(BrandedFoodObjectPackagingPhotosIngredients ingredients) {
    this.ingredients = ingredients;
  }

  public BrandedFoodObjectPackagingPhotos ingredients(BrandedFoodObjectPackagingPhotosIngredients ingredients) {
    this.ingredients = ingredients;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotos {\n");
    
    sb.append("    front: ").append(toIndentedString(front)).append("\n");
    sb.append("    nutrition: ").append(toIndentedString(nutrition)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
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
