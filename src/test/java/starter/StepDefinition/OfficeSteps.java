package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.Office.GetListOffice;
import starter.OfficeBuddy.Office.GetOfficeDetail;

public class OfficeSteps {

    @Steps
    GetListOffice getListOffice;
    @Steps
    GetOfficeDetail getOfficeDetail;

    @Given("I set GET endpoints")
    public void iSetGETEndpoints() {
        getListOffice.GetApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        getListOffice.GetHttpRequest();
    }
    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int arg0) {
        getListOffice.validateHttpResponseCode201();
    }
    @And("I receive valid data for all office")
    public void iReceiveValidDataForAllOffice() {
        getListOffice.validateDataDetailOffice();
    }
    @Given("I set GET endpoints by id")
    public void iSetGETEndpointsById() {
        getOfficeDetail.GetApiEndpointById();
    }
    @When("I send GET HTTP request by id")
    public void iSendGETHTTPRequestById() {
        getOfficeDetail.GetHttpRequestById();
    }
    @Then("I receive valid HTTP response code {int} for get id detail office")
    public void iReceiveValidHTTPResponseCodeForGetIdDetailOffice(int arg0) {
        getOfficeDetail.validateHttpResponseCode200ForGetIdDetailOffice();
    }

    @And("I receive valid data for id office")
    public void iReceiveValidDataForIdOffice() {
        getOfficeDetail.iReceiveValidDataForIdOffice();
    }




}
