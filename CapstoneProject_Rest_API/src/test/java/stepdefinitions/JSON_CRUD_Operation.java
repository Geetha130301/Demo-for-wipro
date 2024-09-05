package stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class JSON_CRUD_Operation {
   
    Response res;
    //Extent instance to log steps in the report
    ExtentReports extentReport =  Hooks.extentReport;
    ExtentTest test = Hooks.extentTest;
   
    @Given("I have a base URI of {string}")
    public void i_have_a_base_uri_of(String URI) {
       baseURI = URI;
         
    }

    @When("I send a Get request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
    test = extentReport.createTest("i send GET request");
        res = given()
                .log().all()
                .when()
                    .get(endpoint);
        test.pass("GET request sent successfully");
       
    }
     
    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statCode) {
        res.then()
               .log().all()
               .statusCode(statCode);
        test.pass("Validation successful for status code");
       
    }
    @When("I send a POST request to {string} with body as {string}")
    public void i_send_a_post_request_to_with_body_as(String endpoint, String reqBody) {
    test = extentReport.createTest("i send POST request");
        res = given()
                .log().all()
                .body(reqBody)
                .when()
                    .post(endpoint);
        test.pass("POST request sent successfully");
    }

    @Then("the response time is less than {long}")
    public void the_response_time_is_less_than(Long millSec) {
        res.then()
        .log().all()
        .time(lessThan(millSec));
    }
    @Given("I have base URI of {string}")
    public void i_have_base_uri_of(String URI) {
        baseURI = URI;
       
    }
    @When("I send a PUT request to {string} with {string}")
    public void i_send_a_put_request_to_with(String endpoint, String reqBody) {
    test = extentReport.createTest("i send PUT request");
        res = given()
                .log().all()
                .body(reqBody)
                .when()
                    .put(endpoint);
        test.pass("PUT request sent  successfully");
    }
    @When("I send a DELETE request to {string}")
    public void i_send_a_delete_request_to(String endpoint) {
    test = extentReport.createTest("i send DELETE request");
        res = given()
                   .log().all()
                   .when()
                   .delete(endpoint);
        test.pass("DELETE request sent  successfully");
       
    }
    @When("I send a PATCH request to {string} with {string}")
    public void i_send_a_patch_request_to_with(String endpoint, String reqBody) {
    test = extentReport.createTest("i send PATCH request");
        res = given()
                .log().all()
                .body(reqBody)
                .when()
                    .patch(endpoint);
        test.pass("PATCH request sent  successfully");
       
       
    }

   
}