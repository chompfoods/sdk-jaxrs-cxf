package io.swagger.api;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;
import io.swagger.model.RecipeObject;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Chomp Food & Recipe Database API Documentation
 *
 * <p>## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. * Get a **Food Data API** key at **[https://chompthis.com/api](https://chompthis.com/api/)**. * Get a **Recipe Data API** key at **[https://chompthis.com/api/recipes](https://chompthis.com/api/recipes/)**.  ### Getting Started   * Subscribe to the **[Food Data API](https://chompthis.com/api/#pricing)** or the **[Recipe Data API](https://chompthis.com/api/recipes/#pricing)**.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**   * Recipe response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/example-recipe-response.json)**   * Error response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/error-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ### I'm a Premium subscriber. How do I access the API?   * All Premium subscribers must pass in a unique user ID for each user on their platform that is accessing data from the Chomp API. A user ID can be any string of letters and numbers that you assign to your user. Simply add \"user_id\" as a URL parameter when calling the API. *You must add a \"user_id\" URL parameter to every call you make to ANY endpoint.*     * **Example**        > ```ENDPOINT.php?api_key=API_KEY&code=CODE&user_id=USER_ID```  ### Helpful Links   * **Help & Support**     * [Knowledge Base &raquo;](https://desk.zoho.com/portal/chompthis/kb/chomp)     * [Support &raquo;](https://chompthis.com/api/ticket-new.php)     * [Client Center &raquo;](https://chompthis.com/api/manage.php)   * **Pricing**     * [Food Data API Subscription Options &raquo;](https://chompthis.com/api/)     * [Recipe Data API Subscription Options &raquo;](https://chompthis.com/api/recipes/)     * [Food Data API Cost Calculator &raquo;](https://chompthis.com/api/cost-calculator.php)     * [Recipe Data API Cost Calculator &raquo;](https://chompthis.com/api/recipes/cost-calculator.php)   * **Guidelines**     * [Terms & License &raquo;](https://chompthis.com/api/terms.php)     * [Attribution &raquo;](https://chompthis.com/api/docs/attribution.php) 
 *
 */
@Path("/")
public interface DefaultApi  {

    /**
     * Get a branded food item using a barcode
     *
     * ## Get data for a branded food using the food&#x27;s UPC/EAN barcode.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example**  &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/barcode.php?api_key&#x3D;API_KEY&amp;code&#x3D;CODE&#x60;&#x60;&#x60;  **Tips**   * Read our **[Knowledge Base article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do)** for helpful tips and tricks.   * Perform a [check-digit](https://en.wikipedia.org/wiki/Check_digit#UPC) on the barcode you are using.   * Use a barcode from our website [ChompThis.com](https://chompthis.com/?r&#x3D;api). Search for a food and use the barcode shown in the search results.   * It is possible that our database contains the food you&#x27;re looking for, but does not have the same barcode you are using. This can happen if a manufacturer introduces a variation of the same food, or the barcode you got was from a 2 oz bag of chips when our database has the food packaged in a 4 oz bag.   * [Contact us](https://chompthis.com/contact.php?api&#x3D;y) if you are having trouble. 
     *
     */
    @GET
    @Path("/food/branded/barcode.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using a barcode", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public BrandedFoodObject foodBrandedBarcodePhpGet(@QueryParam("code")String code, @QueryParam("user_id")String userId);

    /**
     * Get a branded food item by name
     *
     * ## Search for branded food items by name.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/name.php?api_key&#x3D;API_KEY&amp;name&#x3D;NAME&#x60;&#x60;&#x60;  **Tips**   * Get started by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  &gt; This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren&#x27;t sure how to upgrade your subscription. 
     *
     */
    @GET
    @Path("/food/branded/name.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item by name", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public BrandedFoodObject foodBrandedNamePhpGet(@QueryParam("name")String name, @QueryParam("limit")Integer limit, @QueryParam("page")Integer page, @QueryParam("user_id")String userId);

    /**
     * Get data for branded food items using various search parameters
     *
     * ## Search for branded food items using various parameters.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/search.php?api_key&#x3D;API_KEY&amp;brand&#x3D;BRAND&amp;country&#x3D;COUNTRY&amp;page&#x3D;1&#x60;&#x60;&#x60;  **Tips**    * Get started by using the **[Query Builder](https://chompthis.com/api/build.php)**.  &gt; This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren&#x27;t sure how to upgrade your subscription. 
     *
     */
    @GET
    @Path("/food/branded/search.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get data for branded food items using various search parameters", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public BrandedFoodObject foodBrandedSearchPhpGet(@QueryParam("allergen")String allergen, @QueryParam("brand")String brand, @QueryParam("category")String category, @QueryParam("country")String country, @QueryParam("diet")String diet, @QueryParam("ingredient")String ingredient, @QueryParam("keyword")String keyword, @QueryParam("mineral")String mineral, @QueryParam("nutrient")String nutrient, @QueryParam("palm_oil")String palmOil, @QueryParam("trace")String trace, @QueryParam("vitamin")String vitamin, @QueryParam("limit")Integer limit, @QueryParam("page")Integer page, @QueryParam("user_id")String userId);

    /**
     * Get raw/generic food ingredient item(s)
     *
     * ## Get data for a specific ingredient or a specific set of ingredients.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example #1: Single Ingredient** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;raw broccoli&#x60;&#x60;&#x60;  **Example #2: Set of Ingredients** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;raw broccoli,mashed potatoes,chicken drumstick&#x60;&#x60;&#x60;  **Tips**   * Expose ingredient endpoints by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  &gt; This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren&#x27;t sure how to upgrade your subscription. 
     *
     */
    @GET
    @Path("/food/ingredient/search.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get raw/generic food ingredient item(s)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching ingredient foods.  ", content = @Content(schema = @Schema(implementation = IngredientObject.class))),
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public IngredientObject foodIngredientSearchPhpGet(@QueryParam("find")String find, @QueryParam("limit")Integer limit, @QueryParam("user_id")String userId);

    /**
     * Get a recipe by ID
     *
     * ## Get a specific recipe using an ID.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/id.php?api_key&#x3D;API_KEY&amp;id&#x3D;RECIPE_ID&#x60;&#x60;&#x60; 
     *
     */
    @GET
    @Path("/recipe/id.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get a recipe by ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public RecipeObject recipeIdPhpGet(@QueryParam("id")String id, @QueryParam("user_id")String userId);

    /**
     * Get recipes using a list of ingredients
     *
     * ## Get recipes that include all ingredients from a list.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example #1** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/ingredient.php?api_key&#x3D;API_KEY&amp;list&#x3D;INGREDIENT&#x60;&#x60;&#x60;  **Example #2** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/ingredient.php?api_key&#x3D;API_KEY&amp;list&#x3D;INGREDIENT,INGREDIENT,INGREDIENT&#x60;&#x60;&#x60; 
     *
     */
    @GET
    @Path("/recipe/ingredient.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get recipes using a list of ingredients", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public RecipeObject recipeIngredientPhpGet(@QueryParam("list")String list, @QueryParam("limit")Integer limit, @QueryParam("page")Integer page, @QueryParam("user_id")String userId);

    /**
     * Get random popular recipes
     *
     * ## Get random recipes that have instructions and nutrients  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/random.php?api_key&#x3D;API_KEY&#x60;&#x60;&#x60; 
     *
     */
    @GET
    @Path("/recipe/random.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get random popular recipes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public RecipeObject recipeRandomPhpGet(@QueryParam("limit")Integer limit, @QueryParam("user_id")String userId);

    /**
     * Get recipes using a title and optional filters
     *
     * ## Get recipes using a title and optional filters.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example**  &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/search.php?api_key&#x3D;API_KEY&amp;title&#x3D;TITLE&#x60;&#x60;&#x60; 
     *
     */
    @GET
    @Path("/recipe/search.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get recipes using a title and optional filters", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public RecipeObject recipeSearchPhpGet(@QueryParam("title")String title, @QueryParam("excluded_cuisine")String excludedCuisine, @QueryParam("included_cuisine")String includedCuisine, @QueryParam("excluded_ingredient")String excludedIngredient, @QueryParam("included_ingredient")String includedIngredient, @QueryParam("nutrients_required")Integer nutrientsRequired, @QueryParam("limit")Integer limit, @QueryParam("page")Integer page, @QueryParam("user_id")String userId);
}
