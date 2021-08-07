@Candidate3
Feature: F03 - Candidate can see the job's details.

  Background:
    Given Candidate is on the jobs listing screen

  @TC03-001
  Scenario Outline: TC03-001 Candidate opens a job's page and see its details.
    When Candidate opens a job which has index of <index>
    Then verify candidate should see the jobs details
    Examples: First and Second jobs
      | index |
      | 0     |
      | 1     |

  @TC03-002
  Scenario: TC03-002 Candidate opens a job's page and see its details.
    When Candidate opens a job which has index of 0
    Then verify candidate should see the jobs details


  @TC03-003
  Scenario: TC03-003 Candidate opens a job's page and see its details.
    When Candidate opens a job which has index of 1
    Then verify candidate should see the jobs details