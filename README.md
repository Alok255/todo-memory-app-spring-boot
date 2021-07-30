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
 	
  #### [From Docker](https://docs.docker.com/language/java/build-images/)
        $ docker build --tag springtodolist .
         
        $ docker images
        
        $ docker run --detach --publish 8080:8080 springtodolist -e db.username=db_username -e db.password=db_password -e db.name=db_name
        
        $ docker ps -a
        
        $ docker kill <CONTAINER ID>
        
        $ docker rmi <IMAGE ID>
        
 # Contributors
   This project welcomes contributions and suggestions. 	      