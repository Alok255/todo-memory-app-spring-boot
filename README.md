# TODO Memory App Spring Boot

This TODO Memory is Java Application
built using [Spring Boot](https://spring.io/projects/spring-boot), 
[Spring Data JPA](https://spring.io/projects/spring-data-jpa), 
[H2 in memory database](https://www.h2database.com/html/main.html) and [MySQL Connector Java](https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-installing-maven.html).

The TODO Memory RESTful API is implemented as a Spring Boot app running an embedded version of [Tomcat](http://tomcat.apache.org/). For demonstration purposes, the data store is a H2 in-memory and MySQL database accessed via Spring JPA.

# Table of Contents
1. [Build and Run](#build-and-run)
2. [Contributors](#contributors)

# Build and Run
    1. mvn clean install
    2. mvn spring-boot:run
    
 #### From Intellij
 1. Create Application Configuration under springtodolist module
 2. Set Main Class
 	  com.spring.todolist.SpringtodolistApplication
 
 ## Dockerising Spring Boot application with Mysql Database
   Then open the “**Dockerfile**” from the project folder
   This contains the commands for generating Docker image	
  #### [Run From Docker](https://docs.docker.com/language/java/build-images/)
        $ docker build --tag springtodolist .
         
        $ docker images
        
        $ docker run --detach --publish 8080:8080 springtodolist -e db.username=db_username -e db.password=db_password -e db.name=db_name
        
        $ docker ps -a
        
        $ docker kill <CONTAINER ID>
        
        $ docker rmi <IMAGE ID>
  #### [Run From Docker Compose](https://docs.docker.com/get-started/08_using_compose/)
          $ docker-compose build ##Create the build with docker compose to build docker image using built jar file.
           
          $ docker-compose up -d ##Start up the application stack using the docker-compose up command. add the -d flag to run everything in the background.
          
          $ docker-compose down ##To tear it all down, hit this command, the containers will stop and the network will be removed.
          
          $ docker-compose up 
          
 # Contributors
   This project welcomes contributions and suggestions. 	      