package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StepDefinitions {

   private final WebDriver driver = new FirefoxDriver();
   private MainPage mainPage;
   private VirtualReadMore virtualReadMore;

   private EnrollmentPage enrollmentPage;
   private FundamentalsPage fundamentalsPage;

   private TwitterPage twitterPage;

   private InstagramPage instagramPage;
   public StepDefinitions(){
      mainPage = new MainPage(driver);
      virtualReadMore = new VirtualReadMore(driver);
      fundamentalsPage = new FundamentalsPage(driver);
      enrollmentPage = new EnrollmentPage(driver);
      twitterPage = new TwitterPage(driver);
      instagramPage = new InstagramPage(driver);
      driver.manage().window().maximize();

   }
// TC_001
   @Given("I am on the main page")
    public void iAmOnTheMainPage() {
      driver.get("file:///Users/sebastian/Desktop/site%20curs%20test/Testing-Env/index.html");
   }
   @When("I write the email address of {string}")
   public void iWriteTheEmailAddressOf(String string) {
      mainPage.writeEmailToEmailField(string);
   }
   @When("I click the submit button")
   public void iClickTheSubmitButton() {
      mainPage.clickOnSubmitButton();
   }
   @Then("the confirmation pop-up appears")
   public void theConfirmationPopUPAppear(){
      driver.switchTo().alert().accept();
   }
   // TC_002
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

   // TODO: Refactor the code as it checks two objects of the same type. What you want to verify in this method is that you return to the main page thus you will need a WebElement, not an object.
   @Then("I will return to main page")
   public void returnToMainPage(){
      Assert.assertEquals(mainPage.getTheTop().getText(), "Become a Certified Software Tester\n" +
              "We focus on teaching our students the fundamentals of software testing along with preparation for their ISTQB Foundation Level Certification\n" +
              "Start The Enrollment");
   }

   @Then("I am successfully registered and I am able to click to return to homepage")
   public void returnToHomePage(){
      enrollmentPage.clickOnReturnToHomepage();
   }

   @Then("The Twitter page opens")
   public void twitterPageOpen(){twitterPage.getTwitterLogo();}

   @Then("The Instagram page opens")
   public void instagramPageOpen(){instagramPage.getCookiesInstagram();}

   @When("I click on Learn Fundamentals Read More Button")
   public void iClickTheFundamentalsReadMore(){
      Utils.scrollToElement(driver, mainPage.getLearnFundamentalsTitle());
      mainPage.clickOnLearnFundamentalsButton();
   }


   @When("I click on the arrow button in the left bottom of the page")
   public void iClickBackToTopButton(){
      Utils.scrollToElement(driver, mainPage.getContactInfoTitle());
      mainPage.clickOnBackToTopButton();}



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

   @When("I click on Next once again")
   public void iClickOnThirdNextButton(){enrollmentPage.clickOnThirdNextButton();}

   @When("I click on Next one more time")
   public void iClickOnFourthNextButton(){enrollmentPage.clickOnFourthNextButton();}

   @And("I click the Return Button below Virtual header")
   public void iClickOnReturnButtonFromVirtual(){
      virtualReadMore.clickOnReturnButtonFromVirtual();
   }

   @And("I click the Return Button below the Fundamentals Page header")
   public void iClickOnReturnButtonFromFundamentals(){
      fundamentalsPage.clickOnReturnButtonFromFundamentals();
   }

   @And("I click on Twitter logo in first instructor box")
   public void iClickOnTwitterIconFirstBox(){Utils.scrollToElement(driver, mainPage.getOurInstructorsTitle());
   mainPage.clickOnTwitterForFirstInstructor();}

   @And("I click on Instagram logo in first instructor box")
   public void iClickOnIntagramIconFirstBox(){Utils.scrollToElement(driver, mainPage.getInstructorsSection());
   mainPage.clickOnInstagramForFirstInstructor();}

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

   @And("I select the third option - Software Testing - Automation & Manual tester certificate")
   public void iClickOnThirdOption(){enrollmentPage.clickOnThirdRadioButton();}

   @And("I write cardholder name as {string}")
   public void writeCardHolder(String cardHolder){enrollmentPage.writeCardHolderNameToField(cardHolder);}

   @And("I write card number as {string}")
   public void writeCardNumber(String cardNumber){enrollmentPage.writeCardNumberToField(cardNumber);}

   @And("I write CVC as {string}")
   public void writeCVC(String string){enrollmentPage.writeCVCToField(string);}

   @And("I select the expiration month of card")
   public void selectMonth(){
      enrollmentPage.clickMonth();
      Select dropdown = new Select(driver.findElement(By.id("month")));
      dropdown.selectByVisibleText("March");
   }

   @And("I select the expiration year of card")
   public void selectYear(){
      enrollmentPage.clickYear();
      Select dropdown1 = new Select(driver.findElement(By.id("year")));
      dropdown1.selectByVisibleText("2025");
   }
   @After
   public void cleanUp() {
      driver.quit();
   }



   }
