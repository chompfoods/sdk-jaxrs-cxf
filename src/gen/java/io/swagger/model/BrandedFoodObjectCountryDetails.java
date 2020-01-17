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
  * An object containing additional information on the countries where this item is found
 **/
@Schema(description="An object containing additional information on the countries where this item is found")
public class BrandedFoodObjectCountryDetails   {
  
  @Schema(description = "The number of countries where English is the country's primary language")
 /**
   * The number of countries where English is the country's primary language  
  **/
  private Integer englishSpeaking = null;
  
  @Schema(description = "The number of countries where English is not the country's primary language")
 /**
   * The number of countries where English is not the country's primary language  
  **/
  private Integer nonEnglishSpeaking = null;
 /**
   * The number of countries where English is the country&#x27;s primary language
   * @return englishSpeaking
  **/
  @JsonProperty("english_speaking")
  public Integer getEnglishSpeaking() {
    return englishSpeaking;
  }

  public void setEnglishSpeaking(Integer englishSpeaking) {
    this.englishSpeaking = englishSpeaking;
  }

  public BrandedFoodObjectCountryDetails englishSpeaking(Integer englishSpeaking) {
    this.englishSpeaking = englishSpeaking;
    return this;
  }

 /**
   * The number of countries where English is not the country&#x27;s primary language
   * @return nonEnglishSpeaking
  **/
  @JsonProperty("non_english_speaking")
  public Integer getNonEnglishSpeaking() {
    return nonEnglishSpeaking;
  }

  public void setNonEnglishSpeaking(Integer nonEnglishSpeaking) {
    this.nonEnglishSpeaking = nonEnglishSpeaking;
  }

  public BrandedFoodObjectCountryDetails nonEnglishSpeaking(Integer nonEnglishSpeaking) {
    this.nonEnglishSpeaking = nonEnglishSpeaking;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectCountryDetails {\n");
    
    sb.append("    englishSpeaking: ").append(toIndentedString(englishSpeaking)).append("\n");
    sb.append("    nonEnglishSpeaking: ").append(toIndentedString(nonEnglishSpeaking)).append("\n");
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
