FROM quay.io/ojgomez/my-httpd-parent:1.0

MAINTAINER Berta Gramenauer <berta@gmail.com>

LABEL io.openshift.expose-services=8080:httpd \
      io.k8s.description="My HTTPD Child Server" \
      io.openshift.tags="httpd,apache" \
      amici=berta

RUN chgrp -R 0 /var/run/httpd /var/log/httpd && \
    chmod -R g=u /var/run/httpd /var/log/httpd && \
    sed -i "s/Listen 80/Listen 8080/g" /etc/httpd/conf/httpd.conf

EXPOSE 8080

USER 1001
