Feature: Incident Management in the Service now application
Scenario: Tc001 Create a Incident without any body in the HTTP request
Given: User set the endpoint for service now application
And: User set the authentication for service now application
And: User set the queryparam in the Incident management request
And: User set the request header in the Incident management request
When: user set the Post request to the service now application
Then: Verify the status code for the Incident management request
And: Validate the sys_id in the Incident management request.
