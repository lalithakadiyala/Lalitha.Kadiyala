package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {


    WebDriver driver;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@id='identifierId']")
    WebElement login;

    @FindBy (xpath="//span[normalize-space()='Next']")
    WebElement l_next;

    @FindBy(xpath="//input[@name='password']")
    WebElement password;

    @FindBy(xpath="//span[normalize-space()='Next']")
    WebElement  p_next;

   @FindBy(xpath="//a[@class='mat-focus-indicator main button-xl mat-button mat-button-base']")
   WebElement create_Issue;

    @FindBy(xpath="//input[@aria-label='Choose component']")
    WebElement enter_component;

    @FindBy(xpath="//textarea[@id='bv2-description']")
    WebElement desc;

    @FindBy(xpath="//textarea[@id='bv2-description']")
    WebElement component;

    @FindBy(xpath="//input[@id='bv2-title']")
    WebElement title;

    @FindBy (xpath="//span[normalize-space()='Create']")
    WebElement submit_Issue;

    /*public void geturl(String url){
        url="https://issuetracker.google.com/issues/new";
    }*/


    public void login(){
        login.sendKeys("1bugSelenium@gmail.com");
        l_next.click();
    }

    public void password(){
        password.sendKeys("seleniumtest");
        p_next.click();
    }


    public void create_Issue(){
        create_Issue.click();
    }


    public void enter_comp(String comp){

        enter_component.sendKeys(comp);
    }


    public void description(String des){
        desc.sendKeys(des);

    }

    public void title(String ti){
        title.sendKeys(ti);
    }

    public void submit_Issue(){
        submit_Issue.click();
    }

    public void tear_down(){
        driver.close();
    }
}
