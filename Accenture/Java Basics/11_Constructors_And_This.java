/*
===============================================================================
                     JAVA CONSTRUCTORS & THIS KEYWORD
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY DO WE NEED CONSTRUCTORS?
===============================================================================

Suppose we create a Student object.

Student s = new Student();

Immediately after creation, the object exists in memory.

Question:

Who initializes

• name

• rollNo

• age

If we don't initialize them,

they receive default values.

name = null

rollNo = 0

age = 0

Usually we want objects to start with meaningful values.

Constructors solve this problem.

===============================================================================
WHAT IS A CONSTRUCTOR?
===============================================================================

A Constructor is a special member of a class that is executed automatically
when an object is created.

Purpose

✔ Initialize objects

✔ Allocate required resources

✔ Prepare object before use

===============================================================================
CHARACTERISTICS
===============================================================================

✔ Same name as class

✔ No return type

✔ Executes automatically

✔ Can be overloaded

✔ Cannot be inherited

✔ Cannot be static

===============================================================================
CONSTRUCTOR SYNTAX
===============================================================================

class Student{

    Student(){

        System.out.println("Object Created");

    }

}

===============================================================================
FIRST EXAMPLE
===============================================================================

class Student{

    Student(){

        System.out.println("Constructor Executed");

    }

}

public class Main{

    public static void main(String[] args){

        Student s = new Student();

    }

}

Output

Constructor Executed

===============================================================================
OBJECT CREATION PROCESS
===============================================================================

Student s = new Student();

↓

Memory allocated in Heap

↓

Constructor executes

↓

Reference returned

↓

Object ready to use

===============================================================================
DEFAULT CONSTRUCTOR
===============================================================================

If no constructor is written,

Java automatically provides one.

Example

class Student{

}

Compiler internally creates

Student(){

}

This is called the Default Constructor.

===============================================================================
IMPORTANT NOTE
===============================================================================

The compiler provides the default constructor

ONLY

if you have not written any constructor.

If you create even one constructor,

the compiler does NOT generate another.

===============================================================================
PARAMETERIZED CONSTRUCTOR
===============================================================================

Allows values to be supplied during object creation.

Example

class Student{

    String name;
    int age;

    Student(String n,int a){

        name = n;
        age = a;

    }

}

Creating Object

Student s =
new Student("Vedant",22);

===============================================================================
MULTIPLE OBJECTS
===============================================================================

Student s1 =
new Student("Vedant",22);

Student s2 =
new Student("Rahul",20);

Student s3 =
new Student("Aman",23);

Each object stores different values.

===============================================================================
CONSTRUCTOR OVERLOADING
===============================================================================

A class can have multiple constructors.

Example

class Student{

    Student(){

    }

    Student(String name){

    }

    Student(String name,int age){

    }

}

Compiler selects constructor based on arguments.

===============================================================================
EXAMPLE
===============================================================================

class Rectangle{

    int length;
    int width;

    Rectangle(){

        length = 1;
        width = 1;

    }

    Rectangle(int l,int w){

        length = l;
        width = w;

    }

}

===============================================================================
THIS KEYWORD
===============================================================================

this refers to the CURRENT OBJECT.

Example

class Student{

    String name;

    Student(String name){

        this.name = name;

    }

}

===============================================================================
WHY THIS IS REQUIRED?
===============================================================================

Without this

class Student{

    String name;

    Student(String name){

        name = name;

    }

}

Both variables are named

name

The parameter hides the instance variable.

Result

Instance variable never changes.

===============================================================================
WITH THIS
===============================================================================

Student(String name){

    this.name = name;

}

Meaning

Current object's

name

=

Parameter

name

===============================================================================
MEMORY VISUALIZATION
===============================================================================

Student s =
new Student("Vedant");

Stack

+-------------------+

| s --------------|-------------

+-------------------+            |

                                 |

                                 ▼

Heap

+-----------------------------+

| Student Object              |

| name = "Vedant"             |

+-----------------------------+

===============================================================================
THIS TO CALL METHODS
===============================================================================

class Student{

    void display(){

        System.out.println("Display");

    }

    void show(){

        this.display();

    }

}

Equivalent to

display();

But improves readability.

===============================================================================
THIS TO CALL CONSTRUCTORS
===============================================================================

Constructor Chaining

class Student{

    Student(){

        this("Unknown");

    }

    Student(String name){

        System.out.println(name);

    }

}

Creating

new Student();

Output

Unknown

===============================================================================
RULES OF this()
===============================================================================

✔ Must be first statement

✔ Calls another constructor

✔ Reduces duplicate code

Wrong

Student(){

    System.out.println("Hello");

    this("Vedant");

}

Compilation Error

===============================================================================
CONSTRUCTOR CHAINING
===============================================================================

Student()

↓

Student(String)

↓

Student(String,int)

Only one constructor actually performs initialization.

Others delegate using

this()

===============================================================================
NO-ARG vs PARAMETERIZED
===============================================================================

No-Argument Constructor

Student()

No parameters.

Useful for frameworks.

----------------------------------------

Parameterized Constructor

Student("Vedant",22)

Initializes object with data.

===============================================================================
COPY CONSTRUCTOR
===============================================================================

Java does NOT provide copy constructors automatically.

We can create one manually.

Example

class Student{

    String name;
    int age;

    Student(Student other){

        this.name = other.name;
        this.age = other.age;

    }

}

===============================================================================
CONSTRUCTOR vs METHOD
===============================================================================

Constructor

Same name as class

No return type

Runs automatically

Creates/initializes object

----------------------------------------

Method

Any valid name

Has return type

Called explicitly

Performs operations

===============================================================================
ORDER OF EXECUTION
===============================================================================

new Student()

↓

Memory Allocation

↓

Field Initialization

↓

Constructor

↓

Object Returned

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

void Student(){

}

This is NOT a constructor.

It's a method.

----------------------------------------

Mistake

Constructor returning value

Student(){

    return;

}

Allowed

But

Student(){

    return 10;

}

Compilation Error

----------------------------------------

Mistake

Calling this() after another statement.

Compilation Error.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Initialize all required fields.

✔ Prefer constructor injection.

✔ Keep constructors simple.

✔ Avoid heavy business logic.

✔ Use constructor chaining.

✔ Use this when variable names conflict.

===============================================================================
REAL-WORLD EXAMPLES
===============================================================================

BankAccount

new BankAccount("Vedant",5000);

----------------------------------------

Employee

new Employee(101,"Rahul","IT");

----------------------------------------

Product

new Product("Laptop",65000);

----------------------------------------

Car

new Car("Tesla","Model Y");

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is a constructor?

A special member used to initialize objects.

--------------------------------------------------------

Q2 Difference between constructor and method?

Constructor initializes objects.

Method performs operations.

--------------------------------------------------------

Q3 Can constructors be overloaded?

Yes.

--------------------------------------------------------

Q4 Can constructors be inherited?

No.

--------------------------------------------------------

Q5 Can constructors be static?

No.

--------------------------------------------------------

Q6 What is constructor chaining?

Calling one constructor from another using this().

--------------------------------------------------------

Q7 What does this keyword represent?

Current object.

--------------------------------------------------------

Q8 Why use this.name = name?

To distinguish instance variables from parameters.

--------------------------------------------------------

Q9 Can constructor return a value?

No.

--------------------------------------------------------

Q10 Does Java provide copy constructors?

No.

We implement them manually.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Student class with default constructor.

2. Student class with parameterized constructor.

3. Employee constructor.

4. BankAccount constructor.

5. Constructor overloading.

6. Rectangle area calculator.

7. Book management.

8. Car information.

9. Constructor chaining.

10. Copy constructor.

===============================================================================
QUICK REVISION
===============================================================================

✔ Constructor initializes objects

✔ Same name as class

✔ No return type

✔ Runs automatically

✔ Can be overloaded

✔ this = Current Object

✔ this() = Constructor Chaining

✔ Compiler provides default constructor only when none is defined

✔ Constructors cannot be inherited

✔ Constructors cannot be static

===============================================================================
NEXT TOPIC
===============================================================================

12_Encapsulation.java

Topics

• What is Encapsulation?
• Data Hiding
• Getters and Setters
• Access Modifiers
• Immutable Objects
• JavaBeans Convention
• Validation
• Defensive Programming
• Best Practices
• Interview Questions

===============================================================================
*/