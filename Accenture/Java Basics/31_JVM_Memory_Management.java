/*
===============================================================================
                     JAVA JVM & MEMORY MANAGEMENT
===============================================================================

Author : Vedant
Module : Professional Java

===============================================================================
WHY LEARN JVM?
===============================================================================

Every Java program runs inside the

Java Virtual Machine (JVM).

Understanding JVM helps explain

✔ Memory Usage

✔ Garbage Collection

✔ Performance

✔ OutOfMemoryError

✔ StackOverflowError

✔ Thread Management

✔ Class Loading

Without JVM,

Java cannot execute.

===============================================================================
JAVA PLATFORM
===============================================================================

Java Source (.java)

        │

        ▼

Java Compiler (javac)

        │

        ▼

Bytecode (.class)

        │

        ▼

Java Virtual Machine

        │

        ▼

Machine Code

        │

        ▼

Operating System

===============================================================================
JDK vs JRE vs JVM
===============================================================================

JDK

↓

Development Kit

Contains

Compiler

Debugger

JRE

JVM

----------------------------------------

JRE

↓

Runtime Environment

Contains

Libraries

JVM

----------------------------------------

JVM

↓

Executes Bytecode

===============================================================================
WHY BYTECODE?
===============================================================================

Compile Once

Run Anywhere

Windows

↓

Linux

↓

Mac

↓

Cloud

Same

.class

file works everywhere.

===============================================================================
JVM ARCHITECTURE
===============================================================================

               Class Loader

                     │

                     ▼

              Runtime Data Area

                     │

      --------------------------------

      │                              │

    Heap                         Stack

      │                              │

      --------------------------------

                     │

          Execution Engine

                     │

        ----------------------

        │                    │

      Interpreter          JIT Compiler

===============================================================================
CLASS LOADER
===============================================================================

Responsible for

Loading Classes

Linking

Initialization

Types

Bootstrap

Extension

Application

===============================================================================
CLASS LOADING PROCESS
===============================================================================

Loading

↓

Linking

↓

Verification

↓

Preparation

↓

Resolution

↓

Initialization

===============================================================================
RUNTIME DATA AREA
===============================================================================

Contains

Heap

Stack

Method Area

PC Register

Native Method Stack

===============================================================================
HEAP MEMORY
===============================================================================

Stores

Objects

Arrays

Instance Variables

Shared among threads.

Largest memory area.

===============================================================================
HEAP STRUCTURE
===============================================================================

Young Generation

↓

Eden Space

↓

Survivor S0

↓

Survivor S1

----------------------------------------

Old Generation

----------------------------------------

Metaspace

(Java 8+)

===============================================================================
YOUNG GENERATION
===============================================================================

New Objects

allocated here.

Most objects

die quickly.

Garbage Collection happens frequently.

===============================================================================
OLD GENERATION
===============================================================================

Long-living objects

move here.

GC is less frequent.

===============================================================================
METASPACE
===============================================================================

Introduced in Java 8.

Stores

Class Metadata

Method Metadata

Annotations

Replaced

PermGen

===============================================================================
STACK MEMORY
===============================================================================

Each Thread

has its own stack.

Stores

Method Calls

Local Variables

References

Stack disappears

when thread finishes.

===============================================================================
STACK FRAME
===============================================================================

Each method call creates

Stack Frame

Contains

Parameters

Local Variables

Return Address

===============================================================================
PC REGISTER
===============================================================================

Stores

Current instruction

being executed.

Each thread

has one PC Register.

===============================================================================
NATIVE METHOD STACK
===============================================================================

Supports

JNI

(Java Native Interface)

Used when Java calls

C

C++

Native Libraries

===============================================================================
MEMORY VISUALIZATION
===============================================================================

             JVM Memory

     ------------------------

     Heap

     ------------------------

     Stack Thread-1

     Stack Thread-2

     Stack Thread-3

     ------------------------

     Metaspace

===============================================================================
OBJECT CREATION
===============================================================================

new Student()

↓

Heap

↓

Reference stored

↓

Stack

===============================================================================
STACK vs HEAP
===============================================================================

Stack

Stores

Local Variables

Method Calls

Fast

Thread Local

----------------------------------------

Heap

Stores

Objects

Shared

Garbage Collected

===============================================================================
GARBAGE COLLECTION
===============================================================================

Automatically removes

Unused Objects.

Benefits

✔ Prevents Memory Leaks

✔ Automatic Memory Management

✔ Simplifies Programming

===============================================================================
WHEN IS OBJECT ELIGIBLE?
===============================================================================

Object has

No References

↓

Eligible

for GC.

Example

Student s = new Student();

s = null;

===============================================================================
SYSTEM.GC()
===============================================================================

Requests

Garbage Collection.

NOT guaranteed.

Never rely on it.

===============================================================================
FINALIZE()
===============================================================================

Legacy cleanup method.

Deprecated.

Use

try-with-resources

or

AutoCloseable

instead.

===============================================================================
COMMON GC ALGORITHMS
===============================================================================

Serial GC

Parallel GC

G1 GC

ZGC

Shenandoah

===============================================================================
DEFAULT GARBAGE COLLECTOR
===============================================================================

Modern Java

typically uses

G1 GC

(Default in recent JDKs)

Designed for

Large Heap

Low Pause Time

===============================================================================
MEMORY LEAK
===============================================================================

Java can still have

Memory Leaks.

Example

Large static collection

never cleared.

Object remains reachable.

GC cannot remove it.

===============================================================================
OUTOFMEMORYERROR
===============================================================================

Occurs when JVM

cannot allocate memory.

Examples

Huge Arrays

Infinite Object Creation

Memory Leak

===============================================================================
STACKOVERFLOWERROR
===============================================================================

Occurs when

Stack exceeds limit.

Usually caused by

Infinite Recursion.

===============================================================================
JIT COMPILER
===============================================================================

Just-In-Time Compiler.

Converts frequently executed

Bytecode

↓

Native Machine Code.

Improves performance.

===============================================================================
INTERPRETER vs JIT
===============================================================================

Interpreter

Reads bytecode

line-by-line.

----------------------------------------

JIT

Compiles frequently used code.

Much Faster.

===============================================================================
HOTSPOT JVM
===============================================================================

Oracle/OpenJDK JVM.

Detects

Hot Methods

Optimizes them.

===============================================================================
ESCAPE ANALYSIS
===============================================================================

JVM checks whether

objects escape methods.

If not,

may allocate on stack

or optimize away.

===============================================================================
STRING POOL
===============================================================================

Stored in Heap

Shared

Improves memory usage.

===============================================================================
COMMON JVM FLAGS
===============================================================================

-Xms

Initial Heap

----------------------------------------

-Xmx

Maximum Heap

----------------------------------------

-Xss

Stack Size

----------------------------------------

-XX:+UseG1GC

Select G1 Collector

===============================================================================
BEST PRACTICES
===============================================================================

✔ Avoid unnecessary object creation.

✔ Close resources.

✔ Use StringBuilder.

✔ Avoid memory leaks.

✔ Prefer immutable objects.

✔ Monitor heap usage.

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Calling System.gc() frequently.

❌ Huge static collections.

❌ Infinite recursion.

❌ Holding references unnecessarily.

❌ Ignoring heap dumps.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Spring Boot

↓

Millions of Beans

↓

Heap

----------------------------------------

Microservices

↓

Thread Stacks

----------------------------------------

Caching

↓

Heap Memory

----------------------------------------

High Traffic Servers

↓

GC Optimization

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Difference between JDK, JRE, JVM?

JDK

Development

JRE

Runtime

JVM

Execution

--------------------------------------------------------

Q2 Difference between Stack and Heap?

Stack

Method calls

Heap

Objects

--------------------------------------------------------

Q3 What causes StackOverflowError?

Infinite recursion.

--------------------------------------------------------

Q4 What causes OutOfMemoryError?

Heap exhaustion.

--------------------------------------------------------

Q5 What is Garbage Collection?

Automatic memory cleanup.

--------------------------------------------------------

Q6 What is Metaspace?

Stores class metadata.

--------------------------------------------------------

Q7 What is JIT?

Just-In-Time Compiler.

--------------------------------------------------------

Q8 Is System.gc() guaranteed?

No.

--------------------------------------------------------

Q9 What replaces PermGen?

Metaspace.

--------------------------------------------------------

Q10 Which GC is default today?

G1 GC (in modern JDKs).

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Heap vs Stack demonstration.

2. Memory leak using static list.

3. StackOverflow recursion demo.

4. String Pool example.

5. Object lifecycle.

6. JVM arguments experiment.

7. GC logging.

8. WeakReference example.

9. SoftReference example.

10. Heap dump analysis.

===============================================================================
QUICK REVISION
===============================================================================

✔ JVM executes bytecode

✔ Heap stores objects

✔ Stack stores method calls

✔ Metaspace stores class metadata

✔ GC removes unreachable objects

✔ JIT improves performance

✔ StackOverflow = recursion

✔ OutOfMemory = heap exhausted

✔ G1 = default modern GC

✔ Compile Once, Run Anywhere

===============================================================================
NEXT TOPIC
===============================================================================

32_Advanced_Concurrency.java

Topics

• Java Memory Model (JMM)

• volatile Deep Dive

• ReentrantLock

• ReadWriteLock

• Semaphore

• CountDownLatch

• CyclicBarrier

• Phaser

• ForkJoinPool

• CompletableFuture Advanced

• Virtual Threads (Java 21)

• Interview Questions

===============================================================================
*/