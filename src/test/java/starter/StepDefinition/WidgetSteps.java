package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.Widget.GetDashboardWidget;
import starter.OfficeBuddy.Widget.GetOfficeWidget;



public class WidgetSteps {
    @Steps
    GetDashboardWidget getDashboardWidget;
    @Steps
    GetOfficeWidget getOfficeWidget;

    @Given("I set GET endpoints dashboard widget")
    public void GetApiEndpointDashboardWidget(){ getDashboardWidget.GetApiEndpointDashboardWidget();
    }
    @Given("I set GET endpoints office widget")
    public void iSetGETEndpointsOfficeWidget() { getOfficeWidget.iSetGETEndpointsOfficeWidget();

    }
    @When("I send GET HTTP request for dashboard widget")
    public void GetHttpRequestForDashboardWidget(){ getDashboardWidget.GetHttpRequestForDashboardWidget();
    }
    @When("I send GET HTTP request with input invalid token for dashboard widget")
    public void iSendGETHTTPRequestWithInputInvalidTokenForDashboardWidget() { getDashboardWidget.iSendGETHTTPRequestWithInputInvalidTokenForDashboardWidget();
    }
    @When("I send GET HTTP request with invalid endpoints for dashboard widget")
    public void iSendGETHTTPRequestWithInvalidEndpointsForDashboardWidget() { getDashboardWidget.iSendGETHTTPRequestWithInvalidEndpointsForDashboardWidget();
    }
    @When("I send GET HTTP request for office widget")
    public void iSendGETHTTPRequestForOfficeWidget() { getOfficeWidget.iSendGETHTTPRequestForOfficeWidget();

    }
    @When("I send GET HTTP request with input invalid token for office widget")
    public void iSendGETHTTPRequestWithInputInvalidTokenForOfficeWidget() { getOfficeWidget.iSendGETHTTPRequestWithInputInvalidTokenForOfficeWidget();

    }

    @When("I send GET HTTP request with input invalid endpoints for office widget")
    public void iSendGETHTTPRequestWithInputInvalidEndpointsForOfficeWidget() { getOfficeWidget.iSendGETHTTPRequestWithInputInvalidEndpointsForOfficeWidget();
    }
    @Then("I receive valid HTTP response code 200 for get dashboard widget")
    public void validateHttpResponseCode200ForGetDashboardWidget(){ getDashboardWidget.validateHttpResponseCode200ForGetDashboardWidget();
    }
    @Then("I receive valid HTTP response code {int} for dashboard widget")
    public void iReceiveValidHTTPResponseCodeForDashboardWidget(int arg0) { getDashboardWidget.iReceiveValidHTTPResponseCodeForDashboardWidget(401);
    }
    @Then("I receive valid HTTP response code {int} dashboard widget")
    public void iReceiveValidHTTPResponseCodeDashboardWidget(int arg0) { getDashboardWidget.iReceiveValidHTTPResponseCodeDashboardWidget(404);
    }
    @Then("I receive valid HTTP response code {int} for get office widget")
    public void iReceiveValidHTTPResponseCodeForGetOfficeWidget(int arg0) { getOfficeWidget.iReceiveValidHTTPResponseCodeForGetOfficeWidget(200);

    }
    @Then("I receive valid HTTP response code {int} for office widget")
    public void iReceiveValidHTTPResponseCodeForOfficeWidget(int arg0) { getOfficeWidget.iReceiveValidHTTPResponseCodeForOfficeWidget(401);
    }

    @Then("I receive valid HTTP response code {int} office widget")
    public void iReceiveValidHTTPResponseCodeOfficeWidget(int arg0) { getOfficeWidget.iReceiveValidHTTPResponseCodeOfficeWidget(404);
    }

    @And("I receive valid data for dashboard widget")
    public void validateDataDetailOfficeForDashboardWidget(){ getDashboardWidget.validateDataDetailOfficeForDashboardWidget();

    }
    @And("I receive valid data for office widget")
    public void iReceiveValidDataForOfficeWidget() { getOfficeWidget.iReceiveValidDataForOfficeWidget();

    }



}
