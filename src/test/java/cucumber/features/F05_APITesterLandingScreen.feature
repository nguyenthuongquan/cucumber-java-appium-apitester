@APITester-LandingScreen
  Feature: F05 - User can see API Tester Landing Screen

    @APITester-001 @NightlyRegression
    Scenario: TC05-001 User should see Setting icon in top of Landing screen
      Then verify user should see Setting icon in top of APITester Landing screen

    @APITester-002 @NightlyRegression
    Scenario: TC05-002 User should see Search Box in top of Landing screen
      Then verify user should see Search box in top of APITester Landing screen

    @APITester-003 @NightlyRegression
    Scenario: TC05-003 User should see More Option icon in top of Landing screen
      Then verify user should see More Option icon in top of Landing screen

    @APITester-004 @NightlyRegression
    Scenario: TC05-004 User should see Add request icon in top of Landing screen
      Then verify user should see Add request icon in top of Landing screen

    @APITester-005 @NightlyRegression
    Scenario: TC05-005 User should see info in More Option panel in top of Landing screen
      Given verify user should see More Option icon in top of Landing screen
      When user taps on More Option icon in top of Landing screen
      Then verify user should see option "Run all requests" in More Option panel
      Then verify user should see option "Variables" in More Option panel
      Then verify user should see option "New Folder" in More Option panel
      Then verify user should see option "New Collection" in More Option panel
      Then verify user should see option "Delete all requests" in More Option panel

    @APITester-006 @NightlyRegression
    Scenario: TC05-006 User should see info in Setting panel in top of Landing screen
      Given verify user should see More Option icon in top of Landing screen
      When user taps on Setting icon in top of APITester Landing screen
      Then verify user should see item "Rate API Tester" in Settings panel
      Then verify user should see item "Share with friends" in Settings panel
      Then verify user should see item "Guides" in Settings panel
      Then verify user should see item "Community" in Settings panel
      Then verify user should see item "Report a bug" in Settings panel
      Then verify user should see item "More great tools" in Settings panel