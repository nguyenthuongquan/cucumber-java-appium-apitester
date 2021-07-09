@Candidate
Feature: F02 - Candidate can see the job's details.

  Scenario Outline: TC02-001 Candidate opens a job's page and see its details.
    Given Candidate is on the jobs listing screen
    When Candidate opens a job which has index of <index>
    Then Candidate should see the jobs details
    Examples: First and Second jobs
      | index |
      | 0     |
      | 1     |

  @TC02-002
  Scenario: TC02-002 Candidate opens a job's page and see its details.
    Given Candidate is on the jobs listing screen
    When Candidate opens a job which has index of 1
    Then Candidate should see the jobs details