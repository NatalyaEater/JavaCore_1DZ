FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./java ./java
RUN mkdir ./out
RUN javac -encoding utf-8 -sourcepath ./java -d out java/org/example/main/Main.java
CMD java -classpath ./out org.example.main.Main