package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentPage {

    public EnrollmentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getEnrollmentPageTitle() {
        return enrollmentPageTitle;
    }

    @FindBy(xpath = "/html/body/div/div/h2")
    private WebElement enrollmentPageTitle;

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;

    public WebElement getPasswordField() {
        return passwordField;
    }

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    public WebElement getConfirmPasswordField() {
        return confirmPasswordField;
    }

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    public void clickOnNextButton(){this.nextButton.click();}
    public void writeFirstNameToField(String firstName) {
        this.firstNameField.sendKeys(firstName);
    }

    public void writeLastNameToField(String lastName) {
        this.lastNameField.sendKeys(lastName);
    }

    public void writeUsernameToField(String username) {
        this.usernameField.sendKeys(username);
    }

    public void writePasswordToField(String password) {
        this.passwordField.sendKeys(password);
    }

    public void writeCPasswordToField(String cPassword) {
        this.confirmPasswordField.sendKeys(cPassword);
    }
}
