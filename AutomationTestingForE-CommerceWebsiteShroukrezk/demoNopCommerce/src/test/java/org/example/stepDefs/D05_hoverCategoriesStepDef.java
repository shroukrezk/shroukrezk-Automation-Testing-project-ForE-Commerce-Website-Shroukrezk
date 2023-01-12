package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {




    SoftAssert soft = new SoftAssert();
    P03_homePage homePage = new P03_homePage();
    @When("user hover on first category computer and click on first subCategory")
    public void user_hover_on_first_category_computer_and_click_on_first_subCategory(){

      int numberOfSubCategories = homePage.subCategoriesOfComputers().size();

        System.out.println(numberOfSubCategories+" = numberOfSubCategories");
        WebElement firstSubCat = homePage.subCategoriesOfComputers().get(0);

        firstSubCat.click();
        System.out.println(homePage.subCategoriesOfComputers().get(0).getText());

    }

    @Then("user should see be in the page of the choosed subcategory")
    public void user_Should_See_Be_In_ThePage_Of_The_Choosed_Subcategory() {



        String actualText = homePage.assertThatIsTheRightPage().getText().toLowerCase().trim();
        String expectedText= "desktops";
        soft.assertEquals(actualText,expectedText);


    }
}
