package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarsPage {
    public BlueRentalCarsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login1;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;


    @FindBy(id = "formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement login2;


    @FindBy(id = "dropdown-basic-button")
    public WebElement home;






}
