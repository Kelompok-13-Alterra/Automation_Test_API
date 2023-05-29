package starter.altashop.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected static String url = "http://34.101.193.55:8080/api/v1/";
    @Step("I have valid credentials")
    public String iHaveValidCredentials(){
        return url + "auth/login";
    }
    @Step("I submit a POST request to {string} with email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithEmailAndPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "isan22@gmail.com");
        requestBody.put("password", "isanAja22");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iHaveValidCredentials());
    }
    @Step("I receive valid HTTP response code Login {int}")
    public void iShouldGetAResponseCode(){

        restAssuredThat(response -> response.statusCode(200));
    }
}
