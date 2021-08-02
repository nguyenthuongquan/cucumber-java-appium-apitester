#@Candidate
#Feature: F02 - Candidate can see the job's details.
#
#  Background:
#    Given Candidate is on the jobs listing screen
#
#  @TC02-001
#  Scenario Outline: TC02-C Candidate opens a job's page and see its details.
#    When Candidate opens a job which has index of <index>
#    Then verify candidate should see the jobs details
#    Examples: First and Second jobs
#      | index |
#      | 0     |
#      | 1     |
#
#  @TC02-002
#  Scenario: TC02-D Candidate opens a job's page and see its details.
#    When Candidate opens a job which has index of 1
#    Then verify candidate should see the jobs details