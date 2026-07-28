/*
===============================================================================
                              JAVA OPERATORS
===============================================================================

Author : Vedant
Module : Java Basics

===============================================================================
WHY DO WE NEED OPERATORS?
===============================================================================

Variables store data.

Operators allow us to perform operations on that data.

Imagine a calculator.

Without operators, it can only display numbers.

With operators, it can

✔ Add

✔ Subtract

✔ Compare

✔ Assign

✔ Make decisions

✔ Perform logical operations

Operators are the building blocks of expressions.

===============================================================================
WHAT IS AN OPERATOR?
===============================================================================

An Operator is a symbol that performs an operation on one or more operands.

Example

int sum = 10 + 20;

Here

10 and 20 → Operands

+ → Operator

Result

30

===============================================================================
TYPES OF OPERATORS
===============================================================================

Java provides several categories of operators.

1. Arithmetic Operators

2. Unary Operators

3. Assignment Operators

4. Relational Operators

5. Logical Operators

6. Bitwise Operators

7. Shift Operators

8. Ternary Operator

9. instanceof Operator

===============================================================================
1. ARITHMETIC OPERATORS
===============================================================================

Used for mathematical calculations.

Operator        Meaning

+               Addition

-               Subtraction

*               Multiplication

/               Division

%               Modulus (Remainder)

===============================================================================
EXAMPLES
===============================================================================

int a = 15;
int b = 4;

System.out.println(a + b);     //19

System.out.println(a - b);     //11

System.out.println(a * b);     //60

System.out.println(a / b);     //3

System.out.println(a % b);     //3

===============================================================================
INTEGER DIVISION
===============================================================================

Many beginners expect

15 / 4

=

3.75

Wrong.

Both operands are integers.

Java removes the decimal part.

Result

3

Correct

double result = 15.0 / 4;

Output

3.75

===============================================================================
MODULUS OPERATOR (%)
===============================================================================

Returns the remainder.

Examples

10 % 3 = 1

20 % 5 = 0

25 % 4 = 1

Useful for

✔ Even/Odd

✔ Cyclic operations

✔ Hashing

Example

if(number % 2 == 0)

System.out.println("Even");

===============================================================================
2. UNARY OPERATORS
===============================================================================

Operate on only one operand.

+

-

++

--

!

===============================================================================
INCREMENT OPERATOR
===============================================================================

Increases value by 1.

int a = 5;

a++;

Now

a = 6

===============================================================================
DECREMENT OPERATOR
===============================================================================

Decreases value by 1.

int a = 10;

a--;

Result

9

===============================================================================
PRE-INCREMENT
===============================================================================

++a

Step 1

Increase value

Step 2

Use value

Example

int a = 5;

int b = ++a;

Execution

a becomes 6

b becomes 6

===============================================================================
POST-INCREMENT
===============================================================================

a++

Step 1

Use value

Step 2

Increase value

Example

int a = 5;

int b = a++;

Execution

b = 5

a = 6

===============================================================================
PRE VS POST
===============================================================================

Example

int a = 5;

System.out.println(++a);

Output

6

--------------------------------------------

Example

int a = 5;

System.out.println(a++);

Output

5

After execution

a = 6

===============================================================================
INTERVIEW QUESTION
===============================================================================

int x = 5;

int y = x++ + ++x;

Step

x = 5

x++

y = 5

x = 6

++x

x = 7

Final

y = 12

x = 7

===============================================================================
NEGATION (!)
===============================================================================

Used with boolean values.

boolean isRainy = true;

System.out.println(!isRainy);

Output

false

===============================================================================
3. ASSIGNMENT OPERATORS
===============================================================================

Used to assign values.

=

+=

-=

*=

/=

%=

===============================================================================
EXAMPLES
===============================================================================

int a = 10;

a += 5;

Equivalent to

a = a + 5;

Result

15

--------------------------------

a -= 3;

Result

12

--------------------------------

a *= 2;

Result

24

--------------------------------

a /= 6;

Result

4

===============================================================================
4. RELATIONAL OPERATORS
===============================================================================

Compare two values.

Result is always

true

or

false

Operator

==

!=

>

<

>=

<=

===============================================================================
EXAMPLE
===============================================================================

int a = 10;

int b = 20;

a > b

false

a < b

true

a == b

false

a != b

true

===============================================================================
COMMON MISTAKE
===============================================================================

Assignment

=

Comparison

==

Wrong

if(a = b)

Correct

if(a == b)

===============================================================================
5. LOGICAL OPERATORS
===============================================================================

Used with boolean expressions.

&&

AND

||

OR

!

NOT

===============================================================================
LOGICAL AND (&&)
===============================================================================

Both conditions must be true.

Example

age >= 18 && citizen == true

Truth Table

T && T → T

T && F → F

F && T → F

F && F → F

===============================================================================
LOGICAL OR (||)
===============================================================================

At least one condition must be true.

Example

marks >= 40 || sportsQuota

Truth Table

T || T → T

T || F → T

F || T → T

F || F → F

===============================================================================
SHORT-CIRCUIT EVALUATION
===============================================================================

Java avoids unnecessary evaluation.

Example

false && anything

Second condition never executes.

Example

if(obj != null && obj.length() > 0)

Java first checks

obj != null

Only then

obj.length()

Prevents

NullPointerException

===============================================================================
NOT OPERATOR
===============================================================================

boolean loggedIn = false;

if(!loggedIn)

System.out.println("Please Login");

===============================================================================
6. BITWISE OPERATORS
===============================================================================

Operate on binary bits.

Operator

&

|

^

~

===============================================================================
BITWISE AND
===============================================================================

12 = 1100

10 = 1010

AND

1000

Answer

8

===============================================================================
BITWISE OR
===============================================================================

12 = 1100

10 = 1010

OR

1110

Answer

14

===============================================================================
BITWISE XOR
===============================================================================

12 = 1100

10 = 1010

XOR

0110

Answer

6

Useful in

✔ Encryption

✔ Swapping

✔ Competitive Programming

===============================================================================
BITWISE NOT
===============================================================================

~

Inverts all bits.

Example

~5

Produces

-6

Uses two's complement representation.

===============================================================================
7. SHIFT OPERATORS
===============================================================================

Left Shift

<<

Right Shift

>>

Unsigned Right Shift

>>>

===============================================================================
LEFT SHIFT
===============================================================================

5 << 1

Binary

0101

↓

1010

Answer

10

Equivalent to

Multiply by 2

===============================================================================
RIGHT SHIFT
===============================================================================

20 >> 2

20

↓

10

↓

5

Result

5

Equivalent to

Divide by powers of 2

===============================================================================
8. TERNARY OPERATOR
===============================================================================

Shortcut for if-else.

Syntax

condition ? value1 : value2;

Example

int age = 20;

String result =
(age >= 18) ? "Adult" : "Minor";

===============================================================================
9. instanceof OPERATOR
===============================================================================

Checks object type.

Example

Object obj = "Java";

System.out.println(obj instanceof String);

Output

true

===============================================================================
OPERATOR PRECEDENCE
===============================================================================

Highest

()

Unary

*, /, %

+, -

<< >>

< > <= >=

== !=

&

^

|

&&

||

?:

=

Lowest

Always use parentheses if expression becomes complex.

===============================================================================
EXAMPLE
===============================================================================

int result = 5 + 2 * 3;

Multiplication first

2 * 3 = 6

5 + 6

Output

11

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

5 / 2

Output

2

Not

2.5

--------------------------------------------

Mistake

Using = instead of ==

--------------------------------------------

Mistake

Confusing ++a and a++

--------------------------------------------

Mistake

Ignoring precedence

Example

2 + 3 * 4

Not

20

Actual

14

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use parentheses

✔ Prefer meaningful expressions

✔ Avoid nested ternary operators

✔ Never overuse ++ inside expressions

✔ Keep logical conditions readable

===============================================================================
REAL-WORLD APPLICATIONS
===============================================================================

Arithmetic

Billing System

Shopping Cart

Tax Calculation

--------------------------------------------

Relational

Login Validation

Eligibility Check

Ranking

--------------------------------------------

Logical

Authentication

Permission Checking

Filtering

--------------------------------------------

Bitwise

Networking

Encryption

Compression

Device Drivers

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Why does 5 / 2 give 2?

Because both operands are integers.

------------------------------------------------------

Q2 Difference between ++a and a++?

++a increments before use.

a++ increments after use.

------------------------------------------------------

Q3 Difference between && and & ?

&& performs short-circuit evaluation.

& evaluates both operands.

------------------------------------------------------

Q4 Difference between || and | ?

|| short-circuits.

| always evaluates both operands.

------------------------------------------------------

Q5 What is modulus operator used for?

Finding remainder.

Checking even/odd.

Hashing.

Cyclic indexing.

------------------------------------------------------

Q6 What is the ternary operator?

A shorthand replacement for simple if-else statements.

------------------------------------------------------

Q7 What does instanceof do?

Checks whether an object belongs to a specific class or interface.

===============================================================================
QUICK REVISION
===============================================================================

✔ Arithmetic → + - * / %

✔ Unary → ++ -- !

✔ Assignment → = += -= *=

✔ Relational → == != > < >= <=

✔ Logical → && || !

✔ Bitwise → & | ^ ~

✔ Shift → << >> >>>

✔ Ternary → condition ? A : B

✔ instanceof checks object type

✔ Use parentheses to improve readability

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Calculator using arithmetic operators.

2. Swap numbers without a temporary variable.

3. Check whether a number is even or odd.

4. Find the largest of two numbers using the ternary operator.

5. Demonstrate pre and post increment.

6. Perform all assignment operator examples.

7. Display binary results of bitwise operators.

8. Implement a simple login validation using logical operators.

9. Check object type using instanceof.

10. Solve operator precedence puzzles.

===============================================================================
NEXT TOPIC
===============================================================================

06_ControlStatements.java

Topics

• if
• if-else
• if-else-if ladder
• Nested if
• switch
• Enhanced switch (Java 14+)
• break
• continue
• return
• Pattern matching
• Best Practices
• Interview Questions

===============================================================================