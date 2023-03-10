package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundamentalsPage {

    public FundamentalsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getFundamentalsPageHeader() {
        return fundamentalsPageHeader;
    }

    @FindBy(xpath = "/html/body/h1")
    private WebElement fundamentalsPageHeader;

    @FindBy(xpath = "/html/body/a")
    private WebElement returnButtonFromFundamentalsPage;

    public void clickOnReturnButtonFromFundamentals(){
        this.returnButtonFromFundamentalsPage.click();
    }

}
