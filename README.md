This project is a Selenium WebDriver automation testing framework developed using Java, Selenium, TestNG, and Maven.

The project automates web application features such as:

WebElement interactions
Dropdowns
Alerts
iFrames
Multiple windows/tabs
Waits
Actions
Assertions
Page Object Model (POM)
🛠️ Technologies Used
Java
Selenium WebDriver
TestNG
Maven
IntelliJ IDEA
Page Object Model (POM)
📂 Project Structure
src
├── main
│    └── java
│         ├── base
│         │    └── Base.java
│         └── pages
│              ├── DropDown.java
│              ├── AlertPage.java
│              ├── FramePage.java
│              └── TabPage.java
│
└── test
git init└── java
└── tests
├── DropDownTest.java
├── AlertTest.java
├── FrameTest.java
└── TabTest.java
⚙️ Framework Design

The framework follows the Page Object Model (POM) design pattern.
