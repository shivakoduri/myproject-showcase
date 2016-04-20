=========

## Spring security and Hibernate example

##Define tomcat output directory in pom.xml
 '
<outputDirectory><tomcat output directory></outputDirectory>

### Build the Project

maven-antrun-plugin plugin is used to add another task for the integration-test phase, where copying the WAR file to local tomcat directory.

```
mvn clean integration-test package  - it will generate the WAR file and deploy into tomcat too.

mvn clean package - it will just build the project, will not try to deploy it into tomcat directory.

```
myproject-web-start.bat - will deploy the war file in tomcat

 - The application will be hosted  http://localhost:8080/myproject-web/

myproject-web-shutdown.bat - will delete the tomcat and delete the applicaton context folder