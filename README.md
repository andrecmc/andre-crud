# andre-crud

## CRUD Example

## Project initially created using:

https://start.spring.io/

Settings:

Maven Project | Java | Spring Boot 1.5.8

Group: com.andre
Artifact: andrecrud
Name: andrecrud
Description: Demo project for crud
Package Name: com.andre.andrecrud
Packaging: Jar
Java Version: 1.8

Dependencies: Web, JPA, HSQLDB, DevTools

## Instructions:

### Clone from github
### Build using maven:

mvn package

### Run using command:

java -jar ./target/andrecrud-0.0.1-SNAPSHOT.jar

### Test

Open the following url:

http://localhost:8080

#### ADD Campaigns
curl -i -X POST -H "Content-Type:application/json" -d '{"id":"1", "name":"Corinthias", "idTeam":"1", "start":"2017-12-01", "end":"2017-12-03"}' localhost:8080/campaigns
curl -i -X POST -H "Content-Type:application/json" -d '{"id":"2", "name":"Santos", "idTeam":"2", "start":"2017-12-01", "end":"2017-12-03"}' localhost:8080/campaigns

#### GET ALL Campaigns
curl localhost:8080/campaigns

#### Get one Campaign by Id
curl localhost:8080/campaigns/1

#### DELETE one Campaign
curl -i -X DELETE localhost:8080/campaigns/1

#### ADD Users
curl -i -X POST -H "Content-Type:application/json" -d '{"id":"1", "name":"Andre", "email":"andre@gmail.com", "birthday":"1972-11-30", "idTeam":"1"}' localhost:8080/users
curl -i -X POST -H "Content-Type:application/json" -d '{"id":"2", "name":"Jose", "email":"jose@gmail.com", "birthday":"1955-05-20", "idTeam":"2"}' localhost:8080/users

#### GET ALL Users
curl localhost:8080/campaigns

#### UPDATE User
curl -i -X PUT -H "Content-Type:application/json" -d '{"name":"Jose", "email":"jose@gmail.com", "birthday":"1955-05-22", "idTeam":"2"}' localhost:8080/users/2

#### DELETE one User
curl -i -X DELETE localhost:8080/users/1
