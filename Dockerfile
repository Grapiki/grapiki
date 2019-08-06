FROM tomcat:9.0.19-jre8-alpine

RUN apk update && apk add nano && mkdir -p /usr/local/tomcat/conf

COPY tomcat-conf/tomcat-users.xml /usr/local/tomcat/conf/

COPY target/*.war $CATALINA_HOME/webapps/grapiki.war