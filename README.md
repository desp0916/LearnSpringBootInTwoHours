# 2 小时学会 Spring Boot

這是「慕課網」上《[2小时学会SpringBoot](http://www.imooc.com/learn/767)》課程的原始碼與筆記。

## 1. dependencies


	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<version>9.4.1212.jre7</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>
	</dependencies>


## 2. 啟動方式：

啟動的方式有三種：

  1. 在 IDE 裡頭啟動
  2. 在命令列，使用  `mvn spring-boot:run` 啟動
  3. 先用 `mvn install` 編譯，然後在命令列執行  `java -jar target/girl-0.0.1-SNAPSHOT.jar` 啟動

啟動某種環境的方式，假設要啟動「prod」，可以用：

	java -jar target\girl-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod

如果要在 Eclipse 之中啟動，可以先修改 `src/main/resources/application.yml`，例如要啟動「dev」，可以用：

	spring:
	  profiles:
	    active: dev


## 3. 設定檔

預設的設定檔是「`src/main/resources/application.properties`」，建議改用 ` src/main/resources/application.yml`，YAML 的每一層使用縮進兩個空白。以下是我的設定檔內容（注意：我使用的是  PostgreSQL 9.6）：

	spring:
	  profiles:
	    active: dev
	  datasource:
	    driver-class-name: org.postgresql.Driver
	    url: jdbc:postgresql://127.0.0.1:5432/dbgirl
	    username: postgres
	    password: postgres
	  jpa:
	    hibernate:
	      ddl-auto: update
	    show-sql: true
 
關於 `spring.jpa.hibernate.ddl-auto` 有[五種設定方式](http://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html)：

  - none
  - validate
  - update
  - create
  - create-drop

## 4. Annotations


| Annotation                | Description                                   | Code                 |
|---------------------------|-----------------------------------------------|----------------------|
| @Value                    | Annotation at the field or method/constructor parameter level that indicates a default value expression for the affected argument.| HelloController |
| @Component                | Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning. | GirlProperties |
| @ConfigurationProperties  | Annotation for externalized configuration. Add this to a class definition or a @Bean method in a @Configuration class if you want to bind and validate some external Properties (e.g. from a .properties file). | GirlProperties |


Controller 的使用：

| Annotation           | 用途                                                                                                                                                                                            |
|----------------------|-------------------------------------------------------------------|
| @Controller          | 處理 HTTP 請求（需要搭配模版：thymeleaf）                                                                                          |
| @RestController      | Spring4之後新加的註解，用來返回 JSON，需要 @ResponseBody 配合 @Controller |
| @RequestMapping      | 配置 URL 映射                                                                                                                                                                     |


 
## 5. 參考文件：

  - [Spring Data JPA - Reference Documentation](http://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
  - [Database initialization](http://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html)
  - [Hibernate Auto Increment ID](http://stackoverflow.com/questions/2011528/hibernate-auto-increment-id)
