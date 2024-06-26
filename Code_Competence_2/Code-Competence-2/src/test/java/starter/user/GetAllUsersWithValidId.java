package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUsersWithValidId {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get all users")
    public String setApiGetValidId() {
        return url + "users";
    }

    @Step("I send request to get all users")
    public void sendGetAllUsersValidId() {
        SerenityRest.given().get(setApiGetValidId());
    }

    @Step("I receive valid data for all users")
    public void receiveValidUsersData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_USERS_RESPONSE_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}