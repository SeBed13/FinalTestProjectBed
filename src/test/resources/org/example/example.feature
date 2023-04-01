Feature: An example

  Scenario: Email positive #1
    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click the submit button
    Then the confirmation pop-up appears

  Scenario: Email positive #2
    Given I am on the main page
    When I write the email address of "test@hoteloffice.ro"
    And I click the submit button
    Then the confirmation pop-up appears

  Scenario: Institutional email negative #1
    Given I am on the main page
    When I write the email address of "s.bedregianu.student.unitbv.ro"
    And I click the submit button
    Then the border of the email field turns red

  Scenario: Negative #2
    Given I am on the main page
    When I write the email address of "testsssstestssssvtestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    And I click the submit button
    Then the border of the email field turns red

  Scenario: Virtual Read More button
    Given I am on the main page
    When I click on the Read More button for the Virtual classes
    Then the page with the Virtual header opens

  Scenario: Return from Virtual Page
    Given I am on the main page
    When I click on the Read More button for the Virtual classes
    Then the page with the Virtual header opens
    And I click the Return Button below Virtual header
    Then I will return to main page

  Scenario: Learn Fundamentals Read More button
    Given I am on the main page
    When I click on Learn Fundamentals Read More Button
    Then the page with the Learn Fundamentals header opens

  Scenario: Return from Fundamentals Page
    Given I am on the main page
    When I click on Learn Fundamentals Read More Button
    Then the page with the Learn Fundamentals header opens
    And I click the Return Button below the Fundamentals Page header
    Then I will return to main page

  Scenario: Back to top button
    Given I am on the main page
    When I click on the arrow button in the left bottom of the page
    Then the page moves back to the top

  Scenario: What You'll Learn navigation bar
    Given I am on the main page
    When I click on the What You'll Learn in navigation bar
    Then the page will scroll to the Learn Fundamentals section

  Scenario: Instructors navigation bar
    Given I am on the main page
    When I click the Instructors in navigation bar
    Then the page will scroll to the Instructors section


  Scenario: FAQ first question
    Given I am on the main page
    When I click on the first question in FAQ section
    Then the question will expand showing the answer

  Scenario: Start the Enrollment
    Given I am on the main page
    When I click on Start The Enrollment button
    Then the Enrollment page opens

  Scenario: Complete information in the Enrollment page
    Given I am on the main page
    When I click on Start The Enrollment button
    Then the Enrollment page opens
    And I write my first name as "Max"
    And I write my last name as "Volume"
    And I write my username as "MaxVolume01"
    And I write a password as "simplepassword"
    And I write again the password as "simplepassword"
    When I click on the Next button
    And I write an email as "maxvolume13@platform.com"
    And I write phone number as "078989898989"
    And I write country as "Romania"
    And I write city as "Brasov"
    And I write post code as "500449"
    When I click on the Next button again
    And I select the third option - Software Testing - Automation & Manual tester certificate
    When I click on Next once again
    And I write cardholder name as "Max Volume"
    And I write card number as "4539569261682385"
    And I write CVC as "123"
    And I select the expiration month of card
    And I select the expiration year of card
    When I click on Next one more time
    Then I am successfully registered and I am able to click to return to homepage

    Scenario: Instructor's Twitter
      Given I am on the main page
      When I click the Instructors in navigation bar
      Then the page will scroll to the Instructors section
      And I click on Twitter logo in first instructor box
      Then The Twitter page opens

    Scenario: Instructor's Instagram
      Given I am on the main page
      When I click the Instructors in navigation bar
      Then the page will scroll to the Instructors section
      And I click on Instagram logo in first instructor box
      Then The Instagram page opens


