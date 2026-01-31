@smoke
Feature: Google Search

  Scenario: Verify Google title
    Given user opens google homepage
    Then page title should contain Google

  @regression
  Scenario: Open Google again
    Given user opens google homepage
    Then page title should contain Google
