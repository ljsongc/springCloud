FROM java:8
ADD *.jar app.jar
ENV JAVA_OPTS=""
ENV SPRING_PROFILES_ACTIVE=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS $JACOCO_OPTS -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE:-docker} -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]