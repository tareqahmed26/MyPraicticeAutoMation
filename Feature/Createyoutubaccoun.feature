Feature: youtube create account

Scenario Outline: Youtube create account with valide informations

Given user on youtube create account home page
When user provide first name and last name as a "<name>" 
And email as a"<username>"
And password as "<password>"
And user provide password as "<repassword>" 
Then user created youtube account 

Examples:

 |name|username|password|repassword|
 |tareq|tareqahmed11416@gmail.com|tareq2021|tareq2021|