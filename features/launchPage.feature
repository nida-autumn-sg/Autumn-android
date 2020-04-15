@MobileAndroidTesting
Feature: To verify the four options of retirement goal
Scenario Outline:To validate first option
Given user launches the Autumn Application
Then user clicks on start button and reads the test data
Then user enters the name "<name>" and clicks on next button 
Then user enters the date of birth "<dateofbirth>" and clicks on next button
Then user selects the gender and clicks on next
Then user selects the country and clicks on next
Then user enters the email "<emailAddress>" and clicks on next
Then user enters the income "<income>" and expense "<expense>" and clicks on next
Then user enters the savings "<savings>" and liabilities "<liabilities>" and clicks on next
Then user select the first option in retirement goal
Then enter the amount of savings "<amtOfSavings>"
Then enter the retirement age "<retirementAge>"and click on done
Then user selects finance option from the below navigation bar
Then user enters the pwd "<password>"
And selects the registerAccount button
Then user navigates back to the overview page
Then logsout of the app

Examples:
 |name		|dateofbirth	|emailAddress	|income	|expense	|savings	|liabilities	|amtOfSavings	|retirementAge	|password   |
 |tommy		|12/02/2000		|tommy@gmail.com	|10000	|8000		|10000		|0				|200000			|65				|Madic@12345|
 
 

#Scenario Outline:To validate second option
#Given user launches the Autumn Application
#Then user clicks on start button and reads the test data
#Then user enters the name "<name>" and clicks on next button 
#Then user enters the date of birth "<dateofbirth>" and clicks on next button
#Then user selects the gender and clicks on next
#Then user selects the country and clicks on next
#Then user enters the email "<emailAddress>" and clicks on next
#Then user enters the income "<income>" and expense "<expense>" and clicks on next
#Then user enters the savings "<savings>" and liabilities "<liabilities>" and clicks on next
#Then user select the second option in retirement goal
#Then enter the desired retirement income "<desiredRetirementIncome>"
#Then enter the retirement age "<retirementAge>"and click on done
#Then close the app

#Examples:
# |name		|dateofbirth	|emailAddress	|income	|expense	|savings	|liabilities	|desiredRetirementIncome|retirementAge	|
# |sara		|12/02/1995		|sara@gmail.com	|10000	|8000		|10000		|0				|200000					|70				|


#Scenario Outline:To validate third option
#Given user launches the Autumn Application
#Then user clicks on start button and reads the test data
#Then user enters the name "<name>" and clicks on next button 
#Then user enters the date of birth "<dateofbirth>" and clicks on next button
#Then user selects the gender and clicks on next
#Then user selects the country and clicks on next
#Then user enters the email "<emailAddress>" and clicks on next
#Then user enters the income "<income>" and expense "<expense>" and clicks on next
#Then user enters the savings "<savings>" and liabilities "<liabilities>" and clicks on next
#Then user select the third option in retirement goal
#Then enter the legacy amount "<LegacyAmount>"
#Then enter the retirement age "<retirementAge>"and click on done
#Then close the app

#Examples:
# |name		|dateofbirth	|emailAddress	|income	|expense	|savings	|liabilities	|LegacyAmount	|retirementAge	|
# |aba		|12/02/1998		|sara@gmail.com	|10000	|8000		|10000		|0				|200000			|78				|
 
 
 
 
 
#Scenario Outline:To validate fourth option
#Given user launches the Autumn Application
#Then user clicks on start button and reads the test data
#Then user enters the name "<name>" and clicks on next button 
#Then user enters the date of birth "<dateofbirth>" and clicks on next button
#Then user selects the gender and clicks on next
#Then user selects the country and clicks on next
#Then user enters the email "<emailAddress>" and clicks on next
#Then user enters the income "<income>" and expense "<expense>" and clicks on next
#Then user enters the savings "<savings>" and liabilities "<liabilities>" and clicks on next
#Then user select the fourth option in retirement goal
#Then enter the retirement age "<retirementAge>"and click on next
#Then enter the desired retirement income "<desiredRetirementIncome>" and click on done
#Then close the app


#Examples:
# |name		|dateofbirth	|emailAddress	|income	|expense	|savings	|liabilities	|retirementAge	|desiredRetirementIncome|
# |zafar		|12/02/1986		|zafar@gmail.com|10000	|8000		|10000		|5000000		|78				|2000000				|
