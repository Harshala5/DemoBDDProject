package steps;


import cucumber.api.java.Before;
import cucumber.api.java.After;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Harshala on 30/01/2018.
 */

public class StepDefinations {

    public  WebDriver driver;
    public  String url = "https://www.google.co.uk/";


    @Before
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @After
    public void stopBrowser(){
        driver.close();
    }


    @Given("^I am on Google Home page$")
    public void i_am_on_Google_Home_page() throws Throwable {
        //startBrowser();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.co.uk/");
        System.out.println("Page : "+driver.getCurrentUrl());
        System.out.println("I am on Google Home Page.");
    }


    @When("^If I click Gmail link$")
    public void if_I_click_Gmail_link() throws Throwable {
        WebElement gmail_link = driver.findElement(By.className("gb_P"));
        gmail_link.click();
        System.out.println("If I click Gmail Link, ");

    }

    @Then("^Gmail Page should be displayed$")
    public void gmail_Page_should_be_displayed() throws Throwable {
        Assert.assertEquals(driver.getTitle(),"Gmail - Free Storage and Email from Google");
        Assert.assertTrue(driver.getTitle().contains("Gmail"));
        System.out.println("after click: "+driver.getTitle());
        System.out.println("Gmail Page displayed.");
    }
}
