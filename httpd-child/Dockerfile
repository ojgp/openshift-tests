FROM quay.io/ojgomez/http-parent:2.0

LABEL io.openshift.expose-services="10080:http"

RUN chgrp -R 0 /var/run/httpd /var/log/httpd && \
    chmod -R g=u /var/run/httpd /var/log/httpd && \
    sed -i "s/Listen 80/Listen 10080/g" /etc/httpd/conf/httpd.conf

USER 1001

EXPOSE 10080
