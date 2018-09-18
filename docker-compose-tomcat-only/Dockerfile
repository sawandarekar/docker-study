#tomcat images
FROM tomcat:8.0.50-jre8

MAINTAINER sawan darekar <sawan.darekar@tomtom.com>

COPY tomcat-users.xml /usr/local/tomcat/conf/

# Now you can start tomcat...
CMD ["catalina.sh", "run"]
