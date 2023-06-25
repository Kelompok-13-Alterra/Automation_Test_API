package starter.OfficeBuddy.Office;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetListOffice {

    protected static String url = "https://api.officebuddy.space/api/v1/";

    @Step("I set GET endpoints for List Office")
    public String GetApiEndpoint(){
        return url + "office";
    }
    @Step("I send GET HTTP request for List Office")
    public void GetHttpRequest(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .get(GetApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 for get detail payment")
    public void validateHttpResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for all office")
    public void validateDataDetailOffice(){

    }
}
