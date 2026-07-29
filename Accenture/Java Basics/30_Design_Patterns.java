/*
===============================================================================
                           JAVA DESIGN PATTERNS
                     (Enterprise Software Design)
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHAT IS A DESIGN PATTERN?
===============================================================================

A Design Pattern is

A proven, reusable solution
to a commonly occurring software design problem.

Patterns are NOT

Libraries

Frameworks

Algorithms

They are

Design Templates

used to solve recurring problems.

===============================================================================
WHY DO WE NEED DESIGN PATTERNS?
===============================================================================

Without Design Patterns

❌ Tight Coupling

❌ Duplicate Code

❌ Difficult Maintenance

❌ Difficult Testing

❌ Difficult Extension

Design Patterns provide

✔ Reusability

✔ Flexibility

✔ Loose Coupling

✔ Scalability

✔ Maintainability

===============================================================================
HISTORY
===============================================================================

1994

Gang of Four (GoF)

Authors

Erich Gamma

Richard Helm

Ralph Johnson

John Vlissides

Published

"Design Patterns:
Elements of Reusable Object-Oriented Software"

===============================================================================
DESIGN PATTERN CATEGORIES
===============================================================================

23 GoF Patterns

↓

Creational

↓

Structural

↓

Behavioral

===============================================================================
CREATIONAL PATTERNS
===============================================================================

Concern

Object Creation

Patterns

Singleton

Factory Method

Abstract Factory

Builder

Prototype

===============================================================================
STRUCTURAL PATTERNS
===============================================================================

Concern

Class/Object Structure

Patterns

Adapter

Bridge

Composite

Decorator

Facade

Flyweight

Proxy

===============================================================================
BEHAVIORAL PATTERNS
===============================================================================

Concern

Object Communication

Patterns

Strategy

Observer

Command

Iterator

Mediator

Memento

State

Template Method

Visitor

Chain of Responsibility

===============================================================================
SOLID PRINCIPLES
===============================================================================

The foundation of modern software design.

S

Single Responsibility

O

Open Closed

L

Liskov Substitution

I

Interface Segregation

D

Dependency Inversion

===============================================================================
S
SINGLE RESPONSIBILITY PRINCIPLE
===============================================================================

One class

↓

One responsibility

Wrong

Employee

Stores data

Calculates salary

Prints report

Sends email

Too many responsibilities.

Correct

Employee

SalaryService

ReportService

EmailService

===============================================================================
O
OPEN CLOSED PRINCIPLE
===============================================================================

Software should be

Open for Extension

Closed for Modification

Example

Payment

↓

UPI

Card

Wallet

Add new payment type

WITHOUT

changing existing code.

===============================================================================
L
LISKOV SUBSTITUTION PRINCIPLE
===============================================================================

Derived class should be usable
wherever base class is expected.

Wrong

Bird

↓

Penguin

Penguin cannot fly.

Hierarchy is incorrect.

===============================================================================
I
INTERFACE SEGREGATION PRINCIPLE
===============================================================================

Clients should not depend
on methods they don't use.

Instead of

Machine

↓

Print

Scan

Fax

Create

Printer

Scanner

Fax

Separate interfaces.

===============================================================================
D
DEPENDENCY INVERSION PRINCIPLE
===============================================================================

Depend on abstractions

NOT

Concrete implementations.

Wrong

NotificationService

↓

EmailNotification

Correct

Notification

↓

Email

SMS

Push

===============================================================================
SINGLETON PATTERN
===============================================================================

Purpose

Ensure exactly

ONE

object exists.

Example

Logger

Configuration

Cache

Thread Pool

===============================================================================
IMPLEMENTATION
===============================================================================

private constructor

↓

private static instance

↓

public getInstance()

===============================================================================
THREAD-SAFE SINGLETON
===============================================================================

Use

Enum Singleton

or

Double-Checked Locking

===============================================================================
FACTORY METHOD
===============================================================================

Purpose

Object creation delegated
to subclasses/factory.

Example

ShapeFactory

↓

Circle

Rectangle

Triangle

===============================================================================
ABSTRACT FACTORY
===============================================================================

Creates families
of related objects.

Example

Windows UI Factory

↓

Button

Textbox

Checkbox

----------------------------------------

Mac UI Factory

↓

Button

Textbox

Checkbox

===============================================================================
BUILDER PATTERN
===============================================================================

Constructs complex objects
step by step.

Example

User.builder()

.name("Vedant")

.age(22)

.email("abc@example.com")

.build();

Used extensively

Lombok

@Builder

===============================================================================
PROTOTYPE PATTERN
===============================================================================

Creates object

by cloning

existing object.

Uses

clone()

Useful when

Object creation is expensive.

===============================================================================
ADAPTER PATTERN
===============================================================================

Makes incompatible interfaces
work together.

Real Example

Power Plug Adapter

Java Example

Legacy Payment API

↓

Adapter

↓

New Payment System

===============================================================================
DECORATOR PATTERN
===============================================================================

Adds functionality

without modifying
existing class.

Example

Coffee

↓

Milk

↓

Sugar

↓

Chocolate

Each decorator
adds behavior.

===============================================================================
FACADE PATTERN
===============================================================================

Provides simplified interface
to complex subsystem.

Example

Home Theater

Instead of

Projector

Amplifier

DVD

Lights

User simply calls

startMovie()

===============================================================================
PROXY PATTERN
===============================================================================

Placeholder object

controls access
to real object.

Examples

Lazy Loading

Authentication

Caching

Spring AOP

===============================================================================
COMPOSITE PATTERN
===============================================================================

Treat individual objects
and groups uniformly.

Example

Folder

↓

Files

↓

Folders

Tree Structure

===============================================================================
BRIDGE PATTERN
===============================================================================

Separates abstraction
from implementation.

Useful when both
can vary independently.

===============================================================================
FLYWEIGHT PATTERN
===============================================================================

Shares common data
to reduce memory.

Example

Character rendering

Game objects

Icons

===============================================================================
STRATEGY PATTERN
===============================================================================

Encapsulates algorithms.

Example

Payment Strategy

↓

UPI

Card

Wallet

PayPal

Runtime selection.

Spring uses Strategy heavily.

===============================================================================
OBSERVER PATTERN
===============================================================================

One-to-many dependency.

Subject changes

↓

Observers notified.

Examples

YouTube Subscribers

Stock Price Alerts

Event Listeners

===============================================================================
COMMAND PATTERN
===============================================================================

Encapsulates requests
as objects.

Examples

Undo

Redo

Menu Commands

Remote Control

===============================================================================
TEMPLATE METHOD
===============================================================================

Defines algorithm skeleton.

Subclasses customize steps.

Example

Online Shopping

↓

Payment

↓

Packing

↓

Delivery

===============================================================================
STATE PATTERN
===============================================================================

Behavior changes
based on state.

Example

Traffic Light

Red

Yellow

Green

===============================================================================
CHAIN OF RESPONSIBILITY
===============================================================================

Request passes through
multiple handlers.

Example

Authentication

↓

Authorization

↓

Validation

↓

Logging

===============================================================================
ITERATOR PATTERN
===============================================================================

Sequential traversal
without exposing structure.

Java Iterator

implements this pattern.

===============================================================================
MEDIATOR PATTERN
===============================================================================

Central communication object.

Example

Air Traffic Control

Chat Room

===============================================================================
MEMENTO PATTERN
===============================================================================

Stores previous state.

Examples

Undo

Game Save

Text Editor

===============================================================================
VISITOR PATTERN
===============================================================================

Separates operations
from object structure.

Common in

Compilers

AST Processing

===============================================================================
DEPENDENCY INJECTION
===============================================================================

Object dependencies
provided externally.

Spring Boot

@Autowired

Constructor Injection

Setter Injection

Field Injection

Prefer

Constructor Injection

===============================================================================
IOC
INVERSION OF CONTROL
===============================================================================

Traditional

Program creates objects.

IoC

Framework creates objects.

Spring Container

manages lifecycle.

===============================================================================
DESIGN PATTERNS IN SPRING
===============================================================================

Singleton

↓

Beans

----------------------------------------

Factory

↓

BeanFactory

ApplicationContext

----------------------------------------

Proxy

↓

AOP

Transactions

----------------------------------------

Template Method

↓

JdbcTemplate

RestTemplate

----------------------------------------

Observer

↓

Application Events

===============================================================================
DESIGN PATTERNS IN JAVA API
===============================================================================

Singleton

Runtime

Desktop

----------------------------------------

Builder

StringBuilder

HttpRequest.Builder

----------------------------------------

Iterator

Iterator

ListIterator

----------------------------------------

Decorator

BufferedInputStream

BufferedReader

----------------------------------------

Factory

Calendar.getInstance()

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Using patterns everywhere.

❌ Choosing Singleton
for everything.

❌ Deep inheritance.

❌ Ignoring SOLID.

❌ Overengineering.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Follow SOLID first.

✔ Prefer composition
over inheritance.

✔ Use interfaces.

✔ Keep classes focused.

✔ Use Dependency Injection.

✔ Choose patterns
only when needed.

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is a Design Pattern?

Reusable solution
to recurring design problems.

--------------------------------------------------------

Q2 How many GoF patterns exist?

23

--------------------------------------------------------

Q3 Categories?

Creational

Structural

Behavioral

--------------------------------------------------------

Q4 What is Singleton?

Only one object exists.

--------------------------------------------------------

Q5 Difference between
Factory and Builder?

Factory

Creates object.

Builder

Constructs complex object
step-by-step.

--------------------------------------------------------

Q6 Which pattern
does Spring use for Beans?

Singleton

--------------------------------------------------------

Q7 Which pattern
does Spring AOP use?

Proxy

--------------------------------------------------------

Q8 Difference between
Strategy and State?

Strategy

Algorithm changes.

State

Behavior changes
based on object state.

--------------------------------------------------------

Q9 What is Dependency Injection?

Dependencies are supplied
instead of created internally.

--------------------------------------------------------

Q10 What are SOLID principles?

Single Responsibility

Open Closed

Liskov Substitution

Interface Segregation

Dependency Inversion

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Singleton Logger.

2. Factory Shape Creator.

3. Builder User Object.

4. Adapter Payment Gateway.

5. Decorator Coffee Shop.

6. Observer News System.

7. Strategy Payment App.

8. Command Remote Control.

9. Facade Home Theater.

10. Mini Spring-style DI Container.

===============================================================================
QUICK REVISION
===============================================================================

✔ Design Patterns solve recurring problems

✔ 23 GoF Patterns

✔ Creational

✔ Structural

✔ Behavioral

✔ SOLID Principles

✔ Singleton

✔ Factory

✔ Builder

✔ Adapter

✔ Decorator

✔ Strategy

✔ Observer

✔ Proxy

✔ Dependency Injection

✔ IoC

✔ Spring Boot uses many design patterns

===============================================================================
CONGRATULATIONS!
===============================================================================

You have completed

COMPLETE CORE JAVA

Next Recommended Learning Path

1. Advanced Java

2. Maven

3. Gradle

4. Spring Framework

5. Spring Boot

6. Spring Data JPA

7. Hibernate

8. REST APIs

9. Security (JWT, OAuth2)

10. Microservices

11. Docker

12. Kubernetes

13. Kafka

14. Redis

15. System Design

===============================================================================
*/