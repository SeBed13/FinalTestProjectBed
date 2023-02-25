package org.example;

import PageObjects.MainPage;
import PageObjects.VirtualReadMore;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinitions {

   private final WebDriver driver = new ChromeDriver();
   private MainPage mainPage;
   private VirtualReadMore virtualReadMore;

   public StepDefinitions(){
      mainPage = new MainPage(driver);
      virtualReadMore = new VirtualReadMore(driver);
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

   @Then("the confirmation pop-up appears")
   public void theConfirmationPopUPAppear(){
      driver.switchTo().alert().accept();
   }

   @Then("the page with the Virtual header opens")
   public void thePageWithTheVirtualHeaderOpens(){
      driver.get("file:///Users/sebastian/Desktop/site%20curs%20test/Testing-Env/routes/virtual.html");
   }

   @Then("the page with the Learn Fundamentals header opens")
   public void theFundamentalsPageOpens(){
      driver.get("file:///Users/sebastian/Desktop/site%20curs%20test/Testing-Env/routes/fundamentals.html");
   }

   @Then("the page moves back to the top")
   public void BackToTop(){
      Utils.scrollToElement(driver, mainPage.getTheTop());
   }

   @Then("the page will scroll to the Learn Fundamentals section")
   public void learnFundamentalsSecton(){
      Assert.assertEquals("Learn The Fundamentals", "Learn The Fundamentals");
   }

   @Then("the page will scroll to the Instructors section")
   public void instructorsSection(){
      Assert.assertEquals("Our Instructors", "Our Instructors");
   }

   @Then("the question will expand showing the answer")
   public void questionExpand(){
      mainPage.getExpandedQuestion();
   }

   @Then("the border of the email field turns red")
   public void redBoxAlert(){
      Assert.assertTrue(mainPage.getEmailField().getAttribute("class").contains("error"));

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
   public void iClickIntructorsNav(){
      mainPage.clickOnInstructorsNav();
   }

   @When("I click on the first question in FAQ section")
   public void iClickOnFirstQuestion(){
      Utils.scrollToElement(driver, mainPage.getFaqSection());
      mainPage.clickOnFirstQuestion();
   }

   @After
   public void cleanUp() {
      driver.quit();
   }



   }
