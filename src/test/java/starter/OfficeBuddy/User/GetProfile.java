package starter.officebuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProfile {
    protected static String url = "https://api.officebuddy.space/api/v1";

    @Step("I Set GET Endpoints")
    public String SetGetEndpoints(){
        return url + "/user/me";
    }
    @Step("I Send GET HTTP Request")
    public void SendHttppRequest(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImNhcHN0b25lQGdtYWlsLmNvbSIsImlkIjoyNjUsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjB9.H4hoh8Dcv7U4Au3lw3n6pVPAdLCLvzZcfoAg5iaKOHM")
                .when()
                .get(SetGetEndpoints());
    }
    @Step("I Receive HTTP Response Code 200")
    public void HTTPResponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }



}
