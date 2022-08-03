# RCB_TeamTest
This project repo created for with the intention of displaying and creating the RCB_PlayerList 2022 automation tests.

# Getting Started:
Installation Process: 
To create the project, the required softwares are:
•	Eclipse IDE
•	JDK(Version 1.8 is preferred)
•	Git
•	Selenium server jar
Install all these software as prerequisites for creating a Java/Maven Project.
Software Dependencies to add as addon to project:
•	TestNG jar
•	Maven
•	Json-simple dependency
API References: 
Two ways to access json data for Test.
•	To access the api related json data (From Repository): https://gist.github.com/kumarpani/1e759f27ae302be92ad51ec09955e765
•	Add the json-data file as resource file to the Project.

# Build and Test:
•	First, we need to install all the required software and the jar files.
•	Create a Maven Project with the proper naming convention and with Group id and Artifact id related to Project.
•	Add the Package under the source project.
•	Add the .java class files to achieve the desired player list with the help of different test method.
•	Once the testng library got added, generate the testing.xml file which will be helpful for code executions in batch through Project->TestNG->Convert To TestNG.
•	Add the json-simple dependencies in POM.xml file under Dependencies section to access all the json related libraries and build the project.
•	Run the testing.xml to see the result in Console.
•	To see the output in report format, Select emailable-report.html from test-output folder of Project immediately after execution and open it with Web Browser.
•	Here, JSONParser, JSONObject and JSONArray Libraries has been used to achieve the result through json data template.
