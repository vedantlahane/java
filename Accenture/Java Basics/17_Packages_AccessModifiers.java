/*
===============================================================================
                    JAVA PACKAGES & ACCESS MODIFIERS
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY DO WE NEED PACKAGES?
===============================================================================

Imagine developing an E-Commerce application.

Classes

User
Product
Order
Payment
Cart
Invoice
Admin
Customer
Notification
Database

Without packages

All classes stay in one folder.

Problems

❌ Difficult to manage

❌ Name conflicts

❌ Poor organization

❌ Hard to maintain

Packages solve these problems.

===============================================================================
WHAT IS A PACKAGE?
===============================================================================

A Package is a namespace that groups related classes,
interfaces, enums, and annotations.

Think of a package like a folder in your computer.

Example

Documents

↓

Java

↓

Projects

↓

Banking

↓

accounts

transactions

customers

Packages organize Java code similarly.

===============================================================================
PACKAGE HIERARCHY
===============================================================================

com
│
├── company
│
├── project
│
├── service
│
├── repository
│
└── controller

Spring Boot projects follow this structure extensively.

===============================================================================
PACKAGE DECLARATION
===============================================================================

package com.company.project;

public class Student{

}

Package declaration must be

FIRST line

(except comments).

===============================================================================
IMPORT STATEMENT
===============================================================================

Suppose

Student class exists inside

com.company.model

Instead of writing

com.company.model.Student

everywhere,

use

import com.company.model.Student;

Now simply write

Student student = new Student();

===============================================================================
IMPORTING ENTIRE PACKAGE
===============================================================================

import java.util.*;

Allows access to

ArrayList

HashMap

Scanner

Collections

etc.

Note

It imports classes only.

Not sub-packages.

===============================================================================
FULLY QUALIFIED NAME
===============================================================================

Without import

java.util.ArrayList<String> list =
new java.util.ArrayList<>();

Called

Fully Qualified Name (FQN)

===============================================================================
TYPES OF PACKAGES
===============================================================================

1. Built-in Packages

2. User Defined Packages

===============================================================================
BUILT-IN PACKAGES
===============================================================================

java.lang

java.util

java.io

java.net

java.sql

java.time

java.math

===============================================================================
java.lang
===============================================================================

Automatically imported.

Contains

String

Object

Math

System

Integer

Double

Thread

Exception

Example

String name = "Vedant";

No import required.

===============================================================================
java.util
===============================================================================

Contains utility classes.

Examples

ArrayList

HashMap

Scanner

Collections

Random

Optional

===============================================================================
USER DEFINED PACKAGE
===============================================================================

Example

package com.vedant.bank;

public class Account{

}

File Location

com/

└── vedant/

    └── bank/

        Account.java

===============================================================================
STATIC IMPORT
===============================================================================

Normally

Math.sqrt(25);

With static import

import static java.lang.Math.*;

sqrt(25);

pow(2,5);

PI

Cleaner when using utility methods frequently.

===============================================================================
PACKAGE NAMING CONVENTION
===============================================================================

Use lowercase.

Examples

com.amazon.payment

com.google.drive

org.springframework.context

Avoid

MyPackage

JAVA

StudentPackage

===============================================================================
WHY REVERSE DOMAIN?
===============================================================================

Company

example.com

Package

com.example

Prevents naming conflicts worldwide.

===============================================================================
ACCESS MODIFIERS
===============================================================================

Access Modifiers control

Who can access

Classes

Methods

Variables

Constructors

Java provides

1. public

2. protected

3. default

4. private

===============================================================================
ACCESS MODIFIER TABLE
===============================================================================

+------------+-------+---------+-----------+-----------+
| Modifier   | Class | Package | Subclass  | World     |
+------------+-------+---------+-----------+-----------+
| public     | Yes   | Yes     | Yes       | Yes       |
| protected  | Yes   | Yes     | Yes       | No        |
| default    | Yes   | Yes     | No*       | No        |
| private    | Yes   | No       | No        | No        |
+------------+-------+---------+-----------+-----------+

*Accessible only if subclass is in the same package.

===============================================================================
PUBLIC
===============================================================================

Accessible everywhere.

Example

public class Student{

    public void display(){

    }

}

Most APIs expose public methods.

===============================================================================
PRIVATE
===============================================================================

Accessible only inside the same class.

Example

private int salary;

Used for

Data Hiding

Encapsulation

===============================================================================
PROTECTED
===============================================================================

Accessible

✔ Same package

✔ Subclasses (even in different packages)

Example

protected void calculateSalary(){

}

Useful for inheritance.

===============================================================================
DEFAULT (PACKAGE-PRIVATE)
===============================================================================

No keyword.

Example

class Student{

}

Accessible only inside the same package.

===============================================================================
VISUAL REPRESENTATION
===============================================================================

private

↓

Same Class

--------------------------------------

default

↓

Same Package

--------------------------------------

protected

↓

Same Package

+

Subclass

--------------------------------------

public

↓

Entire World

===============================================================================
ACCESSING PRIVATE MEMBERS
===============================================================================

private int age;

Outside class

student.age

Compilation Error

Correct

student.getAge();

===============================================================================
ACCESS MODIFIERS FOR CLASSES
===============================================================================

Top-level classes

Only

public

or

default

Allowed.

private class Student

Compilation Error

protected class Student

Compilation Error

===============================================================================
NESTED CLASSES
===============================================================================

Nested classes

can use all access modifiers.

Example

class Outer{

    private class Inner{

    }

}

===============================================================================
WHEN TO USE WHICH?
===============================================================================

private

Fields

-------------------------------------

protected

Inheritance

-------------------------------------

default

Package utilities

-------------------------------------

public

API methods

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

Making every field public.

-------------------------------------

Mistake

Using wildcard imports everywhere.

-------------------------------------

Mistake

Wrong package structure.

-------------------------------------

Mistake

Confusing default with protected.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use private fields.

✔ Keep APIs public only when necessary.

✔ Use packages to separate layers.

✔ Prefer explicit imports over wildcard imports
   in production code.

✔ Follow reverse-domain package naming.

===============================================================================
SPRING BOOT EXAMPLE
===============================================================================

com.example.bank

│

├── controller

├── service

├── repository

├── entity

├── dto

├── config

├── exception

├── util

└── security

This structure improves maintainability.

===============================================================================
JAVA PLATFORM MODULE SYSTEM (JPMS)
===============================================================================

Introduced in Java 9.

Purpose

✔ Better encapsulation

✔ Faster startup

✔ Smaller runtime images

Example

module bank.app{

    requires java.sql;

    exports com.bank.service;

}

Modules are larger units than packages.

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is a package?

A namespace used to organize related Java classes.

--------------------------------------------------------

Q2 Why use packages?

Organization

Security

Avoid naming conflicts

Maintainability

--------------------------------------------------------

Q3 Difference between package and folder?

Packages are logical namespaces.

Folders are physical directories.

Usually they map to each other.

--------------------------------------------------------

Q4 Which package is imported automatically?

java.lang

--------------------------------------------------------

Q5 Difference between import and static import?

import

Imports classes.

static import

Imports static members.

--------------------------------------------------------

Q6 Which access modifier is most restrictive?

private

--------------------------------------------------------

Q7 Can top-level classes be private?

No.

Only public or package-private.

--------------------------------------------------------

Q8 Difference between protected and default?

protected

Accessible to subclasses
outside the package.

default

Accessible only within
the same package.

--------------------------------------------------------

Q9 What naming convention is used for packages?

Reverse domain name.

Example

com.example.project

--------------------------------------------------------

Q10 What is JPMS?

Java Platform Module System introduced in Java 9.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Create a custom package.

2. Import user-defined classes.

3. Demonstrate public access.

4. Demonstrate private access.

5. Demonstrate protected access.

6. Demonstrate package-private access.

7. Build a layered project structure.

8. Use static import.

9. Create nested classes.

10. Create a simple Java module.

===============================================================================
QUICK REVISION
===============================================================================

✔ Package = Namespace

✔ import simplifies class usage

✔ java.lang imported automatically

✔ Four access modifiers

✔ private = Same Class

✔ default = Same Package

✔ protected = Package + Subclasses

✔ public = Everywhere

✔ Use reverse-domain package names

✔ Java 9 introduced Modules (JPMS)

===============================================================================
NEXT TOPIC
===============================================================================

18_ExceptionHandling.java

Topics

• What is an Exception?
• Exception Hierarchy
• try-catch-finally
• throw
• throws
• Custom Exceptions
• Checked vs Unchecked Exceptions
• Multi-catch
• Try-with-Resources
• Best Practices
• Interview Questions

===============================================================================
*/