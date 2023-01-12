package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {
    SoftAssert soft = new SoftAssert();
    P03_homePage homePage = new P03_homePage();

    @Given("user change current currency to EURO")
    public void userchangecurrentcurrencytoEURO() throws InterruptedException {

        homePage.switchingCurrency(1);
        Thread.sleep(4000);

    }

    @Then("user should found all products prices in EURO")
    public void userShouldFoundAllProductsPricesInEURO() {

        int numberOfProducts = homePage.productPrices().size();
        for (int i = 0; i < numberOfProducts; i++) {


            String actual = homePage.productPrices().get(i).getText();
            System.out.println(actual);
            String expected = "€";
            Assert.assertTrue(actual.contains(expected));
        }

    }

    @Given("user change current currency to US Dollar")
    public void userChangeCurrentCurrencyToUSDollar() throws InterruptedException {
        homePage.switchingCurrency(0);
        Thread.sleep(4000);
    }

    @Then("user should found all products prices in US Dollar")
    public void userShouldFoundAllProductsPricesInUSDollar() {
        int numberOfProducts = homePage.productPrices().size();  //كدا هو خزن ال٤ برودكتس عنده
        for (int i = 0; i < numberOfProducts; i++) {


            String actual = homePage.productPrices().get(i).getText();
            System.out.println(actual);
            String expected = "$";
            Assert.assertTrue(actual.contains(expected));
        }
    }
}
