package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage {

    public TwitterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTwitterLogo() {
        return twitterLogo;
    }

    @FindBy(xpath = "/html/body/div/div/div/div[2]/header/div/div/div/div/div[1]/h1/a/div/svg/g/path")
    public WebElement twitterLogo;


}
