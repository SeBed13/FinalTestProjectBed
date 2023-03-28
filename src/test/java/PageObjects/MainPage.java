package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getOurInstructorsTitle() {
        return ourInstructorsTitle;
    }

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement ourInstructorsTitle;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualTitle;

    public WebElement getVirtualTitle() {
        return virtualTitle;
    }

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMoreButton;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement learnFundamentalsButton;

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement backToTopButton;

    public WebElement getLearnFundamentalsTitle() {
        return learnFundamentalsTitle;
    }

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement learnFundamentalsTitle;

    public WebElement getTheTop() {
        return theTop;
    }

    @FindBy(xpath = "/html/body/section[1]")
    private WebElement theTop;

    public WebElement getContactInfoTitle() {
        return contactInfoTitle;
    }

    @FindBy(xpath = "/html/body/section[8]/div/div/div[1]/h2")
    private WebElement contactInfoTitle;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement whatYouWillLearnNav;

    public WebElement getLearnFundamentalsSection() {
        return learnFundamentalsSection;
    }

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]")
    private WebElement learnFundamentalsSection;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsNavButton;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement firstQuestionFAQ;

    public WebElement getFaqSection() {
        return faqSection;
    }

    public WebElement getExpandedQuestion() {
        return expandedQuestion;
    }

    @FindBy(xpath = "//*[@id=\"question-one\"]")
    private WebElement expandedQuestion;

    @FindBy(xpath = "//*[@id=\"questions\"]/div")
    private WebElement faqSection;

    public WebElement getInstructorsSection() {
        return instructorsSection;
    }

    @FindBy(xpath = "//*[@id=\"instructors\"]")
    private WebElement instructorsSection;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollmentButton;
    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }



    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

    public void writeEmailToEmailField(String email) {
        this.emailField.sendKeys(email);
    }

    public void clickOnReadMoreButton(){this.virtualReadMoreButton.click();}

    public void clickOnLearnFundamentalsButton(){this.learnFundamentalsButton.click();}

    public void clickOnBackToTopButton(){this.backToTopButton.click();}

    public void clickOnWhatYouWillLearnNav(){this.whatYouWillLearnNav.click();}

    public void clickOnInstructorsNav(){this.instructorsNavButton.click();}

    public void clickOnFirstQuestion(){this.firstQuestionFAQ.click();}

    public void clickOnStartTheEnrollmentButton(){this.startEnrollmentButton.click();}


}
