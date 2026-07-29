/*
===============================================================================
                           JAVA 8 FEATURES
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY JAVA 8 WAS A GAME CHANGER?
===============================================================================

Before Java 8

Writing simple operations required
many lines of code.

Example

Sorting

Filtering

Parallel Processing

Thread Creation

required anonymous classes
and verbose code.

Java 8 introduced

✔ Lambda Expressions

✔ Stream API

✔ Functional Interfaces

✔ Method References

✔ Optional

✔ Date & Time API

✔ CompletableFuture Improvements

Result

Cleaner

Shorter

Faster

More Functional Programming.

===============================================================================
MAJOR FEATURES OF JAVA 8
===============================================================================

1. Lambda Expressions

2. Functional Interfaces

3. Method References

4. Stream API

5. Optional Class

6. Default Methods

7. Static Interface Methods

8. Date & Time API

9. CompletableFuture

10. Nashorn JavaScript Engine

===============================================================================
FUNCTIONAL PROGRAMMING
===============================================================================

Traditional Java

Object-Oriented Programming

↓

Classes

Objects

Methods

--------------------------------------------

Java 8

Object-Oriented

+

Functional Programming

Focus

"What should happen"

instead of

"How to do it"

===============================================================================
LAMBDA EXPRESSIONS
===============================================================================

One of the biggest Java 8 features.

A Lambda Expression is an anonymous function.

Syntax

(parameters) -> expression

OR

(parameters) -> {

    statements

}

===============================================================================
BEFORE JAVA 8
===============================================================================

Runnable r = new Runnable(){

    @Override

    public void run(){

        System.out.println("Running");

    }

};

===============================================================================
JAVA 8 LAMBDA
===============================================================================

Runnable r =

() -> System.out.println("Running");

Much shorter.

Much cleaner.

===============================================================================
LAMBDA EXAMPLES
===============================================================================

(int a,int b) -> a+b

--------------------------------------

name -> name.length()

--------------------------------------

() -> System.out.println("Hello")

--------------------------------------

x -> x*x

===============================================================================
WHY LAMBDAS?
===============================================================================

Benefits

✔ Less Boilerplate

✔ Better Readability

✔ Functional Programming

✔ Cleaner APIs

✔ Stream API Support

===============================================================================
FUNCTIONAL INTERFACE
===============================================================================

An interface having exactly

ONE

abstract method.

Example

@FunctionalInterface

interface Calculator{

    int add(int a,int b);

}

Required for Lambdas.

===============================================================================
COMMON FUNCTIONAL INTERFACES
===============================================================================

Runnable

Callable

Predicate<T>

Function<T,R>

Consumer<T>

Supplier<T>

UnaryOperator<T>

BinaryOperator<T>

Comparator<T>

===============================================================================
PREDICATE
===============================================================================

Represents a condition.

Input

↓

Boolean Output

Example

Predicate<Integer> even =

n -> n % 2 == 0;

===============================================================================
FUNCTION
===============================================================================

Input

↓

Output

Example

Function<String,Integer> length =

String::length;

===============================================================================
CONSUMER
===============================================================================

Consumes data.

Returns nothing.

Example

Consumer<String> printer =

System.out::println;

===============================================================================
SUPPLIER
===============================================================================

Produces data.

No input.

Example

Supplier<Double> random =

Math::random;

===============================================================================
METHOD REFERENCES
===============================================================================

Sometimes Lambda only calls
an existing method.

Instead of

x -> System.out.println(x)

Write

System.out::println

Cleaner.

===============================================================================
TYPES OF METHOD REFERENCES
===============================================================================

1. Static Method

Math::sqrt

----------------------------------------

2. Instance Method

System.out::println

----------------------------------------

3. Arbitrary Object Method

String::length

----------------------------------------

4. Constructor Reference

ArrayList::new

===============================================================================
OPTIONAL
===============================================================================

Helps avoid

NullPointerException

Instead of returning

null

Return

Optional

Example

Optional<String> name =

Optional.of("Vedant");

===============================================================================
OPTIONAL METHODS
===============================================================================

isPresent()

isEmpty()

get()

orElse()

orElseGet()

orElseThrow()

ifPresent()

map()

filter()

flatMap()

===============================================================================
OPTIONAL EXAMPLE
===============================================================================

Optional<String> name =

Optional.ofNullable(null);

System.out.println(

name.orElse("Guest")

);

Output

Guest

===============================================================================
DEFAULT METHODS
===============================================================================

Java 8 allows interfaces
to contain implementation.

Example

interface Vehicle{

    default void start(){

        System.out.println("Start");

    }

}

===============================================================================
STATIC METHODS IN INTERFACES
===============================================================================

interface MathUtil{

    static int square(int n){

        return n*n;

    }

}

Calling

MathUtil.square(5);

===============================================================================
STREAM API
===============================================================================

Processes collections
functionally.

Example

list.stream()

.filter()

.map()

.collect()

We'll study Streams
in the next chapter.

===============================================================================
FOREACH METHOD
===============================================================================

List<String> names =

List.of("A","B","C");

names.forEach(

System.out::println

);

Output

A

B

C

===============================================================================
COMPARATOR USING LAMBDA
===============================================================================

Collections.sort(

list,

(a,b) -> a.compareTo(b)

);

Cleaner than anonymous class.

===============================================================================
COLLECTION SORTING
===============================================================================

list.sort(

Comparator.naturalOrder()

);

----------------------------------------

list.sort(

Comparator.reverseOrder()

);

===============================================================================
DATE & TIME API
===============================================================================

Old API

Date

Calendar

Problems

Mutable

Confusing

Thread Safety Issues

Java 8 introduced

LocalDate

LocalTime

LocalDateTime

Instant

Duration

Period

===============================================================================
COMPLETABLEFUTURE
===============================================================================

Improved asynchronous programming.

Example

CompletableFuture

.supplyAsync()

.thenApply()

.thenAccept()

.exceptionally()

===============================================================================
NASHORN
===============================================================================

JavaScript Engine

Introduced in Java 8.

Allowed JavaScript execution
inside JVM.

Deprecated in later versions.

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Using Optional
as class fields.

----------------------------------------

❌ Calling get()
without checking.

----------------------------------------

❌ Writing complex Lambdas.

----------------------------------------

❌ Ignoring Method References.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Prefer Lambdas.

✔ Keep Lambdas short.

✔ Use Method References
where appropriate.

✔ Avoid Optional.get().

✔ Use Optional.orElseThrow().

✔ Program with Streams.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Spring Boot

↓

Dependency Injection

↓

Lambdas

----------------------------------------

Streams

↓

Filtering Products

----------------------------------------

Optional

↓

Database Results

----------------------------------------

CompletableFuture

↓

Async REST APIs

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is Lambda Expression?

Anonymous function.

--------------------------------------------------------

Q2 What is Functional Interface?

Interface with exactly one abstract method.

--------------------------------------------------------

Q3 Why were Default Methods introduced?

To evolve interfaces
without breaking existing code.

--------------------------------------------------------

Q4 Difference between Consumer
and Supplier?

Consumer

Input

No Output

Supplier

No Input

Returns Output

--------------------------------------------------------

Q5 What is Optional?

Container object representing
presence or absence of value.

--------------------------------------------------------

Q6 Difference between Lambda
and Method Reference?

Method Reference is shorthand
when Lambda simply calls an existing method.

--------------------------------------------------------

Q7 Which annotation marks
Functional Interface?

@FunctionalInterface

--------------------------------------------------------

Q8 Why avoid Optional.get()?

Throws NoSuchElementException
when empty.

--------------------------------------------------------

Q9 Which Java version
introduced Streams?

Java 8

--------------------------------------------------------

Q10 Why is Java 8 important?

Introduced Functional Programming,
Streams, Lambdas,
modern APIs,
and cleaner syntax.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Lambda Calculator.

2. Predicate Example.

3. Consumer Example.

4. Supplier Example.

5. Function Example.

6. Method References.

7. Optional Demo.

8. Comparator Sorting.

9. Stream Filtering.

10. CompletableFuture Example.

===============================================================================
QUICK REVISION
===============================================================================

✔ Lambda = Anonymous Function

✔ Functional Interface = One Abstract Method

✔ Method References simplify Lambdas

✔ Optional reduces NullPointerException

✔ Streams process collections

✔ Default Methods evolve interfaces

✔ Static Interface Methods allowed

✔ CompletableFuture = Async Programming

✔ Java 8 introduced Functional Programming

===============================================================================
NEXT TOPIC
===============================================================================

25_Stream_API.java

Topics

• Stream Pipeline

• Intermediate Operations

• Terminal Operations

• map()

• filter()

• flatMap()

• reduce()

• collect()

• Collectors

• Parallel Streams

• Performance

• Interview Questions

===============================================================================
*/