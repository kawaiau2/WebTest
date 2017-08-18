Project Description:  Automation test for HK01 Web writen test

1. Check article title
2. Check login button
3. Check page date

Installation:
mvn install

if no mvn:
    1. Download maven in http://maven.apache.org/download.cgi
    2. Unzip and install the file
    3. Add follow to ~/.bash_profile
        export M2_HOME=/Users/mkyong/apache-maven-3.1.1
        export PATH=$PATH:$M2_HOME/bin 
    4. Restart Terminal

if no JAVA:
    use follow command:
        curl -v -j -k -L -H "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u121-b13/e9e7ea248e2c4826b92b3f075a80e441/jdk-8u121-macosx-x64.dmg > jdk-8u121-macosx-x64.dmg
        hdiutil attach jdk-8u121-macosx-x64.dmg
        sudo installer -pkg /Volumes/JDK\ 8\ Update\ 121/JDK\ 8\ Update\ 121.pkg -target /
        diskutil umount /Volumes/JDK\ 8\ Update\ 121
        rm jdk-8u121-macosx-x64.dmg

Test Execution:
mvn test