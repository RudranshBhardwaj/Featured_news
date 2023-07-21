Feature: Login with Valid Credentials
@Sanity
	Scenario: Successful Login with Valid Credentials
	
		When user login
		Then User navigates to be.cognizant
		Then capture Heading
		Then capture Paragraph