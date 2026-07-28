/*
===============================================================================
                                JAVA LOOPS
===============================================================================

Author : Vedant
Module : Java Basics

===============================================================================
WHY DO WE NEED LOOPS?
===============================================================================

Imagine you want to print

Hello

100 times.

Without loops

System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
...
100 times

This is repetitive, error-prone, and difficult to maintain.

Loops allow us to execute the same block of code repeatedly.

Write once.

Execute many times.

===============================================================================
WHAT IS A LOOP?
===============================================================================

A loop repeatedly executes a block of code until a condition becomes false.

General Flow

Initialization
      ↓
Check Condition
      ↓
True?
      │
     Yes
      │
Execute Statements
      │
Update Expression
      │
      └──────────────┐
                     │
                  Repeat
                     │
                  Condition False
                     │
                    Exit

===============================================================================
TYPES OF LOOPS IN JAVA
===============================================================================

1. for Loop

2. while Loop

3. do-while Loop

4. Enhanced for Loop (for-each)

===============================================================================
1. FOR LOOP
===============================================================================

The for loop is used when the number of iterations is known.

Syntax

for(initialization; condition; update){

    // statements

}

===============================================================================
FLOW OF FOR LOOP
===============================================================================

Initialization

↓

Condition

↓

True?

↓

Execute Body

↓

Update

↓

Condition Again

↓

False

↓

Exit

===============================================================================
EXAMPLE
===============================================================================

for(int i = 1; i <= 5; i++){

    System.out.println(i);

}

Output

1
2
3
4
5

===============================================================================
STEP-BY-STEP EXECUTION
===============================================================================

Iteration 1

i = 1

Condition

1 <= 5

True

Print 1

Increment

i = 2

--------------------------------

Iteration 2

i = 2

Condition True

Print 2

Increment

i = 3

...

Iteration 6

i = 6

Condition

6 <= 5

False

Loop Stops

===============================================================================
PRINT EVEN NUMBERS
===============================================================================

for(int i=2;i<=20;i+=2){

    System.out.println(i);

}

Output

2
4
6
8
10
12
14
16
18
20

===============================================================================
SUM OF FIRST 100 NUMBERS
===============================================================================

int sum = 0;

for(int i=1;i<=100;i++){

    sum += i;

}

System.out.println(sum);

Output

5050

===============================================================================
FACTORIAL
===============================================================================

int number = 5;

int factorial = 1;

for(int i=1;i<=number;i++){

    factorial *= i;

}

Output

120

===============================================================================
NESTED FOR LOOP
===============================================================================

A loop inside another loop.

Example

for(int i=1;i<=3;i++){

    for(int j=1;j<=3;j++){

        System.out.print("* ");

    }

    System.out.println();

}

Output

* * *
* * *
* * *

===============================================================================
MULTIPLICATION TABLE
===============================================================================

int n = 7;

for(int i=1;i<=10;i++){

    System.out.println(n + " x " + i + " = " + (n*i));

}

===============================================================================
2. WHILE LOOP
===============================================================================

Used when the number of iterations is unknown.

Syntax

while(condition){

    statements;

}

===============================================================================
FLOW
===============================================================================

Condition

↓

True?

↓

Execute

↓

Update

↓

Repeat

===============================================================================
EXAMPLE
===============================================================================

int i = 1;

while(i <= 5){

    System.out.println(i);

    i++;

}

Output

1
2
3
4
5

===============================================================================
WHEN TO USE WHILE?
===============================================================================

Reading a file

Waiting for user input

Game loop

Network connection

Menu-driven programs

===============================================================================
PALINDROME USING WHILE
===============================================================================

int number = 121;

int temp = number;

int reverse = 0;

while(number > 0){

    int digit = number % 10;

    reverse = reverse * 10 + digit;

    number /= 10;

}

System.out.println(temp == reverse);

Output

true

===============================================================================
3. DO-WHILE LOOP
===============================================================================

Executes at least once.

Condition checked AFTER execution.

Syntax

do{

    statements;

}while(condition);

===============================================================================
FLOW
===============================================================================

Execute

↓

Condition

↓

True?

↓

Repeat

===============================================================================
EXAMPLE
===============================================================================

int i = 1;

do{

    System.out.println(i);

    i++;

}while(i<=5);

===============================================================================
WHY DO-WHILE?
===============================================================================

Suppose

User must see the menu at least once.

Even if condition becomes false immediately,

menu should appear once.

Perfect use case for do-while.

===============================================================================
EXAMPLE
===============================================================================

int choice;

do{

    System.out.println("1. Add");
    System.out.println("2. Delete");
    System.out.println("3. Exit");

    choice = scanner.nextInt();

}while(choice != 3);

===============================================================================
FOR vs WHILE vs DO-WHILE
===============================================================================

FOR

Known number of iterations

Initialization included

Condition checked first

----------------------------------------

WHILE

Unknown iterations

Condition checked first

----------------------------------------

DO-WHILE

Runs at least once

Condition checked last

===============================================================================
ENHANCED FOR LOOP (FOR-EACH)
===============================================================================

Introduced for collections and arrays.

Syntax

for(type variable : collection){

    statements;

}

===============================================================================
EXAMPLE
===============================================================================

int[] marks = {85,90,78,92};

for(int mark : marks){

    System.out.println(mark);

}

Output

85
90
78
92

Advantages

Cleaner

Readable

Less error-prone

===============================================================================
INFINITE LOOP
===============================================================================

Example

while(true){

}

OR

for(;;){

}

Never ends unless

break

exception

program termination

===============================================================================
LOOP CONTROL STATEMENTS
===============================================================================

break

Immediately exits loop.

----------------------------------------

continue

Skips current iteration.

===============================================================================
EXAMPLE (break)
===============================================================================

for(int i=1;i<=10;i++){

    if(i==6)

        break;

    System.out.println(i);

}

Output

1
2
3
4
5

===============================================================================
EXAMPLE (continue)
===============================================================================

for(int i=1;i<=5;i++){

    if(i==3)

        continue;

    System.out.println(i);

}

Output

1
2
4
5

===============================================================================
LABELED BREAK
===============================================================================

Useful for nested loops.

Example

outer:

for(int i=1;i<=3;i++){

    for(int j=1;j<=3;j++){

        if(i==2 && j==2)

            break outer;

        System.out.println(i+" "+j);

    }

}

Execution exits BOTH loops.

===============================================================================
LABELED CONTINUE
===============================================================================

outer:

for(int i=1;i<=3;i++){

    for(int j=1;j<=3;j++){

        if(j==2)

            continue outer;

        System.out.println(i+" "+j);

    }

}

Skips directly to next outer iteration.

===============================================================================
COMMON LOOP PATTERNS
===============================================================================

Counting

for(int i=1;i<=100;i++)

----------------------------------------

Reverse Counting

for(int i=100;i>=1;i--)

----------------------------------------

Step Size

for(int i=0;i<=100;i+=5)

----------------------------------------

Traverse Array

for(int i=0;i<arr.length;i++)

===============================================================================
PATTERN PRINTING
===============================================================================

Square

*****
*****
*****
*****
*****

----------------------------------------

Right Triangle

*
**
***
****
*****

----------------------------------------

Reverse Triangle

*****
****
***
**
*

===============================================================================
TIME COMPLEXITY BASICS
===============================================================================

Single Loop

O(n)

----------------------------------------

Nested Loop

O(n²)

----------------------------------------

Triple Nested Loop

O(n³)

Understanding loops helps in algorithm optimization.

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

for(int i=1;i<=5;i--)

Infinite loop.

----------------------------------------

Mistake

Forget increment.

while(i<=5){

}

Infinite loop.

----------------------------------------

Mistake

Modify loop variable incorrectly.

----------------------------------------

Mistake

Off-by-one errors.

Example

i < length

vs

i <= length

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use meaningful loop variables

✔ Keep loop body small

✔ Avoid unnecessary nested loops

✔ Use enhanced for for arrays

✔ Avoid modifying collection during iteration

✔ Always verify termination condition

===============================================================================
REAL-WORLD APPLICATIONS
===============================================================================

✔ Reading CSV files

✔ Processing database records

✔ Image processing

✔ Machine Learning datasets

✔ Game development

✔ Animation

✔ Data analytics

✔ Searching algorithms

✔ Sorting algorithms

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Difference between while and do-while?

while checks condition before execution.

do-while checks after execution.

--------------------------------------------------------

Q2 Which loop guarantees one execution?

do-while

--------------------------------------------------------

Q3 What is an infinite loop?

A loop that never terminates.

--------------------------------------------------------

Q4 Difference between for and enhanced for?

for gives index access.

Enhanced for gives elements directly.

--------------------------------------------------------

Q5 What is labeled break?

Allows exiting multiple nested loops at once.

--------------------------------------------------------

Q6 Time complexity of nested loops?

Generally O(n²)

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Print numbers from 1 to 100.

2. Print even numbers.

3. Print odd numbers.

4. Reverse counting.

5. Multiplication table.

6. Factorial.

7. Fibonacci series.

8. Prime numbers.

9. Armstrong number.

10. Palindrome number.

11. Reverse a number.

12. Sum of digits.

13. Count digits.

14. GCD and LCM.

15. Number guessing game.

16. Star patterns.

17. Number pyramid.

18. Hollow square.

19. Pascal's Triangle.

20. Floyd's Triangle.

===============================================================================
QUICK REVISION
===============================================================================

✔ for → Known iterations

✔ while → Unknown iterations

✔ do-while → Executes at least once

✔ Enhanced for → Arrays & Collections

✔ break → Exit loop

✔ continue → Skip iteration

✔ Labeled break → Exit nested loops

✔ Nested loops → O(n²)

✔ Infinite loop → Never ends

===============================================================================
NEXT TOPIC
===============================================================================

08_Arrays.java

Topics

• What is an Array?
• Array Declaration
• Array Initialization
• Memory Representation
• 1D Arrays
• 2D Arrays
• Jagged Arrays
• Enhanced for Loop
• Arrays Utility Class
• Common Algorithms (Search, Max, Min, Reverse)
• Time Complexity
• Interview Questions

===============================================================================
*/