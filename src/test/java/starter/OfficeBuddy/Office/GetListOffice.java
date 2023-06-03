package starter.OfficeBuddy.Office;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetListOffice {

    protected static String url = "http://34.101.193.55:8080/api/v1/";

    @Step("I set GET endpoints")
    public String GetApiEndpoint(){
        return url + "office";
    }
    @Step("I send GET HTTP request")
    public void GetHttpRequest(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InRlc3RpMTIzQGdtYWlsLmNvbSIsImlkIjo5LCJpc192ZXJpZnkiOmZhbHNlLCJyb2xlIjowfQ.fhUkJkwAUqyAXFk-k_dSJKyZB4e4wI6PF-b8tbs-Cqk")
                .get(GetApiEndpoint());
    }
    @Step("I receive valid HTTP response code 201")
    public void validateHttpResponseCode201(){

        restAssuredThat(response -> response.statusCode(201));
    }
    @Step("I receive valid data for all office")
    public void validateDataDetailOffice(){

    }
}
