package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.Hooks.driver;

public class RegisterPage {

    public WebElement registerLink() {
        return driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }

    public WebElement selectingGender(String gender) {
        return driver.findElement(By.className(gender));
    }
    public WebElement enteringFirstName() {
        return driver.findElement(By.id("FirstName"));

    }
    public WebElement enteringLastName() {
        return driver.findElement(By.id("LastName"));
//ss
    }



    public void selectingDay(int arg0) {
        //create object from Select class
        WebElement parentlist = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(parentlist);
        select.selectByValue(String.valueOf(arg0));
    }
    public void selectingMonth(int arg0) {
        //create object from Select class
        WebElement parentlist = driver.findElement(By.name("DateOfBirthMonth"));
        Select select = new Select(parentlist);
        select.selectByValue(String.valueOf(arg0));
    }
    public void selectingYear(int arg0) {
        //create object from Select class
        WebElement parentlist = driver.findElement(By.name("DateOfBirthYear"));
        Select select = new Select(parentlist);
        select.selectByValue(String.valueOf(arg0));
    }
    public WebElement PassingTheMail(String arg00) {

        return driver.findElement(By.id("Email"));
    }
    public WebElement PassingTheCompany() {
        return driver.findElement(By.id("Company"));
    }
    public WebElement userEnteringpassword() {
        return driver.findElement(By.id("Password"));
    }
    public WebElement userReEnteringpassword() {
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement clickOnRegisterButton() {
        return driver.findElement(By.id("register-button"));
    }
    public WebElement message ()
    {
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
    public WebElement color ()
    {
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

    public WebElement logout(){
        return driver.findElement(By.className("ico-logout"));
    }

}
