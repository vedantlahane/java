/*
===============================================================================
                         ADVANCED JAVA INTERFACES
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY STUDY INTERFACES IN DEPTH?
===============================================================================

Interfaces are one of the most important concepts in modern Java.

Almost every major Java framework heavily relies on interfaces.

Examples

Spring Boot

JDBC

Collections Framework

Streams API

Executor Framework

Lambda Expressions

Microservices

If you understand interfaces well,

you'll understand enterprise Java much faster.

===============================================================================
RECAP
===============================================================================

Interface defines a CONTRACT.

It tells a class

"What you MUST do"

instead of

"How you should do it."

Example

interface Payment{

    void pay();

}

Classes

UPI

CreditCard

Wallet

All implement

pay()

in different ways.

===============================================================================
WHY NOT USE ONLY ABSTRACT CLASSES?
===============================================================================

Suppose

Bird

Fish

Airplane

All can move.

Can Airplane inherit from Bird?

No.

But all can implement

Flyable

This is where interfaces shine.

===============================================================================
INTERFACE SYNTAX
===============================================================================

interface Animal{

    void sound();

}

class Dog implements Animal{

    @Override

    public void sound(){

        System.out.println("Bark");

    }

}

===============================================================================
INTERFACE VARIABLES
===============================================================================

Every variable declared inside an interface is automatically

public

static

final

Example

interface Constants{

    int MAX = 100;

}

Compiler treats it as

public static final int MAX = 100;

Cannot modify.

===============================================================================
INTERFACE METHODS
===============================================================================

Before Java 8

Only abstract methods.

After Java 8

✔ Abstract Methods

✔ Default Methods

✔ Static Methods

After Java 9

✔ Private Methods

===============================================================================
DEFAULT METHODS
===============================================================================

Default methods allow interfaces
to evolve without breaking existing code.

Example

interface Vehicle{

    default void start(){

        System.out.println("Starting Vehicle");

    }

}

Implementing class may override it.

===============================================================================
WHY DEFAULT METHODS?
===============================================================================

Suppose Java adds a new method
to List interface.

Without default methods,

every implementation

(ArrayList)

(LinkedList)

(Vector)

would immediately break.

Default methods solve this problem.

===============================================================================
STATIC METHODS
===============================================================================

Interfaces may contain utility methods.

Example

interface Calculator{

    static int square(int n){

        return n*n;

    }

}

Calling

Calculator.square(5);

Output

25

===============================================================================
PRIVATE METHODS
===============================================================================

Java 9 introduced private methods.

Used to reduce duplicate code
inside default methods.

Cannot be called outside interface.

===============================================================================
INTERFACE INHERITANCE
===============================================================================

Interfaces can extend interfaces.

Example

interface Animal{

    void eat();

}

interface Pet extends Animal{

    void play();

}

Implementing class

must implement

eat()

play()

===============================================================================
MULTIPLE INTERFACE INHERITANCE
===============================================================================

interface A{

    void show();

}

interface B{

    void display();

}

class Demo implements A,B{

    public void show(){}

    public void display(){}

}

Perfectly valid.

===============================================================================
DEFAULT METHOD CONFLICT
===============================================================================

interface A{

    default void show(){

        System.out.println("A");

    }

}

interface B{

    default void show(){

        System.out.println("B");

    }

}

class Demo implements A,B{

}

Compilation Error

Ambiguous.

===============================================================================
RESOLVING CONFLICT
===============================================================================

Override the method.

class Demo implements A,B{

    @Override

    public void show(){

        A.super.show();

    }

}

===============================================================================
FUNCTIONAL INTERFACE
===============================================================================

Contains exactly ONE abstract method.

Example

@FunctionalInterface

interface Printer{

    void print();

}

Used extensively in Java 8+.

===============================================================================
WHY FUNCTIONAL INTERFACES?
===============================================================================

They allow

Lambda Expressions

Method References

Streams API

Parallel Processing

===============================================================================
COMMON FUNCTIONAL INTERFACES
===============================================================================

Runnable

Callable

Comparator

Predicate<T>

Function<T,R>

Consumer<T>

Supplier<T>

UnaryOperator<T>

BinaryOperator<T>

===============================================================================
PREDICATE
===============================================================================

Represents

Condition

Example

Predicate<Integer> even =
n -> n % 2 == 0;

Returns

true

or

false

===============================================================================
FUNCTION
===============================================================================

Accepts input

Returns output

Example

Function<String,Integer> length =
String::length;

===============================================================================
CONSUMER
===============================================================================

Consumes input.

Returns nothing.

Example

Consumer<String> printer =
System.out::println;

===============================================================================
SUPPLIER
===============================================================================

Provides data.

No input.

Example

Supplier<Double> random =
Math::random;

===============================================================================
METHOD REFERENCES
===============================================================================

Lambda

x -> System.out.println(x)

Method Reference

System.out::println

Cleaner

Readable

===============================================================================
LAMBDA EXPRESSION
===============================================================================

Traditional

Runnable r = new Runnable(){

    public void run(){

        System.out.println("Running");

    }

};

Lambda

Runnable r =
() -> System.out.println("Running");

===============================================================================
INTERFACE AS API CONTRACT
===============================================================================

Controller

↓

Service Interface

↓

Service Implementation

↓

Repository Interface

↓

Database

Spring Boot follows this architecture extensively.

===============================================================================
INTERFACE SEGREGATION PRINCIPLE
===============================================================================

Clients should not depend upon
methods they don't use.

Instead of

interface Machine{

    print();

    scan();

    fax();

}

Create

Printer

Scanner

Fax

Separate interfaces.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Comparable

Sorting

----------------------------------------

Comparator

Custom Sorting

----------------------------------------

Runnable

Threads

----------------------------------------

AutoCloseable

Files

Database Connections

----------------------------------------

Iterable

Enhanced for Loop

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

Trying to instantiate interface.

Payment p = new Payment();

Compilation Error

--------------------------------------------

Mistake

Forgetting public while implementing.

Interface methods are public.

Implementation cannot reduce visibility.

--------------------------------------------

Mistake

Trying to modify interface variables.

Compilation Error.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Program to interfaces.

✔ Keep interfaces small.

✔ Prefer composition.

✔ Use Functional Interfaces
for Lambdas.

✔ Use default methods carefully.

✔ Avoid "God Interfaces."

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is an interface?

A contract specifying behavior.

--------------------------------------------------------

Q2 Difference between interface and abstract class?

Interface

Contract

Multiple inheritance

Abstract Class

Shared implementation

Single inheritance

--------------------------------------------------------

Q3 Can interfaces have constructors?

No.

--------------------------------------------------------

Q4 Can interfaces contain variables?

Yes.

They are implicitly

public static final.

--------------------------------------------------------

Q5 Can interfaces have implemented methods?

Yes.

Default

Static

Private

--------------------------------------------------------

Q6 What is a Functional Interface?

Exactly one abstract method.

--------------------------------------------------------

Q7 Which annotation verifies
functional interfaces?

@FunctionalInterface

--------------------------------------------------------

Q8 Can one interface extend another?

Yes.

--------------------------------------------------------

Q9 Can one class implement multiple interfaces?

Yes.

--------------------------------------------------------

Q10 Why are interfaces heavily used
in Spring Boot?

Because they promote loose coupling,
testability, dependency injection,
and interchangeable implementations.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Payment Interface

2. Notification Interface

3. Vehicle Interface

4. Multiple Interface Example

5. Functional Interface

6. Lambda Calculator

7. Comparator Sorting

8. Predicate Example

9. Consumer Example

10. Supplier Example

===============================================================================
QUICK REVISION
===============================================================================

✔ Interface = Contract

✔ Multiple inheritance via interfaces

✔ Default methods (Java 8)

✔ Static methods (Java 8)

✔ Private methods (Java 9)

✔ Functional Interface = One abstract method

✔ Lambdas require Functional Interfaces

✔ Method References simplify Lambdas

✔ Spring Boot uses interfaces extensively

===============================================================================
NEXT TOPIC
===============================================================================

17_Packages_AccessModifiers.java

Topics

• Packages
• import
• package keyword
• Access Modifiers
• public
• private
• protected
• default
• Static Import
• Naming Conventions
• Java Modules (JPMS)
• Interview Questions

===============================================================================
*/