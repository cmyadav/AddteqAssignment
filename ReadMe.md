# Swag Labs Automation Framework

## Project Overview
This framework automates the Swag Labs sample e-commerce web app using Selenium WebDriver with Java, TestNG, Page Object Model, ExtentReports, and Log4j2.

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- ExtentReports
- Apache POI (Excel DataProvider)
- Log4j2

## Directory Structure
```
SwagLabsAutomation/
├── src/
│   ├── main/java/pages      # Page classes
│   ├── main/java/utils      # Utility classes (Driver, Excel, Logging)
│   ├── main/resources/      # log4j2.xml
│   └── test/java/tests      # TestNG test classes
├── data/loginData.xlsx      # Excel file for DataProvider
├── testng.xml               # Test suite config
├── pom.xml                  # Maven dependencies
├── README.md                # Project info and setup
```

## Setup Instructions
1. Install Java (JDK 11+), Maven, and Chrome
2. Clone this repo or unzip the project
3. Run `mvn clean install` to install dependencies
4. Ensure `loginData.xlsx` exists in the `/data` folder

## Run Tests
To run all tests:
```
mvn test
```

To run with specific TestNG suite:
```
mvn test -DsuiteXmlFile=testng.xml
```

## Features
- Login & Checkout test cases
- Page Object Model
- Excel-based DataProvider
- ExtentReports HTML output
- Retry logic for failed tests
- Parallel execution via TestNG
- Logging with Log4j2 (logs to console + `logs/automation.log`)

## Reports & Logs
- `reports/extent-report.html` – Test report
- `logs/automation.log` – Log output

## Future Enhancements
- Add browser config support (Chrome/Firefox)
- Add support for cross-browser via Selenium Grid or Docker
- CI integration (GitHub Actions / Jenkins)
