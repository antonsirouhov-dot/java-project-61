plugins {
	id ("checkstyle")
	id("org.sonarqube") version "7.3.1.8318"
	application
}

checkstyle {
	toolVersion = "10.12.4"
}

sonar {
	properties {
		property("sonar.projectKey", "antonsirouhov-dot_java-project-61")
		property("sonar.organization", "antonsirouhov-dot")
		property("sonar.coverage.exclusions", "**")
	}
}

application {
	mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
	checkstyle("com.puppycrawl.tools:checkstyle:${checkstyle.toolVersion}")
}

tasks.getByName<JavaExec>("run") {
	standardInput = System.`in`
}
