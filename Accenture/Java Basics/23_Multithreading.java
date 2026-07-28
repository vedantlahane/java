/*
===============================================================================
                           JAVA MULTITHREADING
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY DO WE NEED MULTITHREADING?
===============================================================================

Suppose you're downloading a movie.

At the same time you can

✔ Listen to music

✔ Browse Chrome

✔ Chat on WhatsApp

✔ Copy files

Your computer performs multiple tasks simultaneously.

This is possible because of

Processes

and

Threads.

Without multithreading

A program performs only one task at a time.

Example

Read File

↓

Finish

↓

Connect Database

↓

Finish

↓

Process Request

↓

Finish

↓

Send Response

Slow.

===============================================================================
REAL WORLD EXAMPLE
===============================================================================

Restaurant

One Waiter

↓

Take Order

↓

Cook

↓

Serve

↓

Take Next Order

Very Slow

--------------------------------------------

Restaurant

Five Waiters

↓

Multiple Customers Served

↓

Higher Throughput

Threads work similarly.

===============================================================================
WHAT IS A PROCESS?
===============================================================================

A Process is an independent program executing in memory.

Examples

Chrome

VS Code

Spotify

Discord

Each process has

✔ Own Memory

✔ Own Resources

✔ Own Threads

===============================================================================
WHAT IS A THREAD?
===============================================================================

A Thread is the smallest unit of execution inside a process.

One Process

↓

Many Threads

Example

Chrome

↓

UI Thread

↓

Network Thread

↓

Rendering Thread

↓

JavaScript Engine Thread

===============================================================================
PROCESS vs THREAD
===============================================================================

Process

Independent

Own Memory

Heavyweight

Slow Creation

----------------------------------------

Thread

Shares Memory

Lightweight

Fast Creation

Within Same Process

===============================================================================
JAVA THREAD MODEL
===============================================================================

Java Program

↓

JVM Process

↓

Main Thread

↓

Worker Threads

↓

Garbage Collector Thread

↓

JIT Compiler Thread

===============================================================================
MAIN THREAD
===============================================================================

Every Java application starts with

main()

Main Thread executes

public static void main(String[] args)

Other threads are created from it.

===============================================================================
THREAD LIFECYCLE
===============================================================================

NEW

↓

RUNNABLE

↓

RUNNING

↓

BLOCKED / WAITING

↓

RUNNABLE

↓

TERMINATED

===============================================================================
THREAD STATES
===============================================================================

NEW

Thread created

Not started

----------------------------------------

RUNNABLE

Ready to execute

----------------------------------------

RUNNING

CPU executing

----------------------------------------

BLOCKED

Waiting for lock

----------------------------------------

WAITING

Waiting indefinitely

----------------------------------------

TIMED_WAITING

Waiting for specified time

----------------------------------------

TERMINATED

Execution complete

===============================================================================
CREATING THREADS
===============================================================================

Java provides

1. Thread Class

2. Runnable Interface

3. Callable Interface

===============================================================================
METHOD 1
EXTENDING THREAD CLASS
===============================================================================

class MyThread extends Thread{

    @Override

    public void run(){

        System.out.println("Running");

    }

}

Main

MyThread t = new MyThread();

t.start();

===============================================================================
IMPORTANT
===============================================================================

Never call

run()

directly.

Wrong

t.run();

Correct

t.start();

start()

creates a new thread.

run()

is executed by JVM.

===============================================================================
METHOD 2
IMPLEMENTING RUNNABLE
===============================================================================

class Task implements Runnable{

    @Override

    public void run(){

        System.out.println("Task Running");

    }

}

Thread thread =
new Thread(new Task());

thread.start();

===============================================================================
WHY RUNNABLE IS PREFERRED?
===============================================================================

Java supports

Single Inheritance

If class already extends another class,

it cannot extend Thread.

Runnable solves this.

===============================================================================
THREAD METHODS
===============================================================================

start()

run()

sleep()

join()

yield()

interrupt()

isAlive()

currentThread()

getName()

setName()

===============================================================================
SLEEP()
===============================================================================

Pauses current thread.

Thread.sleep(2000);

Waits

2 Seconds

Throws

InterruptedException

===============================================================================
JOIN()
===============================================================================

Waits for another thread to finish.

t1.start();

t1.join();

System.out.println("Done");

===============================================================================
YIELD()
===============================================================================

Hints scheduler

that current thread
is willing to pause.

Not guaranteed.

===============================================================================
DAEMON THREAD
===============================================================================

Background thread.

Examples

Garbage Collector

Logger

Monitoring

Set

thread.setDaemon(true);

===============================================================================
USER THREAD
===============================================================================

Normal application thread.

JVM waits for user threads
before shutting down.

===============================================================================
THREAD PRIORITY
===============================================================================

Range

1

to

10

Constants

MIN_PRIORITY

NORM_PRIORITY

MAX_PRIORITY

Priority is only a scheduling hint.

===============================================================================
RACE CONDITION
===============================================================================

Occurs when multiple threads
modify shared data simultaneously.

Example

balance = 1000

Thread A

Withdraw 500

Thread B

Withdraw 700

Without synchronization

Incorrect balance.

===============================================================================
SYNCHRONIZATION
===============================================================================

Allows only one thread
to access critical section
at a time.

Example

public synchronized void deposit(){

}

===============================================================================
MONITOR LOCK
===============================================================================

Every Java object has
an intrinsic monitor lock.

Thread acquires lock

↓

Executes synchronized block

↓

Releases lock

===============================================================================
SYNCHRONIZED BLOCK
===============================================================================

synchronized(lock){

    // Critical Section

}

Better than synchronizing
entire method.

===============================================================================
VOLATILE
===============================================================================

Ensures variable updates
are visible to all threads.

Example

volatile boolean running = true;

Does NOT provide atomicity.

Only visibility.

===============================================================================
ATOMIC CLASSES
===============================================================================

Package

java.util.concurrent.atomic

Examples

AtomicInteger

AtomicLong

AtomicBoolean

Methods

incrementAndGet()

compareAndSet()

get()

set()

===============================================================================
WAIT()
===============================================================================

Thread releases lock
and waits.

Object.wait();

===============================================================================
NOTIFY()
===============================================================================

Wakes one waiting thread.

Object.notify();

===============================================================================
NOTIFYALL()
===============================================================================

Wakes all waiting threads.

Object.notifyAll();

===============================================================================
DEADLOCK
===============================================================================

Thread A

Waiting for Lock B

Thread B

Waiting for Lock A

Neither proceeds.

Program freezes.

===============================================================================
LIVELOCK
===============================================================================

Threads keep responding
to each other

But

No useful work happens.

===============================================================================
STARVATION
===============================================================================

Low-priority thread
never gets CPU time.

===============================================================================
EXECUTOR FRAMEWORK
===============================================================================

Introduced in Java 5.

Preferred over manually creating threads.

ExecutorService executor =
Executors.newFixedThreadPool(4);

executor.submit(task);

executor.shutdown();

===============================================================================
THREAD POOL
===============================================================================

Instead of creating
new threads repeatedly,

Reuse existing threads.

Benefits

✔ Faster

✔ Less Memory

✔ Better Performance

===============================================================================
CALLABLE
===============================================================================

Runnable

↓

No return value

Callable

↓

Returns value

Throws Exception

Example

Callable<Integer> task =
() -> 100;

===============================================================================
FUTURE
===============================================================================

Represents result
of asynchronous computation.

Future<Integer> future =
executor.submit(task);

future.get();

===============================================================================
COMPLETABLEFUTURE
===============================================================================

Java 8+

Supports asynchronous programming.

CompletableFuture

.supplyAsync()

.thenApply()

.thenAccept()

.exceptionally()

===============================================================================
CONCURRENT COLLECTIONS
===============================================================================

ConcurrentHashMap

CopyOnWriteArrayList

BlockingQueue

ConcurrentLinkedQueue

Thread-safe collections.

===============================================================================
JAVA MEMORY MODEL (INTRO)
===============================================================================

Defines rules for

Memory Visibility

Instruction Reordering

Synchronization

volatile

synchronized

Atomic Classes

are based on JMM.

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Calling run() directly.

❌ Forgetting synchronization.

❌ Ignoring InterruptedException.

❌ Creating thousands of threads.

❌ Using Thread.stop()
(Deprecated)

===============================================================================
BEST PRACTICES
===============================================================================

✔ Prefer ExecutorService.

✔ Use Runnable or Callable.

✔ Minimize synchronized blocks.

✔ Prefer concurrent collections.

✔ Use Atomic classes.

✔ Shutdown executors properly.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

✔ Spring Boot Request Handling

✔ Web Servers

✔ Download Managers

✔ Multiplayer Games

✔ Banking Systems

✔ Chat Applications

✔ Stock Market Systems

✔ Background Email Sending

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is a Thread?

Smallest unit of execution
inside a process.

--------------------------------------------------------

Q2 Difference between Process and Thread?

Process

Independent

Own Memory

Thread

Shares Process Memory

--------------------------------------------------------

Q3 Difference between Thread
and Runnable?

Thread

Class

Runnable

Interface

Runnable is preferred.

--------------------------------------------------------

Q4 Difference between start()
and run()?

start()

Creates new thread.

run()

Normal method.

--------------------------------------------------------

Q5 What is Synchronization?

Restricts access to
critical section.

--------------------------------------------------------

Q6 What causes Deadlock?

Circular waiting
for locks.

--------------------------------------------------------

Q7 Difference between volatile
and synchronized?

volatile

Visibility only.

synchronized

Visibility + Mutual Exclusion.

--------------------------------------------------------

Q8 Why use ExecutorService?

Thread Pool Management.

Better performance.

--------------------------------------------------------

Q9 Difference between Runnable
and Callable?

Runnable

No return value.

Callable

Returns value
and throws exceptions.

--------------------------------------------------------

Q10 What is ConcurrentHashMap?

Thread-safe HashMap
designed for concurrent access.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Create Thread using Thread class.

2. Create Thread using Runnable.

3. Thread Sleep Demo.

4. Thread Join Demo.

5. Synchronization Example.

6. Producer Consumer.

7. Deadlock Example.

8. AtomicInteger Counter.

9. ExecutorService Demo.

10. CompletableFuture Example.

11. ConcurrentHashMap Demo.

12. Thread Pool Example.

===============================================================================
QUICK REVISION
===============================================================================

✔ Process = Program

✔ Thread = Smallest execution unit

✔ Main Thread starts every Java program

✔ start() creates thread

✔ Runnable preferred

✔ Synchronization prevents race conditions

✔ volatile = Visibility

✔ ExecutorService = Thread Pool

✔ Callable returns values

✔ CompletableFuture = Async Programming

✔ Concurrent Collections = Thread Safety

===============================================================================
NEXT TOPIC
===============================================================================

24_Java8_Features.java

Topics

• Lambda Expressions
• Functional Interfaces
• Method References
• Optional
• Stream API Overview
• Default Methods
• Static Interface Methods
• Date & Time API
• Nashorn
• Interview Questions

===============================================================================
*/