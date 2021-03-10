package io.swagger.model;

import io.swagger.model.RecipeObjectMetaImages;
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
public class RecipeObjectMeta   {
  
  @Schema(description = "URL to the recipe. You must link back to the recipe when displaying it.")
 /**
   * URL to the recipe. You must link back to the recipe when displaying it.  
  **/
  private String url = null;
  
  @Schema(description = "")
  private RecipeObjectMetaImages images = null;
  
  @Schema(description = "The source of the recipe. You must attribute this source when displaying this recipe.")
 /**
   * The source of the recipe. You must attribute this source when displaying this recipe.  
  **/
  private String source = null;
  
  @Schema(description = "This recipe's cuisine")
 /**
   * This recipe's cuisine  
  **/
  private String cuisine = null;
  
  @Schema(description = "The date when this recipe was created")
 /**
   * The date when this recipe was created  
  **/
  private String created = null;
  
  @Schema(description = "The date when this recipe was most recently modified")
 /**
   * The date when this recipe was most recently modified  
  **/
  private String modified = null;
  
  @Schema(description = "Additional information about this recipe's nutrients")
 /**
   * Additional information about this recipe's nutrients  
  **/
  private String nutrientsNotice = null;
 /**
   * URL to the recipe. You must link back to the recipe when displaying it.
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RecipeObjectMeta url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get images
   * @return images
  **/
  @JsonProperty("images")
  public RecipeObjectMetaImages getImages() {
    return images;
  }

  public void setImages(RecipeObjectMetaImages images) {
    this.images = images;
  }

  public RecipeObjectMeta images(RecipeObjectMetaImages images) {
    this.images = images;
    return this;
  }

 /**
   * The source of the recipe. You must attribute this source when displaying this recipe.
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public RecipeObjectMeta source(String source) {
    this.source = source;
    return this;
  }

 /**
   * This recipe&#x27;s cuisine
   * @return cuisine
  **/
  @JsonProperty("cuisine")
  public String getCuisine() {
    return cuisine;
  }

  public void setCuisine(String cuisine) {
    this.cuisine = cuisine;
  }

  public RecipeObjectMeta cuisine(String cuisine) {
    this.cuisine = cuisine;
    return this;
  }

 /**
   * The date when this recipe was created
   * @return created
  **/
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public RecipeObjectMeta created(String created) {
    this.created = created;
    return this;
  }

 /**
   * The date when this recipe was most recently modified
   * @return modified
  **/
  @JsonProperty("modified")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public RecipeObjectMeta modified(String modified) {
    this.modified = modified;
    return this;
  }

 /**
   * Additional information about this recipe&#x27;s nutrients
   * @return nutrientsNotice
  **/
  @JsonProperty("nutrients_notice")
  public String getNutrientsNotice() {
    return nutrientsNotice;
  }

  public void setNutrientsNotice(String nutrientsNotice) {
    this.nutrientsNotice = nutrientsNotice;
  }

  public RecipeObjectMeta nutrientsNotice(String nutrientsNotice) {
    this.nutrientsNotice = nutrientsNotice;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectMeta {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    cuisine: ").append(toIndentedString(cuisine)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    nutrientsNotice: ").append(toIndentedString(nutrientsNotice)).append("\n");
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
