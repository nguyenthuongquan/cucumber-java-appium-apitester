@APITester-CreateGetRequest
  Feature: F06 - User can create GET request

    @APITester-007 @NightlyRegression
    Scenario: TC05-007 User should be able to create GET request
      Given user taps on Add Requests icon in top of APITester Landing screen
      And user taps on "GET" Requests button in Create New Request screen
      When user types "jsonplaceholder.typicode.com/todos/1" into URL in Request Details screen
      Then verify user should see the item "jsonplaceholder.typicode.com/todos/1" in Request Details screen
      And user taps on "Done" button in Request Details screen
      Then verify user should see the item "jsonplaceholder.typicode.com/todos/1" in Request List screen
