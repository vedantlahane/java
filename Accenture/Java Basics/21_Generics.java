/*
===============================================================================
                              JAVA GENERICS
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY WERE GENERICS INTRODUCED?
===============================================================================

Before Java 5,

Collections stored Objects.

Example

ArrayList list = new ArrayList();

list.add("Vedant");

list.add(100);

list.add(true);

Everything was allowed.

Problem

Programmer had to manually cast objects.

String name = (String) list.get(0);

This introduced

❌ Runtime Errors

❌ Unsafe Code

❌ Extra Casting

Generics solved this problem.

===============================================================================
WHAT ARE GENERICS?
===============================================================================

Generics allow classes, interfaces, and methods
to work with different data types while
maintaining type safety.

Generics provide

✔ Compile-Time Type Checking

✔ Code Reusability

✔ Elimination of Explicit Casting

===============================================================================
WITHOUT GENERICS
===============================================================================

ArrayList list = new ArrayList();

list.add("Java");

list.add(100);

String name = (String) list.get(1);

Output

ClassCastException

===============================================================================
WITH GENERICS
===============================================================================

ArrayList<String> list =
new ArrayList<>();

list.add("Java");

list.add("Spring");

Compilation Error

list.add(100);

Compiler prevents mistakes.

===============================================================================
GENERIC SYNTAX
===============================================================================

ClassName<Type>

Examples

ArrayList<String>

ArrayList<Integer>

HashMap<String,Integer>

List<Employee>

Queue<Order>

===============================================================================
COMMON TYPE PARAMETERS
===============================================================================

T

Type

----------------------------------------

E

Element

(Collection)

----------------------------------------

K

Key

(Map)

----------------------------------------

V

Value

(Map)

----------------------------------------

N

Number

(Custom)

===============================================================================
GENERIC CLASS
===============================================================================

class Box<T>{

    private T value;

    public void set(T value){

        this.value = value;

    }

    public T get(){

        return value;

    }

}

===============================================================================
USING GENERIC CLASS
===============================================================================

Box<String> box =
new Box<>();

box.set("Java");

System.out.println(box.get());

Output

Java

----------------------------------------

Box<Integer> numbers =
new Box<>();

numbers.set(100);

===============================================================================
MULTIPLE TYPE PARAMETERS
===============================================================================

class Pair<K,V>{

    private K key;

    private V value;

}

Example

Pair<String,Integer>

Pair<Integer,String>

===============================================================================
GENERIC METHODS
===============================================================================

Methods can also be generic.

Example

public static <T> void print(T value){

    System.out.println(value);

}

Calling

print("Java");

print(100);

print(true);

===============================================================================
BOUNDED GENERICS
===============================================================================

Sometimes

T

should accept only certain types.

Example

<T extends Number>

Accepts

Integer

Double

Float

Long

Not

String

===============================================================================
EXAMPLE
===============================================================================

public class Calculator{

    public static <T extends Number>

    double square(T value){

        return value.doubleValue()
             * value.doubleValue();

    }

}

===============================================================================
MULTIPLE BOUNDS
===============================================================================

<T extends Animal & Runnable>

Meaning

Must extend Animal

AND

implement Runnable

===============================================================================
WILDCARDS
===============================================================================

Generics also support

?

Called

Wildcard

Types

?

? extends

? super

===============================================================================
UNBOUNDED WILDCARD
===============================================================================

List<?> list;

Accepts

List<String>

List<Integer>

List<Employee>

Can read

Cannot safely add elements
(except null).

===============================================================================
UPPER BOUNDED WILDCARD
===============================================================================

List<? extends Number>

Accepts

Integer

Double

Float

Long

Useful when

Reading data.

===============================================================================
LOWER BOUNDED WILDCARD
===============================================================================

List<? super Integer>

Accepts

Integer

Number

Object

Useful when

Writing data.

===============================================================================
PECS PRINCIPLE
===============================================================================

Producer

Extends

Consumer

Super

Remember

PECS

Producer Extends

Consumer Super

Example

Read values

↓

? extends

Write values

↓

? super

===============================================================================
TYPE ERASURE
===============================================================================

One of the most important interview topics.

Generics exist

ONLY

during compilation.

At runtime,

generic information is removed.

Example

List<String>

↓

List

Bytecode contains raw types.

===============================================================================
WHY TYPE ERASURE?
===============================================================================

To maintain backward compatibility
with older Java code.

Java 1.4 code still works
with Java 5+.

===============================================================================
RAW TYPES
===============================================================================

Avoid

ArrayList list =
new ArrayList();

Prefer

ArrayList<String> list =
new ArrayList<>();

Raw types disable type checking.

===============================================================================
GENERIC INTERFACE
===============================================================================

interface Repository<T>{

    void save(T obj);

    T findById(int id);

}

===============================================================================
GENERIC INHERITANCE
===============================================================================

class StudentRepository

implements Repository<Student>{

}

Compiler replaces

T

with

Student

===============================================================================
DIAMOND OPERATOR
===============================================================================

Introduced in Java 7.

Instead of

ArrayList<String> list =
new ArrayList<String>();

Write

ArrayList<String> list =
new ArrayList<>();

Cleaner

Less duplication

===============================================================================
GENERIC COLLECTIONS
===============================================================================

List<String>

Set<Integer>

Queue<Employee>

Map<Integer,Product>

PriorityQueue<Task>

===============================================================================
LIMITATIONS OF GENERICS
===============================================================================

Cannot use primitive types.

Wrong

List<int>

Correct

List<Integer>

----------------------------------------

Cannot create

new T()

----------------------------------------

Cannot create

T[]

directly

----------------------------------------

Static members
cannot use class type parameter.

===============================================================================
AUTOBOXING
===============================================================================

List<Integer> list =
new ArrayList<>();

list.add(10);

Internally

Integer.valueOf(10)

Primitive converted automatically.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Spring Boot

Repository<User>

----------------------------------------

JPA

JpaRepository<Employee,Integer>

----------------------------------------

HashMap<String,User>

----------------------------------------

ResponseEntity<Customer>

----------------------------------------

CompletableFuture<Result>

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

Using raw collections.

----------------------------------------

Mistake

Using primitive types.

List<int>

Compilation Error

----------------------------------------

Mistake

Ignoring wildcard usage.

----------------------------------------

Mistake

Confusing

? extends

with

? super

===============================================================================
BEST PRACTICES
===============================================================================

✔ Always use generics.

✔ Avoid raw types.

✔ Prefer interfaces

List<String>

instead of

ArrayList<String>

✔ Follow PECS rule.

✔ Use bounded types
when appropriate.

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What are Generics?

A feature providing compile-time
type safety and reusable code.

--------------------------------------------------------

Q2 Why were Generics introduced?

To eliminate ClassCastException
and provide type safety.

--------------------------------------------------------

Q3 What is Type Erasure?

Removal of generic type information
during compilation.

--------------------------------------------------------

Q4 Can Generics use primitive types?

No.

Use wrapper classes.

--------------------------------------------------------

Q5 What is the Diamond Operator?

<>

Allows compiler to infer type parameters.

--------------------------------------------------------

Q6 Difference between

<T>

and

?

<T>

Named type parameter.

Used in declarations.

?

Wildcard.

Used when exact type is unknown.

--------------------------------------------------------

Q7 What is PECS?

Producer Extends

Consumer Super

--------------------------------------------------------

Q8 Difference between

? extends Number

and

? super Integer

extends

Read

super

Write

--------------------------------------------------------

Q9 Why can't we write

new T()?

Because generic type information
does not exist at runtime.

--------------------------------------------------------

Q10 Why are Generics heavily used
in Spring Boot?

They enable reusable repositories,
services, collections,
and type-safe APIs.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Generic Box class.

2. Generic Pair class.

3. Generic Calculator.

4. Generic Stack.

5. Generic Queue.

6. Generic Repository.

7. Generic Swap Method.

8. Bounded Generic Example.

9. Wildcard Example.

10. PECS Demonstration.

===============================================================================
QUICK REVISION
===============================================================================

✔ Generics = Type Safety

✔ No explicit casting

✔ Generic Classes

✔ Generic Methods

✔ Bounded Types

✔ Wildcards

✔ Type Erasure

✔ Diamond Operator

✔ PECS Principle

✔ Wrapper Classes required

===============================================================================
NEXT TOPIC
===============================================================================

22_FileHandling_IO_NIO.java

Topics

• Java IO
• Streams
• File Class
• Buffered Streams
• Character Streams
• Serialization Basics
• NIO
• Paths
• Files API
• Interview Questions

===============================================================================
*/