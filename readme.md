## Run Locally

1. Install MySQL
2. Build DB with create scripts
3. Create user for webapp or use root (local dev only)
4. Customize your application.properties file if necessary
```cli
spring.jpa.hibernate.ddl-auto=none
spring.datasource.url=jdbc:mysql://localhost:3306/CIS4160
spring.datasource.username=root
spring.datasource.password=root
```
5. Start MYSQL
```cli
mysql.server start
mysql -u root -p
```
6. Run spring boot app