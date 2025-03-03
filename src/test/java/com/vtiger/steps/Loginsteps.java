package com.vtiger.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginsteps {
    public  WebDriver driver;
    @Given("user should be on login page")
    public void user_should_be_on_login_page() {
        driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();

    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
    }
    @Then("user should navigate to home page")
    public void user_should_navigate_to_home_page() {
        driver.findElement(By.linkText("Home")).isDisplayed();
    }
    @Then("user can see logout link")
    public void user_can_see_logout_link() {
        driver.findElement(By.linkText("Logout")).isDisplayed();

    }
    @When("user enters invalid credentials")
    public void user_enters_invalid_credentials() {
        driver.findElement(By.name("user_name")).sendKeys("Admin1");
        driver.findElement(By.name("user_password")).sendKeys("Admin2");
        driver.findElement(By.name("Login")).click();
    }
    @Then("user should be on same page")
    public void user_should_be_on_same_page() {
        driver.findElement(By.name("user_name"));
    }
    @Then("user can see error message")
    public void user_can_see_error_message() {
        driver.findElement(By.xpath("//*[contains(text(),'You must specify a valid username and password.')]")).isDisplayed();
    }


    @When("user enters invalid credentials user mane as {string} and password as {string}")
    public void user_enters_invalid_credentials_user_mane_as_and_password_as(String uid, String pwd) throws InterruptedException {
        driver.findElement(By.name("user_name")).sendKeys(uid);
        driver.findElement(By.name("user_password")).sendKeys(pwd);
        Thread.sleep(3000);
        driver.findElement(By.name("Login")).click();
    }

    @When("user click on new lead link")
    public void user_click_on_new_lead_link() {
        driver.findElement(By.linkText("New Lead")).click();

    }
    @When("fill mandatory fields and click save button")
    public void fill_mandatory_fields_and_click_save_button() {
        driver.findElement(By.name("lastname")).sendKeys("Modi");
        driver.findElement(By.name("company")).sendKeys("BJP");
        driver.findElement(By.name("button")).click();

    }
    @Then("Lead should created successfully")
    public void lead_should_created_successfully() {
        driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[text()='Modi']")).isDisplayed();
        driver.findElement(By.xpath("//td[text()='Company:']/following::td[text()='BJP']")).isDisplayed();

    }

    @When("fill mandatory fields lastname\"Shah\" and Company \"BJP\"click save button")
    public void fill_mandatory_fields_lastname_shah_and_company_bjp_click_save_button() {
        driver.findElement(By.name("lastname")).sendKeys("");
        driver.findElement(By.name("company")).sendKeys("");
        driver.findElement(By.name("button")).click();
    }
    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }





}
