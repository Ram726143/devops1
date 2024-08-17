from eclipse-temurin:17
copy target/ganathyapp.jar ganathyapp.jar
cmd ["java","-jar","ganathyapp.jar"]