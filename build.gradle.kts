import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.1.7.RELEASE"
	id("io.spring.dependency-management") version "1.0.8.RELEASE"
	kotlin("jvm") version "1.2.71"
	kotlin("plugin.spring") version "1.2.71"
	idea
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
}

dependencies {
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")


	/**
	 * Spring Web MVC
	 */
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.0")
	//test
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	//thymleaf
	compile("org.springframework.boot:spring-boot-starter-thymeleaf")
	compile("org.springframework.boot:spring-boot-devtools")

	/**
	 * Spring Data JPA
	 */
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	runtimeOnly("org.postgresql:postgresql")

	implementation("org.projectlombok:lombok:1.16.6")

	/**
	 * Spring Retry
	 */
	implementation("org.springframework.retry:spring-retry")
	implementation("org.springframework.boot:spring-boot-starter-aop")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
