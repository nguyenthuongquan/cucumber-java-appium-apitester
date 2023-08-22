@APITester-LandingScreen
  Feature: F07 - User can see API Tester Landing Screen

    @APITester-003 @NightlyRegression
    Scenario: TC-003 User should see Setting icon in top of Landing screen
      Then verify user should see Setting icon in top of APITester Landing screen

    @APITester-004 @NightlyRegression
    Scenario: TC-004 User should see Search Box in top of Landing screen
      Then verify user should see Search box in top of APITester Landing screen

    @APITester-005 @NightlyRegression
    Scenario: TC-005 User should see More Option icon in top of Landing screen
      Then verify user should see More Option icon in top of Landing screen

    @APITester-006 @NightlyRegression
    Scenario: TC-006 User should see Add request icon in top of Landing screen
      Then verify user should see Add request icon in top of Landing screen

    @APITester-007 @NightlyRegression @Suite1
    Scenario: TC-007 User should see info in More Option panel in top of Landing screen
      Given verify user should see More Option icon in top of Landing screen
      When user taps on More Option icon in top of Landing screen
      Then verify user should see option "Run all requests" in More Option panel
      Then verify user should see option "Variables" in More Option panel
      Then verify user should see option "New Folder" in More Option panel
      Then verify user should see option "New Collection" in More Option panel
      Then verify user should see option "Delete all requests" in More Option panel

    @APITester-008 @NightlyRegression @Suite2
    Scenario: TC-008 User should see info in Setting panel in top of Landing screen
      Given verify user should see More Option icon in top of Landing screen
      When user taps on Setting icon in top of APITester Landing screen
      Then verify user should see item "Rate API Tester" in Settings panel
      Then verify user should see item "Share with friends" in Settings panel
      Then verify user should see item "Guides" in Settings panel
      Then verify user should see item "Community" in Settings panel
      Then verify user should see item "Report a bug" in Settings panel
      Then verify user should see item "More great tools" in Settings panel

    @APITester-009 @NightlyRegression @Suite3
    Scenario: TC-009 User should see New Request panel in Landing screen
      When user taps on "Create new request" item
      Then verify user should see item "Create new request"

    @APITester-010 @NightlyRegression @Suite1
    Scenario: TC-010 User should see Request example in Landing screen
      When user taps on "examples" item
      Then verify user should see item "Request"

    @APITester-011 @NightlyRegression @Suite4
    Scenario: TC-011 User should see New Request panel in Landing screen
      When user taps on "Create new request" item
      Then verify user should see item "Create new request"

    @APITester-012 @NightlyRegression @Suite2
    Scenario: TC-012 User should see Request example in Landing screen
      When user taps on "examples" item
      Then verify user should see item "Request"

    @APITester-013 @NightlyRegression @Suite2
    Scenario: TC-013 User should see New Request panel in Landing screen
      When user taps on "Create new request" item
      Then verify user should see item "Create new request"

    @APITester-014 @NightlyRegression @Suite4
    Scenario: TC-014 User should see Request example in Landing screen
      When user taps on "examples" item
      Then verify user should see item "Request"