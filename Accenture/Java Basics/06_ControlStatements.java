/*
===============================================================================
                         JAVA CONTROL STATEMENTS
===============================================================================

Author : Vedant
Module : Java Basics

===============================================================================
WHY DO WE NEED CONTROL STATEMENTS?
===============================================================================

Imagine an ATM machine.

If the PIN is correct,
    Allow withdrawal.
Else
    Show "Invalid PIN".

Or imagine a login page.

If username and password are correct,
    Login.

Otherwise,
    Show an error.

Without control statements,
every line of code would execute sequentially.

Real-world applications require decision making.

Java provides Control Statements for this purpose.

===============================================================================
WHAT ARE CONTROL STATEMENTS?
===============================================================================

Control Statements determine the flow of execution of a program.

Instead of executing every statement one after another,

Java can

✔ Make decisions

✔ Repeat tasks

✔ Skip statements

✔ Stop execution

===============================================================================
CLASSIFICATION
===============================================================================

                    Control Statements
                           │
        ┌──────────────────┴─────────────────┐
        │                                    │
        ▼                                    ▼
 Decision Making                     Looping Statements

 if                                 for

 if-else                            while

 if-else-if                         do-while

 switch

===============================================================================
DECISION MAKING
===============================================================================

Decision statements execute code based on conditions.

Condition evaluates to

true

or

false

===============================================================================
1. if STATEMENT
===============================================================================

Syntax

if(condition){

    statements;

}

If the condition is true,

statements execute.

Otherwise,

they are skipped.

===============================================================================
EXAMPLE
===============================================================================

int age = 20;

if(age >= 18){

    System.out.println("Eligible to Vote");

}

Output

Eligible to Vote

===============================================================================
EXECUTION FLOW
===============================================================================

           age >= 18 ?

             │

      ┌──────┴──────┐

     Yes           No

      │             │

Print Message    Skip

===============================================================================
2. if-else
===============================================================================

Used when exactly one of two choices should execute.

Syntax

if(condition){

    statements;

}

else{

    statements;

}

===============================================================================
EXAMPLE
===============================================================================

int marks = 35;

if(marks >= 40){

    System.out.println("Pass");

}

else{

    System.out.println("Fail");

}

Output

Fail

===============================================================================
3. if-else-if LADDER
===============================================================================

Used when multiple conditions exist.

Syntax

if(condition1){

}

else if(condition2){

}

else if(condition3){

}

else{

}

===============================================================================
EXAMPLE
===============================================================================

int marks = 86;

if(marks >= 90){

    System.out.println("Grade A");

}

else if(marks >= 80){

    System.out.println("Grade B");

}

else if(marks >= 70){

    System.out.println("Grade C");

}

else{

    System.out.println("Grade D");

}

Output

Grade B

===============================================================================
EXECUTION FLOW
===============================================================================

          marks >=90 ?

             │

       Yes──►A

             │

             No

             │

       marks >=80 ?

             │

       Yes──►B

             │

             No

             │

       marks >=70 ?

             │

       Yes──►C

             │

             No

             │

             D

===============================================================================
4. NESTED if
===============================================================================

An if inside another if.

Useful when one condition depends on another.

Example

int age = 22;

boolean citizen = true;

if(age >= 18){

    if(citizen){

        System.out.println("Eligible");

    }

}

===============================================================================
REAL WORLD EXAMPLE
===============================================================================

Bank ATM

If Card Valid

↓

If PIN Correct

↓

If Balance Available

↓

Withdraw Money

===============================================================================
COMMON MISTAKE
===============================================================================

Wrong

if(age >18);

{

    System.out.println("Eligible");

}

Notice the semicolon.

The condition ends immediately.

The block always executes.

Correct

if(age >18){

    System.out.println("Eligible");

}

===============================================================================
SWITCH STATEMENT
===============================================================================

switch selects one block among many choices.

Better than long if-else chains when comparing fixed values.

===============================================================================
SYNTAX
===============================================================================

switch(expression){

    case value1:

        statements;

        break;

    case value2:

        statements;

        break;

    default:

        statements;

}

===============================================================================
EXAMPLE
===============================================================================

int day = 3;

switch(day){

case 1:

    System.out.println("Monday");

    break;

case 2:

    System.out.println("Tuesday");

    break;

case 3:

    System.out.println("Wednesday");

    break;

default:

    System.out.println("Invalid");

}

Output

Wednesday

===============================================================================
WHY break?
===============================================================================

Without break,

execution continues into the next case.

This is called

Fall Through

Example

case 1:

    System.out.println("One");

case 2:

    System.out.println("Two");

Output

One

Two

===============================================================================
DEFAULT CASE
===============================================================================

Executed when no case matches.

Example

switch(choice){

default:

System.out.println("Invalid Choice");

}

===============================================================================
ENHANCED SWITCH (JAVA 14+)
===============================================================================

Modern Java introduced switch expressions.

Example

int day = 2;

String name = switch(day){

    case 1 -> "Monday";

    case 2 -> "Tuesday";

    case 3 -> "Wednesday";

    default -> "Invalid";

};

System.out.println(name);

Advantages

✔ Cleaner

✔ No break

✔ Less error-prone

===============================================================================
WHEN TO USE if OR switch?
===============================================================================

Use if

✔ Range checking

✔ Multiple logical conditions

✔ Complex expressions

Example

marks >= 40

salary > 50000

age >=18 && citizen

----------------------------------------

Use switch

✔ Fixed values

✔ Menus

✔ Days

✔ Months

✔ Commands

===============================================================================
break STATEMENT
===============================================================================

Immediately exits

Loop

or

Switch

Example

for(int i=1;i<=10;i++){

    if(i==5)

        break;

    System.out.println(i);

}

Output

1

2

3

4

===============================================================================
continue STATEMENT
===============================================================================

Skips current iteration.

Moves to next iteration.

Example

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
return STATEMENT
===============================================================================

Ends the current method immediately.

Example

public static void printAge(int age){

    if(age<0)

        return;

    System.out.println(age);

}

===============================================================================
TERNARY VS if
===============================================================================

Simple

if(age>=18)

status="Adult";

else

status="Minor";

Equivalent

status=(age>=18)?"Adult":"Minor";

Use ternary only for simple conditions.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Always use braces {}

✔ Keep nesting shallow

✔ Prefer switch for fixed values

✔ Use enhanced switch in Java 14+

✔ Avoid deeply nested if statements

✔ Write readable conditions

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Missing break

❌ Semicolon after if

❌ Confusing = with ==

❌ Forgetting default case

❌ Excessive nesting

===============================================================================
REAL-WORLD APPLICATIONS
===============================================================================

if

Login Authentication

---------------------------------------

if-else-if

Student Grading

---------------------------------------

switch

Restaurant Menu

ATM Menu

Game Levels

Calculator Menu

---------------------------------------

break

Search Algorithms

---------------------------------------

continue

Filtering Data

Skipping Invalid Records

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1. Difference between if and switch?

if evaluates boolean conditions and ranges.

switch compares fixed values.

------------------------------------------------------------

Q2. What is Fall Through?

Execution of consecutive switch cases when break is omitted.

------------------------------------------------------------

Q3. Why use break?

To terminate a loop or switch immediately.

------------------------------------------------------------

Q4. Difference between break and continue?

break exits the loop.

continue skips the current iteration.

------------------------------------------------------------

Q5. What is the purpose of default?

Executes when no case matches.

------------------------------------------------------------

Q6. Can switch work with String?

Yes.

Supported since Java 7.

------------------------------------------------------------

Q7. What are switch expressions?

Modern switch syntax introduced in Java 14 that returns values using `->`.

===============================================================================
QUICK REVISION
===============================================================================

✔ if → Single condition

✔ if-else → Two choices

✔ if-else-if → Multiple choices

✔ Nested if → Dependent conditions

✔ switch → Fixed values

✔ break → Exit immediately

✔ continue → Skip current iteration

✔ return → Exit method

✔ Enhanced switch → Java 14+

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Check whether a number is positive, negative, or zero.

2. Find the largest of three numbers.

3. Check leap year.

4. Grade calculator using if-else-if.

5. ATM menu using switch.

6. Calculator using switch.

7. Electricity bill calculator.

8. Income tax calculator.

9. Voting eligibility checker.

10. Login authentication system.

===============================================================================
NEXT TOPIC
===============================================================================

07_Loops.java

Topics

• for loop
• while loop
• do-while loop
• Enhanced for loop
• Nested loops
• Infinite loops
• Loop control
• Pattern printing
• Time complexity basics
• Interview Questions

===============================================================================
*/