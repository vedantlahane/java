/*
===============================================================================
                      IDENTIFIERS & VARIABLES IN JAVA
===============================================================================

Author : Vedant
Module : Java Basics

===============================================================================
WHY VARIABLES EXIST
===============================================================================

Imagine writing a program to calculate a student's percentage.

Without variables:

95
87
91

These numbers have no meaning.

Instead, we store them with meaningful names.

int physicsMarks = 95;
int chemistryMarks = 87;
int mathsMarks = 91;

Now the program becomes readable.

Variables are simply named memory locations.

===============================================================================
WHAT IS AN IDENTIFIER?
===============================================================================

Identifier = Name given to

• Variable
• Class
• Method
• Package
• Interface
• Enum

Examples

studentAge

Employee

calculateSalary()

BankAccount

Vehicle

Every identifier follows Java naming rules.

===============================================================================
IDENTIFIER RULES
===============================================================================

Rule 1

Must begin with

✔ Alphabet

✔ _ (underscore)

✔ $

Examples

student

_employee

$salary

------------------------------------------------------

Rule 2

Cannot begin with numbers

❌ 123marks

❌ 9student

✔ student9

------------------------------------------------------

Rule 3

Cannot contain spaces

❌ first name

✔ firstName

------------------------------------------------------

Rule 4

Cannot use Java keywords

❌ int class;

❌ int while;

❌ int public;

------------------------------------------------------

Rule 5

Case Sensitive

employee

Employee

EMPLOYEE

are three different identifiers.

===============================================================================
GOOD vs BAD IDENTIFIERS
===============================================================================

GOOD

studentAge

employeeSalary

totalMarks

isEligible

bankBalance

BAD

a

x

temp1

abc

xyz123

Use meaningful names.

Code is read far more often than it is written.

===============================================================================
VARIABLE
===============================================================================

Variable = Named memory location used to store data.

Syntax

datatype variableName;

Example

int age;

Here

int -> datatype

age -> variable

===============================================================================
DECLARATION
===============================================================================

Declaring means reserving memory.

Example

int age;

double salary;

boolean passed;

char grade;

String name;

Memory is reserved.

No value assigned yet.

===============================================================================
INITIALIZATION
===============================================================================

Initialization means assigning the first value.

Example

int age = 20;

double salary = 75000;

char grade = 'A';

boolean passed = true;

String city = "Mumbai";

===============================================================================
DECLARATION + INITIALIZATION
===============================================================================

Separate

int age;

age = 21;

Combined

int age = 21;

Both are valid.

===============================================================================
ASSIGNMENT
===============================================================================

After initialization,

variables can receive new values.

Example

int count = 10;

count = 15;

count = 20;

Latest value

20

===============================================================================
VARIABLE CREATION PROCESS
===============================================================================

Step 1

Declaration

↓

Step 2

Initialization

↓

Step 3

Usage

↓

Step 4

Modification

===============================================================================
MEMORY REPRESENTATION
===============================================================================

int age = 22;

Memory

+-----------------+

| age | 22 |

+-----------------+

String city = "Delhi";

Memory

city

↓

"Delhi"

===============================================================================
MULTIPLE DECLARATIONS
===============================================================================

int x = 10;

int y = 20;

int z = 30;

OR

int x = 10,
    y = 20,
    z = 30;

Recommended

Declare one variable per line.

Improves readability.

===============================================================================
VARIABLE NAMING CONVENTIONS
===============================================================================

Use camelCase.

Examples

studentAge

employeeSalary

bankBalance

firstName

dateOfBirth

Never

StudentAge

student_age

student-age

===============================================================================
CONSTANTS
===============================================================================

Sometimes values should never change.

Example

PI

GST

MAX_SPEED

Use

final

Example

final double PI = 3.14159265359;

PI = 10;

❌ Compilation Error

===============================================================================
CONSTANT NAMING CONVENTION
===============================================================================

Use UPPER_CASE.

Examples

MAX_SIZE

MIN_VALUE

PI

GST_RATE

DEFAULT_PORT

===============================================================================
TYPE INFERENCE (JAVA 10+)
===============================================================================

Java introduced

var

Example

var age = 22;

Compiler automatically understands

int

Example

var name = "Vedant";

Compiler detects

String

Example

var salary = 55000.50;

Compiler detects

double

Rules

✔ Must initialize immediately

✔ Only for local variables

❌ Cannot be null

===============================================================================
VARIABLE SCOPE
===============================================================================

Variables are visible only inside their scope.

Example

public class Demo {

    public static void main(String[] args) {

        int age = 20;

        System.out.println(age);

    }

}

Valid

Outside main()

age

does not exist.

===============================================================================
LOCAL VARIABLES
===============================================================================

Created inside methods.

Destroyed after method execution.

Example

public void calculate() {

    int marks = 90;

}

marks disappears after calculate() finishes.

===============================================================================
INSTANCE VARIABLES
===============================================================================

Belong to objects.

Example

class Student {

    String name;

    int age;

}

Every Student object gets its own copy.

===============================================================================
STATIC VARIABLES
===============================================================================

Belong to class.

Only one copy exists.

Example

class Student {

    static String college = "LPU";

}

All Student objects share the same college variable.

===============================================================================
LOCAL vs INSTANCE vs STATIC
===============================================================================

Local

Owner

Method

Copies

Every method call

Lifetime

Method execution

--------------------------------------------

Instance

Owner

Object

Copies

One per object

Lifetime

Until object destroyed

--------------------------------------------

Static

Owner

Class

Copies

Only one

Lifetime

Until JVM exits

===============================================================================
DEFAULT VALUES
===============================================================================

Instance Variables

int

0

double

0.0

boolean

false

char

'\u0000'

String

null

--------------------------------------------

Local Variables

NO DEFAULT VALUE

Must initialize manually.

Example

int age;

System.out.println(age);

❌ Compilation Error

===============================================================================
SWAPPING VARIABLES
===============================================================================

int a = 10;

int b = 20;

Using temporary variable

int temp = a;

a = b;

b = temp;

Result

a = 20

b = 10

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake 1

int age;

System.out.println(age);

❌ Local variable not initialized.

--------------------------------------------

Mistake 2

int student age;

❌ Space not allowed.

--------------------------------------------

Mistake 3

int class;

❌ Keyword.

--------------------------------------------

Mistake 4

int 2marks;

❌ Cannot begin with number.

--------------------------------------------

Mistake 5

String Name;

Allowed

But violates naming convention.

Use

name

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use meaningful names

✔ Keep scope small

✔ Initialize immediately

✔ Use final whenever possible

✔ Avoid single-letter variables

✔ Follow camelCase

✔ Keep variables close to where they are used

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1. What is an identifier?

Name given to program elements like variables, methods, classes, etc.

------------------------------------------------------------

Q2. Difference between declaration and initialization?

Declaration creates a variable.

Initialization gives it the first value.

------------------------------------------------------------

Q3. Can a local variable have a default value?

No.

------------------------------------------------------------

Q4. Can variable names start with numbers?

No.

------------------------------------------------------------

Q5. Difference between instance and static variables?

Instance → One copy per object.

Static → One copy shared by all objects.

------------------------------------------------------------

Q6. What is final?

Makes a variable constant after initialization.

------------------------------------------------------------

Q7. What is var?

Type inference introduced in Java 10 for local variables.

===============================================================================
QUICK REVISION
===============================================================================

✔ Identifier = Name

✔ Variable = Memory Location

✔ Declaration = Create

✔ Initialization = First Value

✔ Assignment = Change Value

✔ camelCase for variables

✔ UPPER_CASE for constants

✔ final creates constants

✔ Local variables have NO default values

✔ Static variables belong to class

✔ Instance variables belong to objects

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Store your personal information in variables.

2. Swap two numbers.

3. Calculate area of rectangle.

4. Convert Celsius to Fahrenheit.

5. Calculate simple interest.

6. Calculate percentage of five subjects.

7. Find average of three numbers.

8. Convert minutes into hours.

9. Calculate BMI.

10. Calculate total shopping bill with GST.

===============================================================================
NEXT TOPIC
===============================================================================

04_DataTypes.java

Topics

• Primitive Data Types
• Non-Primitive Data Types
• Memory Representation
• Type Casting
• Wrapper Classes
• Autoboxing
• Unboxing
• Overflow
• Literals
• Interview Questions

===============================================================================