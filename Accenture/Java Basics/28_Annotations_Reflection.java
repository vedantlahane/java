/*
===============================================================================
                     JAVA ANNOTATIONS & REFLECTION
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY ARE ANNOTATIONS IMPORTANT?
===============================================================================

Modern Java frameworks rarely ask developers
to write XML configuration.

Instead, they use annotations.

Example

@SpringBootApplication

@RestController

@Service

@Repository

@Entity

@Autowired

@Test

@JsonProperty

These are annotations.

Frameworks detect them
using Reflection.

===============================================================================
WHAT IS AN ANNOTATION?
===============================================================================

An Annotation is metadata.

It provides information
about code.

Annotations

DO NOT

directly change program logic.

Instead,

they provide information
to

Compiler

JVM

Frameworks

Tools

===============================================================================
REAL WORLD ANALOGY
===============================================================================

Imagine a passport.

Your passport

does not change who you are.

It describes

Nationality

Age

Identity

Similarly

Annotations describe

Classes

Methods

Fields

Parameters

===============================================================================
ANNOTATION SYNTAX
===============================================================================

@Override

public void display(){

}

----------------------------------------

@Deprecated

class OldAPI{

}

----------------------------------------

@SuppressWarnings("unchecked")

===============================================================================
WHY USE ANNOTATIONS?
===============================================================================

✔ Reduce XML Configuration

✔ Improve Readability

✔ Provide Metadata

✔ Enable Framework Automation

✔ Compile-Time Validation

✔ Runtime Processing

===============================================================================
BUILT-IN ANNOTATIONS
===============================================================================

@Override

@Deprecated

@SuppressWarnings

@FunctionalInterface

@SafeVarargs

@Native

===============================================================================
@Override
===============================================================================

Verifies method overriding.

Example

@Override

public void display(){

}

Compiler reports error
if overriding is incorrect.

===============================================================================
@Deprecated
===============================================================================

Marks code as obsolete.

Example

@Deprecated

public void oldMethod(){

}

Compiler generates warning.

===============================================================================
@SuppressWarnings
===============================================================================

Suppresses compiler warnings.

Example

@SuppressWarnings("unchecked")

Useful with legacy code.

===============================================================================
@FunctionalInterface
===============================================================================

Ensures interface contains

exactly one abstract method.

Required for

Lambda Expressions.

===============================================================================
CUSTOM ANNOTATIONS
===============================================================================

You can create your own annotations.

Example

@interface Author{

    String name();

}

===============================================================================
USING CUSTOM ANNOTATION
===============================================================================

@Author(name="Vedant")

class Student{

}

===============================================================================
ANNOTATION ELEMENTS
===============================================================================

@interface Course{

    String name();

    int duration();

    boolean active() default true;

}

===============================================================================
RETENTION POLICY
===============================================================================

Controls annotation lifetime.

SOURCE

↓

Compiler removes it.

----------------------------------------

CLASS

↓

Stored in bytecode.

Not available at runtime.

----------------------------------------

RUNTIME

↓

Available through Reflection.

===============================================================================
TARGET
===============================================================================

Defines where annotation
can be applied.

Examples

TYPE

METHOD

FIELD

CONSTRUCTOR

PARAMETER

LOCAL_VARIABLE

PACKAGE

MODULE

===============================================================================
META ANNOTATIONS
===============================================================================

@Retention

@Target

@Inherited

@Documented

@Repeatable

===============================================================================
REFLECTION API
===============================================================================

Reflection allows Java programs
to inspect and manipulate

Classes

Methods

Fields

Constructors

during runtime.

===============================================================================
WHY REFLECTION?
===============================================================================

Frameworks don't know
your classes beforehand.

Spring Boot

Hibernate

JUnit

Jackson

They inspect classes dynamically.

===============================================================================
CLASS OBJECT
===============================================================================

Every loaded class
has one

Class

object.

Example

Class<?> clazz =
Student.class;

===============================================================================
WAYS TO GET CLASS OBJECT
===============================================================================

Student.class

----------------------------------------

object.getClass()

----------------------------------------

Class.forName()

===============================================================================
CLASS INFORMATION
===============================================================================

clazz.getName()

clazz.getSimpleName()

clazz.getPackage()

clazz.getSuperclass()

clazz.getInterfaces()

===============================================================================
GETTING FIELDS
===============================================================================

clazz.getFields()

clazz.getDeclaredFields()

===============================================================================
GETTING METHODS
===============================================================================

clazz.getMethods()

clazz.getDeclaredMethods()

===============================================================================
GETTING CONSTRUCTORS
===============================================================================

clazz.getConstructors()

clazz.getDeclaredConstructors()

===============================================================================
INVOKING METHODS
===============================================================================

Method method =

clazz.getMethod("display");

method.invoke(object);

Method executed dynamically.

===============================================================================
ACCESSING PRIVATE FIELDS
===============================================================================

Field field =

clazz.getDeclaredField("name");

field.setAccessible(true);

field.set(object,"Vedant");

Reflection bypasses access checks.

Use carefully.

===============================================================================
CREATING OBJECTS
===============================================================================

Constructor<?> constructor =

clazz.getConstructor();

Object obj =

constructor.newInstance();

===============================================================================
DYNAMIC CLASS LOADING
===============================================================================

Class.forName(

"com.example.Student"

);

Loads class during runtime.

===============================================================================
ANNOTATION PROCESSING
===============================================================================

Reflection reads annotations.

Example

if(clazz.isAnnotationPresent(

Entity.class

)){

    // Process Entity

}

===============================================================================
SPRING BOOT EXAMPLE
===============================================================================

@RestController

↓

Reflection detects annotation

↓

Creates Bean

↓

Registers Endpoint

Automatically

===============================================================================
HIBERNATE EXAMPLE
===============================================================================

@Entity

↓

Reflection

↓

Maps Java Object

↓

Database Table

===============================================================================
JUNIT EXAMPLE
===============================================================================

@Test

↓

Reflection

↓

Executes Test Method

===============================================================================
JACKSON EXAMPLE
===============================================================================

@JsonProperty

↓

Reflection

↓

Maps JSON

↓

Java Object

===============================================================================
PERFORMANCE
===============================================================================

Reflection is slower than
normal method calls.

Reason

Runtime inspection

Dynamic invocation

Modern JVM optimizations
reduce overhead,
but reflection should not
be used in performance-critical loops.

===============================================================================
LIMITATIONS
===============================================================================

Reflection

Breaks encapsulation

May reduce performance

Can access private members

Requires security considerations

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Forgetting RetentionPolicy.RUNTIME
for runtime annotations.

----------------------------------------

❌ Excessive reflection.

----------------------------------------

❌ Ignoring accessibility rules.

----------------------------------------

❌ Using reflection
when normal method calls suffice.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use annotations
for metadata only.

✔ Prefer framework annotations.

✔ Keep reflection localized.

✔ Cache reflective lookups
when repeatedly used.

✔ Avoid reflection
inside tight loops.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Spring Dependency Injection

↓

Reflection

----------------------------------------

Hibernate ORM Mapping

↓

Reflection

----------------------------------------

JUnit Testing

↓

Reflection

----------------------------------------

Jackson Serialization

↓

Reflection

----------------------------------------

Lombok

↓

Annotation Processing

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is an annotation?

Metadata describing program elements.

--------------------------------------------------------

Q2 Do annotations change program logic?

No.

They provide metadata used
by compilers, tools, or frameworks.

--------------------------------------------------------

Q3 Difference between
@Override and @Deprecated?

@Override

Checks overriding.

@Deprecated

Marks obsolete code.

--------------------------------------------------------

Q4 What is Reflection?

Ability to inspect and manipulate
classes during runtime.

--------------------------------------------------------

Q5 Which class represents
metadata of a loaded class?

Class

--------------------------------------------------------

Q6 Difference between

getMethods()

and

getDeclaredMethods()?

getMethods()

Public methods including inherited.

getDeclaredMethods()

All methods declared
in the class.

--------------------------------------------------------

Q7 Which retention policy
is required for runtime reflection?

RetentionPolicy.RUNTIME

--------------------------------------------------------

Q8 Why does Spring Boot
use reflection?

To discover annotations,
create beans,
inject dependencies,
and invoke methods dynamically.

--------------------------------------------------------

Q9 Why is reflection slower?

Because method resolution
happens dynamically at runtime.

--------------------------------------------------------

Q10 Name frameworks
that heavily use annotations.

Spring

Hibernate

JUnit

Jackson

Lombok

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Create custom annotation.

2. Read annotation using reflection.

3. List class methods.

4. List constructors.

5. Access private field.

6. Invoke method dynamically.

7. Create object using reflection.

8. Display superclass.

9. Annotation-based validator.

10. Mini dependency injection container.

===============================================================================
QUICK REVISION
===============================================================================

✔ Annotation = Metadata

✔ Reflection = Runtime inspection

✔ @Override checks overriding

✔ @Deprecated marks obsolete code

✔ Custom annotations supported

✔ Retention controls annotation lifetime

✔ Reflection accesses classes, methods, fields

✔ Spring Boot uses reflection extensively

✔ Hibernate maps entities using reflection

✔ Reflection powers modern Java frameworks

===============================================================================
NEXT TOPIC
===============================================================================

29_Serialization.java

Topics

• Serializable

• Externalizable

• ObjectOutputStream

• ObjectInputStream

• transient

• serialVersionUID

• Version Compatibility

• Security

• Best Practices

• Interview Questions

===============================================================================
*/