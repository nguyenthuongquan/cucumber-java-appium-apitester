@Candidate1
  Feature: F01 - Candidate can see the job's details.

    @TC01-001
    Scenario Outline: TC01-001 Candidate opens a job's page and see its details.
      Given user is on the jobs listing in Main screen
      When user opens a job which has index of <index> in Main screen
      Then verify user should see info in Jobs Details screen
      Examples: First and Second jobs
        | index |
        | 0     |
        | 1     |

    @TC01-002
    Scenario: TC01-002 Candidate opens a job's page and see its details.
      Given user is on the jobs listing in Main screen
      When user opens a job which has index of 0 in Main screen
      Then verify user should see info in Jobs Details screen

    @TC01-003
    Scenario: TC01-003 Candidate opens a job's page and see its details.
      Given user is on the jobs listing in Main screen
      When user opens a job which has index of 1 in Main screen
      Then verify user should see info in Jobs Details screen

    @TC01-004
    Scenario: TC01-004 Candidate opens a job's page and see its details.
      Given user clicks 'Welcome' button in Splash screen
      And user clicks 'Searching for a job' button in Selection screen
      And user allows to access device's location while using the app in Main screen
      When user opens a job which has index of 1 in Main screen
      Then verify user should see info in Jobs Details screen
