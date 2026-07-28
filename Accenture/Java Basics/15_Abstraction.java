/*
===============================================================================
                              JAVA ABSTRACTION
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHAT IS ABSTRACTION?
===============================================================================

Abstraction means hiding implementation details while exposing only
the essential functionality.

The user knows

WHAT the object does.

The user does NOT need to know

HOW it does it.

Definition

"Showing only essential features while hiding implementation details."

===============================================================================
REAL WORLD EXAMPLE
===============================================================================

Car

Driver knows

✔ Steering

✔ Brake

✔ Accelerator

Driver does NOT know

❌ Fuel Injection

❌ Engine Timing

❌ Gear Synchronization

Those implementation details remain hidden.

This is Abstraction.

===============================================================================
ANOTHER EXAMPLE
===============================================================================

ATM Machine

User can

✔ Withdraw Money

✔ Deposit Money

✔ Check Balance

User never sees

✔ Database Queries

✔ Encryption

✔ Network Communication

All internal details remain hidden.

===============================================================================
WHY DO WE NEED ABSTRACTION?
===============================================================================

Without abstraction

Users interact with unnecessary complexity.

Example

Imagine writing

engine.startFuelInjection();

engine.adjustValveTiming();

engine.rotateCrankshaft();

instead of

car.start();

Abstraction simplifies APIs.

Benefits

✔ Simplicity

✔ Security

✔ Maintainability

✔ Loose Coupling

===============================================================================
ABSTRACTION IN JAVA
===============================================================================

Java provides abstraction using

1. Abstract Classes

2. Interfaces

===============================================================================
ABSTRACT CLASS
===============================================================================

An Abstract Class is a class that cannot be instantiated.

It serves as a blueprint for subclasses.

Syntax

abstract class Animal{

}

===============================================================================
WHY ABSTRACT CLASS?
===============================================================================

Suppose every animal

eats()

sleeps()

But

sound()

depends on animal type.

Dog → Bark

Cat → Meow

Lion → Roar

We force subclasses to implement sound().

===============================================================================
ABSTRACT METHOD
===============================================================================

An abstract method

has declaration

but no implementation.

Syntax

abstract void sound();

Example

abstract class Animal{

    abstract void sound();

}

===============================================================================
CONCRETE METHOD
===============================================================================

Abstract classes can also contain

normal methods.

Example

abstract class Animal{

    void eat(){

        System.out.println("Eating");

    }

}

===============================================================================
COMPLETE EXAMPLE
===============================================================================

abstract class Animal{

    abstract void sound();

    void sleep(){

        System.out.println("Sleeping");

    }

}

class Dog extends Animal{

    @Override

    void sound(){

        System.out.println("Bark");

    }

}

Main

Animal animal = new Dog();

animal.sound();

animal.sleep();

Output

Bark

Sleeping

===============================================================================
RULES OF ABSTRACT CLASS
===============================================================================

✔ Can contain abstract methods

✔ Can contain concrete methods

✔ Can have constructors

✔ Can have instance variables

✔ Cannot be instantiated

===============================================================================
CAN ABSTRACT CLASS HAVE CONSTRUCTOR?
===============================================================================

Yes.

Example

abstract class Animal{

    Animal(){

        System.out.println("Animal Created");

    }

}

Constructor executes before subclass constructor.

===============================================================================
CAN ABSTRACT CLASS HAVE VARIABLES?
===============================================================================

Yes.

Example

abstract class Employee{

    String company = "OpenAI";

}

===============================================================================
INTERFACE
===============================================================================

Interface defines a contract.

It specifies

WHAT

must be done,

not

HOW.

Syntax

interface Animal{

    void sound();

}

===============================================================================
IMPLEMENTING INTERFACE
===============================================================================

class Dog implements Animal{

    @Override

    public void sound(){

        System.out.println("Bark");

    }

}

===============================================================================
WHY INTERFACES?
===============================================================================

Interfaces allow completely unrelated classes
to follow the same contract.

Example

interface Payment{

    void pay();

}

Classes

CreditCard

UPI

Wallet

All implement

pay()

===============================================================================
MULTIPLE INHERITANCE USING INTERFACES
===============================================================================

Java does NOT allow

class A extends B,C

But

class Dog implements Animal,Pet{

}

is perfectly valid.

Interfaces solve the Diamond Problem.

===============================================================================
DEFAULT METHODS
===============================================================================

Introduced in Java 8.

Interfaces can contain implemented methods.

Example

interface Vehicle{

    default void start(){

        System.out.println("Starting");

    }

}

===============================================================================
STATIC METHODS IN INTERFACE
===============================================================================

Java 8 introduced static methods.

Example

interface MathUtil{

    static int square(int n){

        return n*n;

    }

}

Calling

MathUtil.square(5);

===============================================================================
PRIVATE METHODS IN INTERFACE
===============================================================================

Java 9 introduced private methods.

Used internally by default methods.

Cannot be accessed outside interface.

===============================================================================
FUNCTIONAL INTERFACE
===============================================================================

Contains exactly one abstract method.

Example

@FunctionalInterface

interface Calculator{

    int add(int a,int b);

}

Used by

Lambda Expressions

Streams API

Method References

===============================================================================
COMMON FUNCTIONAL INTERFACES
===============================================================================

Runnable

Callable

Comparator

Predicate

Function

Consumer

Supplier

BiFunction

BiConsumer

===============================================================================
MARKER INTERFACE
===============================================================================

Contains no methods.

Used to provide metadata.

Examples

Serializable

Cloneable

RandomAccess

===============================================================================
ABSTRACT CLASS vs INTERFACE
===============================================================================

Abstract Class

Can have constructors

Can have variables

Supports partial implementation

Single inheritance

----------------------------------------

Interface

No constructors

public static final variables only

Defines contract

Supports multiple inheritance

===============================================================================
WHEN TO USE ABSTRACT CLASS?
===============================================================================

Use when

Objects share common code.

Example

Animal

Vehicle

Employee

BankAccount

===============================================================================
WHEN TO USE INTERFACE?
===============================================================================

Use when

Different classes should follow
the same contract.

Example

Payment

Authentication

Notification

Comparable

Runnable

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Vehicle

↓

Car

Bike

Truck

(Abstract Class)

----------------------------------------

Payment

↓

UPI

Credit Card

Wallet

(Interface)

----------------------------------------

Notification

↓

SMS

Email

Push Notification

(Interface)

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Creating object of abstract class

Animal a = new Animal();

Compilation Error.

----------------------------------------

❌ Forgetting to implement all interface methods.

----------------------------------------

❌ Confusing interface with abstract class.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Program to interfaces.

✔ Use abstract classes for shared implementation.

✔ Keep interfaces focused.

✔ Prefer composition over deep inheritance.

✔ Use @Override consistently.

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is abstraction?

Hiding implementation details while exposing essential functionality.

--------------------------------------------------------

Q2 How is abstraction achieved in Java?

Using

1. Abstract Classes

2. Interfaces

--------------------------------------------------------

Q3 Can abstract classes have constructors?

Yes.

--------------------------------------------------------

Q4 Can abstract classes have concrete methods?

Yes.

--------------------------------------------------------

Q5 Can interfaces have methods with implementation?

Yes.

Default and static methods.

--------------------------------------------------------

Q6 Can interfaces have variables?

Yes.

They are implicitly

public static final.

--------------------------------------------------------

Q7 Why were default methods introduced?

To add new methods to interfaces
without breaking existing implementations.

--------------------------------------------------------

Q8 Difference between abstract class and interface?

Abstract class provides shared implementation.

Interface defines a contract.

--------------------------------------------------------

Q9 What is a Functional Interface?

An interface with exactly one abstract method.

--------------------------------------------------------

Q10 Give examples of marker interfaces.

Serializable

Cloneable

RandomAccess

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Animal abstract class.

2. Vehicle abstract class.

3. Payment interface.

4. Shape hierarchy.

5. Notification system.

6. Banking application.

7. Employee management.

8. Functional interface demo.

9. Lambda using functional interface.

10. Multiple interface implementation.

===============================================================================
QUICK REVISION
===============================================================================

✔ Abstraction hides implementation.

✔ Abstract class cannot be instantiated.

✔ Abstract methods have no body.

✔ Concrete methods have implementation.

✔ Interfaces define contracts.

✔ Java supports multiple inheritance through interfaces.

✔ Default methods introduced in Java 8.

✔ Functional Interface = One abstract method.

✔ Marker Interface = No methods.

✔ Program to interfaces, not implementations.

===============================================================================
NEXT TOPIC
===============================================================================

16_Interfaces_Advanced.java

Topics

• Deep Dive into Interfaces
• Interface Inheritance
• Functional Interfaces
• Lambda Expressions
• Method References
• Comparable vs Comparator
• Default Method Conflicts
• Interview Questions

===============================================================================
*/