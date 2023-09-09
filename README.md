# Test project for **devzion.com**

## 📖 Contents:

- [Technologies and tools](#gear-technologies-and-tools)
- [Test cases](#heavy_check_mark-test-cases)
- [How to run tests locally](#-How-to-run-tests-locally)
- [Examples](#examples)
- [How to run tests using Jenkins](#-how-to-run-tests-using-jenkins)
- [Allure reports](#-allure-reports)
- [Telegram notifications](#-telegram-notifications)
- [Test video](#-test-video)

## ⚙ Technologies and tools
<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="media/logos/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logos/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="media/logos/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media/logos/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logos/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="media/logos/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="media/logos/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logos/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logos/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://web.telegram.org/"><img src="media\logos\Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
</p>

Autotests written on **Java** using **Selenide** and **JUnit5** frameworks. Project builds from **IntelliJ Idea** with **Gradle**. Tests can be run from **Jenkins** on remote server with **Selenoid**.  

Results visualised with **Allure Report** and **Telegram Bot**. 

## ✔️ Test cases

- Checking headers on the main page
- Checking links on the main page
- Checking 'about us' link and page contents
- Checking 'careers' link and page contents
- Checking 'contact' link and page contents
- Checking 'stories' link and page contents

## 💻 How to run tests from terminal

```
gradle clean test -DselenoidHome="selenoid.autotests.cloud" -DbrowserSize="1920х1080" -Dbrowser="chrome" -DbrowserVersion="100.0"
```

Test will be launched remotely with Selenoid

## <img width="12%" style="vertical-align:middle" title="Jenkins" src="media/logos/Jenkins.svg"> How to run tests using Jenkins
## Examples
## <img width="12%" style="vertical-align:middle" title="Jenkins" src="media/logos/Allure_report.svg"> Allure reports
## <img width="12%" style="vertical-align:middle" title="Jenkins" src="media/logos/telegram.svg"> Telegram notifications
## 🎥 Test video
