FROM openjdk
WORKDIR /app
COPY D387_sample_code-0.0.2-SNAPSHOT.jar /app/myapp.jar
RUN sh -c 'touch /myapp.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/myapp.jar"]






