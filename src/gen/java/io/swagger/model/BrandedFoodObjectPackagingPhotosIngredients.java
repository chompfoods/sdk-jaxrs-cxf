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
  * An object containing photos of the ingredients on this item's packaging
 **/
@Schema(description="An object containing photos of the ingredients on this item's packaging")
public class BrandedFoodObjectPackagingPhotosIngredients   {
  
  @Schema(description = "Small photo of the ingredients on this item's packaging")
 /**
   * Small photo of the ingredients on this item's packaging  
  **/
  private String small = null;
  
  @Schema(description = "Thumbnail photo of the ingredients on this item's packaging")
 /**
   * Thumbnail photo of the ingredients on this item's packaging  
  **/
  private String thumb = null;
  
  @Schema(description = "Full-sized photo of the ingredients on this item's packaging")
 /**
   * Full-sized photo of the ingredients on this item's packaging  
  **/
  private String display = null;
 /**
   * Small photo of the ingredients on this item&#x27;s packaging
   * @return small
  **/
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public BrandedFoodObjectPackagingPhotosIngredients small(String small) {
    this.small = small;
    return this;
  }

 /**
   * Thumbnail photo of the ingredients on this item&#x27;s packaging
   * @return thumb
  **/
  @JsonProperty("thumb")
  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public BrandedFoodObjectPackagingPhotosIngredients thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

 /**
   * Full-sized photo of the ingredients on this item&#x27;s packaging
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public BrandedFoodObjectPackagingPhotosIngredients display(String display) {
    this.display = display;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotosIngredients {\n");
    
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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
