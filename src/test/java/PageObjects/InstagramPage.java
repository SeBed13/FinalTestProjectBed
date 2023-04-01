package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramPage {

    public InstagramPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getCookiesInstagram() {
        return cookiesInstagram;
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/h2")
    private WebElement cookiesInstagram;
}
