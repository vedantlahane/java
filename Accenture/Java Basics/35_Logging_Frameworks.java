/*
===============================================================================
                        JAVA LOGGING FRAMEWORKS
                  (SLF4J, Logback & Log4j2)
===============================================================================

Author : Vedant
Module : Professional Java

===============================================================================
WHY DO WE NEED LOGGING?
===============================================================================

Imagine a Banking Application.

Customer reports

"Money disappeared."

Developer needs to know

✔ Who logged in?

✔ Which API was called?

✔ What SQL executed?

✔ Which exception occurred?

Without logs

↓

Impossible to investigate.

Logging provides
a permanent record of application events.

===============================================================================
WHAT IS LOGGING?
===============================================================================

Logging is the process of recording
application events during execution.

Examples

✔ Startup

✔ Shutdown

✔ API Requests

✔ Database Queries

✔ Exceptions

✔ Security Events

✔ Performance Metrics

===============================================================================
WHY NOT USE System.out.println()?
===============================================================================

Problems

❌ Cannot filter messages

❌ No timestamps

❌ No log levels

❌ Difficult to disable

❌ Poor performance

❌ No file output

Professional applications
always use logging frameworks.

===============================================================================
JAVA LOGGING FRAMEWORKS
===============================================================================

java.util.logging (JUL)

----------------------------------------

Log4j

----------------------------------------

Logback

----------------------------------------

Log4j2

----------------------------------------

SLF4J

(Not a logger)

Logging Facade

===============================================================================
SLF4J
===============================================================================

Simple Logging Facade for Java

SLF4J is NOT

a logging implementation.

It is

an abstraction layer.

Application

↓

SLF4J

↓

Logback

or

Log4j2

or

JUL

===============================================================================
WHY USE SLF4J?
===============================================================================

Without SLF4J

Application depends directly
on Logback.

Changing framework

↓

Code changes required.

With SLF4J

Only implementation changes.

Application code remains unchanged.

===============================================================================
LOGBACK
===============================================================================

Default logger used by

Spring Boot.

Advantages

✔ Fast

✔ Lightweight

✔ Excellent integration

✔ Automatic configuration

===============================================================================
LOG4J2
===============================================================================

Apache Logging Framework.

Features

✔ High Performance

✔ Asynchronous Logging

✔ JSON Logging

✔ Advanced Configuration

===============================================================================
LOGGER CREATION
===============================================================================

private static final Logger logger =

LoggerFactory.getLogger(

StudentService.class

);

One logger per class.

===============================================================================
LOGGING LEVELS
===============================================================================

TRACE

↓

DEBUG

↓

INFO

↓

WARN

↓

ERROR

===============================================================================
TRACE
===============================================================================

Most detailed logs.

Used for

Algorithm tracing

Internal framework behavior

Rarely enabled in production.

===============================================================================
DEBUG
===============================================================================

Developer information.

Examples

Variable values

Method entry

SQL parameters

Usually disabled in production.

===============================================================================
INFO
===============================================================================

Normal application events.

Examples

Application Started

User Logged In

Order Created

Service Started

Most commonly used level.

===============================================================================
WARN
===============================================================================

Unexpected situations

that do not stop execution.

Examples

Retry Attempt

Deprecated API

Configuration Missing

Disk Nearly Full

===============================================================================
ERROR
===============================================================================

Serious failures.

Examples

Database Connection Failed

Payment Failed

NullPointerException

Unhandled Exceptions

===============================================================================
LOG LEVEL HIERARCHY
===============================================================================

TRACE

DEBUG

INFO

WARN

ERROR

If level is INFO

TRACE and DEBUG

are ignored.

===============================================================================
LOGGING EXAMPLES
===============================================================================

logger.trace(...)

logger.debug(...)

logger.info(...)

logger.warn(...)

logger.error(...)

===============================================================================
PLACEHOLDER LOGGING
===============================================================================

Correct

logger.info(

"User {} logged in",

username

);

Avoid

String concatenation.

Benefits

✔ Better Performance

✔ Cleaner Code

===============================================================================
EXCEPTION LOGGING
===============================================================================

Correct

logger.error(

"Payment Failed",

exception

);

Stack trace automatically logged.

===============================================================================
LOG CONFIGURATION
===============================================================================

Spring Boot

application.properties

or

application.yml

Example

logging.level.root=INFO

===============================================================================
LOGBACK CONFIGURATION
===============================================================================

logback.xml

Defines

Appenders

Log Levels

Patterns

Rolling Policies

===============================================================================
APPENDERS
===============================================================================

Appender decides

where logs go.

Examples

Console

File

Database

Remote Server

Kafka

ElasticSearch

===============================================================================
CONSOLE APPENDER
===============================================================================

Logs printed
to terminal.

Useful during development.

===============================================================================
FILE APPENDER
===============================================================================

Stores logs in files.

Example

application.log

Useful in production.

===============================================================================
ROLLING FILE APPENDER
===============================================================================

Creates new log file

Daily

Hourly

By Size

Example

application.log

↓

application.2026-07-29.log

===============================================================================
LOG PATTERN
===============================================================================

Typical Pattern

Date

Time

Thread

Level

Logger

Message

Example

2026-07-29 10:30:15

INFO

StudentService

Student Created

===============================================================================
MDC
Mapped Diagnostic Context
===============================================================================

Stores request-specific data.

Example

Request ID

User ID

Session ID

Trace ID

Every log automatically
contains this information.

Very important

in Microservices.

===============================================================================
STRUCTURED LOGGING
===============================================================================

Instead of plain text

Use JSON

Example

{

"timestamp": "...",

"level":"INFO",

"userId":123,

"requestId":"abc"

}

Used with

ELK Stack

Splunk

Datadog

===============================================================================
ASYNC LOGGING
===============================================================================

Logging performed
in background thread.

Advantages

✔ Faster

✔ Less latency

Useful in

High Traffic Systems.

===============================================================================
LOG ROTATION
===============================================================================

Old log files

Archived

Compressed

Deleted

Prevents

Disk Full

===============================================================================
LOG AGGREGATION
===============================================================================

Microservices generate

Thousands of logs.

Centralize logs using

ElasticSearch

Logstash

Kibana

Graylog

Splunk

===============================================================================
SPRING BOOT LOGGING
===============================================================================

Default

SLF4J

+

Logback

Can replace with

Log4j2

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Using System.out.println()

----------------------------------------

❌ Logging passwords

----------------------------------------

❌ Logging credit card numbers

----------------------------------------

❌ Logging too much

(DEBUG in production)

----------------------------------------

❌ Ignoring stack traces

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use SLF4J

✔ Use placeholders

✔ Log meaningful messages

✔ Never log secrets

✔ Configure log rotation

✔ Use INFO sparingly

✔ DEBUG only during development

✔ ERROR for failures

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Spring Boot

↓

Logback

----------------------------------------

Kafka Consumers

↓

Structured Logging

----------------------------------------

Microservices

↓

MDC

----------------------------------------

Cloud Applications

↓

Centralized Logging

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Why use logging?

Debugging

Monitoring

Auditing

Troubleshooting

--------------------------------------------------------

Q2 Difference between
SLF4J and Logback?

SLF4J

Facade

Logback

Implementation

--------------------------------------------------------

Q3 Which logger
does Spring Boot use?

Logback

--------------------------------------------------------

Q4 Difference between
DEBUG and INFO?

DEBUG

Development

INFO

Business events

--------------------------------------------------------

Q5 What is MDC?

Mapped Diagnostic Context

Stores request-specific metadata.

--------------------------------------------------------

Q6 Why use placeholders?

Better performance
than string concatenation.

--------------------------------------------------------

Q7 What is log rotation?

Automatically archives
old log files.

--------------------------------------------------------

Q8 What is structured logging?

Logging in JSON
or machine-readable format.

--------------------------------------------------------

Q9 Which level should
exceptions use?

ERROR

--------------------------------------------------------

Q10 Why avoid logging passwords?

Security and compliance.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Configure Logback.

2. Console Logging Demo.

3. File Logging Demo.

4. Rolling File Logs.

5. Exception Logging.

6. Placeholder Logging.

7. Spring Boot Logging.

8. MDC Request ID Demo.

9. JSON Logging.

10. Async Logging Example.

===============================================================================
QUICK REVISION
===============================================================================

✔ Logging records application events

✔ SLF4J = Facade

✔ Logback = Default Spring Boot logger

✔ Log4j2 = High-performance logger

✔ TRACE < DEBUG < INFO < WARN < ERROR

✔ Use placeholders

✔ Never log sensitive information

✔ Use rolling files

✔ Use MDC for request tracing

✔ Structured logging for production

===============================================================================
NEXT TOPIC
===============================================================================

36_Testing_JUnit_Mockito.java

Topics

• Why Testing?

• Unit Testing

• Integration Testing

• JUnit 5

• Assertions

• Lifecycle Annotations

• Parameterized Tests

• Mockito

• Mock Objects

• Testcontainers

• Code Coverage

• Best Practices

• Interview Questions

===============================================================================
*/