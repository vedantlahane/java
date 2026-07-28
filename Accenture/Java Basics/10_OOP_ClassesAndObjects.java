/*
===============================================================================
                    OBJECT-ORIENTED PROGRAMMING (OOP)
                    PART 1 : CLASSES & OBJECTS
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY OBJECT-ORIENTED PROGRAMMING?
===============================================================================

Imagine you're developing an Online Shopping Application.

The application contains

• Customers

• Products

• Orders

• Payments

• Delivery Partners

Can we represent these using variables only?

int customerId;

String customerName;

double productPrice;

...

As the application grows,

thousands of variables become impossible to manage.

Instead,

Java models the real world using

OBJECTS.

Everything becomes

Customer Object

Product Object

Order Object

Payment Object

Delivery Object

This approach is called

Object-Oriented Programming.

===============================================================================
WHAT IS OOP?
===============================================================================

Object-Oriented Programming (OOP) is a programming paradigm that organizes
software around Objects rather than functions.

Instead of asking

"What should the program do?"

we ask

"What objects exist?"

Those objects contain

✔ Data (Fields)

✔ Behaviour (Methods)

===============================================================================
REAL-WORLD ANALOGY
===============================================================================

Real World

Car

Data

Brand

Color

Speed

Fuel

Behaviour

Start()

Stop()

Accelerate()

Brake()

--------------------------------------------

Java

Class

↓

Object

↓

Fields

↓

Methods

===============================================================================
WHY WAS OOP INTRODUCED?
===============================================================================

Earlier programming languages followed

Procedural Programming.

Everything was functions.

Problems

❌ Difficult to maintain

❌ Duplicate code

❌ Poor scalability

❌ Weak security

❌ Difficult collaboration

OOP solves these problems.

===============================================================================
PROCEDURAL vs OBJECT ORIENTED
===============================================================================

Procedural Programming

Program

↓

Functions

↓

Data

--------------------------------------------

Object-Oriented Programming

Program

↓

Objects

↓

Data + Behaviour Together

===============================================================================
WHAT IS A CLASS?
===============================================================================

A Class is a blueprint or template used to create objects.

Think of it as a design.

Example

Blueprint

↓

House

A blueprint is NOT a house.

Similarly,

Class is NOT an object.

===============================================================================
CLASS ANALOGY
===============================================================================

Blueprint

↓

House

--------------------------------------------

Recipe

↓

Cake

--------------------------------------------

Class

↓

Object

===============================================================================
CLASS EXAMPLE
===============================================================================

class Student{

    int rollNo;

    String name;

    int age;

    void study(){

        System.out.println("Studying...");

    }

}

This class defines

Properties

rollNo

name

age

Behaviour

study()

===============================================================================
WHAT IS AN OBJECT?
===============================================================================

An Object is a real instance of a class.

Example

Student s1 = new Student();

Student s2 = new Student();

Student s3 = new Student();

Each object has

Its own values.

===============================================================================
VISUAL REPRESENTATION
===============================================================================

Class

Student

↓

Creates

↓

+-----------------------+
| Student Object (s1)   |
| rollNo = 101          |
| name = Vedant         |
| age = 22              |
+-----------------------+

↓

+-----------------------+
| Student Object (s2)   |
| rollNo = 102          |
| name = Rahul          |
| age = 21              |
+-----------------------+

===============================================================================
CREATING OBJECTS
===============================================================================

Syntax

ClassName objectName = new ClassName();

Example

Student student = new Student();

Breakdown

Student

↓

Class

student

↓

Reference Variable

new

↓

Creates Object

Student()

↓

Constructor

===============================================================================
OBJECT CREATION PROCESS
===============================================================================

Step 1

JVM allocates memory in Heap.

↓

Step 2

Constructor executes.

↓

Step 3

Reference variable stores object's address.

↓

Step 4

Object becomes usable.

===============================================================================
ACCESSING OBJECT MEMBERS
===============================================================================

Student s = new Student();

s.name = "Vedant";

s.rollNo = 10;

s.study();

Dot Operator

.

is used to access

Fields

Methods

===============================================================================
COMPLETE EXAMPLE
===============================================================================

class Student{

    int rollNo;
    String name;

    void display(){

        System.out.println(rollNo);
        System.out.println(name);

    }

}

public class Main{

    public static void main(String[] args){

        Student s = new Student();

        s.rollNo = 101;
        s.name = "Vedant";

        s.display();

    }

}

Output

101

Vedant

===============================================================================
MULTIPLE OBJECTS
===============================================================================

Student s1 = new Student();

Student s2 = new Student();

Student s3 = new Student();

Each object stores different data.

s1.name = "Vedant";

s2.name = "Rahul";

s3.name = "Aman";

Memory

Heap

+----------------------+
| Object 1             |
+----------------------+

+----------------------+
| Object 2             |
+----------------------+

+----------------------+
| Object 3             |
+----------------------+

===============================================================================
STACK vs HEAP MEMORY
===============================================================================

Stack Memory

Stores

• Method Calls

• Local Variables

• References

Heap Memory

Stores

• Objects

• Arrays

Example

Student s = new Student();

Stack

+---------+

| s | ----|

+---------+
           |
           |
           ▼

Heap

+-------------------+

| name = Vedant     |

| rollNo = 101      |

+-------------------+

===============================================================================
OBJECT IDENTITY
===============================================================================

Student s1 = new Student();

Student s2 = new Student();

Although values may be same,

Objects are different.

s1 == s2

false

Different memory locations.

===============================================================================
REFERENCE VARIABLES
===============================================================================

Student s;

This DOES NOT create an object.

It only creates a reference.

Actual object

Student s = new Student();

===============================================================================
NULL REFERENCES
===============================================================================

Student s = null;

No object exists.

Calling

s.display();

throws

NullPointerException

===============================================================================
GARBAGE COLLECTION
===============================================================================

Student s = new Student();

s = null;

Object becomes unreachable.

Garbage Collector may remove it later.

Programmer does NOT manually delete objects.

===============================================================================
REAL-WORLD EXAMPLES
===============================================================================

Class

Employee

Objects

Rahul

Vedant

Aman

--------------------------------------------

Class

Car

Objects

BMW

Audi

Tesla

--------------------------------------------

Class

Book

Objects

Java Book

Spring Book

Docker Book

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Forgetting new keyword

Student s;

s.display();

NullPointerException

--------------------------------------------

❌ Using == to compare objects

Use equals() when appropriate.

--------------------------------------------

❌ Assuming class occupies heap memory

Only objects occupy heap.

===============================================================================
BEST PRACTICES
===============================================================================

✔ One class = One responsibility

✔ Use meaningful class names

✔ Class names should be PascalCase

✔ Object names should be camelCase

✔ Keep fields private (learn in Encapsulation)

✔ Initialize objects properly

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1. What is a Class?

A blueprint for creating objects.

--------------------------------------------------------

Q2. What is an Object?

A runtime instance of a class.

--------------------------------------------------------

Q3. Difference between Class and Object?

Class = Blueprint

Object = Real Instance

--------------------------------------------------------

Q4. Where are objects stored?

Heap Memory.

--------------------------------------------------------

Q5. Where are reference variables stored?

Usually Stack Memory (local references).

--------------------------------------------------------

Q6. Does

Student s;

create an object?

No.

Only a reference variable is created.

--------------------------------------------------------

Q7. What does the new keyword do?

Allocates memory in the heap and invokes the constructor.

--------------------------------------------------------

Q8. What happens if an object has no references?

It becomes eligible for Garbage Collection.

===============================================================================
QUICK REVISION
===============================================================================

✔ OOP models real-world entities

✔ Class = Blueprint

✔ Object = Instance

✔ new creates objects

✔ Heap stores objects

✔ Stack stores references

✔ Dot operator accesses members

✔ Multiple objects share one class

✔ Objects are garbage collected automatically

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Create a Student class.

2. Create an Employee class.

3. Create a Car class.

4. Create a BankAccount class.

5. Create a Book class.

6. Create five Student objects.

7. Display student information.

8. Compare two object references.

9. Demonstrate NullPointerException.

10. Draw stack and heap memory for object creation.

===============================================================================
NEXT TOPIC
===============================================================================

11_Constructors_And_This.java

Topics

• Constructors
• Default Constructor
• Parameterized Constructor
• Constructor Overloading
• this Keyword
• Constructor Chaining
• Object Initialization
• this() vs super()
• Initialization Blocks
• Interview Questions

===============================================================================
*/