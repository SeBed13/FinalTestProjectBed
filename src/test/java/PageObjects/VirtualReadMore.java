package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualReadMore {

    public VirtualReadMore(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

}

