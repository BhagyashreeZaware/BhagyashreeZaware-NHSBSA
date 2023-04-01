##NHSBSA COST ONLINE SERVICE##

selenium-cucumber : Automation Testing Using Java
selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web. 
It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free. Automate your test cases with minimal coding.

Installation (pre-requisites)
    - JDK 17 (Make sure Java class path is set)
    - Maven (make sure .m2 class path is set)
    - Eclipse or IntelliJ 

Download a Framework:
https://github.com/BhagyashreeZaware/BhagyashreeZaware-NHSBSA

Report will be generated tо directory: target/site/allure-maven/index.html and you can view it locally.

Runnung Test through command line:
mvn -Dtest=TestRunner test

HTML Report:
To generate HTML report use mvn test -Dcucumber.options="–plugin html:target/result.html"

JSON Report:
To generate a JSON report Use mvn test -Dcucumber.options="–plugin json:target/result.json"