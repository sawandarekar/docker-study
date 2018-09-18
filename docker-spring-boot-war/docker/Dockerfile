FROM tomcat:8.0.50-jre8

MAINTAINER sawan darekar <sawan.darekar@tomtom.com>

# Copy to images tomcat path
COPY docker-spring-boot-war-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/docker-spring-boot-war.war
COPY tomcat-users.xml /usr/local/tomcat/conf/

# Now you can start tomcat...
CMD ["catalina.sh", "run"]
