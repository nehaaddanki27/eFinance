# eFinance
eFinance

IST 412 Course Project

ATZ Finance is a financial services company. ATZ Finance has 15 offices in the South, Midwest, and Northeast regions of United States. Customers who want to borrow money for various reasons submit online loan applications. The type of loans provided by ATZ Finance include personal loans, business loans, car loans, renovation loans, project loans, etc. Home loans are excluded. Once submitted the online application goes through a loan evaluation process and the outcome may be approved or not approved.

For a successful application, further processing takes process culminating with the customer accepting the terms of the loan, signing, and the loan is disbursed to the customer’s bank account. The users of this web-based application will access it using different kinds of devices: PC, laptop, tablet, and smart phones. Through this system, customers can view, their loan accounts, make payments online from their bank accounts, make enquiries, etc. ATZ Finance personnel can view customer accounts, make updates, etc. You could think of other features that are part of this application.

----------------------------------------------------------M04 A03 Implement two use cases------------------------------------------------------------------
Refactoring Implementations
    Refactored controllers to single account controller
    Resolved mapping issues from first use case
    Early implementation of input designs for data entry
    Added and encapsulated model attributes
    Created service and repository packages
    Corrected HTML link from index to account creation

Controller classes (main folder) 
    ApplicationController, BankController, Controller (index), FAQController
    Controller classes will function to connect each html page to the main index page using the @getMapping method. This will allow the user to move from one page to another page in application.

EFinanceApplication (java folder) - main
    connects EFinanceApplication to SpringBoot

HTML Files (resources - templates.pages)
    index.html, banks.html, FAQ.html, loanAppications.html
    index.html - This is the main page of our application. This is a page where users will be able to create accounts and login to our application. We are planning to insert a drop-down bar menu later to provide more options.
    Users can login with the following credentials
    Username: root
    Password: password
    bank.html - still in progress. This is a page where users will connect their bank accounts. Users will have to fill out every field to complete the process.
    FAQ.html - still in progress. The FAQ page will include frequently asked questions and more functions that will help users navigate our application easier. 
    LoanApplication.html- still in progress
    Users can click on the “Loan Applications” link at the bottom of the home page which leads them to a page where they can apply for loans
    First, users have to select from the drop down menu which loan they would like to apply for (car, house, school, or business loan). Then, users can enter in input for their first and last name, email, phone number, social security number, their credit score from a dropdown menu, and the reason for applying for the loan
    Once the users click the “submit” button, it will lead them to a confirmation page
    If users submit their application with a credit score of “400 and below” selected, their loan application will be automatically denied.
    *Currently our loan application page is not working because we are having trouble linking it to the index.html page. However, we have added a screenshot in our submission of what our page is supposed to look like*

Test class - EFinanceApplicationTests
    includes SpringBootTest function


