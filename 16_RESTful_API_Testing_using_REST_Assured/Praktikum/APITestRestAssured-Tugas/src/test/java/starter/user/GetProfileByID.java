package starter.user;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetProfileByID {

    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint to get complete user profile")
    public String setApiEndProfile(){
        return url + "users/1";
    }

    @Step("I send request to get user profile")
    public void sendRequestProfile(){
        SerenityRest.given().get(setApiEndProfile());
    }

    @Step("I receive complete user profile")
    public void receiveValidProfile(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'id'",notNullValue()));
        restAssuredThat(response -> response.body("'name'",notNullValue()));
        restAssuredThat(response -> response.body("'username'",notNullValue()));
        restAssuredThat(response -> response.body("'email'",notNullValue()));
        restAssuredThat(response -> response.body("'address'",notNullValue()));
        restAssuredThat(response -> response.body("'phone'",notNullValue()));
        restAssuredThat(response -> response.body("'website'",notNullValue()));
        restAssuredThat(response -> response.body("'company'",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }


}