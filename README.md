A tool for import large number of rows from `Hive` to `RDBMS`(Oracle).
Using `Spring Boot` to build executable jar.
Hibernate `batch-size` is set to *50*.


## CMD
* `java -jar -Dspring.profiles.active=dev hive2ora-1.0-SNAPSHOT.jar`
* or with limit `java -jar -Dspring.profiles.active=dev hive2ora-1.0-SNAPSHOT.jar 1000`