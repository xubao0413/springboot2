1、src/main/resources下新建：
templates/**.html

2、pom.xml添加：
<!-- thymeleaf的启动器 -->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
更改版本，可消除html模板的标签强校验：
<properties>
	<thymeleaf.version>3.0.2.RELEASE</thymeleaf.version>
	<thymeleaf-layout-dialect.version>2.0.4</thymeleaf-layout-dialect.version>
</properties>