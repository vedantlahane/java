/*
===============================================================================
                        MAVEN & GRADLE
                 (Java Build Automation Tools)
===============================================================================

Author : Vedant
Module : Professional Java

===============================================================================
WHY DO WE NEED BUILD TOOLS?
===============================================================================

Imagine a Spring Boot project.

It requires

Spring Framework

Hibernate

Jackson

JUnit

MySQL Driver

Logback

Lombok

Without Build Tools

↓

Download every JAR manually

↓

Copy to project

↓

Manage versions yourself

Very difficult.

Build tools automate everything.

===============================================================================
WHAT IS A BUILD TOOL?
===============================================================================

A Build Tool automates

✔ Compilation

✔ Dependency Management

✔ Testing

✔ Packaging

✔ Deployment

✔ Code Generation

Examples

Maven

Gradle

===============================================================================
BEFORE BUILD TOOLS
===============================================================================

Developer downloads

100+ JAR files

↓

Adds manually

↓

Updates manually

↓

Version conflicts

↓

Broken project

===============================================================================
WITH MAVEN
===============================================================================

Developer writes

pom.xml

↓

Maven downloads

everything automatically.

===============================================================================
WHAT IS MAVEN?
===============================================================================

Maven is

A Project Management
and Build Automation Tool.

Developed by

Apache Software Foundation.

Configuration file

pom.xml

===============================================================================
WHAT IS GRADLE?
===============================================================================

Gradle is

A modern build automation tool

using

Groovy DSL

or

Kotlin DSL.

Configuration

build.gradle

or

build.gradle.kts

===============================================================================
MAVEN vs GRADLE
===============================================================================

Maven

XML

Convention over Configuration

Simple

Widely Used

----------------------------------------

Gradle

Groovy/Kotlin

Highly Flexible

Faster Builds

Incremental Compilation

===============================================================================
STANDARD MAVEN PROJECT
===============================================================================

project

│

├── src

│   ├── main

│   │   ├── java

│   │   └── resources

│   └── test

│       ├── java

│       └── resources

│

├── pom.xml

│

└── target

===============================================================================
POM.XML
===============================================================================

POM

Project Object Model

Contains

Project Information

Dependencies

Plugins

Build Configuration

===============================================================================
MINIMAL POM
===============================================================================

groupId

artifactId

version

These uniquely identify a project.

===============================================================================
GROUP ID
===============================================================================

Usually

Reverse Domain

Example

com.vedant

org.springframework

===============================================================================
ARTIFACT ID
===============================================================================

Project Name

Example

bank-app

student-management

===============================================================================
VERSION
===============================================================================

Example

1.0.0

1.1.0

2.0.0

-SNAPSHOT

===============================================================================
DEPENDENCIES
===============================================================================

Dependencies are external libraries.

Example

Spring Boot Starter Web

MySQL Connector

JUnit

Lombok

===============================================================================
DEPENDENCY REPOSITORY
===============================================================================

Default Repository

Maven Central

Other Repositories

Spring Repository

JCenter (legacy)

Internal Company Repository

===============================================================================
DEPENDENCY DOWNLOAD FLOW
===============================================================================

pom.xml

↓

Maven

↓

Maven Central

↓

Downloads JAR

↓

Stores locally

===============================================================================
LOCAL MAVEN REPOSITORY
===============================================================================

Location

~/.m2/repository

Stores

Downloaded dependencies

Avoids repeated downloads.

===============================================================================
TRANSITIVE DEPENDENCIES
===============================================================================

Dependency A

↓

Needs Dependency B

↓

Maven downloads both.

Developer adds only

Dependency A.

===============================================================================
DEPENDENCY SCOPE
===============================================================================

compile

Default

----------------------------------------

provided

Server provides library

----------------------------------------

runtime

Needed only at runtime

----------------------------------------

test

JUnit

Mockito

----------------------------------------

system

Rarely used

===============================================================================
MAVEN BUILD LIFECYCLE
===============================================================================

validate

↓

compile

↓

test

↓

package

↓

verify

↓

install

↓

deploy

===============================================================================
COMMON MAVEN COMMANDS
===============================================================================

mvn compile

Compile source code

----------------------------------------

mvn test

Run tests

----------------------------------------

mvn package

Create JAR/WAR

----------------------------------------

mvn install

Install in local repository

----------------------------------------

mvn clean

Delete target directory

===============================================================================
TARGET DIRECTORY
===============================================================================

Generated automatically.

Contains

Compiled Classes

Reports

Packaged JAR

Temporary Build Files

===============================================================================
PLUGINS
===============================================================================

Maven functionality
is provided by plugins.

Examples

Compiler Plugin

Surefire Plugin

Jar Plugin

Spring Boot Plugin

===============================================================================
MAVEN WRAPPER
===============================================================================

mvnw

Ensures every developer
uses the same Maven version.

===============================================================================
GRADLE BUILD FILE
===============================================================================

build.gradle

or

build.gradle.kts

Contains

Plugins

Dependencies

Tasks

===============================================================================
GRADLE FEATURES
===============================================================================

Incremental Build

Parallel Execution

Dependency Caching

Build Cache

Custom Tasks

===============================================================================
COMMON GRADLE COMMANDS
===============================================================================

gradle build

----------------------------------------

gradle clean

----------------------------------------

gradle test

----------------------------------------

gradle run

----------------------------------------

gradle bootRun

(Spring Boot)

===============================================================================
MULTI-MODULE PROJECT
===============================================================================

Parent Project

↓

Common

↓

Service

↓

API

↓

Database

Each module

builds independently.

===============================================================================
MAVEN vs MANUAL BUILD
===============================================================================

Manual

Compile

Copy JARs

Package

Test

Everything manual

----------------------------------------

Maven

Single command

mvn package

===============================================================================
SPRING BOOT & MAVEN
===============================================================================

Spring Initializr

generates

pom.xml

with

Spring Boot Starter

Dependencies

Ready to use.

===============================================================================
SPRING BOOT & GRADLE
===============================================================================

Spring Initializr also supports

Gradle

build.gradle

===============================================================================
SNAPSHOT VERSION
===============================================================================

Example

1.0.0-SNAPSHOT

Means

Development Version

Not final release.

===============================================================================
RELEASE VERSION
===============================================================================

Example

1.0.0

Stable

Production Ready

===============================================================================
SEMANTIC VERSIONING
===============================================================================

MAJOR.MINOR.PATCH

Example

2.5.1

Major

Breaking Changes

Minor

New Features

Patch

Bug Fixes

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Committing target folder.

❌ Using latest dependency blindly.

❌ Ignoring dependency conflicts.

❌ Mixing incompatible library versions.

❌ Editing generated files.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use Maven Wrapper.

✔ Prefer Spring Initializr.

✔ Pin dependency versions.

✔ Keep dependencies updated.

✔ Remove unused libraries.

✔ Use dependency management.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Spring Boot

↓

Maven

----------------------------------------

Microservices

↓

Gradle

----------------------------------------

Android

↓

Gradle

----------------------------------------

Enterprise Banking

↓

Multi-module Maven

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is Maven?

Build automation and dependency
management tool.

--------------------------------------------------------

Q2 Difference between Maven
and Gradle?

Maven

XML

Convention-based.

Gradle

Groovy/Kotlin

More flexible and faster.

--------------------------------------------------------

Q3 What is POM?

Project Object Model.

Configuration file for Maven.

--------------------------------------------------------

Q4 What is Maven Central?

Default repository
for downloading dependencies.

--------------------------------------------------------

Q5 What is dependency scope?

Defines when a dependency
is available.

Examples

compile

runtime

test

--------------------------------------------------------

Q6 Difference between

mvn package

and

mvn install?

package

Creates JAR/WAR.

install

Also stores artifact
in local Maven repository.

--------------------------------------------------------

Q7 What is a transitive dependency?

A dependency required
by another dependency.

--------------------------------------------------------

Q8 What is Maven Wrapper?

Ensures consistent Maven version
across environments.

--------------------------------------------------------

Q9 Which build tool
does Spring Initializr support?

Maven

Gradle

--------------------------------------------------------

Q10 Where are Maven dependencies stored?

~/.m2/repository

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Create Maven Project.

2. Add JUnit Dependency.

3. Build executable JAR.

4. Multi-module project.

5. Spring Boot Maven app.

6. Gradle Java project.

7. Dependency conflict resolution.

8. Custom Maven plugin.

9. Create Fat JAR.

10. Publish artifact locally.

===============================================================================
QUICK REVISION
===============================================================================

✔ Maven = Build + Dependency Management

✔ Gradle = Modern Build Tool

✔ pom.xml = Maven configuration

✔ build.gradle = Gradle configuration

✔ Maven Central stores libraries

✔ Local repository = ~/.m2/repository

✔ Maven lifecycle automates builds

✔ Plugins extend functionality

✔ Multi-module projects improve organization

✔ Spring Boot supports both Maven and Gradle

===============================================================================
NEXT TOPIC
===============================================================================

35_Logging_Frameworks.java

Topics

• Why Logging?

• SLF4J

• Logback

• Log4j2

• Logging Levels

• MDC

• Structured Logging

• Rolling File Appenders

• Best Practices

• Interview Questions

===============================================================================
*/