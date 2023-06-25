package starter.OfficeBuddy.Office;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteOffice {
    protected String url = "https://api.officebuddy.space/api/";

    @Step("I set DELETE api endpoint")
    public void setDeleteApiEndpoint(){
        return url;
    }
    @Step("I set DELETE HTTP request")
    public void sendDeleteHTTPRequest(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .delete(DeleteOffice());
    }
    @Step("I receive valid HTTP response code 204")
    public void validateHttpResponseCode204() {
        restAssuredThat(response -> response.statusCode(204));
    }
}
