package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    @FindBy(xpath = "//a[normalize-space(text())='Got it!']")
    public WebElement AcceptCookies;

    @FindBy(xpath = "//ul[@id='menu']//a[@href='/page/contuct-us']")
    public WebElement ContactUs;
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
