Feature: To validate UI and functionality of checkout

@Automation
Scenario Outline: To validate button functionalities
Given user logs in to the app with "<UID>" and "<PWD>" in login page
Then user navigated to the home page
And "ADD TO CART" text button should be displayed
When user taps on A2C button
Then rmv "REMOVE" button should be displayed
When user taps on remove button
And "ADD TO CART" text button should be displayed
When user taps on A2C button
And navigates inside product
Then rmv "REMOVE" button should be displayed
When user taps on remove button
And "ADD TO CART" text button should be displayed
When user taps on A2C button
And taps on Back to product button
And taps on page view button
Then remove icon should be displayed
When user taps on remove icon
Then A2C icon should be displayed
When user taps on A2C icon
Then remove icon should be displayed
And user logs out
Examples:
|UID|PWD|
|standard_user|secret_sauce|


@Automation
Scenario Outline: To validate cart functionalities
Given user logs in to the app with "<UID>" and "<PWD>" in login page
Then user navigated to the home page
When user taps on A2C button
And user selects another product
And selects cart icon
Then cart landing page displayed
When user taps on remove icon
And user taps on "CONTINUE SHOPPING" continue shopping button
Then user navigated to the home page
When user taps on A2C button
And selects cart icon
Then cart landing page displayed
And user taps on "CONTINUE SHOPPING" continue shopping button
Then user navigated to the home page
When user taps on A2C button
And user taps on checkout button
Then checkout info page should be displayed
When user fills checkout fields with "<FN>" firstname 
And user fills checkout fields with"<LN>" lastname  
And user fills checkout fields with "<PsC>" post code
And taps on continue button
Then checkout overview page should be displayed
When user taps on "FINISH" button
Then Order confirmation page should be displayed
And user logs out
Examples:
|UID|PWD|prd1|prd2|FN|LN|PsC|
|standard_user|secret_sauce|Sauce Labs Backpack|Sauce Labs Bike Light|QA|Eng|123456|


@Automation
Scenario Outline: To perform negative validation
Given user logs in to the app with "<UID>" and "<PWD>" in login page
Then user navigated to the home page
When user taps on A2C button
And selects cart icon
Then cart landing page displayed
When user taps on checkout button
Then checkout info page should be displayed
When taps on continue button
Then firstname "<FNerrTxt>" should be displayed
When user fills checkout fields with "<FN>" firstname 
And taps on continue button
Then lastname <LNerrTxt> should be displayed
When user fills checkout fields with"<LN>" lastname  
And taps on continue button
Then postcode <PsCerrTxt> should be displayed
When user fills checkout fields with "<PsC>" postcode
And taps on continue button
Then checkout overview page should be displayed
When user taps on cancel button
Then user navigated to the home page
And user logs out
Examples:
|UID|PWD|prd1|prd2|FN|LN|PsC|FNerrTxt|LNerrTxt|PsCerrTxt|
|standard_user|secret_sauce|QA|Eng|123456|First Name is required|Last Name is required|Postal Code is required|


@Automation
Scenario Outline: To validate button functionalities using error data
Given user logs in to the app with "<UID>" and "<PWD>" in login page
Then user navigated to the home page
And "ADD TO CART" text button should be displayed
When user taps on A2C button
Then rmv "REMOVE" button should be displayed
When user taps on remove button
And "ADD TO CART" text button should be displayed
When user taps on A2C button
And navigates inside product
Then rmv "REMOVE" button should be displayed
When user taps on remove button
And "ADD TO CART" text button should be displayed
When user taps on A2C button
And taps on Back to product button
And taps on page view button
Then remove icon should be displayed
When user taps on remove icon
Then A2C icon should be displayed
When user taps on A2C icon
Then remove icon should be displayed
And user logs out
Examples:
|UID|PWD|
|problem_user|secret_sauce|

