FROM registry.access.redhat.com/ubi8:8.5

MAINTAINER Barbarix <barbarix@barbapapaland.com

LABEL amici=Barbarix

ARG AMICI=Barbarix

RUN yum install -y --nodocs --disableplugin=subscription-manager httpd && \
    yum clean all --disableplugin=subscription-manager && \
    echo "Hello from $AMICI HTTPD Parent Server" > /var/www/html/index.html

ONBUILD COPY src/. /var/www/html/.

USER 0

EXPOSE 80

CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]
