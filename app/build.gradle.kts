plugins {
	id ("checkstyle")
	id("org.sonarqube") version "7.3.1.8318"
	application
    id("java")
}

checkstyle {
	toolVersion = "10.12.4"
}

sonar {
	properties {
		property("sonar.projectKey", "antonsirouhov-dot_java-project-61")
		property("sonar.organization", "antonsirouhov-dot")
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
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName<JavaExec>("run") {
	standardInput = System.`in`
}
