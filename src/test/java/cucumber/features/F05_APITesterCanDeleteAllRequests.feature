@APITester-DeleteRequest
  Feature: F05 - User can delete all requests

    @APITester-001 @NightlyRegression @Suite1
    Scenario: TC-001 User should be able to delete all requests
      Given user taps on More Option icon in top of Landing screen
      And verify user should see item "Delete all requests"
      When user taps on "Delete all requests" in More Option panel
      And verify user should see item "DELETE"
      And user confirms "DELETE" in delete all requests popup
      Then verify user should see item "Create new request" in Landing screen