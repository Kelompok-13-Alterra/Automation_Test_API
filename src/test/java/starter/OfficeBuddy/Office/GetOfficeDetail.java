package starter.OfficeBuddy.Office;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetOfficeDetail {

    protected static String url = "http://34.101.193.55:8080/api/v1/";

    @Step("I set GET endpoints by id")
    public String GetApiEndpointById(){
        return url + "office/2";
    }
    @Step("I send GET HTTP request by id")
    public void GetHttpRequestById(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InRlc3RpMTIzQGdtYWlsLmNvbSIsImlkIjo5LCJpc192ZXJpZnkiOmZhbHNlLCJyb2xlIjowfQ.fhUkJkwAUqyAXFk-k_dSJKyZB4e4wI6PF-b8tbs-Cqk")
                .get(GetApiEndpointById());
    }
    @Step("I receive valid HTTP response code 200 for get id detail office")
    public void validateHttpResponseCode200ForGetIdDetailOffice(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for id office")
    public void iReceiveValidDataForIdOffice(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
