Feature: Create Form Action

Scenario: Successful Form submission
	Given User is on Create Form Page
	When User enters Firstname and Lastname and Country
	When Click on Submit button
	Then Message displayed Creation Successfully