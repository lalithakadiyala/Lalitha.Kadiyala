package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Home_Page1;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;


public class Steps_Home {
    WebDriver driver;
    Home_Page1 hp;

    public List<HashMap<String, String>> datamap;
    Logger logger;

    @Given("launch the browser")
    public void launch_the_browser() {
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        driver = new ChromeDriver();
        // driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         hp = new Home_Page1(driver);

        logger = LogManager.getLogger(this.getClass());

    }

    @When("open the url")
    public void open_the_url() {
        driver.get("http://www.homegain.com/homevalues");
        logger.info("Succesfully launched the website");

    }

    @Then("enter the zip code")
    public void enter_the_zip_code() {
       hp.zipcode();
       logger.info("Succesfully entered zip_code");
    }

    @Then("click on go_button")
    public void go_button() {
        hp.go();
        logger.info("Succesfully clicked on Go button");
    }

    @When("select the Home_Values on the subsequent form")
    public void select_the_home_values_on_the_subsequent_form() {
        hp.home();
        logger.info("Succesfull selected the home value");
        }


    @And("click on continue")
    public void click_on_continue() {
        hp.continu();
    }
    @When("Selected drop down")
        public void select_drop_down() {
            hp.drpdrphomeValSelect();
            logger.info("Drop down selected succesfully");
        }

        @Then("enter street adress of the property")
        public void street_adress() {
        hp.street_adress();
        logger.info("Street adreess entered sucecsfully");
        }

      @And("enter the type of the property")
       public void property_type() {
          hp.property_type();
          logger.info("property type entered sucecsfully");
      }

      @Then("enter number of bedrooms and bathrooms")
      public void bed_bath() {
        hp.bed_rooms();
        hp.bath_rooms();
        logger.info("Bed and Bath rooms entered sucecsfully");
       }

    @And ("enter timeframe to sell the home")
    public void timeframe() {
        hp.timeframe();
        logger.info("Timeframe entered sucecsfully");
    }

    @And("enter the price range")
    public void pricerange() {
        hp.price_range();
        logger.info("price range entered sucecsfully");
    }
    @And ("enter the personal information")
    public void personal_info() {
        hp.about_yourself();
        logger.info("personel information entered sucecsfully");
    }
    @Then("check the money savings offer checkbox")
    public void savings_check(){
        hp.checkbox1();
    }
    @Then("check the contact me about the offers checkbox")
    public void offers_check(){
        hp.request_info();
    }

    @And("close the browser")
    public void tear_down() {
        hp.tear_down();
    }


    }






