package io.swagger.api;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;

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
 * Chomp Food Database API Documentation
 *
 * <p>__Important:__   - An __[API key](https://chompthis.com/api/)__ is required for access to this API.   - Get yours at __[https://chompthis.com/api](https://chompthis.com/api/)__.  -----  __Getting Started:__   - __[Subscribe](https://chompthis.com/api/#pricing)__ to the API.   - Scroll down and click the \"__Authorize__\" button.   - Enter your API key into the \"__value__\" input, click the \"__Authorize__\" button, then click the \"__Close__\" button.   - Scroll down to the section titled \"__default__\" and click on the API endpoint you wish to use.   - Click the \"__Try it out__\" button.   - Enter the information the endpoint requires.   - Click the \"__Execute__\" button.  __Example:__    - Branded Food: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)__ API response object.   - Ingredient: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)__ API response object.  -----  __How Do I Find My API Key?__   - Your API key was sent to the email address you used to create your subscription.   - You will also find your API key in the __[Client Center](https://chompthis.com/api/manage.php)__.   - _Read __[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)__ for more information._  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
 *
 */
@Path("/")
public interface DefaultApi  {

    /**
     * Get a branded food item using a barcode
     *
     * # Get data for a branded food using the food&#x27;s UPC/EAN barcode.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/barcode.php?api_key&#x3D;API_KEY&amp;code&#x3D;CODE&#x60;&#x60;&#x60; 
     *
     */
    @GET
    @Path("/food/branded/barcode.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using a barcode", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public BrandedFoodObject foodBrandedBarcodePhpGet(@QueryParam("code")String code);

    /**
     * Get a branded food item using an ID number
     *
     * # Get data for a branded food using Chomp&#x27;s internal ID number.  _Alternatively, set the \&quot;source\&quot; parameter to \&quot;USDA\&quot; and use the food&#x27;s FDC ID._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/id.php?api_key&#x3D;API_KEY&amp;id&#x3D;ID&#x60;&#x60;&#x60; 
     *
     */
    @GET
    @Path("/food/branded/id.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using an ID number", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public BrandedFoodObject foodBrandedIdPhpGet(@QueryParam("id")Integer id, @QueryParam("source")String source);

    /**
     * Get a branded food item by name
     *
     * # Search for branded food items by name.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/name.php?api_key&#x3D;API_KEY&amp;name&#x3D;NAME&#x60;&#x60;&#x60; 
     *
     */
    @GET
    @Path("/food/branded/name.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item by name", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public BrandedFoodObject foodBrandedNamePhpGet(@QueryParam("name")String name, @QueryParam("limit")Integer limit);

    /**
     * Get data for branded food items using various search parameters
     *
     * # Search for branded food items using various parameters.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/search.php?api_key&#x3D;API_KEY&amp;brand&#x3D;BRAND&amp;country&#x3D;COUNTRY&amp;page&#x3D;1&#x60;&#x60;&#x60;  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ 
     *
     */
    @GET
    @Path("/food/branded/search.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get data for branded food items using various search parameters", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public BrandedFoodObject foodBrandedSearchPhpGet(@QueryParam("allergen")String allergen, @QueryParam("brand")String brand, @QueryParam("category")String category, @QueryParam("country")String country, @QueryParam("diet")String diet, @QueryParam("ingredient")String ingredient, @QueryParam("keyword")String keyword, @QueryParam("mineral")String mineral, @QueryParam("nutrient")String nutrient, @QueryParam("palm_oil")String palmOil, @QueryParam("trace")String trace, @QueryParam("vitamin")String vitamin, @QueryParam("limit")Integer limit, @QueryParam("page")Integer page);

    /**
     * Get raw/generic food ingredient item(s)
     *
     * # Get data for a specific ingredient or a specific set of ingredients.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;STRING/LIST&amp;list&#x3D;BOOLEAN&amp;raw&#x3D;BOOLEAN&#x60;&#x60;&#x60; 
     *
     */
    @GET
    @Path("/food/ingredient/search.php")
    @Produces({ "application/json" })
    @Operation(summary = "Get raw/generic food ingredient item(s)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching ingredient foods.", content = @Content(schema = @Schema(implementation = IngredientObject.class))),
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public IngredientObject foodIngredientSearchPhpGet(@QueryParam("find")Integer find, @QueryParam("list")Boolean list, @QueryParam("raw")Boolean raw, @QueryParam("limit")Integer limit);
}
