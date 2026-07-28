/*
===============================================================================
                             JAVA INHERITANCE
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHAT IS INHERITANCE?
===============================================================================

Inheritance is the mechanism through which one class acquires the properties
(fields) and behaviors (methods) of another class.

Instead of rewriting existing code,

we extend it.

Example

Animal

↓

Dog

Dog automatically gets

✔ name

✔ age

✔ eat()

✔ sleep()

Dog only needs to define

bark()

This promotes

✔ Code Reusability

✔ Maintainability

✔ Extensibility

===============================================================================
REAL WORLD ANALOGY
===============================================================================

Vehicle

↓

Car

↓

Electric Car

Electric Car inherits

Brand

Color

Engine

Start()

Stop()

And adds

Battery Capacity

Charge()

===============================================================================
WHY DO WE NEED INHERITANCE?
===============================================================================

Without inheritance

class Dog{

    String name;

    void eat(){}

}

class Cat{

    String name;

    void eat(){}

}

Duplicate code.

With inheritance

class Animal{

    String name;

    void eat(){}

}

class Dog extends Animal{

    void bark(){}

}

No duplication.

===============================================================================
SYNTAX
===============================================================================

class Parent{

}

class Child extends Parent{

}

extends

means

Child inherits Parent.

===============================================================================
FIRST EXAMPLE
===============================================================================

class Animal{

    void eat(){

        System.out.println("Eating");

    }

}

class Dog extends Animal{

    void bark(){

        System.out.println("Barking");

    }

}

public class Main{

    public static void main(String[] args){

        Dog dog = new Dog();

        dog.eat();

        dog.bark();

    }

}

Output

Eating

Barking

===============================================================================
IS-A RELATIONSHIP
===============================================================================

Inheritance models

IS-A

relationships.

Dog IS-A Animal

Car IS-A Vehicle

SavingsAccount IS-A BankAccount

Student IS-A Person

Wrong Examples

Engine IS-A Car

NO

Book IS-A Library

NO

These are

HAS-A

relationships (Composition).

===============================================================================
TYPES OF INHERITANCE
===============================================================================

Java supports

1. Single Inheritance

2. Multilevel Inheritance

3. Hierarchical Inheritance

Java does NOT support

Multiple Inheritance using classes.

===============================================================================
1. SINGLE INHERITANCE
===============================================================================

Animal

↓

Dog

Example

class Animal{

}

class Dog extends Animal{

}

===============================================================================
2. MULTILEVEL INHERITANCE
===============================================================================

Animal

↓

Dog

↓

Puppy

Example

class Animal{

}

class Dog extends Animal{

}

class Puppy extends Dog{

}

Puppy inherits both

Dog

and

Animal

===============================================================================
3. HIERARCHICAL INHERITANCE
===============================================================================

          Animal

         /      \

      Dog      Cat

       |

     Puppy

Dog and Cat inherit from Animal.

===============================================================================
WHY JAVA DOES NOT SUPPORT MULTIPLE
INHERITANCE USING CLASSES
===============================================================================

Example

class A{

    void show(){}

}

class B{

    void show(){}

}

class C extends A,B{

}

Which show() should C inherit?

Ambiguity.

This is called

Diamond Problem.

Java avoids it.

Instead,

Java provides

Interfaces.

===============================================================================
SUPERCLASS
===============================================================================

The class being inherited.

Example

class Animal{

}

Animal

is superclass.

===============================================================================
SUBCLASS
===============================================================================

The inheriting class.

Example

class Dog extends Animal{

}

Dog

is subclass.

===============================================================================
ACCESSING INHERITED MEMBERS
===============================================================================

class Animal{

    void eat(){

        System.out.println("Eating");

    }

}

class Dog extends Animal{

}

Dog d = new Dog();

d.eat();

Inherited method works directly.

===============================================================================
PRIVATE MEMBERS
===============================================================================

Private members are NOT inherited directly.

Example

class Animal{

    private int age;

}

Dog cannot access

age

Use getters/setters if needed.

===============================================================================
PROTECTED MEMBERS
===============================================================================

protected members are accessible

Inside subclass.

Useful when inheritance is intended.

===============================================================================
THE super KEYWORD
===============================================================================

super refers to the immediate parent class.

Uses

✔ Access parent methods

✔ Access parent variables

✔ Call parent constructor

===============================================================================
ACCESSING PARENT METHOD
===============================================================================

class Animal{

    void sound(){

        System.out.println("Animal Sound");

    }

}

class Dog extends Animal{

    void sound(){

        super.sound();

        System.out.println("Dog Bark");

    }

}

Output

Animal Sound

Dog Bark

===============================================================================
ACCESSING PARENT VARIABLE
===============================================================================

class Animal{

    String name = "Animal";

}

class Dog extends Animal{

    String name = "Dog";

    void print(){

        System.out.println(super.name);

        System.out.println(this.name);

    }

}

Output

Animal

Dog

===============================================================================
CALLING PARENT CONSTRUCTOR
===============================================================================

class Animal{

    Animal(){

        System.out.println("Animal Constructor");

    }

}

class Dog extends Animal{

    Dog(){

        super();

        System.out.println("Dog Constructor");

    }

}

Output

Animal Constructor

Dog Constructor

===============================================================================
CONSTRUCTOR CHAINING
===============================================================================

Creating Dog object

↓

Animal Constructor

↓

Dog Constructor

Parent constructor always executes first.

===============================================================================
METHOD OVERRIDING
===============================================================================

Subclass provides its own implementation of a parent method.

Example

class Animal{

    void sound(){

        System.out.println("Animal");

    }

}

class Dog extends Animal{

    @Override

    void sound(){

        System.out.println("Bark");

    }

}

===============================================================================
OVERRIDING RULES
===============================================================================

✔ Same method name

✔ Same parameters

✔ Same return type (or covariant)

✔ Cannot reduce visibility

✔ Cannot override final methods

✔ Cannot override static methods

===============================================================================
RUNTIME POLYMORPHISM
===============================================================================

Animal animal = new Dog();

animal.sound();

Output

Bark

Decision made

at runtime.

===============================================================================
THE OBJECT CLASS
===============================================================================

Every Java class implicitly extends

Object

Example

class Student{

}

Internally

class Student extends Object{

}

Object provides methods

toString()

equals()

hashCode()

getClass()

clone()

wait()

notify()

===============================================================================
INSTANCEOF OPERATOR
===============================================================================

Checks object type.

Example

Animal animal = new Dog();

System.out.println(animal instanceof Dog);

Output

true

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

Trying to inherit multiple classes.

Compilation Error.

--------------------------------------------

Mistake

Accessing private parent variables directly.

--------------------------------------------

Mistake

Forgetting @Override annotation.

--------------------------------------------

Mistake

Calling subclass constructor before parent.

Impossible.

Parent constructor always executes first.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Prefer inheritance only for IS-A relationships.

✔ Keep inheritance hierarchy shallow.

✔ Use composition when appropriate.

✔ Always use @Override.

✔ Avoid deep inheritance chains.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Person

↓

Employee

↓

Manager

----------------------------------------

Vehicle

↓

Car

↓

ElectricCar

----------------------------------------

Shape

↓

Circle

↓

Sphere

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is inheritance?

Mechanism by which one class acquires the properties and behaviors of another.

--------------------------------------------------------

Q2 Which keyword is used?

extends

--------------------------------------------------------

Q3 Does Java support multiple inheritance?

Not with classes.

Yes, with interfaces.

--------------------------------------------------------

Q4 What is an IS-A relationship?

Relationship represented by inheritance.

--------------------------------------------------------

Q5 What is super?

Reference to the immediate parent class.

--------------------------------------------------------

Q6 Which constructor executes first?

Parent constructor.

--------------------------------------------------------

Q7 Can constructors be inherited?

No.

--------------------------------------------------------

Q8 Can private members be inherited?

They exist in the object but cannot be accessed directly by subclasses.

--------------------------------------------------------

Q9 Which class is the parent of every Java class?

Object

--------------------------------------------------------

Q10 Difference between extends and implements?

extends

Inheritance from a class.

implements

Implements one or more interfaces.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Animal → Dog

2. Person → Employee

3. Vehicle → Car

4. Shape → Circle

5. BankAccount → SavingsAccount

6. Demonstrate constructor chaining.

7. Demonstrate super keyword.

8. Demonstrate method overriding.

9. Print object type using instanceof.

10. Build a multilevel inheritance example.

===============================================================================
QUICK REVISION
===============================================================================

✔ Inheritance = Code Reuse

✔ extends creates inheritance

✔ IS-A relationship

✔ Java supports Single, Multilevel, Hierarchical inheritance

✔ No multiple inheritance using classes

✔ super accesses parent

✔ Parent constructor executes first

✔ Every class extends Object

✔ instanceof checks object type

✔ Overriding enables runtime polymorphism

===============================================================================
NEXT TOPIC
===============================================================================

14_Polymorphism.java

Topics

• What is Polymorphism?
• Compile-Time Polymorphism
• Runtime Polymorphism
• Method Overloading
• Method Overriding
• Dynamic Method Dispatch
• Upcasting & Downcasting
• Covariant Return Types
• final Methods
• Interview Questions

===============================================================================
*/