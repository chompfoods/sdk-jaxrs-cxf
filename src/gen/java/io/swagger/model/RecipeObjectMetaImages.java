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
  * An object containing this recipe's image URLs
 **/
@Schema(description="An object containing this recipe's image URLs")
public class RecipeObjectMetaImages   {
  
  @Schema(description = "Extra large recipe image")
 /**
   * Extra large recipe image  
  **/
  private String extraLarge = null;
  
  @Schema(description = "Large recipe image")
 /**
   * Large recipe image  
  **/
  private String large = null;
  
  @Schema(description = "Standard recipe image")
 /**
   * Standard recipe image  
  **/
  private String standard = null;
  
  @Schema(description = "Grid view recipe image")
 /**
   * Grid view recipe image  
  **/
  private String gridView = null;
  
  @Schema(description = "Small recipe image")
 /**
   * Small recipe image  
  **/
  private String small = null;
  
  @Schema(description = "Thumbnail recipe image")
 /**
   * Thumbnail recipe image  
  **/
  private String thumbnail = null;
  
  @Schema(description = "Extra small recipe image")
 /**
   * Extra small recipe image  
  **/
  private String extraSmall = null;
 /**
   * Extra large recipe image
   * @return extraLarge
  **/
  @JsonProperty("extra_large")
  public String getExtraLarge() {
    return extraLarge;
  }

  public void setExtraLarge(String extraLarge) {
    this.extraLarge = extraLarge;
  }

  public RecipeObjectMetaImages extraLarge(String extraLarge) {
    this.extraLarge = extraLarge;
    return this;
  }

 /**
   * Large recipe image
   * @return large
  **/
  @JsonProperty("large")
  public String getLarge() {
    return large;
  }

  public void setLarge(String large) {
    this.large = large;
  }

  public RecipeObjectMetaImages large(String large) {
    this.large = large;
    return this;
  }

 /**
   * Standard recipe image
   * @return standard
  **/
  @JsonProperty("standard")
  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public RecipeObjectMetaImages standard(String standard) {
    this.standard = standard;
    return this;
  }

 /**
   * Grid view recipe image
   * @return gridView
  **/
  @JsonProperty("grid_view")
  public String getGridView() {
    return gridView;
  }

  public void setGridView(String gridView) {
    this.gridView = gridView;
  }

  public RecipeObjectMetaImages gridView(String gridView) {
    this.gridView = gridView;
    return this;
  }

 /**
   * Small recipe image
   * @return small
  **/
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public RecipeObjectMetaImages small(String small) {
    this.small = small;
    return this;
  }

 /**
   * Thumbnail recipe image
   * @return thumbnail
  **/
  @JsonProperty("thumbnail")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public RecipeObjectMetaImages thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

 /**
   * Extra small recipe image
   * @return extraSmall
  **/
  @JsonProperty("extra_small")
  public String getExtraSmall() {
    return extraSmall;
  }

  public void setExtraSmall(String extraSmall) {
    this.extraSmall = extraSmall;
  }

  public RecipeObjectMetaImages extraSmall(String extraSmall) {
    this.extraSmall = extraSmall;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectMetaImages {\n");
    
    sb.append("    extraLarge: ").append(toIndentedString(extraLarge)).append("\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    gridView: ").append(toIndentedString(gridView)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    extraSmall: ").append(toIndentedString(extraSmall)).append("\n");
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
