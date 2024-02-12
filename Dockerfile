FROM openjdk:11
EXPOSE 9090
ADD target/mymovieplan-0.0.1-SNAPSHOT.war mymovieplan-0.0.1-SNAPSHOT.war.original
ENTRYPOINT ["java", "-jar", "/mymovieplan.war"]