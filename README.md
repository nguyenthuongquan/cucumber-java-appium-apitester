I. Setup Selenium Grid and Nodes:
1. Go to folder documents, copy folder grid-mobile-work to C:\Selenium
2. In C:\Selenium\grid-mobile-work -> startGrid -> hubHost: http://192.168.2.48:4444/wd/hub
3. The 1st device.json is Quan Nguyen's Samsung S9 phone. [We can connect it via Wifi](https://www.swtestacademy.com/appium-paralllel-testing/)
4. Check the 3 remaining device.json files, make sure the hubHost and hubPort are correct
5. AVD Manager > launch 3 devices match with the 3 json files. 
6. Setup Appium Servers for device.json files
7. Clicking on startAppium.bat files to start Appium Servers

II. Run tests 
1. Open testng.xml review devices which take care each TestRunner/TestSuite/TestClass
2. Right click and Run

III. View report:
- reports > pdf > Extend.pdf
- reports > spark > Index.html
- target > run cmd: allure serve allure-results


IV. (Optional) Run test by cmd:
- mvn clean verify
- mvn clean test -Dcucumber.filter.tags="@Smoke"
- mvn clean test -Dtest=TestRunner
- mvn clean test -Dtest=TestFailedRunner