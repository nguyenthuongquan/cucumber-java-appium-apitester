##1. Setup Selenium Grid and Nodes:
- Go to folder documents, copy folder grid-mobile-work to C:\Selenium
- In C:\Selenium\grid-mobile-work -> startGrid -> hubHost: http://192.168.2.48:4444/wd/hub
- The 1st device.json is Quan Nguyen's Samsung S9 phone. [We can connect it via Wifi](https://www.swtestacademy.com/appium-paralllel-testing/)
- connect S9 via cable > adb devices > adb -s 1cb3ec8812027ece tcpip 5552 > unplug > get phone ip > adb connect 192.168.2.93:5552 > adb devices
- Check the 3 remaining device.json files, make sure the hubHost and hubPort are correct
- AVD Manager > launch 3 devices match with the 3 json files.
- Setup Appium Servers for device.json files
- Clicking on startAppium.bat files to start Appium Servers

##2. Run tests
- Open testng.xml review devices which take care each TestRunner/TestSuite/TestClass
- Right click and Run

##3. View report:
- reports > pdf > Extend.pdf
- reports > spark > Index.html
- target > run cmd: allure serve allure-results -> to see report locally

##4. Public Allure report
- (Hey! Remember this way is not good for security)
- target > run cmd: npx allure generate --clean --> to generate allure-report
- Drop 'allure-report' to [https://app.netlify.com/teams/nguyenthuongquan/overview](https://app.netlify.com/teams/nguyenthuongquan/overview)
- Share the link to others

##5. Mvn command to run test
- mvn clean verify
- mvn clean test -Dcucumber.filter.tags="@Smoke"
- mvn clean test -Dtest=TestRunner
- mvn clean test -Dtest=TestFailedRunner