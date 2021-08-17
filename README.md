**1. What can this framework do?**
- This framework is designed for selenium Grid. We have to start a Grid with 1 Hub and 1/n nodes
- The reports of this framework (SparkExtend, Allure) are awesome.
- The PDF reports just works fine when running in 1 device. For grid, it's broken.

**2. Setup Selenium Grid for 1 Hub and 4 Nodes**
- Go to folder documents, copy all files in folder grid-mobile-work to C:\Selenium\ grid-mobile-work
- In C:\Selenium\grid-mobile-work -> read README
- Click 0.StartGridHubAndIts4Nodes -> check: http://192.168.2.48:4444/grid/console or http://localhost:4444/grid/console
- The 1st device.json is Quan Nguyen's Samsung S9 phone. [We can connect it via Wifi](https://www.swtestacademy.com/appium-paralllel-testing/)
- Connect S9 via cable > adb devices > adb -s 1cb3ec8812027ece tcpip 5552 > unplug > get phone ip > adb connect 192.168.2.93:5552 > adb devices
- Check the 3 remaining device.json files, make sure the hubHost and hubPort are correct
- AVD Manager > launch 3 devices match with the 3 json files.

**3. Run tests in IJ Configuration (test by test)**
- Select TestNG options and run. E.g: "Regression", "Single", "RerunTestFailed"

**4. Mvn command to run test (test by test)**
- Todo --> the below doesn't work
- mvn clean verify
- mvn clean test -Dcucumber.filter.tags="@Smoke"
- mvn clean test -Dtest=TestRunner
- mvn clean test -Dtest=TestFailedRunner

**5. Run tests with xml file (gird parallel)**
- Open testng.xml review devices which take care each TestRunner/TestSuite/TestClass
- Right click and Run

**6. Mvn command to run testng.xml(gird parallel)**
- Todo

**7. View report**
- reports > pdf > Extend.pdf
- reports > spark > Index.html
- target > run cmd: allure serve allure-results -> to see report locally

**8. Public Allure report**
- (This is not good for security because guys in netlify can read our report)
- target > run cmd: npx allure generate --clean --> to generate allure-report
- Drop 'allure-report' to [https://app.netlify.com/teams/nguyenthuongquan/overview](https://app.netlify.com/teams/nguyenthuongquan/overview)
- Share the link to others