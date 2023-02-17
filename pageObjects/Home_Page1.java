package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Home_Page1 {


    WebDriver driver;

    Actions action;

    Select drphomeValSelect;

    public Home_Page1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);


    }

    @FindBy(xpath = "//input[@id='rewLocation']")
    WebElement zip_code;

    @FindBy(xpath = "//div[@class='mainCard overlayPageCard Step']//button[@class='goBtn rewGetQuoteGo'][normalize-space()='Go']")
    WebElement go_button;

    @FindBy(xpath ="//input[@value='17']")
    WebElement home_value;

    @FindBy(xpath = "//button[@class='goBtn rewGetCategoryClick']\n")
    WebElement contiue_button;

    @FindBy(xpath = "//input[@placeholder='Address']")
    WebElement streetadress;

    @FindBy(xpath = "//input[@id='address']")
    WebElement home_adress;

    @FindBy(xpath = "//i[@class='icon-entypo-magnifying-glass orange-default-color']")
    WebElement search;

    @FindBy(xpath="//input[@placeholder='First Name']")
    WebElement first_name;

    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement last_name;

    @FindBy(xpath="//input[@placeholder='Phone']")
    WebElement phone_number;

    @FindBy(xpath="//input[@placeholder='Email']")
    WebElement email;

    @FindBy(xpath="//input[@name='OffersCheckBox']")
    WebElement checkbox_savings;

    @FindBy(xpath="//input[@name='RequestMortgageInfo']")
    WebElement request_mor_info;


    public void zipcode() {
        zip_code.sendKeys("94568");
        zip_code.click();
    }

    public void go() {
        go_button.click();
    }

    public void home() {
        home_value.click();
    }

    public void continu() {
        contiue_button.click();

    }

    public void drpdrphomeValSelect() {
        drphomeValSelect = new Select(driver.findElement(By.name("Intent")));
        drphomeValSelect.selectByValue("1");
    }

    public void property_type() {
        drphomeValSelect =new Select(driver.findElement(By.name("PropertyType")));
        drphomeValSelect.selectByValue("147");
    }
    public void bed_rooms(){
        drphomeValSelect =new Select(driver.findElement(By.name("Bedrooms")));
        drphomeValSelect.selectByValue("6");

    }
    public void bath_rooms(){
        drphomeValSelect =new Select(driver.findElement(By.name("Bathrooms")));
        drphomeValSelect.selectByValue("4");

    }

    public void timeframe(){
        drphomeValSelect =new Select(driver.findElement(By.name("TimeFrame")));
        drphomeValSelect.selectByValue("25");

    }
    public void price_range(){
        drphomeValSelect =new Select(driver.findElement(By.name("PriceRange")));
        drphomeValSelect.selectByValue("200000-224999");

    }

    public void about_yourself(){
        first_name.sendKeys("Sara");
        last_name.sendKeys("Richard");
        phone_number.sendKeys("9788099666");
        email.sendKeys("Saramjd@gmail.com");
    }

    public void checkbox1(){
        checkbox_savings.click();
    }

    public void request_info(){
        request_mor_info.click();
    }







    public void enter_adress(){
        home_adress.sendKeys(
                "346 Filbert Ct, Oakley, CA, 94561");
        action.doubleClick(home_adress).build().perform();
    }
    public void street_adress(){

        streetadress.sendKeys("346 Filbert Ct, Oakley, CA, 94561");
    }

    public void tear_down(){
        driver.close();
    }
}
