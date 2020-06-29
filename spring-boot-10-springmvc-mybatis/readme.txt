1、src/main/resources下新建application.properties添加：
spring.datasource.driverClassName=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/ssm
spring.datasource.username=root
spring.datasource.password=admin

spring.datasource.type=com.alibaba.druid.pool.DruidDataSource

mybatis.type-aliases-package=com.bjsxt.pojo

2、pom.xml添加：
<!-- Mybatis启动器 -->
<dependency>
	<groupId>org.mybatis.spring.boot</groupId>
	<artifactId>mybatis-spring-boot-starter</artifactId>
	<version>1.1.1</version>
</dependency>
<!-- mysql数据库驱动 -->
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
</dependency>
<!-- druid数据库连接池 -->
<dependency>
	<groupId>com.alibaba</groupId>
	<artifactId>druid</artifactId>
	<version>1.0.9</version>
</dependency>

3、创建数据库
CREATE TABLE users (
  id INT PRIMARY KEY auto_increment COMMENT '用户id',
	name VARCHAR(64) COMMENT '用户姓名',
	age INT COMMENT '用户年龄'
) COMMENT '用户表';

