@smoke
Feature: Google Search Automation

  Scenario: Verify Google homepage
    Given user opens google homepage
    Then page title should contain "Google"
