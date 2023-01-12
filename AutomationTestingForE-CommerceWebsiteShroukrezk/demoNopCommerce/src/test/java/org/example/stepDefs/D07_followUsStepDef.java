package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D07_followUsStepDef {




    SoftAssert soft = new SoftAssert();
    P03_homePage homePage = new P03_homePage();

    @When("user opens facebook link")
    public void user_opens_facebook_link() throws InterruptedException {
        Thread.sleep(2000);

        homePage.locateFacebookBtn().click();
        
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        homePage.manageWindows();
        String actualUrl = homePage.currentUrl();
        String expectedUrl = arg0;
        soft.assertEquals(actualUrl, expectedUrl);
        soft.assertAll();

    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        Thread.sleep(2000);
        homePage.locateTwitterBtn().click();

    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        Thread.sleep(2000);
        homePage.locateRssBtn().click();

    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        Thread.sleep(2000);
        homePage.locateYoutubeBtn().click();
    }
}
