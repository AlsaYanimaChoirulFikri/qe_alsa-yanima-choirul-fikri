package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddNewProductInCart {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get all products")
    public String setApiAddProductInCart() {
        return url + "products";
    }

    @Step("I send request to add new product with valid credential userId = {int}, date = {String} ")
    public void sendRequestAddNewProductInCart(int userId, String date) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", userId);
        requestBody.put("date", date);

        JSONArray productsArray = new JSONArray();
        JSONObject product1 = new JSONObject();
        product1.put("productId", 5);
        product1.put("quantity", 1);

        JSONObject product2 = new JSONObject();
        product2.put("productId", 1);
        product2.put("quantity", 5);

        productsArray.put(product1);
        productsArray.put(product2);

        requestBody.put("products", productsArray);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .body(requestBody.toString())
                .post(setApiAddProductInCart());

    }

    @Step("I receive valid data for created new product in cart ")
    public void receiveNewProductinCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_NEW_PRODUCT_CART_SCHEMA);
        restAssuredThat(response -> response.body("id", equalTo(21)));
        restAssuredThat(response -> response.body("userId",equalTo(null)));
        restAssuredThat(response -> response.body("date", equalTo(null)));

        restAssuredThat(response -> response.body("'products'.'productId'", equalTo(1)));
        restAssuredThat(response -> response.body("'products'.'quantity'", equalTo(2)));

        restAssuredThat(response -> response.body("'products'.'productId'", equalTo(2)));
        restAssuredThat(response -> response.body("'products'.'quantity'", equalTo(1)));
        JSONArray productsArray = new JSONArray();
        JSONObject product1 = new JSONObject();
        product1.put("productId", 2);
        product1.put("quantity", 1);
        JSONObject product2 = new JSONObject();
        product2.put("productId", 1);
        product2.put("quantity", 2);

        productsArray.put(product1);
        productsArray.put(product2);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }
}