@Candidate2
Feature: F02 - Candidate can see the job's details.

  Background:
    Given user is on the jobs listing in Main screen

  @TC02-001
  Scenario Outline: TC02-001 Candidate opens a job's page and see its details.
    When user opens a job which has index of <index> in Main screen
    Then verify user should see info in Jobs Details screen
    Examples: First and Second jobs
      | index |
      | 0     |
      | 1     |

  @TC02-002
  Scenario: TC02-002 Candidate opens a job's page and see its details.
    When user opens a job which has index of 0 in Main screen
    Then verify user should see info in Jobs Details screen


  @TC02-003
  Scenario: TC02-003 Candidate opens a job's page and see its details.
    When user opens a job which has index of 1 in Main screen
    Then verify user should see info in Jobs Details screen