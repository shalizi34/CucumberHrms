@searchEmployee @sprint13
Feature: Employee Search

Background:
   Given user is logged with valid admin credentials
   And user navigate to employee list page

  @smoke
  Scenario: Search employee by id
    When user enters valid employee id
    And click on search button
    Then user see employee information is displayed

  @regression
  Scenario: Search employee by name
    When user enters valid employee name and last name
    And click on search button
    Then user see employee information is displayed