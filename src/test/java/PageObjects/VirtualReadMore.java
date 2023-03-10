package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualReadMore {

    public VirtualReadMore(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    public WebElement getVirtualHeader() {
        return virtualHeader;
    }

    @FindBy(xpath = "/html/body/h1")
    private WebElement virtualHeader;

    public WebElement getReturnButtonFromVirtual() {
        return returnButtonFromVirtual;
    }

    @FindBy(xpath = "/html/body/a")
    private WebElement returnButtonFromVirtual;

    public void clickOnReturnButtonFromVirtual(){
        this.returnButtonFromVirtual.click();
    }
}

