FROM tomcat:9.0.19-jre8-alpine

RUN apk update && apk add nano && mkdir -p /usr/local/tomcat/conf

COPY tomcat-conf/tomcat-users.xml /usr/local/tomcat/conf/
COPY tomcat-conf/context.xml /usr/local/tomcat/webapps/manager/META-INF/
COPY tomcat-conf/db-conf/context.xml /usr/local/tomcat/conf/Catalina/localhost

COPY target/*.war $CATALINA_HOME/webapps/grapiki.war