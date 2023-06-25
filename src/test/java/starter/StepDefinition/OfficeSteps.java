package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.Office.CreateOffice;
import starter.OfficeBuddy.Office.DeleteOffice;
import starter.OfficeBuddy.Office.GetListOffice;
import starter.OfficeBuddy.Office.GetOfficeDetail;

public class OfficeSteps {

    @Steps
    GetListOffice getListOffice;
    @Steps
    GetOfficeDetail getOfficeDetail;

    @Steps
    CreateOffice createOffice;
    @Steps
    DeleteOffice deleteOffice;

    @Given("I set GET endpoints for List Office")
    public void iSetGETEndpoints() {
        getListOffice.GetApiEndpoint();
    }
    @When("I send GET HTTP request for List Office")
    public void iSendGetHTTPRequest() {
        getListOffice.GetHttpRequest();
    }
    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int arg0) {
        getListOffice.validateHttpResponseCode200();
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


    @Given("I set POST endpoints")
    public void iSetPOSTEndpoints() {
        createOffice.iSetPOSTEndpoints();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        createOffice.iSendPOSTHTTPRequest();
    }

    @When("I send POST HTTP request with input invalid data for create")
    public void iSendPOSTHTTPRequestWithInputInvalidDataForCreate() { createOffice.iSendPOSTHTTPRequestWithInputInvalidDataForCreate();
    }
    @When("I send PUT HTTP request to invalid endpoints for create")
    public void iSendPUTHTTPRequestToInvalidEndpointsForCreate() { createOffice.iSendPUTHTTPRequestToInvalidEndpointsForCreate();
    }
    @When("I send POST HTTP request with input invalid token for create")
    public void iSendPOSTHTTPRequestWithInputInvalidTokenForCreate() { createOffice.iSendPOSTHTTPRequestWithInputInvalidTokenForCreate();

    }

    @Then("I receive valid HTTP response code {int} for create office")
    public void iReceiveValidHTTPResponseCodeForCreateOffice(int arg0) {
        createOffice.iReceiveValidHTTPResponseCodeForCreateOffice(201);
    }

    @And("I receive valid data for create office")
    public void iReceiveValidDataForCreateOffice() {
        createOffice.iReceiveValidDataForCreateOffice();
    }


    @Then("I receive valid HTTP response code {int} for invalid data to create")
    public void iReceiveValidHTTPResponseCodeForInvalidDataToCreate(int arg0) { createOffice.iReceiveValidHTTPResponseCodeForInvalidDataToCreate();
    }


    @Then("I receive valid HTTP response code {int} for invalid endpoints to create office")
    public void iReceiveValidHTTPResponseCodeForInvalidEndpointsToCreateOffice(int arg0) { createOffice.iReceiveValidHTTPResponseCodeForInvalidEndpointsToCreateOffice();
    }


    @Then("I receive valid HTTP response code {int} to create")
    public void iReceiveValidHTTPResponseCodeToCreate(int arg0) { createOffice.iReceiveValidHTTPResponseCodeToCreate();
    }

    @Given("I set DELETE endpoints")
    public void iSetDELETEEndpoints() { deleteOffice.iSetDELETEEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() { deleteOffice.iSendDELETEHTTPRequest();

    }

    @Then("I receive valid HTTP response code {int} in delete office")
    public void iReceiveValidHTTPResponseCodeInDeleteOffice(int arg0) { deleteOffice.iReceiveValidHTTPResponseCodeInDeleteOffice(200);

    }
}
