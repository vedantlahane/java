/*
===============================================================================
                              JAVA DATA TYPES
===============================================================================

Author : Vedant
Module : Java Basics

===============================================================================
WHY DO WE NEED DATA TYPES?
===============================================================================

Computers store everything as binary (0s and 1s).

However, different kinds of data require different amounts of memory.

Example

Age                → Integer

Salary             → Decimal

Grade              → Character

Is Student?        → Boolean

Name               → Text

A data type tells Java:

✔ What kind of data is stored

✔ How much memory should be allocated

✔ What operations are allowed

===============================================================================
WHAT IS A DATA TYPE?
===============================================================================

A Data Type specifies

• Type of value

• Memory size

• Valid range

• Allowed operations

Example

int age = 22;

Here

int

means

Store only integer values.

Memory allocated = 4 Bytes

===============================================================================
CLASSIFICATION OF DATA TYPES
===============================================================================

                    Data Types
                         │
          ┌──────────────┴──────────────┐
          │                             │
          ▼                             ▼
    Primitive                     Non-Primitive
   (Built into Java)              (Reference Types)

Primitive Examples

byte
short
int
long
float
double
char
boolean

Reference Examples

String

Array

Class

Interface

Object

Collection

===============================================================================
PRIMITIVE DATA TYPES
===============================================================================

Java has exactly 8 primitive data types.

+----------+---------+-----------------------------+
| Type     | Size    | Range                       |
+----------+---------+-----------------------------+
| byte     | 1 Byte  | -128 to 127                |
| short    | 2 Bytes | -32,768 to 32,767          |
| int      | 4 Bytes | ±2.1 Billion               |
| long     | 8 Bytes | Very Large Integers        |
| float    | 4 Bytes | Decimal Numbers            |
| double   | 8 Bytes | High Precision Decimal     |
| char     | 2 Bytes | Unicode Character          |
| boolean  | JVM Dep | true / false               |
+----------+---------+-----------------------------+

Remember

There are ONLY eight primitive data types.

===============================================================================
INTEGER DATA TYPES
===============================================================================

1. byte

Memory

1 Byte

Range

-128 to 127

Example

byte age = 25;

Used when memory optimization is important.

--------------------------------------------

2. short

Memory

2 Bytes

Example

short year = 2026;

Rarely used.

--------------------------------------------

3. int

Memory

4 Bytes

Default integer type.

Example

int salary = 50000;

Most commonly used integer type.

--------------------------------------------

4. long

Memory

8 Bytes

Stores very large numbers.

Example

long population = 14567891234L;

Notice

Suffix

L

is required.

===============================================================================
FLOATING POINT DATA TYPES
===============================================================================

float

Memory

4 Bytes

Example

float price = 199.99f;

Suffix

f

is mandatory.

--------------------------------------------

double

Memory

8 Bytes

Default decimal type.

Example

double pi = 3.1415926535;

Most preferred decimal type.

===============================================================================
CHAR DATA TYPE
===============================================================================

char stores

ONE Unicode character.

Memory

2 Bytes

Example

char grade = 'A';

char symbol = '$';

char digit = '7';

Characters use

single quotes.

===============================================================================
UNICODE
===============================================================================

Java uses Unicode instead of ASCII.

Example

char letter = 'A';

Unicode value

65

Example

char hindi = 'अ';

Java supports international languages.

===============================================================================
BOOLEAN DATA TYPE
===============================================================================

Stores only

true

or

false

Example

boolean passed = true;

boolean raining = false;

Cannot store

1

0

Yes

No

===============================================================================
DEFAULT VALUES
===============================================================================

Instance Variables

byte

0

short

0

int

0

long

0L

float

0.0f

double

0.0

char

'\u0000'

boolean

false

Reference Types

null

Local variables

NO DEFAULT VALUE

===============================================================================
REFERENCE DATA TYPES
===============================================================================

Unlike primitive types,

reference variables store

ADDRESS

not actual data.

Example

String city = "Mumbai";

Memory

city

↓

"Mumbai"

===============================================================================
STRING
===============================================================================

String is NOT a primitive data type.

It is a class.

Example

String name = "Vedant";

Notice

Double quotes

are used.

===============================================================================
MEMORY REPRESENTATION
===============================================================================

Primitive

int age = 20;

Memory

+-----------+

| age | 20 |

+-----------+

--------------------------------------------

Reference

String city = "Delhi";

city

↓

"Delhi"

Variable stores address.

===============================================================================
LITERALS
===============================================================================

Literal = Constant value written directly in code.

Examples

100

3.14

'A'

true

"Java"

All of these are literals.

===============================================================================
NUMBER LITERALS
===============================================================================

Decimal

int a = 10;

Binary

int b = 0b1010;

Octal

int c = 012;

Hexadecimal

int d = 0xA;

All represent value

10

===============================================================================
TYPE CASTING
===============================================================================

Sometimes we convert

one data type

into another.

Two types

1. Implicit Casting

2. Explicit Casting

===============================================================================
IMPLICIT CASTING
===============================================================================

Small datatype

↓

Large datatype

Automatically done by Java.

byte

↓

short

↓

int

↓

long

↓

float

↓

double

Example

int number = 100;

double value = number;

No data loss.

===============================================================================
EXPLICIT CASTING
===============================================================================

Large datatype

↓

Small datatype

Must be done manually.

Example

double price = 99.99;

int p = (int) price;

Output

99

Decimal part removed.

===============================================================================
CASTING EXAMPLE
===============================================================================

double salary = 55555.75;

int amount = (int) salary;

System.out.println(amount);

Output

55555

===============================================================================
OVERFLOW
===============================================================================

Every datatype has a limit.

Example

byte number = 127;

number++;

Output

-128

Reason

Overflow.

===============================================================================
UNDERFLOW
===============================================================================

byte number = -128;

number--;

Output

127

This is called

Underflow.

===============================================================================
WRAPPER CLASSES
===============================================================================

Every primitive has a corresponding class.

Primitive      Wrapper

byte           Byte

short          Short

int            Integer

long           Long

float          Float

double         Double

char           Character

boolean        Boolean

===============================================================================
WHY WRAPPER CLASSES?
===============================================================================

Collections store objects,

not primitives.

Example

ArrayList<Integer>

NOT

ArrayList<int>

Wrapper classes also provide utility methods.

Example

Integer.parseInt()

Double.parseDouble()

Character.isDigit()

===============================================================================
AUTOBOXING
===============================================================================

Automatic conversion

Primitive

↓

Wrapper

Example

int age = 25;

Integer obj = age;

Compiler performs conversion automatically.

===============================================================================
UNBOXING
===============================================================================

Wrapper

↓

Primitive

Example

Integer age = 30;

int value = age;

Automatic conversion.

===============================================================================
COMPARISON OF PRIMITIVE VS REFERENCE
===============================================================================

Primitive

Stores actual value

Fast

Fixed size

Cannot call methods

--------------------------------------------

Reference

Stores address

Can call methods

Can be null

Variable size

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

float value = 5.5;

Compilation Error

Correct

float value = 5.5f;

--------------------------------------------

Mistake

long population = 12345678900;

Correct

long population = 12345678900L;

--------------------------------------------

Mistake

char c = "A";

Wrong

Correct

char c = 'A';

--------------------------------------------

Mistake

String name = 'Vedant';

Wrong

Correct

String name = "Vedant";

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use int for integers

✔ Use double for decimals

✔ Use boolean for conditions

✔ Use char for single characters

✔ Use String for text

✔ Avoid unnecessary casting

✔ Prefer wrapper classes only when objects are required

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1. How many primitive data types exist in Java?

Answer

Eight.

------------------------------------------------------------

Q2. Which is the default integer type?

int

------------------------------------------------------------

Q3. Which is the default decimal type?

double

------------------------------------------------------------

Q4. Is String primitive?

No.

It is a class.

------------------------------------------------------------

Q5. Difference between char and String?

char stores one character.

String stores multiple characters.

------------------------------------------------------------

Q6. What is Autoboxing?

Automatic conversion from primitive to wrapper object.

------------------------------------------------------------

Q7. What is Unboxing?

Automatic conversion from wrapper object to primitive.

------------------------------------------------------------

Q8. Difference between Implicit and Explicit Casting?

Implicit

Automatic conversion from smaller to larger type.

Explicit

Manual conversion from larger to smaller type.

===============================================================================
QUICK REVISION
===============================================================================

✔ 8 Primitive Data Types

✔ int = Default Integer

✔ double = Default Decimal

✔ char = Single Character

✔ String = Class

✔ Primitive stores value

✔ Reference stores address

✔ Implicit Casting = Automatic

✔ Explicit Casting = Manual

✔ Wrapper Classes enable object behavior

✔ Overflow wraps around

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Display size and range of all primitive types.

2. Convert Celsius to Fahrenheit using double.

3. Demonstrate implicit casting.

4. Demonstrate explicit casting.

5. Show overflow using byte.

6. Convert int to Integer (Autoboxing).

7. Convert Integer to int (Unboxing).

8. Print Unicode value of a character.

9. Accept character input and print ASCII/Unicode value.

10. Compare primitive vs wrapper objects.

===============================================================================
NEXT TOPIC
===============================================================================

05_Operators.java

Topics

• Arithmetic Operators
• Unary Operators
• Assignment Operators
• Relational Operators
• Logical Operators
• Bitwise Operators
• Shift Operators
• Ternary Operator
• Operator Precedence
• Short-Circuit Evaluation
• Interview Questions

===============================================================================