FROM java:alpine
USER jimboLix
RUN  mkdir /usr/local/september/log
ADD september-*.jar /usr/local/september
ADD start.sh /usr/local/september
ENTRYPOINT ['sh','/usr/local/september/start.sh']
EXPOSE 8089