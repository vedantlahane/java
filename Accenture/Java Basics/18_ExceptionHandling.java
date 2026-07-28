/*
===============================================================================
                         JAVA EXCEPTION HANDLING
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY DO WE NEED EXCEPTION HANDLING?
===============================================================================

Imagine a Banking Application.

User tries to

Withdraw Money

↓

Database connection fails.

Without Exception Handling

↓

Application crashes.

--------------------------------------------

With Exception Handling

↓

Show

"Unable to process your request.
Please try again later."

↓

Program continues.

This improves reliability.

===============================================================================
WHAT IS AN EXCEPTION?
===============================================================================

An Exception is an event that occurs during program execution
which disrupts the normal flow of the program.

Example

int a = 10;

int b = 0;

System.out.println(a / b);

Output

ArithmeticException

Program terminates immediately.

===============================================================================
REAL WORLD ANALOGY
===============================================================================

Driving a Car

Normal Flow

↓

Road Block

↓

Take Alternate Route

Exception Handling works similarly.

===============================================================================
ERROR vs EXCEPTION
===============================================================================

Error

Serious problem.

Usually cannot be recovered.

Examples

OutOfMemoryError

StackOverflowError

VirtualMachineError

--------------------------------------------

Exception

Recoverable problem.

Examples

IOException

SQLException

NullPointerException

===============================================================================
EXCEPTION HIERARCHY
===============================================================================

                Object

                   │

             Throwable

             /       \

         Error     Exception

                      │

          ---------------------

          │                   │

 Checked Exceptions   RuntimeException

                            │

                Unchecked Exceptions

===============================================================================
THROWABLE
===============================================================================

Root class of all errors and exceptions.

Provides

getMessage()

printStackTrace()

getCause()

===============================================================================
ERROR
===============================================================================

Errors indicate JVM problems.

Examples

StackOverflowError

OutOfMemoryError

NoClassDefFoundError

Usually,

you should NOT catch Errors.

===============================================================================
EXCEPTION
===============================================================================

Represents recoverable conditions.

Can be handled using

try

catch

finally

===============================================================================
CHECKED EXCEPTIONS
===============================================================================

Checked at compile time.

Must be handled or declared.

Examples

IOException

SQLException

ClassNotFoundException

InterruptedException

===============================================================================
UNCHECKED EXCEPTIONS
===============================================================================

Occur at runtime.

Compiler does NOT force handling.

Examples

ArithmeticException

NullPointerException

ArrayIndexOutOfBoundsException

IllegalArgumentException

===============================================================================
CHECKED vs UNCHECKED
===============================================================================

Checked

Compile Time

Must Handle

Recoverable

--------------------------------------------

Unchecked

Runtime

Optional Handling

Programming Errors

===============================================================================
COMMON RUNTIME EXCEPTIONS
===============================================================================

ArithmeticException

NullPointerException

NumberFormatException

ClassCastException

IndexOutOfBoundsException

IllegalArgumentException

IllegalStateException

===============================================================================
TRY BLOCK
===============================================================================

Code that may throw an exception
is placed inside try.

Syntax

try{

    // risky code

}

===============================================================================
CATCH BLOCK
===============================================================================

Handles exceptions.

Syntax

catch(Exception e){

}

===============================================================================
FIRST EXAMPLE
===============================================================================

try{

    int result = 10 / 0;

}

catch(ArithmeticException e){

    System.out.println("Cannot divide by zero");

}

Output

Cannot divide by zero

===============================================================================
FLOW OF EXECUTION
===============================================================================

try

↓

Exception?

↓

No

↓

Continue

--------------------------------------------

Yes

↓

Matching Catch

↓

Handle Exception

↓

Continue Program

===============================================================================
MULTIPLE CATCH BLOCKS
===============================================================================

try{

}

catch(IOException e){

}

catch(SQLException e){

}

catch(Exception e){

}

Always place

Specific Exceptions

before

General Exceptions.

===============================================================================
WRONG ORDER
===============================================================================

catch(Exception e){

}

catch(IOException e){

}

Compilation Error.

===============================================================================
MULTI-CATCH (JAVA 7)
===============================================================================

catch(IOException | SQLException e){

}

Useful when handling logic is identical.

===============================================================================
FINALLY BLOCK
===============================================================================

Executes

Whether exception occurs or not.

Used for cleanup.

Syntax

finally{

}

===============================================================================
EXAMPLE
===============================================================================

try{

    System.out.println("Try");

}

finally{

    System.out.println("Finally");

}

Output

Try

Finally

===============================================================================
WHEN IS FINALLY USED?
===============================================================================

Closing

Files

Sockets

Database Connections

Network Streams

Resources

===============================================================================
RETURN INSIDE TRY
===============================================================================

try{

    return;

}

finally{

    System.out.println("Runs First");

}

finally executes

before

method actually returns.

===============================================================================
THROW KEYWORD
===============================================================================

Used to manually create exceptions.

Example

if(age < 18){

    throw new IllegalArgumentException(

        "Age must be at least 18"

    );

}

===============================================================================
THROWS KEYWORD
===============================================================================

Declares that a method
may throw exceptions.

Example

public void readFile()

throws IOException{

}

Responsibility moves to caller.

===============================================================================
THROW vs THROWS
===============================================================================

throw

Actually throws an exception.

Inside method.

--------------------------------------------

throws

Declares possible exceptions.

Method signature.

===============================================================================
CUSTOM EXCEPTION
===============================================================================

Create your own exception.

Example

class InvalidAgeException

extends Exception{

    InvalidAgeException(String message){

        super(message);

    }

}

Throwing

throw new InvalidAgeException(

    "Age Invalid"

);

===============================================================================
TRY-WITH-RESOURCES (JAVA 7)
===============================================================================

Automatically closes resources.

Example

try(BufferedReader br =
new BufferedReader(

new FileReader("test.txt")

)){

    System.out.println(br.readLine());

}

No need for finally.

===============================================================================
AUTOCLOSEABLE
===============================================================================

Try-with-resources works with classes
implementing

AutoCloseable

Examples

BufferedReader

Scanner

Connection

PreparedStatement

ResultSet

===============================================================================
STACK TRACE
===============================================================================

When exception occurs,

Java prints

Exception Type

↓

Message

↓

Method Calls

↓

Line Numbers

Example

java.lang.NullPointerException

at Demo.main(Demo.java:15)

===============================================================================
PRINTING EXCEPTION DETAILS
===============================================================================

catch(Exception e){

    e.printStackTrace();

    System.out.println(e.getMessage());

}

Useful for debugging.

===============================================================================
EXCEPTION PROPAGATION
===============================================================================

main()

↓

A()

↓

B()

↓

C()

↓

Exception

↓

Back to

B

↓

A

↓

main

If no one handles it,

program terminates.

===============================================================================
COMMON EXCEPTIONS
===============================================================================

NullPointerException

Using null reference.

----------------------------------------

ArrayIndexOutOfBoundsException

Invalid array index.

----------------------------------------

NumberFormatException

Parsing invalid number.

----------------------------------------

FileNotFoundException

Missing file.

----------------------------------------

SQLException

Database failure.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Catch specific exceptions.

✔ Never ignore exceptions.

✔ Log meaningful messages.

✔ Close resources properly.

✔ Use try-with-resources.

✔ Create custom exceptions
for business rules.

✔ Avoid catching Throwable.

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

catch(Exception e){

}

Doing nothing.

Exceptions disappear silently.

--------------------------------------------

Mistake

Using exceptions
for normal program flow.

--------------------------------------------

Mistake

Catching Throwable.

--------------------------------------------

Mistake

Ignoring finally
for resource cleanup
(before Java 7).

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

ATM

↓

Insufficient Balance

↓

Custom Exception

----------------------------------------

File Upload

↓

File Missing

↓

IOException

----------------------------------------

Database

↓

Connection Lost

↓

SQLException

----------------------------------------

REST API

↓

Invalid Request

↓

IllegalArgumentException

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is an Exception?

An event that interrupts normal program execution.

--------------------------------------------------------

Q2 Difference between Error and Exception?

Error

Usually unrecoverable.

Exception

Recoverable.

--------------------------------------------------------

Q3 Difference between Checked and Unchecked exceptions?

Checked

Compile-time checking.

Unchecked

Runtime checking.

--------------------------------------------------------

Q4 Difference between throw and throws?

throw

Throws an exception.

throws

Declares possible exceptions.

--------------------------------------------------------

Q5 Does finally always execute?

Almost always.

Not if JVM terminates abruptly
(e.g., System.exit()).

--------------------------------------------------------

Q6 Why use try-with-resources?

Automatically closes resources.

--------------------------------------------------------

Q7 What is Exception Propagation?

Passing exceptions up the call stack
until handled.

--------------------------------------------------------

Q8 Why create custom exceptions?

To represent business-specific errors
with meaningful names and messages.

--------------------------------------------------------

Q9 Can we have multiple catch blocks?

Yes.

Specific exceptions must come first.

--------------------------------------------------------

Q10 Which class is the root
of all exceptions and errors?

Throwable

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Divide by zero example.

2. Handle NullPointerException.

3. Handle NumberFormatException.

4. Read file using try-catch.

5. Multiple catch example.

6. finally block demo.

7. throw keyword example.

8. throws keyword example.

9. Custom InvalidAgeException.

10. Try-with-resources using BufferedReader.

===============================================================================
QUICK REVISION
===============================================================================

✔ Exception = Recoverable problem

✔ Error = Serious JVM problem

✔ Throwable = Root class

✔ Checked exceptions = Compile-time

✔ Unchecked exceptions = Runtime

✔ try = Risky code

✔ catch = Handle exception

✔ finally = Cleanup

✔ throw = Throw exception

✔ throws = Declare exception

✔ Try-with-resources = Automatic cleanup

✔ Custom exceptions = Business rules

===============================================================================
NEXT TOPIC
===============================================================================

19_String_StringBuilder_StringBuffer.java

Topics

• String Pool
• String Immutability
• String Methods
• StringBuilder
• StringBuffer
• String vs StringBuilder vs StringBuffer
• Memory Diagrams
• Performance
• Interview Questions

===============================================================================
*/