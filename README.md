Appium_Tests
-------------
This tool is developed for studying

#### MAIN GOAL:

- Education

#### PREPARATION:

1. install JDK
2. install Gradle
3. install  Node.js
4. install Appium
5. install Anroid SDK
6. set up Anroid Virtual Device(e.g. Nexus 5)
7. run appium server(Host:127.0.0.1,Port:4723)
8. Download calculator apk https://apkpure.com/calculator/com.google.android.calculator
9. Put calculator apk Appium_Tests/application/Calculator.apk

#### HOW TO USE:

### All tests:
1. Run command:  gradle testAll(default platformVersion = 9.0, avd = Nexus)*

*To specify use properties: gradle testAll -PplatformVersion=9.0 -Pavd=Nexus

### Report :
Local:
1. Run command:  allure generate build/allure-results

Link
1. Run command:  allure serve build/allure-results
