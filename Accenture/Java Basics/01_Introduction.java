/*
===============================================================================
                                JAVA INTRODUCTION
===============================================================================

Author  : Vedant
Purpose : Complete notes for Java Basics

===============================================================================
WHAT IS JAVA?
===============================================================================

Java is a high-level, object-oriented, platform-independent programming language
developed by James Gosling and his team at Sun Microsystems.

It was officially released in 1995.

Java follows the principle:

        Write Once, Run Anywhere (WORA)

This means a Java program can run on any operating system without changing
the source code.

===============================================================================
HISTORY OF JAVA
===============================================================================

1991
----
• Sun Microsystems started the "Green Project".
• The programming language was initially called Oak.
• Designed by James Gosling.

Why Oak?

Because an Oak tree stood outside James Gosling's office.

Later...

Oak was already trademarked.

So the language was renamed...

JAVA

The name came from Java Coffee.

1995
----
Java was officially released.

Today Java is maintained by Oracle Corporation.

===============================================================================
WHY WAS JAVA CREATED?
===============================================================================

At that time...

Programs written for Windows could not run on Linux.

Programs written for Linux could not run on Mac.

Every Operating System required separate compilation.

This created huge maintenance problems.

Java solved this problem.

Instead of compiling directly into machine code...

Java compiles into

                BYTECODE

which is executed by JVM.

===============================================================================
WRITE ONCE RUN ANYWHERE (WORA)
===============================================================================

            Java Source Code
                    │
                    ▼
              Java Compiler
                (javac)
                    │
                    ▼
              Bytecode (.class)
                    │
        ┌───────────┼───────────┐
        ▼           ▼           ▼
     Windows      Linux       macOS
       JVM          JVM         JVM
        │            │           │
        ▼            ▼           ▼
 Machine Code  Machine Code Machine Code

Same bytecode.

Different JVMs.

No recompilation required.

===============================================================================
ADVANTAGES OF JAVA
===============================================================================

1. Platform Independent
-----------------------
Runs on every operating system having JVM.

Example:
Windows
Linux
macOS
Solaris

--------------------------------------------------

2. Object Oriented
------------------

Everything revolves around objects.

Supports

• Class
• Object
• Inheritance
• Encapsulation
• Polymorphism
• Abstraction

--------------------------------------------------

3. Robust
----------

Java is reliable because of

• Exception Handling
• Garbage Collection
• Strong Type Checking

--------------------------------------------------

4. Secure
----------

No pointer arithmetic.

Bytecode verification.

Security Manager.

Sandbox execution.

--------------------------------------------------

5. Portable
------------

Fixed primitive data sizes.

int always = 32 bits

No OS dependency.

--------------------------------------------------

6. High Performance
-------------------

JIT Compiler

HotSpot JVM

Optimized execution

--------------------------------------------------

7. Multithreading
------------------

Can execute multiple tasks simultaneously.

Example

Downloading file
+
Playing music
+
Rendering UI

===============================================================================
REAL WORLD APPLICATIONS
===============================================================================

Java is widely used in

• Banking Systems
• Android Development
• Enterprise Applications
• Web Applications
• Cloud Computing
• Big Data
• IoT
• Distributed Systems
• Financial Software
• Airline Reservation Systems

Companies using Java

• Amazon
• Netflix
• Google
• Uber
• LinkedIn
• Oracle

===============================================================================
JAVA EDITIONS
===============================================================================

1. Java SE
-----------
Core Java

Desktop

Console

Utility Applications

--------------------------------------------------

2. Java EE (Jakarta EE)
-------------------------

Enterprise Applications

Web Applications

REST APIs

Microservices

--------------------------------------------------

3. Java ME
-----------

Embedded Devices

IoT

Smart TVs

Mobile Devices

===============================================================================
FIRST JAVA PROGRAM
===============================================================================

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}

===============================================================================
PROGRAM EXECUTION
===============================================================================

Step 1

Write

Main.java

↓

Step 2

Compile

javac Main.java

↓

Main.class

↓

Step 3

Run

java Main

↓

Output

Hello World

===============================================================================
IMPORTANT KEYWORDS
===============================================================================

public

Accessible everywhere.

--------------------------------

class

Defines a class.

--------------------------------

static

Belongs to class.

--------------------------------

void

Returns nothing.

--------------------------------

main()

Entry point of every Java application.

--------------------------------

String[] args

Stores command-line arguments.

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Why is Java platform independent?

Answer:
Because Java compiles into bytecode which runs on JVM.

--------------------------------------------------

Q2 Who developed Java?

James Gosling

--------------------------------------------------

Q3 What was Java originally called?

Oak

--------------------------------------------------

Q4 What is WORA?

Write Once Run Anywhere.

--------------------------------------------------

Q5 Which company currently owns Java?

Oracle Corporation.

===============================================================================
QUICK REVISION
===============================================================================

✔ Developed by James Gosling

✔ Started as Oak

✔ Released in 1995

✔ Platform Independent

✔ Bytecode

✔ JVM

✔ WORA

✔ Object Oriented

✔ Secure

✔ Robust

✔ Portable

✔ Multithreaded

===============================================================================
NEXT TOPIC
===============================================================================

02_JavaArchitecture.java

(JVM • JDK • JRE • Bytecode • Compilation Process)

===============================================================================