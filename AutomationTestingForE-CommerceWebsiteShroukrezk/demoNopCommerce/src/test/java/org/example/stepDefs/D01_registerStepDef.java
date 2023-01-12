package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D01_registerStepDef {
    SoftAssert soft = new SoftAssert();

    String gender = "";
    RegisterPage register=new RegisterPage();
    @Given("user go to register page")
    public void register() {

       register.registerLink().click();
    }

    @When("user select gender type {string}")
    public void userSelectGenderType(String gender) {
//ss
        register.selectingGender(gender).click();


    }

    @And("user entering {string} fisrtName")
    public void userEnteringFisrtName(String arg0) {
        register.enteringFirstName().sendKeys(arg0);
    }

    @And("user entering {string} lastName")
    public void userEnteringLastName(String arg0) {
        register.enteringLastName().sendKeys(arg0);
    }

    @And("user selecting day of birth {int}")
    public void userSelectingDayOfBirth(int arg0) {
        register.selectingDay(arg0);
    }

    @And("user selecting month {int}")
    public void userSelectingMonth(int arg0) {
        register.selectingMonth(arg0);
    }

    @And("user selecting year {int}")
    public void userSelectingYear(int arg0) {
        register.selectingYear(arg0);
    }

    @And("user entering {string} his email")
    public void userEnteringHisEmail(String validEmail) {
        register.PassingTheMail(validEmail).sendKeys(validEmail);
    }


    @And("user entering {string} his company")
    public void userEnteringHisCompany(String arg0) {
        register.PassingTheCompany().sendKeys(arg0);
    }

    @And("user entering {string} his password")
    public void userEntering(String arg0) {
        register.userEnteringpassword().sendKeys(arg0);
    }

    @And("user ReEntering {string} his Confirmation password")
    public void userReEntering(String arg0) {

        register.userReEnteringpassword().sendKeys(arg0);
    }

    @Then("user click on Register Button")
    public void userClickOnRegisterButton() {
        register.clickOnRegisterButton().click();
    }

    @Then("user should see {string} message")
    public void userShouldSeeMessage(String arg0) {

        String actualMsg = register.message().getText();
        String expectedMsg = "Your registration completed";

        soft.assertTrue(expectedMsg.contains(actualMsg));
        soft.assertAll();

    }

    @And("user should see color of text green")
    public void userShouldSeeColorOfTextGreen() {
        String actualColor = register.color().getCssValue("color");
        System.out.println(actualColor);
        String expectedColor = "rgba(76, 177, 124, 1)";
        soft.assertEquals(actualColor,expectedColor);
        soft.assertAll();
    }


}
