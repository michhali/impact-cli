# impact-cli

A simple Java CLI built with [Picocli](https://picocli.info/).  
It prints the company name as a demonstration project.

---

## Requirements
- Java 17+
- Maven 3.8+

---

## Build
```sh
mvn clean package
Artifacts created in target/:

impact-cli-1.0.0.jar — thin JAR

impact-cli-1.0.0-shaded.jar — runnable fat JAR with dependencies
Run

Run shaded JAR directly:
java -jar target/impact-cli-1.0.0-shaded.jar
Expected output:
impact.com
