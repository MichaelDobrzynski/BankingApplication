# Banking Application
Application for handling new customer bank account requests.

Application can:
- read a csv file containing names, social security numbers, the account type, and the initial deposit.
- use proper data structures to hold the accounts
- have savings and checking accounts share properties such as deposit(), withdraw(), transfer(), and showInfo().

An 11-digit account number is generated through the following process:
- 1 or 2 depending on Savings or Checking account
- last two digits of Social Security Number
- unique 5-digit number
- and lastly a random 3-digit number

Savings account holders have a safety deposit box identified by a 3-digit number and accessed with a 4-digit Pin.

Checking account holders are assigned a 12-digit debit card number along with a 4-digit Pin.

Both accounts use an interface that will determine the base interest rate.
- Savings accounts use .25 points less than the base rate
- Checking accounts use 15% of the base rate

The showInfo() method should reveal relevant account information as well as info specific to the account type.

