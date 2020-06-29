1、pom.xml添加：
<!-- Quartz坐标 -->
<dependency>
	<groupId>org.quartz-scheduler</groupId>
	<artifactId>quartz</artifactId>
	<version>2.2.1</version>
	<exclusions>
		<exclusion>
			<artifactId>slf4j-api</artifactId>
			<groupId>org.slf4j</groupId>
		</exclusion>
	</exclusions>
</dependency>
<!-- 添加Scheduled坐标 -->
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-context-support</artifactId>
</dependency>
<!-- Sprng tx 坐标 -->
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-tx</artifactId>
</dependency>