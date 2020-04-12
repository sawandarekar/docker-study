#tomcat images
FROM tomcat:8.0.50-jre8

MAINTAINER sawan darekar <sawandarekar@gmail.com>


#COPY docker-spring-boot-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/docker-spring-boot.war

COPY tomcat-users.xml /usr/local/tomcat/conf/

# Now you can start tomcat...
CMD ["catalina.sh", "run"]
