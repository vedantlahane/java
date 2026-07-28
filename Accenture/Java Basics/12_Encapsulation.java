/*
===============================================================================
                              JAVA ENCAPSULATION
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHAT IS ENCAPSULATION?
===============================================================================

Encapsulation is the process of wrapping

✔ Data (Variables)

AND

✔ Methods (Functions)

into a single unit called a Class.

It also protects data from unauthorized access.

Think of it as

"Data Hiding + Controlled Access"

===============================================================================
REAL WORLD EXAMPLE
===============================================================================

Imagine an ATM Machine.

You can

✔ Withdraw Money

✔ Deposit Money

✔ Check Balance

Can you directly change your bank balance?

balance = 1000000;

NO.

The balance is hidden.

You must use

withdraw()

deposit()

This is Encapsulation.

===============================================================================
ANOTHER ANALOGY
===============================================================================

Car

You press

Accelerator

Brake

Steering

But you cannot directly manipulate

Fuel Injection

Engine Timing

Gearbox Internals

These are hidden.

Java works the same way.

===============================================================================
WHY DO WE NEED ENCAPSULATION?
===============================================================================

Without encapsulation

Anyone can change object data.

Example

student.age = -50;

employee.salary = -1000;

bank.balance = -500000;

Clearly invalid.

Encapsulation prevents this.

===============================================================================
WITHOUT ENCAPSULATION
===============================================================================

class Student{

    public String name;

    public int age;

}

Main

Student s = new Student();

s.age = -100;

Program compiles successfully.

Invalid data enters the object.

===============================================================================
WITH ENCAPSULATION
===============================================================================

class Student{

    private String name;

    private int age;

}

Now

s.age = -100;

Compilation Error

Direct access is blocked.

===============================================================================
PRIVATE ACCESS MODIFIER
===============================================================================

private

Means

Accessible ONLY inside the same class.

Example

class Student{

    private int age;

}

Outside class

student.age

Compilation Error

===============================================================================
HOW DO WE ACCESS PRIVATE DATA?
===============================================================================

Using

Getters

and

Setters

===============================================================================
GETTER METHOD
===============================================================================

Getter returns the value.

Example

public int getAge(){

    return age;

}

Calling

student.getAge();

===============================================================================
SETTER METHOD
===============================================================================

Setter updates the value.

Example

public void setAge(int age){

    this.age = age;

}

Calling

student.setAge(21);

===============================================================================
COMPLETE EXAMPLE
===============================================================================

class Student{

    private String name;

    private int age;

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return name;

    }

    public void setAge(int age){

        this.age = age;

    }

    public int getAge(){

        return age;

    }

}

Main

Student s = new Student();

s.setName("Vedant");

s.setAge(22);

System.out.println(s.getName());

System.out.println(s.getAge());

===============================================================================
WHY USE GETTERS & SETTERS?
===============================================================================

They allow validation.

Example

public void setAge(int age){

    if(age >= 0){

        this.age = age;

    }

}

Now

student.setAge(-50);

Ignored.

Object remains valid.

===============================================================================
VALIDATION EXAMPLE
===============================================================================

class BankAccount{

    private double balance;

    public void deposit(double amount){

        if(amount > 0){

            balance += amount;

        }

    }

}

Invalid deposits are rejected.

===============================================================================
READ-ONLY PROPERTY
===============================================================================

Getter only.

Example

private final String accountNumber;

public String getAccountNumber(){

    return accountNumber;

}

No Setter.

Cannot modify.

===============================================================================
WRITE-ONLY PROPERTY
===============================================================================

Setter only.

Example

private String password;

public void setPassword(String password){

    this.password = password;

}

No Getter.

Useful for sensitive data.

===============================================================================
IMMUTABLE OBJECT
===============================================================================

Object whose state never changes after creation.

Example

final class Employee{

    private final int id;

    private final String name;

    Employee(int id,String name){

        this.id=id;
        this.name=name;

    }

    public int getId(){

        return id;

    }

    public String getName(){

        return name;

    }

}

No setters.

Object cannot change.

String is immutable.

===============================================================================
JAVABEANS CONVENTION
===============================================================================

Field

private String firstName;

Getter

getFirstName()

Setter

setFirstName()

Boolean

private boolean active;

Getter

isActive()

Setter

setActive()

Most Java frameworks expect this convention.

===============================================================================
BENEFITS OF ENCAPSULATION
===============================================================================

✔ Data Hiding

✔ Better Security

✔ Controlled Access

✔ Easier Validation

✔ Easier Maintenance

✔ Flexible Implementation

✔ Better Testing

✔ Supports Frameworks

===============================================================================
ACCESS FLOW
===============================================================================

User

↓

Setter

↓

Validation

↓

Private Variable

↓

Getter

↓

User

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Bank Account

balance is private

Deposit()

Withdraw()

----------------------------------------

Student

marks are private

calculatePercentage()

----------------------------------------

Employee

salary is private

incrementSalary()

===============================================================================
ENCAPSULATION vs ABSTRACTION
===============================================================================

Encapsulation

Focus

Protect Data

Technique

Private Fields

Getter

Setter

----------------------------------------

Abstraction

Focus

Hide Implementation

Technique

Abstract Class

Interface

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

Making all variables public.

----------------------------------------

Mistake

Setter without validation.

----------------------------------------

Mistake

Returning mutable objects directly.

----------------------------------------

Mistake

Creating getters and setters for everything
without considering whether external modification
should actually be allowed.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Keep fields private.

✔ Validate input inside setters.

✔ Expose only required methods.

✔ Prefer immutable objects when possible.

✔ Don't expose internal collections directly.

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is Encapsulation?

Wrapping data and methods into one unit while hiding internal data.

--------------------------------------------------------

Q2 Why are fields private?

To prevent unauthorized modification.

--------------------------------------------------------

Q3 What is Data Hiding?

Restricting direct access to object data.

--------------------------------------------------------

Q4 Difference between Encapsulation and Data Hiding?

Data Hiding

Restricts access.

Encapsulation

Bundles data + methods and usually uses
data hiding as an implementation technique.

--------------------------------------------------------

Q5 Why use Getters and Setters?

To provide controlled access and validation.

--------------------------------------------------------

Q6 Can an immutable object have setters?

No.

--------------------------------------------------------

Q7 Is String immutable?

Yes.

--------------------------------------------------------

Q8 Why do Spring Boot and Hibernate prefer
JavaBeans?

Because frameworks use getters/setters and
reflection to access object properties.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Student class using encapsulation.

2. Bank Account with deposit() and withdraw().

3. Employee salary validation.

4. Product price validation.

5. Read-only Employee ID.

6. Write-only Password.

7. Immutable Book class.

8. ATM simulation.

9. User registration with validation.

10. JavaBean implementation.

===============================================================================
QUICK REVISION
===============================================================================

✔ Encapsulation = Data + Methods

✔ Data Hiding = Restrict Direct Access

✔ private protects data

✔ Getter reads data

✔ Setter updates data

✔ Validate inside setters

✔ Immutable classes have no setters

✔ JavaBeans use get/set naming conventions

✔ Spring Boot heavily relies on encapsulation

===============================================================================
NEXT TOPIC
===============================================================================

13_Inheritance.java

Topics

• What is Inheritance?
• IS-A Relationship
• extends Keyword
• Types of Inheritance
• Method Overriding
• super Keyword
• Constructor Chaining
• Object Class
• instanceof
• Interview Questions

===============================================================================
*/