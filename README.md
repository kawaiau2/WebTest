Project Description:  Automation test for Web writen test

1. Check article title
2. Check login button
3. Check page date

Installation:
1. If installed mvn and java
    1. mvn clean install

2. If no mvn:
    1. brew install maven

3. If no JAVA:
    1. use follow command:

        1. curl -v -j -k -L -H "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u121-b13/e9e7ea248e2c4826b92b3f075a80e441/jdk-8u121-macosx-x64.dmg > jdk-8u121-macosx-x64.dmg
        2. hdiutil attach jdk-8u121-macosx-x64.dmg
        3. sudo installer -pkg /Volumes/JDK\ 8\ Update\ 121/JDK\ 8\ Update\ 121.pkg -target /
        4. diskutil umount /Volumes/JDK\ 8\ Update\ 121
        5. rm jdk-8u121-macosx-x64.dmg

Support Driver:
1. Chrome (Please install Chrome browser first)

Test Execution:
1. mvn test
