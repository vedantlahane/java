/*
===============================================================================
                             JAVA POLYMORPHISM
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHAT IS POLYMORPHISM?
===============================================================================

The word Polymorphism comes from two Greek words.

Poly  = Many

Morph = Forms

Meaning

"One Interface, Many Forms"

In Java,

the same method call can perform different actions depending on
the object executing it.

===============================================================================
REAL WORLD ANALOGY
===============================================================================

Button

Different applications perform different actions.

Browser

Refresh

IDE

Run Program

Game

Pause

Same button.

Different behavior.

This is Polymorphism.

===============================================================================
WHY DO WE NEED POLYMORPHISM?
===============================================================================

Imagine a payment application.

Without polymorphism

payByCreditCard()

payByUPI()

payByWallet()

payByNetBanking()

Every time a new payment method is added,

client code changes.

Instead

payment.pay();

Each payment object decides

how to pay.

Client code never changes.

===============================================================================
TYPES OF POLYMORPHISM
===============================================================================

Java supports

1. Compile-Time Polymorphism

2. Runtime Polymorphism

===============================================================================
1. COMPILE-TIME POLYMORPHISM
===============================================================================

Also called

Static Binding

Method Overloading

Decision made

During Compilation

===============================================================================
METHOD OVERLOADING
===============================================================================

Same method name

Different parameter list

Example

class Calculator{

    int add(int a,int b){

        return a+b;

    }

    double add(double a,double b){

        return a+b;

    }

    int add(int a,int b,int c){

        return a+b+c;

    }

}

Compiler decides which method to call.

===============================================================================
EXAMPLE
===============================================================================

Calculator c = new Calculator();

c.add(10,20);

↓

Calls

add(int,int)

------------------------------------------

c.add(5.5,2.5);

↓

Calls

add(double,double)

===============================================================================
OVERLOADING RULES
===============================================================================

Must differ in

Number of Parameters

OR

Data Type

OR

Order of Parameters

Cannot overload

only by return type.

===============================================================================
INVALID EXAMPLE
===============================================================================

int test(){

}

double test(){

}

Compilation Error

Reason

Same signature.

===============================================================================
2. RUNTIME POLYMORPHISM
===============================================================================

Also called

Dynamic Binding

Method Overriding

Decision made

During Runtime

===============================================================================
METHOD OVERRIDING
===============================================================================

Subclass provides its own implementation of
a parent method.

Example

class Animal{

    void sound(){

        System.out.println("Animal Sound");

    }

}

class Dog extends Animal{

    @Override

    void sound(){

        System.out.println("Dog Barks");

    }

}

===============================================================================
RUNTIME EXAMPLE
===============================================================================

Animal animal = new Dog();

animal.sound();

Output

Dog Barks

Compiler only knows

Animal

JVM decides

Dog

at runtime.

===============================================================================
DYNAMIC METHOD DISPATCH
===============================================================================

Method call resolution based on actual object.

Reference Type

↓

Animal

Object Type

↓

Dog

Method Executed

↓

Dog.sound()

This is Dynamic Method Dispatch.

===============================================================================
VISUALIZATION
===============================================================================

Animal ref

↓

Dog Object

↓

sound()

↓

Dog Implementation

===============================================================================
UPCASTING
===============================================================================

Subclass Object

↓

Parent Reference

Example

Dog dog = new Dog();

Animal animal = dog;

OR

Animal animal = new Dog();

Automatic

Safe

Recommended

===============================================================================
WHY UPCASTING?
===============================================================================

Allows generic programming.

Example

List<String>

↓

ArrayList

LinkedList

Vector

All treated as

List

===============================================================================
DOWNCASTING
===============================================================================

Parent Reference

↓

Subclass Reference

Requires explicit cast.

Example

Animal animal = new Dog();

Dog dog = (Dog) animal;

===============================================================================
INVALID DOWNCAST
===============================================================================

Animal animal = new Animal();

Dog dog = (Dog) animal;

Runtime Error

ClassCastException

===============================================================================
INSTANCEOF BEFORE CASTING
===============================================================================

if(animal instanceof Dog){

    Dog dog = (Dog) animal;

}

Safe casting.

===============================================================================
COVARIANT RETURN TYPE
===============================================================================

Overridden methods may return

subclasses

of original return type.

Example

class Animal{

    Animal getAnimal(){

        return new Animal();

    }

}

class Dog extends Animal{

    @Override

    Dog getAnimal(){

        return new Dog();

    }

}

Allowed.

===============================================================================
FINAL METHODS
===============================================================================

final methods

cannot be overridden.

Example

class Vehicle{

    final void start(){

    }

}

Compilation Error

if subclass overrides.

===============================================================================
STATIC METHODS
===============================================================================

Static methods are

Hidden

NOT

Overridden

Method selection depends on

Reference Type

===============================================================================
PRIVATE METHODS
===============================================================================

Private methods are

NOT inherited.

Therefore,

they cannot be overridden.

===============================================================================
OVERLOADING vs OVERRIDING
===============================================================================

Overloading

Same Class

Compile Time

Different Parameters

--------------------------------------------

Overriding

Parent + Child

Runtime

Same Parameters

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Shape

↓

draw()

Circle

Rectangle

Triangle

--------------------------------------------

Payment

↓

pay()

CreditCard

UPI

Wallet

--------------------------------------------

Notification

↓

send()

SMS

Email

Push Notification

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

Overloading by return type only.

--------------------------------------------

Mistake

Forgetting @Override

--------------------------------------------

Mistake

Unsafe downcasting.

--------------------------------------------

Mistake

Expecting static methods
to be polymorphic.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Program to interfaces.

✔ Prefer overriding over conditionals.

✔ Always use @Override.

✔ Use instanceof before downcasting.

✔ Avoid unnecessary casts.

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is Polymorphism?

Ability of one interface to have multiple implementations.

--------------------------------------------------------

Q2 Types of Polymorphism?

Compile-Time

Runtime

--------------------------------------------------------

Q3 Difference between Overloading and Overriding?

Overloading

Compile Time

Same Class

Different Parameters

Overriding

Runtime

Parent + Child

Same Signature

--------------------------------------------------------

Q4 What is Dynamic Method Dispatch?

Runtime method resolution based on actual object.

--------------------------------------------------------

Q5 What is Upcasting?

Subclass object assigned to parent reference.

--------------------------------------------------------

Q6 What is Downcasting?

Parent reference cast back to subclass.

--------------------------------------------------------

Q7 Can static methods be overridden?

No.

They are hidden.

--------------------------------------------------------

Q8 Can final methods be overridden?

No.

--------------------------------------------------------

Q9 Can constructors be overridden?

No.

--------------------------------------------------------

Q10 Why use @Override?

Compiler verifies that overriding is correct.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Animal → Dog sound()

2. Payment Gateway

3. Employee Salary Calculator

4. Shape Area Calculator

5. Notification System

6. Vehicle Hierarchy

7. Banking Interest Calculator

8. Smart Home Devices

9. Demonstrate Upcasting

10. Demonstrate Downcasting

===============================================================================
QUICK REVISION
===============================================================================

✔ Polymorphism = One Interface, Many Forms

✔ Compile-Time = Overloading

✔ Runtime = Overriding

✔ Dynamic Method Dispatch

✔ Upcasting = Safe

✔ Downcasting = Explicit

✔ instanceof = Safe Casting

✔ final methods cannot be overridden

✔ Static methods are hidden

✔ @Override improves safety

===============================================================================
NEXT TOPIC
===============================================================================

15_Abstraction.java

Topics

• What is Abstraction?
• Why Abstraction?
• Abstract Classes
• Abstract Methods
• Concrete Methods
• Interfaces
• Multiple Inheritance with Interfaces
• Default & Static Methods
• Functional Interfaces
• Marker Interfaces
• Interview Questions

===============================================================================
*/