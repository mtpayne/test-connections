# Spring Boot Test Connections Application
This is a companion application for tutorials found at 
[MoToots](https://www.motoots.com/)

Edit properties files as needed.

To run all tests:
```
./mvnw test
```

To run individual tests:
```
./mvnw test -Dtest=MySqlTest
./mvnw test -Dtest=MongoDbTest
./mvnw test -Dtest=RabbitMqTest
./mvnw test -Dtest=RedisTest
```

To run multiple tests:
```
./mvnw test -Dtest=MySqlTest,MongoDbTest
```