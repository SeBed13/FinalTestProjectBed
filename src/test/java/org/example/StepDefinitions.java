package org.example;

import PageObjects.EnrollmentPage;
import PageObjects.FundamentalsPage;
import PageObjects.MainPage;
import PageObjects.VirtualReadMore;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class StepDefinitions {

   private final WebDriver driver = new FirefoxDriver();
   private MainPage mainPage;
   private VirtualReadMore virtualReadMore;

   private EnrollmentPage enrollmentPage;
   private FundamentalsPage fundamentalsPage;
   public StepDefinitions(){
      mainPage = new MainPage(driver);
      virtualReadMore = new VirtualReadMore(driver);
      fundamentalsPage = new FundamentalsPage(driver);
      enrollmentPage = new EnrollmentPage(driver);
      driver.manage().window().maximize();

   }

   @Given("I am on the main page")
    public void iAmOnTheMainPage() {
      driver.get("file:///Users/sebastian/Desktop/site%20curs%20test/Testing-Env/index.html");
   }
   @When("I write the email address of {string}")
   public void iWriteTheEmailAddressOf(String string) {
      mainPage.writeEmailToEmailField(string);
   }

   @When("I click on the Read More button for the Virtual classes")
   public void iClickTheVirtualReadMoreButton(){
      Utils.scrollToElement(driver, mainPage.getVirtualTitle());
      mainPage.clickOnReadMoreButton();
   }

   @When("I click on the What You'll Learn in navigation bar")
   public void iClickWhatYouWillLearnNav(){
      mainPage.clickOnWhatYouWillLearnNav();
   }

   @When("I click on Start The Enrollment button")
   public void iClickStartTheEnrollmentButton(){
      mainPage.clickOnStartTheEnrollmentButton();
   }

   @Then("the Enrollment page opens")
   public void theEnrollmentPageOpens(){
      Assert.assertEquals(enrollmentPage.getEnrollmentPageTitle().getText(), "Sign up for the Software Testing course");
   }

   @Then("the confirmation pop-up appears")
   public void theConfirmationPopUPAppear(){
      driver.switchTo().alert().accept();
   }

   @Then("the page with the Virtual header opens")
   public void thePageWithTheVirtualHeaderOpens(){
      Assert.assertEquals(virtualReadMore.getVirtualHeader().getText(), "Virtual");
   }

   @Then("the page with the Learn Fundamentals header opens")
   public void theFundamentalsPageOpens(){
      Assert.assertEquals(fundamentalsPage.getFundamentalsPageHeader().getText(), "Fundamentals page");
   }

   @Then("the page moves back to the top")
   public void BackToTop(){
      Utils.scrollToElement(driver, mainPage.getTheTop());
   }

   @Then("the page will scroll to the Learn Fundamentals section")
   public void learnFundamentalsSection(){
      Assert.assertEquals(mainPage.getLearnFundamentalsTitle().getText(), "Learn The Fundamentals");
   }

   @Then("the page will scroll to the Instructors section")
   public void instructorsSection(){
      Assert.assertEquals(mainPage.getOurInstructorsTitle().getText(), "Our Instructors");
   }

   @Then("the question will expand showing the answer")
   public void questionExpand(){
      mainPage.getExpandedQuestion();
   }

   @Then("the border of the email field turns red")
   public void redBoxAlert(){
      Assert.assertTrue(mainPage.getEmailField().getAttribute("class").contains("error"));

   }

   @Then("I will return to main page")
   public void returnToMainPage(){
      Assert.assertEquals(mainPage, mainPage);
   }
   @When("I click on Learn Fundamentals Read More Button")
   public void iClickTheFundamentalsReadMore(){
      Utils.scrollToElement(driver, mainPage.getLearnFundamentalsTitle());
      mainPage.clickOnLearnFundamentalsButton();
   }

   @When("I click on the arrow button in the left bottom of the page")
   public void iClickBackToTopButton(){
      Utils.scrollToElement(driver, mainPage.getContactInfoTitle());
      mainPage.clickOnBackToTopButton();}

   @When("I click the submit button")
   public void iClickTheSubmitButton() {
      mainPage.clickOnSubmitButton();
   }

   @When("I click the Instructors in navigation bar")
   public void iClickInstructorsNav(){
      mainPage.clickOnInstructorsNav();
   }

   @When("I click on the first question in FAQ section")
   public void iClickOnFirstQuestion(){
      Utils.scrollToElement(driver, mainPage.getFaqSection());
      mainPage.clickOnFirstQuestion();
   }

   @When("I click on the Next button")
   public void iClickOnNextButton(){
      enrollmentPage.clickOnNextButton();
   }

   @When("I click on the Next button again")
      public void iClickOnSecondNextButton(){
      enrollmentPage.clickOnSecondNextButton();
      }
   @And("I click the Return Button below Virtual header")
   public void iClickOnReturnButtonFromVirtual(){
      virtualReadMore.clickOnReturnButtonFromVirtual();
   }

   @And("I click the Return Button below the Fundamentals Page header")
   public void iClickOnReturnButtonFromFundamentals(){
      fundamentalsPage.clickOnReturnButtonFromFundamentals();
   }

   @And("I write my first name as {string}")
   public void writeFirstName(String string){enrollmentPage.writeFirstNameToField(string);}

   @And("I write my last name as {string}")
   public void writeLastName(String string){enrollmentPage.writeLastNameToField(string);}

   @And("I write my username as {string}")
   public void writeUsername(String string){enrollmentPage.writeUsernameToField(string);}

   @And("I write a password as {string}")
   public void writePassword(String string){enrollmentPage.writePasswordToField(string);}

   @And("I write again the password as {string}")
   public void writeCPassword(String string){enrollmentPage.writeCPasswordToField(string);}

   @And("I write an email as {string}")
   public void writeEmail(String string){enrollmentPage.writeEmailToField(string);}

   @And("I write phone number as {string}")
   public void writePhone(String string){enrollmentPage.writePhoneToField(string);}

   @And("I write country as {string}")
   public void writeCountry(String string){enrollmentPage.writeCountryToField(string);}

   @And("I write city as {string}")
   public void writeCity(String string){enrollmentPage.writeCityToField(string);}

   @And("I write post code as {string}")
   public void writePostCode(String string){enrollmentPage.writePostCodeToField(string);}


   @After
   public void cleanUp() {
      driver.quit();
   }



   }
