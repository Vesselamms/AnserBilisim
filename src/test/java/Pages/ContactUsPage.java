package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{

    @FindBy(xpath = "//div[normalize-space(text())='Anser Information Technologies, Bilkent Cyberpark C 3 Blok No: 4C/Z06, 06800 Çankaya Ankara']")
    public WebElement address;
}
