package io.swagger.model;

import io.swagger.model.IngredientObjectItems;
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
  * Please read the description of each field in this API response object example. By default, the value of each field is **null**. This indicates an unknown state or that no data exists.
 **/
@Schema(description="Please read the description of each field in this API response object example. By default, the value of each field is **null**. This indicates an unknown state or that no data exists.")
public class IngredientObject   {
  
  @Schema(description = "An array containing an object for each individual item returned by your API call.")
 /**
   * An array containing an object for each individual item returned by your API call.  
  **/
  private List<IngredientObjectItems> items = null;
 /**
   * An array containing an object for each individual item returned by your API call.
   * @return items
  **/
  @JsonProperty("items")
  public List<IngredientObjectItems> getItems() {
    return items;
  }

  public void setItems(List<IngredientObjectItems> items) {
    this.items = items;
  }

  public IngredientObject items(List<IngredientObjectItems> items) {
    this.items = items;
    return this;
  }

  public IngredientObject addItemsItem(IngredientObjectItems itemsItem) {
    this.items.add(itemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObject {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
