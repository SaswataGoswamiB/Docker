#Base Docker Image
FROM openjdk:17
#Meta Data About the JAR
LABEL maintainer="Sample Docker"
# ADD the JAR to the Docker Image
#Syntax ::  ADD  <target-JAR> <Destinatin jar>
ADD target/Spring-Docker.jar Docker-image.jar

#Entry Point is the set of Intrs to be execited at the beginnign of the Container eexc.
#It is defined as an arraty.
#Syntax for Java Container :: ENTRYPOINT["java","-jar","<Dockler Image name>"]   
ENTRYPOINT ["java","-jar","Docker-image.jar"]