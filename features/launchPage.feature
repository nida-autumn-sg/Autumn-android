@AlphaTesting
Feature: To register to autumn app and add savings & liabilites, properties and CPF
#Scenario Outline:To register to autumn app
#Given user launches the Autumn Application
#Then user clicks on start button and accepts the popUp
#Then user enters the name "<name>" and clicks on next button 
#Then user enters the date of birth "<dateofbirth>" and clicks on next button
#Then user selects the gender and clicks on next
#Then user selects the country and clicks on next
#Then user enters the email "<emailAddress>" and clicks on next
#Then user enters the income "<income>" and expense "<expense>" and clicks on next
#Then user enters the savings "<savings>" and liabilities "<liabilities>" and clicks on next
#Then user select the first option in retirement goal
#Then enter the amount of savings "<amtOfSavings>"
#Then enter the retirement age "<retirementAge>"and click on done
#Then user selects finance option from the below navigation bar
#Then user enters the pwd "<password>"
#And selects the registerAccount button
#Then user navigates back to the overview page
#Then logsout of the app

#Examples:
# |name		|dateofbirth	|emailAddress	  |income	|expense	|savings	|liabilities	|amtOfSavings	|retirementAge	|password   |
# |bunny		|12/02/2000		|bunny@gmail.com  |10000	|8000		|10000		|0				|200000		    |65			|Madic@12345|
 
 

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






Scenario Outline:To register to autumn app
Given user launches the Autumn Application
Then user clicks on start button and accepts the popUp
Then user enters the name "<name>" and clicks on next button 
Then user enters the date of birth "<dateofbirth>" and clicks on next button
Then user selects the gender and clicks on next
Then user selects the country and clicks on next
Then user enters the email "<emailAddress>" and clicks on next
Then user enters the pwd "<password>"
And selects the registerAccount button
Then logsout of the app

Examples:
|name		|dateofbirth	|emailAddress	  |password   |
|nida		|12/02/2000		|nida16@gmail.com  |Madic@12345|



Scenario Outline:To add the savings and liabilities 
Given user launches the Autumn Application
Then user clicks on login button
Then user provides the username "<uname>" and pwd "<password>"
Then user clicks on login button
Then user selects the bank option from the Quicklinks
Then user selects the product from AddProduct dropdown
Then user gives the account name "<AccountName>"
Then user chooses the bank "<bank>" from the dropdown
And user provides the amount "<Amount>" present in the account
And user click on save and selects the fab button
Then user selects the home loan option
Then user provides the loan name "<LoanName>"
Then user chooses the bank "<bank1>" from the dropdown
And user provides the amount "<Amount1>" present in the account
And user clicks on save and then on cross button
Then logsout of the app

Examples:

|uname            |password   |AccountName|bank		|Amount   |LoanName |bank1|Amount1|
|nida16@gmail.com |Madic@12345| nida	  |Maybank  |300      |Home Loan|UOB  |200    |


Scenario Outline:To add the CPF details 
Given user launches the Autumn Application
Then user clicks on login button
Then user provides the username "<uname>" and pwd "<password>"
Then user clicks on login button
Then user selects the CPF option from the Quicklinks
Then user enters the monthly contribution "<MonthlyContribution>"
Then user provides the value of ordinary account "<OrdinaryAccount>"
Then user provides the value of special account "<SpecialAccount>"
Then user provides the value of Medisave account "<MedisaveAccount>"
And user clicks on save and then on cross button
Then logsout of the app

Examples:

|uname           |password   |MonthlyContribution  |OrdinaryAccount	|SpecialAccount  |MedisaveAccount |
|nida16@gmail.com |Madic@12345| 1200              |2000			    |3200	         |850	 |



Scenario Outline:To add the property details 
Given user launches the Autumn Application
Then user clicks on login button
Then user provides the username "<uname>" and pwd "<password>"
Then user clicks on login button
Then user selects the properties option from the Quicklinks
Then user provides the property name "<PropertyName>" 
Then user provides the postal code "<PostalCode>"
Then user provides the estimated property value "<EstimatedValue>" 
And user clicks on save and then on cross button
Then logsout of the app

Examples:

|uname           |password   |PropertyName  |PostalCode  |EstimatedValue  |
|nida16@gmail.com |Madic@12345|condo         |640009      |2000000        |








#Scenario Outline:To add the investment details 
#Given user launches the Autumn Application
#Then user clicks on login button
#Then user provides the username "<uname>" and pwd "<password>"
#Then user clicks on login button
#Then user selects the investment option from quick links
#Then user selects the equities option from the drop down
#Then user provides equity name "<name>" and Date of intial purchase "<Date>" and Broker "<Broker>" and Ticker "<Ticker>" and Intial purchase "<PurchasePrice>" and holdings "<holdings>" 
#Then user selects Geographic region and sector exposure
#And user clicks on save and then on cross button
#Then logsout of the app



#Examples:

#|uname             |password   |name    |Date   |Broker |Ticker |PurchasePrice|holdings|
#|dumm19@gmail.com  |Madic@12345|equity1 |06/2020|broker1|ticker1|200          |2       |











Scenario Outline:To edit the savings and liabilities 
Given user launches the Autumn Application
Then user clicks on login button
Then user provides the username "<uname>" and pwd "<password>"
Then user clicks on login button
Then user selects finance option from the below navigation bar
And clicks on manage button under savings and liabilties
Then user selects the edit button and changes the amount"<amount>"
And user clicks on done and then on cross button
Then logsout of the app


Examples:
|uname              |password   |amount|
|nida16@gmail.com  |Madic@12345|2000  |

#Scenario Outline:To edit the property details 
#Given user launches the Autumn Application
#Then user clicks on login button
#Then user provides the username "<uname>" and pwd "<password>"
#Then user clicks on login button
#Then user selects finance option from the below navigation bar
#Then user clicks on manage button under property details
#Then user selects the property
#Then user edits the PropertyName "<PropertyName>" and postalCode "<PostalCode>" 
#And user clicks on save and then on cross button
#Then logsout of the app

#Examples:

#|uname            |password   |PropertyName| PostalCode| EstimatedValue|
#|nida15@gmail.com |Madic@12345|HDB         |640712	   | 10000|


#Scenario Outline:To edit the CPF details 
#Given user launches the Autumn Application
#Then user clicks on login button
#Then user provides the username "<uname>" and pwd "<password>"
#Then user clicks on login button
#Then user selects finance option from the below navigation bar
#And clicks on manage button under CPF details
#Then user selects the edit button and provides new values for "<monthly>" and "<ordinary>" an "<special>" and "<medisave>"
#And user clicks on save and then on cross button
#Then logsout of the app


#Examples:

#|uname           |password   |monthly |ordinary	|special |medisave |
#|nida@autumn.sg  |Madic!12345|200     |300		|400	 |500	   |


Scenario Outline:To change the password of the user
Given user launches the Autumn Application
Then user clicks on login button
Then user provides the username "<uname>" and pwd "<Currentpassword>"
Then user clicks on login button
Then user selects the change pwd option under settings
And user provides the currentpwd "<Currentpassword>" and newpwd "<NewPassword>" and repeatpwd "<RepeatPassword>"
Then user clicks on submit button and logsout
And user logins with username "<uname>" and newpwd "<NewPassword>"
Then logsout of the app

Examples:

|uname           |Currentpassword   |NewPassword   |RepeatPassword    |
|nida16@gmail.com|Madic@12345       |Madic!12345   |Madic!12345       |


#Scenario Outline:To change the account details of the user
#Given user launches the Autumn Application
#Then user clicks on login button
#Then user provides the username "<uname>" and pwd "<password>"
#Then user clicks on login button
#Then user selects account option from settings
#And user changes the name "<name>" and clicks on save button
#Then user clicks on back and checks the name displayed "<name>"
#Then logsout of the app

#Examples:

#|uname           |password     | name   |
#|gum@gmail.com   |Madic!12345  |gunTree456 |



