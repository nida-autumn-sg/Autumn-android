$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/launchPage.feature");
formatter.feature({
  "name": "To verify the four options of retirement goal",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MobileAndroidTesting"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate first option",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launches the Autumn Application",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on start button and reads the test data",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the name \"\u003cname\u003e\" and clicks on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the date of birth \"\u003cdateofbirth\u003e\" and clicks on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the gender and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the country and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the email \"\u003cemailAddress\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the income \"\u003cincome\u003e\" and expense \"\u003cexpense\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the savings \"\u003csavings\u003e\" and liabilities \"\u003cliabilities\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user select the first option in retirement goal",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the amount of savings \"\u003camtOfSavings\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the retirement age \"\u003cretirementAge\u003e\"and click on done",
  "keyword": "Then "
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "dateofbirth",
        "emailAddress",
        "income",
        "expense",
        "savings",
        "liabilities",
        "amtOfSavings",
        "retirementAge"
      ]
    },
    {
      "cells": [
        "abc",
        "12/02/2000",
        "abc@gmail.com",
        "10000",
        "8000",
        "10000",
        "0",
        "200000",
        "65"
      ]
    },
    {
      "cells": [
        "XYZ",
        "08/10/1997",
        "xyz@gmail.com",
        "1200",
        "5000",
        "2000",
        "100000",
        "1000",
        "80"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate first option",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MobileAndroidTesting"
    }
  ]
});
formatter.step({
  "name": "user launches the Autumn Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LaunchPage.user_launches_the_Autumn_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on start button and reads the test data",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_clicks_on_start_button_and_reads_the_test_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the name \"abc\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_name_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the date of birth \"12/02/2000\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_date_of_birth_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the gender and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_gender_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the country and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_country_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email \"abc@gmail.com\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_email_and_clicks_on_next(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the income \"10000\" and expense \"8000\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_income_and_expense_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the savings \"10000\" and liabilities \"0\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_savings_and_liabilities_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the first option in retirement goal",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_select_the_first_option_in_retirement_goal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the amount of savings \"200000\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_amount_of_savings(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the retirement age \"65\"and click on done",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_retirement_age_and_click_on_done(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.close_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate first option",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MobileAndroidTesting"
    }
  ]
});
formatter.step({
  "name": "user launches the Autumn Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LaunchPage.user_launches_the_Autumn_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on start button and reads the test data",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_clicks_on_start_button_and_reads_the_test_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the name \"XYZ\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_name_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the date of birth \"08/10/1997\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_date_of_birth_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the gender and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_gender_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the country and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_country_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email \"xyz@gmail.com\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_email_and_clicks_on_next(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the income \"1200\" and expense \"5000\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_income_and_expense_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the savings \"2000\" and liabilities \"100000\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_savings_and_liabilities_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the first option in retirement goal",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_select_the_first_option_in_retirement_goal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the amount of savings \"1000\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_amount_of_savings(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the retirement age \"80\"and click on done",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_retirement_age_and_click_on_done(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.close_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate second option",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launches the Autumn Application",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on start button and reads the test data",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the name \"\u003cname\u003e\" and clicks on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the date of birth \"\u003cdateofbirth\u003e\" and clicks on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the gender and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the country and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the email \"\u003cemailAddress\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the income \"\u003cincome\u003e\" and expense \"\u003cexpense\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the savings \"\u003csavings\u003e\" and liabilities \"\u003cliabilities\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user select the second option in retirement goal",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the desired retirement income \"\u003cdesiredRetirementIncome\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the retirement age \"\u003cretirementAge\u003e\"and click on done",
  "keyword": "Then "
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "dateofbirth",
        "emailAddress",
        "income",
        "expense",
        "savings",
        "liabilities",
        "desiredRetirementIncome",
        "retirementAge"
      ]
    },
    {
      "cells": [
        "sara",
        "12/02/1995",
        "sara@gmail.com",
        "10000",
        "8000",
        "10000",
        "0",
        "200000",
        "70"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate second option",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MobileAndroidTesting"
    }
  ]
});
formatter.step({
  "name": "user launches the Autumn Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LaunchPage.user_launches_the_Autumn_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on start button and reads the test data",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_clicks_on_start_button_and_reads_the_test_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the name \"sara\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_name_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the date of birth \"12/02/1995\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_date_of_birth_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the gender and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_gender_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the country and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_country_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email \"sara@gmail.com\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_email_and_clicks_on_next(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the income \"10000\" and expense \"8000\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_income_and_expense_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the savings \"10000\" and liabilities \"0\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_savings_and_liabilities_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the second option in retirement goal",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_select_the_second_option_in_retirement_goal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the desired retirement income \"200000\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_desired_retirement_income(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the retirement age \"70\"and click on done",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_retirement_age_and_click_on_done(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.close_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate third option",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launches the Autumn Application",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on start button and reads the test data",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the name \"\u003cname\u003e\" and clicks on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the date of birth \"\u003cdateofbirth\u003e\" and clicks on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the gender and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the country and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the email \"\u003cemailAddress\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the income \"\u003cincome\u003e\" and expense \"\u003cexpense\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the savings \"\u003csavings\u003e\" and liabilities \"\u003cliabilities\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user select the third option in retirement goal",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the legacy amount \"\u003cLegacyAmount\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the retirement age \"\u003cretirementAge\u003e\"and click on done",
  "keyword": "Then "
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "dateofbirth",
        "emailAddress",
        "income",
        "expense",
        "savings",
        "liabilities",
        "LegacyAmount",
        "retirementAge"
      ]
    },
    {
      "cells": [
        "aba",
        "12/02/1998",
        "sara@gmail.com",
        "10000",
        "8000",
        "10000",
        "0",
        "200000",
        "78"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate third option",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MobileAndroidTesting"
    }
  ]
});
formatter.step({
  "name": "user launches the Autumn Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LaunchPage.user_launches_the_Autumn_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on start button and reads the test data",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_clicks_on_start_button_and_reads_the_test_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the name \"aba\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_name_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the date of birth \"12/02/1998\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_date_of_birth_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the gender and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_gender_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the country and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_country_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email \"sara@gmail.com\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_email_and_clicks_on_next(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the income \"10000\" and expense \"8000\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_income_and_expense_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the savings \"10000\" and liabilities \"0\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_savings_and_liabilities_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the third option in retirement goal",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_select_the_third_option_in_retirement_goal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the legacy amount \"200000\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_legacy_amount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the retirement age \"78\"and click on done",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_retirement_age_and_click_on_done(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.close_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate fourth option",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launches the Autumn Application",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on start button and reads the test data",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the name \"\u003cname\u003e\" and clicks on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the date of birth \"\u003cdateofbirth\u003e\" and clicks on next button",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the gender and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the country and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the email \"\u003cemailAddress\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the income \"\u003cincome\u003e\" and expense \"\u003cexpense\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the savings \"\u003csavings\u003e\" and liabilities \"\u003cliabilities\u003e\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "name": "user select the fourth option in retirement goal",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the retirement age \"\u003cretirementAge\u003e\"and click on next",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the desired retirement income \"\u003cdesiredRetirementIncome\u003e\" and click on done",
  "keyword": "Then "
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "dateofbirth",
        "emailAddress",
        "income",
        "expense",
        "savings",
        "liabilities",
        "retirementAge",
        "desiredRetirementIncome"
      ]
    },
    {
      "cells": [
        "zafar",
        "12/02/1986",
        "zafar@gmail.com",
        "10000",
        "8000",
        "10000",
        "5000000",
        "78",
        "2000000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate fourth option",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MobileAndroidTesting"
    }
  ]
});
formatter.step({
  "name": "user launches the Autumn Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LaunchPage.user_launches_the_Autumn_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on start button and reads the test data",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_clicks_on_start_button_and_reads_the_test_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the name \"zafar\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_name_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the date of birth \"12/02/1986\" and clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_date_of_birth_and_clicks_on_next_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the gender and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_gender_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the country and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_selects_the_country_and_clicks_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email \"zafar@gmail.com\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_email_and_clicks_on_next(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the income \"10000\" and expense \"8000\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_income_and_expense_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the savings \"10000\" and liabilities \"5000000\" and clicks on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_enters_the_savings_and_liabilities_and_clicks_on_next(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the fourth option in retirement goal",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.user_select_the_fourth_option_in_retirement_goal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the retirement age \"78\"and click on next",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_retirement_age_and_click_on_next(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the desired retirement income \"2000000\" and click on done",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.enter_the_desired_retirement_income_and_click_on_done(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchPage.close_the_app()"
});
formatter.result({
  "status": "passed"
});
});