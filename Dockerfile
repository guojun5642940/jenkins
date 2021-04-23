#
FROM java:8
VOLUME /tmp
COPY ./target/jenkins-0.0.1-SNAPSHOT.jar ./
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","jenkins-0.0.1-SNAPSHOT.jar"]