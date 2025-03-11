
<h1 align="center"> 🏨 GTPL Bank : Online Banking Platform</h1>

- This project automates testing for the InetBanking application using Selenium WebDriver and TestNG. It focuses on validating functionalities such as user login, customer management (add/edit/delete), and data-driven testing using Excel. 


- This project aims to test various functionalities of a web application using Selenium and TestNG. The web app. being tested is 
[GTPL Bank](https://demo.guru99.com/V1/index.php)

<h1 align="center">📦 Project Overview :</h1>

![AutomationsProjectPic](https://github.com/user-attachments/assets/20b73fd9-1d7f-4e6b-bc01-329d025ff571)

 <h1 align="center">📂 Project Structure  :</h1>

<img align="right" alt="coding" width="400" src="https://user-images.githubusercontent.com/55389276/140866485-8fb1c876-9a8f-4d6a-98dc-08c4981eaf70.gif">

![Screenshot 2025-01-24 200912](https://github.com/user-attachments/assets/75fc67e6-62c5-4702-823e-b5361a562e53)  

# Folder Structure Overview :
## 1. src/main/java
### **com.inetBanking.pageObjects:** Contains Page Elements:
- **LoginPage:** Handles login actions.

- **AddCustomerPage:** Manages adding new customers.

## 2. src/test/java
### **com.inetBanking.testCases:** Contains test scripts:

- **BaseClass:** Initializes WebDriver and other configurations.

- **TC_LoginTest_001:** Validates user login functionality.

- **TC_AddCustomerTest_003:** Tests adding a new customer.

- **TC_DeleteCustomer_005:** Verifies customer deletion.

- **TC_LoginDDT_002:** Data-driven login tests using Excel.

### com.inetBanking.testData:

- **LoginData.xlsx:** Excel sheet for data-driven tests.

### com.inetBanking.utilities: Utility classes:

- **ReadConfig:** Reads configuration data from properties files.

- **Reporting:** Manages custom test reports.

- **XLUtils**: Provides methods for Excel data handling.

## 3. src/test/resources
### testData:
- **LoginData.xlsx:** Test data file.

- **CommanData.properties:** Configuration file for test constants.
# 4. Additional Folders
- **reports:** Contains generated test reports.

- **Screenshots:** Stores screenshots for failed test cases

   <h1 align="center">📂 Project Phases  :</h1>


| Phase-1: Implementation | Phase-2: Execution | Phase-3: Maintenance |
|--------------|-------------|------------|
| Create Maven Project                     |Run test cases with Maven pom.xml.                         |Creating repository in GITHUB.  |
| Update pom.xml                           |Run test cases through Maven CLI. (Command Line Interface) |Commit the project code in local repository. |
| Create Page Objects                      |Run test cases using run. bat.                             |Push the project code to GITHUB remote repository from local GIT repository. |
| Create Basic Test case                   |Run test cases using Jenkins. (using bat file)             |Addressing issues and updates to automation scripts.
| Add logs to test case                    |Review test results and identify defects.                  |Reporting on automation performance and improvements. 
| Read common values from properties file  |Defect logging and management
| Run test case on desired browser         |
| Add extent report                        |
| Create Data Driven test case             | 
| Adding new test case                     | 
 
  <h1 align="center">🌐 Technologies Used:</h1>

  - **Selenium WebDriver** is being used as the core automation engine.

- **Eclipse IDE** is used to develop the automated scripts.

- **Build tool Maven** is used for build, execution and dependency purpose.

- **TestNG framework** is used for organizing the scripts.

- **Page Object Model** as the design pattern.

- **Test data** is read from Excel sheet at run time.

- **Git and Github** is used for version control management.

- **Cl tool Jenkins** is used to run the scripts.

- **Extent Spark Report** test results are generated for each run.

<h1 align="center">✨ Key Features :</h1>
 
- >> Automates core banking operations (login, customer management).

- >>Implements data-driven testing with Excel.

- >> Generates custom reports for test execution.

- >> Captures screenshots for failed tests.

<h1 align="center">  💼 Reporting :</h1>

  - TestNG Reports :
 
![Screenshot 2025-01-26 155521](https://github.com/user-attachments/assets/73f6ef51-79c9-4b8c-a18d-6abd5ed03506)
 
 <h1 align="center">🤝 Contributing :</h1>

 - Contributions are welcome! Feel free to submit issues and pull requests.

    
