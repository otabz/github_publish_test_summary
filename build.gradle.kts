plugins {
    kotlin("jvm") version "1.8.20"
    id("test-report-aggregation")
}

defaultTasks(tasks.clean.name, tasks.test.name, tasks.check.name)

dependencies {
    implementation(project(":child1"))
}

tasks.check {
    dependsOn(tasks.named<TestReport>("testAggregateTestReport"))
}

allprojects {
    apply(plugin = "java")

    group = "org.example"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    }

    tasks.test {
        useJUnitPlatform()
        reports.html.required.set(true)
        reports.junitXml.required.set(true)
        testLogging {
            events("failed")
        }
    }
}