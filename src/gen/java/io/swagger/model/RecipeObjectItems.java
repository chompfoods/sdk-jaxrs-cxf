package io.swagger.model;

import io.swagger.model.RecipeObjectAttributes;
import io.swagger.model.RecipeObjectIngredients;
import io.swagger.model.RecipeObjectMeta;
import io.swagger.model.RecipeObjectNutrients;
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
  * An object containing information for this specific item.
 **/
@Schema(description="An object containing information for this specific item.")
public class RecipeObjectItems   {
  
  @Schema(description = "Unique recipe ID")
 /**
   * Unique recipe ID  
  **/
  private String id = null;
  
  @Schema(description = "Recipe title")
 /**
   * Recipe title  
  **/
  private String title = null;
  
  @Schema(description = "")
  private RecipeObjectMeta meta = null;
  
  @Schema(description = "")
  private List<String> categories = null;
  
  @Schema(description = "The author of this recipe. You must attribute this author when displaying this recipe.")
 /**
   * The author of this recipe. You must attribute this author when displaying this recipe.  
  **/
  private String author = null;
  
  @Schema(description = "")
  private List<String> keywords = null;
  
  @Schema(description = "")
  private List<String> topics = null;
  
  @Schema(description = "")
  private RecipeObjectAttributes attributes = null;
  
  @Schema(description = "An array containing this recipe's ingredients")
 /**
   * An array containing this recipe's ingredients  
  **/
  private List<RecipeObjectIngredients> ingredients = null;
  
  @Schema(description = "")
  private List<String> baseIngredients = null;
  
  @Schema(description = "")
  private RecipeObjectNutrients nutrients = null;
  
  @Schema(description = "")
  private List<String> diabeticExchanges = null;
 /**
   * Unique recipe ID
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RecipeObjectItems id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Recipe title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RecipeObjectItems title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("meta")
  public RecipeObjectMeta getMeta() {
    return meta;
  }

  public void setMeta(RecipeObjectMeta meta) {
    this.meta = meta;
  }

  public RecipeObjectItems meta(RecipeObjectMeta meta) {
    this.meta = meta;
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

  public RecipeObjectItems categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public RecipeObjectItems addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * The author of this recipe. You must attribute this author when displaying this recipe.
   * @return author
  **/
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public RecipeObjectItems author(String author) {
    this.author = author;
    return this;
  }

 /**
   * Get keywords
   * @return keywords
  **/
  @JsonProperty("keywords")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public RecipeObjectItems keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public RecipeObjectItems addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
   * Get topics
   * @return topics
  **/
  @JsonProperty("topics")
  public List<String> getTopics() {
    return topics;
  }

  public void setTopics(List<String> topics) {
    this.topics = topics;
  }

  public RecipeObjectItems topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public RecipeObjectItems addTopicsItem(String topicsItem) {
    this.topics.add(topicsItem);
    return this;
  }

 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  public RecipeObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(RecipeObjectAttributes attributes) {
    this.attributes = attributes;
  }

  public RecipeObjectItems attributes(RecipeObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

 /**
   * An array containing this recipe&#x27;s ingredients
   * @return ingredients
  **/
  @JsonProperty("ingredients")
  public List<RecipeObjectIngredients> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<RecipeObjectIngredients> ingredients) {
    this.ingredients = ingredients;
  }

  public RecipeObjectItems ingredients(List<RecipeObjectIngredients> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public RecipeObjectItems addIngredientsItem(RecipeObjectIngredients ingredientsItem) {
    this.ingredients.add(ingredientsItem);
    return this;
  }

 /**
   * Get baseIngredients
   * @return baseIngredients
  **/
  @JsonProperty("base_ingredients")
  public List<String> getBaseIngredients() {
    return baseIngredients;
  }

  public void setBaseIngredients(List<String> baseIngredients) {
    this.baseIngredients = baseIngredients;
  }

  public RecipeObjectItems baseIngredients(List<String> baseIngredients) {
    this.baseIngredients = baseIngredients;
    return this;
  }

  public RecipeObjectItems addBaseIngredientsItem(String baseIngredientsItem) {
    this.baseIngredients.add(baseIngredientsItem);
    return this;
  }

 /**
   * Get nutrients
   * @return nutrients
  **/
  @JsonProperty("nutrients")
  public RecipeObjectNutrients getNutrients() {
    return nutrients;
  }

  public void setNutrients(RecipeObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  public RecipeObjectItems nutrients(RecipeObjectNutrients nutrients) {
    this.nutrients = nutrients;
    return this;
  }

 /**
   * Get diabeticExchanges
   * @return diabeticExchanges
  **/
  @JsonProperty("diabetic_exchanges")
  public List<String> getDiabeticExchanges() {
    return diabeticExchanges;
  }

  public void setDiabeticExchanges(List<String> diabeticExchanges) {
    this.diabeticExchanges = diabeticExchanges;
  }

  public RecipeObjectItems diabeticExchanges(List<String> diabeticExchanges) {
    this.diabeticExchanges = diabeticExchanges;
    return this;
  }

  public RecipeObjectItems addDiabeticExchangesItem(String diabeticExchangesItem) {
    this.diabeticExchanges.add(diabeticExchangesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    baseIngredients: ").append(toIndentedString(baseIngredients)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    diabeticExchanges: ").append(toIndentedString(diabeticExchanges)).append("\n");
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
