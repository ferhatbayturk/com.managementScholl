package stepdefinitions.Api_Test.advisor_teacher_controller;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;

public class S1_POST {


    @Given("Set the Url dvisor_teacher_controller_Post")
    public void setTheUrlDvisor_teacher_controller_Post() {

       specAdmin.pathParams("first", "studentInfo", "second", "save");


    }

    @And("Set the expected data dvisor_teacher_controller_Post")
    public void setTheExpectedDataDvisor_teacher_controller_Post() {
    }

    @When("Send the request and get the response dvisor_teacher_controller_Post")
    public void sendTheRequestAndGetTheResponseDvisor_teacher_controller_Post() {
    }

    @Then("Do assertion dvisor_teacher_controller_Post")
    public void doAssertionDvisor_teacher_controller_Post() {
    }


}
