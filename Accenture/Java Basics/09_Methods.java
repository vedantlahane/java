/*
===============================================================================
                               JAVA METHODS
===============================================================================

Author : Vedant
Module : Java Basics

===============================================================================
WHY DO WE NEED METHODS?
===============================================================================

Imagine writing a Banking System.

You need to

• Deposit Money

• Withdraw Money

• Check Balance

Without methods

All code would be written inside main().

Result

❌ Thousands of lines

❌ Difficult to debug

❌ Difficult to reuse

Instead

deposit();

withdraw();

checkBalance();

Each task becomes independent.

This follows

"Divide and Conquer"

===============================================================================
WHAT IS A METHOD?
===============================================================================

A Method is a reusable block of code that performs a specific task.

It executes only when called.

Example

public static void greet(){

    System.out.println("Welcome");

}

===============================================================================
ADVANTAGES OF METHODS
===============================================================================

✔ Code Reusability

✔ Easy Maintenance

✔ Modular Programming

✔ Better Readability

✔ Easier Testing

✔ Reduced Duplication

===============================================================================
METHOD SYNTAX
===============================================================================

accessModifier returnType methodName(parameters){

    // Method Body

}

Example

public static int add(int a, int b){

    return a + b;

}

===============================================================================
PARTS OF A METHOD
===============================================================================

public

↓

Access Modifier

------------------------------------

static

↓

Belongs to Class

------------------------------------

int

↓

Return Type

------------------------------------

add

↓

Method Name

------------------------------------

(int a,int b)

↓

Parameters

------------------------------------

{

}

↓

Method Body

===============================================================================
METHOD DECLARATION
===============================================================================

Only defines the method.

Example

public static void display(){

    System.out.println("Hello");

}

Method is stored in memory.

It does NOT execute automatically.

===============================================================================
METHOD CALL
===============================================================================

display();

Execution jumps to the method.

After completion,

control returns to caller.

===============================================================================
EXECUTION FLOW
===============================================================================

main()

↓

display()

↓

Execute Statements

↓

Return

↓

main()

===============================================================================
EXAMPLE
===============================================================================

public class Demo{

    public static void greet(){

        System.out.println("Good Morning");

    }

    public static void main(String[] args){

        greet();

    }

}

Output

Good Morning

===============================================================================
PARAMETERS
===============================================================================

Parameters are variables declared inside the method definition.

Example

public static void printSquare(int number){

    System.out.println(number * number);

}

Here

number

is a parameter.

===============================================================================
ARGUMENTS
===============================================================================

Arguments are actual values supplied during method call.

printSquare(10);

Parameter

number

Argument

10

===============================================================================
PARAMETER vs ARGUMENT
===============================================================================

Parameter

Declared inside method

Placeholder

--------------------------------------------

Argument

Passed during method call

Actual Value

===============================================================================
RETURN TYPE
===============================================================================

A method may

Return a value

OR

Return nothing

===============================================================================
VOID METHOD
===============================================================================

Returns nothing.

Example

public static void welcome(){

    System.out.println("Welcome");

}

===============================================================================
METHOD RETURNING VALUE
===============================================================================

public static int square(int number){

    return number * number;

}

Calling

int result = square(5);

Output

25

===============================================================================
MULTIPLE PARAMETERS
===============================================================================

public static int add(int a,int b){

    return a+b;

}

Calling

add(10,20);

Output

30

===============================================================================
LOCAL VARIABLES
===============================================================================

Variables declared inside methods.

Example

public static void demo(){

    int x = 10;

}

Destroyed after method execution.

===============================================================================
METHOD OVERLOADING
===============================================================================

Same method name

Different parameters

Example

add(int,int)

add(double,double)

add(int,int,int)

Compiler selects the correct method.

===============================================================================
EXAMPLE
===============================================================================

public static int add(int a,int b){

    return a+b;

}

public static double add(double a,double b){

    return a+b;

}

===============================================================================
CAN WE OVERLOAD BY RETURN TYPE?
===============================================================================

No.

Example

int test()

double test()

Compilation Error

Reason

Method signature remains the same.

===============================================================================
JAVA IS PASS BY VALUE
===============================================================================

One of the most common interview questions.

Java ALWAYS passes copies of values.

Example

public static void change(int x){

    x = 100;

}

public static void main(String[] args){

    int a = 10;

    change(a);

    System.out.println(a);

}

Output

10

Reason

Only a copy of a is modified.

===============================================================================
PASSING OBJECTS
===============================================================================

Even objects are passed by value.

The copied value is the object's reference.

Example

Student s = new Student();

modify(s);

The reference is copied.

Both references point to the same object.

===============================================================================
RECURSION
===============================================================================

A method calling itself.

Example

public static void countdown(int n){

    if(n==0)

        return;

    System.out.println(n);

    countdown(n-1);

}

Output

5

4

3

2

1

===============================================================================
RECURSION EXECUTION
===============================================================================

countdown(3)

↓

countdown(2)

↓

countdown(1)

↓

countdown(0)

↓

Return

↓

Return

↓

Return

===============================================================================
BASE CASE
===============================================================================

Every recursive method must have a stopping condition.

Without it

StackOverflowError

occurs.

===============================================================================
FACTORIAL USING RECURSION
===============================================================================

public static int factorial(int n){

    if(n==1)

        return 1;

    return n * factorial(n-1);

}

factorial(5)

↓

5 × factorial(4)

↓

5 × 4 × factorial(3)

↓

...

↓

120

===============================================================================
VARARGS (VARIABLE ARGUMENTS)
===============================================================================

Java allows passing variable number of arguments.

Syntax

datatype... variable

Example

public static int sum(int... numbers){

    int total = 0;

    for(int n : numbers)

        total += n;

    return total;

}

Calling

sum(10,20);

sum(10,20,30);

sum(5);

===============================================================================
STATIC METHODS
===============================================================================

Belong to class.

Can be called without creating objects.

Example

Math.sqrt(25);

Integer.parseInt("100");

===============================================================================
INSTANCE METHODS
===============================================================================

Belong to objects.

Require object creation.

Example

Student s = new Student();

s.display();

===============================================================================
STATIC vs INSTANCE METHODS
===============================================================================

Static

Belongs to Class

Shared

No Object Required

----------------------------------------

Instance

Belongs to Object

Separate Copy

Object Required

===============================================================================
METHOD CALL STACK
===============================================================================

main()

↓

calculate()

↓

display()

↓

return

↓

calculate()

↓

return

↓

main()

Each method gets its own stack frame.

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Forgetting return statement.

--------------------------------------------

❌ Returning wrong data type.

--------------------------------------------

❌ Infinite recursion.

--------------------------------------------

❌ Calling instance methods without object.

--------------------------------------------

❌ Overloading only by return type.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Keep methods small.

✔ One method = One responsibility.

✔ Use meaningful names.

✔ Avoid long parameter lists.

✔ Prefer returning values instead of printing.

✔ Reuse methods instead of duplicating code.

===============================================================================
REAL-WORLD APPLICATIONS
===============================================================================

✔ Login Validation

✔ Payment Processing

✔ Database Access

✔ Email Sending

✔ API Calls

✔ File Processing

✔ Data Analysis

✔ Machine Learning Pipelines

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is a method?

A reusable block of code that performs a specific task.

------------------------------------------------------------

Q2 Difference between parameter and argument?

Parameter → Variable in method declaration.

Argument → Actual value passed.

------------------------------------------------------------

Q3 Can methods return multiple values?

Not directly.

Use arrays, objects, records, or collections.

------------------------------------------------------------

Q4 Can main() be overloaded?

Yes.

Only

public static void main(String[] args)

acts as the JVM entry point.

------------------------------------------------------------

Q5 Is Java Pass by Reference?

No.

Java is always Pass by Value.

------------------------------------------------------------

Q6 Difference between static and instance methods?

Static belongs to class.

Instance belongs to objects.

------------------------------------------------------------

Q7 What happens without a base case in recursion?

StackOverflowError

------------------------------------------------------------

Q8 What is Method Overloading?

Multiple methods with the same name but different parameter lists.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Add two numbers using a method.

2. Find factorial using recursion.

3. Check prime number.

4. Reverse a number.

5. Find GCD.

6. Find LCM.

7. Swap two numbers.

8. Fibonacci using recursion.

9. Find maximum of three numbers.

10. Calculator using methods.

11. Student grade calculator.

12. Method overloading examples.

13. Area of different shapes using overloading.

14. Demonstrate varargs.

15. Sum of array using method.

===============================================================================
QUICK REVISION
===============================================================================

✔ Method = Reusable Code

✔ Parameters = Placeholders

✔ Arguments = Actual Values

✔ void = No Return

✔ return = Sends Value Back

✔ Java = Pass by Value

✔ Recursion = Method Calls Itself

✔ Base Case Prevents Infinite Recursion

✔ Static Methods Belong to Class

✔ Instance Methods Belong to Objects

✔ Varargs Accept Variable Arguments

===============================================================================
NEXT TOPIC
===============================================================================

10_OOP_ClassesAndObjects.java

Topics

• What is OOP?
• Procedural vs Object-Oriented Programming
• Classes
• Objects
• Object Creation
• Constructors
• this Keyword
• Object Lifecycle
• Heap vs Stack Memory
• Memory Diagrams
• Real-world Modeling
• Interview Questions

===============================================================================
*/