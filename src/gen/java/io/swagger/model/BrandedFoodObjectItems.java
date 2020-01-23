package io.swagger.model;

import io.swagger.model.BrandedFoodObjectCalorieConversionFactor;
import io.swagger.model.BrandedFoodObjectComponents;
import io.swagger.model.BrandedFoodObjectCountryDetails;
import io.swagger.model.BrandedFoodObjectDietFlags;
import io.swagger.model.BrandedFoodObjectDietLabels;
import io.swagger.model.BrandedFoodObjectIngredients;
import io.swagger.model.BrandedFoodObjectNutrients;
import io.swagger.model.BrandedFoodObjectPackage;
import io.swagger.model.BrandedFoodObjectPackagingPhotos;
import io.swagger.model.BrandedFoodObjectPortions;
import io.swagger.model.BrandedFoodObjectServing;
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
public class BrandedFoodObjectItems   {
  
  @Schema(description = "EAN/UPC barcode")
 /**
   * EAN/UPC barcode  
  **/
  private String barcode = null;
  
  @Schema(description = "Item name as provided by brand owner or as shown on packaging")
 /**
   * Item name as provided by brand owner or as shown on packaging  
  **/
  private String name = null;
  
  @Schema(description = "The brand name that owns this item")
 /**
   * The brand name that owns this item  
  **/
  private String brand = null;
  
  @Schema(description = "")
  private BrandedFoodObjectIngredients ingredients = null;
  
  @Schema(description = "")
  private BrandedFoodObjectPackage _package = null;
  
  @Schema(description = "")
  private BrandedFoodObjectServing serving = null;
  
  @Schema(description = "")
  private List<String> categories = null;
  
  @Schema(description = "")
  private BrandedFoodObjectNutrients nutrients = null;
  
  @Schema(description = "")
  private BrandedFoodObjectCalorieConversionFactor calorieConversionFactor = null;
  
  @Schema(description = "The multiplication factor used to calculate protein from nitrogen")
 /**
   * The multiplication factor used to calculate protein from nitrogen  
  **/
  private BigDecimal proteinConversionFactor = null;
  
  @Schema(description = "")
  private BrandedFoodObjectDietLabels dietLabels = null;
  
  @Schema(description = "An array of ingredient objects that were flagged while grading this item for compatibility with each diet")
 /**
   * An array of ingredient objects that were flagged while grading this item for compatibility with each diet  
  **/
  private List<BrandedFoodObjectDietFlags> dietFlags = null;
  
  @Schema(description = "")
  private BrandedFoodObjectPackagingPhotos packagingPhotos = null;
  
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
  
  @Schema(description = "An array of ingredients in this item that may cause allergic reactions in people")
 /**
   * An array of ingredients in this item that may cause allergic reactions in people  
  **/
  private List<String> allergens = null;
  
  @Schema(description = "An array of brands we have associated with this item. Some items are sold by more than 1 brand.")
 /**
   * An array of brands we have associated with this item. Some items are sold by more than 1 brand.  
  **/
  private List<String> brandList = null;
  
  @Schema(description = "An array of countries where this item is sold")
 /**
   * An array of countries where this item is sold  
  **/
  private List<String> countries = null;
  
  @Schema(description = "")
  private BrandedFoodObjectCountryDetails countryDetails = null;
  
  @Schema(description = "An array of ingredients made from palm oil")
 /**
   * An array of ingredients made from palm oil  
  **/
  private List<String> palmOilIngredients = null;
  
  @Schema(description = "An array of this item's ingredients")
 /**
   * An array of this item's ingredients  
  **/
  private List<String> ingredientList = null;
  
  @Schema(description = "A boolean indicating if we have English ingredients for this item")
 /**
   * A boolean indicating if we have English ingredients for this item  
  **/
  private Boolean hasEnglishIngredients = null;
  
  @Schema(description = "An array of minerals that this item contains")
 /**
   * An array of minerals that this item contains  
  **/
  private List<String> minerals = null;
  
  @Schema(description = "An array of trace ingredients that may be found in this item")
 /**
   * An array of trace ingredients that may be found in this item  
  **/
  private List<String> traces = null;
  
  @Schema(description = "An array of vitamins that are found in this item")
 /**
   * An array of vitamins that are found in this item  
  **/
  private List<String> vitamins = null;
  
  @Schema(description = "A description of this item")
 /**
   * A description of this item  
  **/
  private String description = null;
  
  @Schema(description = "An array of keywords that can be used to describe this item")
 /**
   * An array of keywords that can be used to describe this item  
  **/
  private List<String> keywords = null;
  
  @Schema(description = "Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.")
 /**
   * Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.  
  **/
  private String footnote = null;
 /**
   * EAN/UPC barcode
   * @return barcode
  **/
  @JsonProperty("barcode")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public BrandedFoodObjectItems barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

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

  public BrandedFoodObjectItems name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The brand name that owns this item
   * @return brand
  **/
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public BrandedFoodObjectItems brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
   * Get ingredients
   * @return ingredients
  **/
  @JsonProperty("ingredients")
  public BrandedFoodObjectIngredients getIngredients() {
    return ingredients;
  }

  public void setIngredients(BrandedFoodObjectIngredients ingredients) {
    this.ingredients = ingredients;
  }

  public BrandedFoodObjectItems ingredients(BrandedFoodObjectIngredients ingredients) {
    this.ingredients = ingredients;
    return this;
  }

 /**
   * Get _package
   * @return _package
  **/
  @JsonProperty("package")
  public BrandedFoodObjectPackage getPackage() {
    return _package;
  }

  public void setPackage(BrandedFoodObjectPackage _package) {
    this._package = _package;
  }

  public BrandedFoodObjectItems _package(BrandedFoodObjectPackage _package) {
    this._package = _package;
    return this;
  }

 /**
   * Get serving
   * @return serving
  **/
  @JsonProperty("serving")
  public BrandedFoodObjectServing getServing() {
    return serving;
  }

  public void setServing(BrandedFoodObjectServing serving) {
    this.serving = serving;
  }

  public BrandedFoodObjectItems serving(BrandedFoodObjectServing serving) {
    this.serving = serving;
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

  public BrandedFoodObjectItems categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public BrandedFoodObjectItems addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get nutrients
   * @return nutrients
  **/
  @JsonProperty("nutrients")
  public BrandedFoodObjectNutrients getNutrients() {
    return nutrients;
  }

  public void setNutrients(BrandedFoodObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  public BrandedFoodObjectItems nutrients(BrandedFoodObjectNutrients nutrients) {
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

  public BrandedFoodObjectItems calorieConversionFactor(BrandedFoodObjectCalorieConversionFactor calorieConversionFactor) {
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

  public BrandedFoodObjectItems proteinConversionFactor(BigDecimal proteinConversionFactor) {
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

  public BrandedFoodObjectItems dietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
    return this;
  }

 /**
   * An array of ingredient objects that were flagged while grading this item for compatibility with each diet
   * @return dietFlags
  **/
  @JsonProperty("diet_flags")
  public List<BrandedFoodObjectDietFlags> getDietFlags() {
    return dietFlags;
  }

  public void setDietFlags(List<BrandedFoodObjectDietFlags> dietFlags) {
    this.dietFlags = dietFlags;
  }

  public BrandedFoodObjectItems dietFlags(List<BrandedFoodObjectDietFlags> dietFlags) {
    this.dietFlags = dietFlags;
    return this;
  }

  public BrandedFoodObjectItems addDietFlagsItem(BrandedFoodObjectDietFlags dietFlagsItem) {
    this.dietFlags.add(dietFlagsItem);
    return this;
  }

 /**
   * Get packagingPhotos
   * @return packagingPhotos
  **/
  @JsonProperty("packaging_photos")
  public BrandedFoodObjectPackagingPhotos getPackagingPhotos() {
    return packagingPhotos;
  }

  public void setPackagingPhotos(BrandedFoodObjectPackagingPhotos packagingPhotos) {
    this.packagingPhotos = packagingPhotos;
  }

  public BrandedFoodObjectItems packagingPhotos(BrandedFoodObjectPackagingPhotos packagingPhotos) {
    this.packagingPhotos = packagingPhotos;
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

  public BrandedFoodObjectItems components(List<BrandedFoodObjectComponents> components) {
    this.components = components;
    return this;
  }

  public BrandedFoodObjectItems addComponentsItem(BrandedFoodObjectComponents componentsItem) {
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

  public BrandedFoodObjectItems portions(List<BrandedFoodObjectPortions> portions) {
    this.portions = portions;
    return this;
  }

  public BrandedFoodObjectItems addPortionsItem(BrandedFoodObjectPortions portionsItem) {
    this.portions.add(portionsItem);
    return this;
  }

 /**
   * An array of ingredients in this item that may cause allergic reactions in people
   * @return allergens
  **/
  @JsonProperty("allergens")
  public List<String> getAllergens() {
    return allergens;
  }

  public void setAllergens(List<String> allergens) {
    this.allergens = allergens;
  }

  public BrandedFoodObjectItems allergens(List<String> allergens) {
    this.allergens = allergens;
    return this;
  }

  public BrandedFoodObjectItems addAllergensItem(String allergensItem) {
    this.allergens.add(allergensItem);
    return this;
  }

 /**
   * An array of brands we have associated with this item. Some items are sold by more than 1 brand.
   * @return brandList
  **/
  @JsonProperty("brand_list")
  public List<String> getBrandList() {
    return brandList;
  }

  public void setBrandList(List<String> brandList) {
    this.brandList = brandList;
  }

  public BrandedFoodObjectItems brandList(List<String> brandList) {
    this.brandList = brandList;
    return this;
  }

  public BrandedFoodObjectItems addBrandListItem(String brandListItem) {
    this.brandList.add(brandListItem);
    return this;
  }

 /**
   * An array of countries where this item is sold
   * @return countries
  **/
  @JsonProperty("countries")
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public BrandedFoodObjectItems countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public BrandedFoodObjectItems addCountriesItem(String countriesItem) {
    this.countries.add(countriesItem);
    return this;
  }

 /**
   * Get countryDetails
   * @return countryDetails
  **/
  @JsonProperty("country_details")
  public BrandedFoodObjectCountryDetails getCountryDetails() {
    return countryDetails;
  }

  public void setCountryDetails(BrandedFoodObjectCountryDetails countryDetails) {
    this.countryDetails = countryDetails;
  }

  public BrandedFoodObjectItems countryDetails(BrandedFoodObjectCountryDetails countryDetails) {
    this.countryDetails = countryDetails;
    return this;
  }

 /**
   * An array of ingredients made from palm oil
   * @return palmOilIngredients
  **/
  @JsonProperty("palm_oil_ingredients")
  public List<String> getPalmOilIngredients() {
    return palmOilIngredients;
  }

  public void setPalmOilIngredients(List<String> palmOilIngredients) {
    this.palmOilIngredients = palmOilIngredients;
  }

  public BrandedFoodObjectItems palmOilIngredients(List<String> palmOilIngredients) {
    this.palmOilIngredients = palmOilIngredients;
    return this;
  }

  public BrandedFoodObjectItems addPalmOilIngredientsItem(String palmOilIngredientsItem) {
    this.palmOilIngredients.add(palmOilIngredientsItem);
    return this;
  }

 /**
   * An array of this item&#x27;s ingredients
   * @return ingredientList
  **/
  @JsonProperty("ingredient_list")
  public List<String> getIngredientList() {
    return ingredientList;
  }

  public void setIngredientList(List<String> ingredientList) {
    this.ingredientList = ingredientList;
  }

  public BrandedFoodObjectItems ingredientList(List<String> ingredientList) {
    this.ingredientList = ingredientList;
    return this;
  }

  public BrandedFoodObjectItems addIngredientListItem(String ingredientListItem) {
    this.ingredientList.add(ingredientListItem);
    return this;
  }

 /**
   * A boolean indicating if we have English ingredients for this item
   * @return hasEnglishIngredients
  **/
  @JsonProperty("has_english_ingredients")
  public Boolean isHasEnglishIngredients() {
    return hasEnglishIngredients;
  }

  public void setHasEnglishIngredients(Boolean hasEnglishIngredients) {
    this.hasEnglishIngredients = hasEnglishIngredients;
  }

  public BrandedFoodObjectItems hasEnglishIngredients(Boolean hasEnglishIngredients) {
    this.hasEnglishIngredients = hasEnglishIngredients;
    return this;
  }

 /**
   * An array of minerals that this item contains
   * @return minerals
  **/
  @JsonProperty("minerals")
  public List<String> getMinerals() {
    return minerals;
  }

  public void setMinerals(List<String> minerals) {
    this.minerals = minerals;
  }

  public BrandedFoodObjectItems minerals(List<String> minerals) {
    this.minerals = minerals;
    return this;
  }

  public BrandedFoodObjectItems addMineralsItem(String mineralsItem) {
    this.minerals.add(mineralsItem);
    return this;
  }

 /**
   * An array of trace ingredients that may be found in this item
   * @return traces
  **/
  @JsonProperty("traces")
  public List<String> getTraces() {
    return traces;
  }

  public void setTraces(List<String> traces) {
    this.traces = traces;
  }

  public BrandedFoodObjectItems traces(List<String> traces) {
    this.traces = traces;
    return this;
  }

  public BrandedFoodObjectItems addTracesItem(String tracesItem) {
    this.traces.add(tracesItem);
    return this;
  }

 /**
   * An array of vitamins that are found in this item
   * @return vitamins
  **/
  @JsonProperty("vitamins")
  public List<String> getVitamins() {
    return vitamins;
  }

  public void setVitamins(List<String> vitamins) {
    this.vitamins = vitamins;
  }

  public BrandedFoodObjectItems vitamins(List<String> vitamins) {
    this.vitamins = vitamins;
    return this;
  }

  public BrandedFoodObjectItems addVitaminsItem(String vitaminsItem) {
    this.vitamins.add(vitaminsItem);
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

  public BrandedFoodObjectItems description(String description) {
    this.description = description;
    return this;
  }

 /**
   * An array of keywords that can be used to describe this item
   * @return keywords
  **/
  @JsonProperty("keywords")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public BrandedFoodObjectItems keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public BrandedFoodObjectItems addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
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

  public BrandedFoodObjectItems footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectItems {\n");
    
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    serving: ").append(toIndentedString(serving)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    calorieConversionFactor: ").append(toIndentedString(calorieConversionFactor)).append("\n");
    sb.append("    proteinConversionFactor: ").append(toIndentedString(proteinConversionFactor)).append("\n");
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    dietFlags: ").append(toIndentedString(dietFlags)).append("\n");
    sb.append("    packagingPhotos: ").append(toIndentedString(packagingPhotos)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    portions: ").append(toIndentedString(portions)).append("\n");
    sb.append("    allergens: ").append(toIndentedString(allergens)).append("\n");
    sb.append("    brandList: ").append(toIndentedString(brandList)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    countryDetails: ").append(toIndentedString(countryDetails)).append("\n");
    sb.append("    palmOilIngredients: ").append(toIndentedString(palmOilIngredients)).append("\n");
    sb.append("    ingredientList: ").append(toIndentedString(ingredientList)).append("\n");
    sb.append("    hasEnglishIngredients: ").append(toIndentedString(hasEnglishIngredients)).append("\n");
    sb.append("    minerals: ").append(toIndentedString(minerals)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    vitamins: ").append(toIndentedString(vitamins)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
