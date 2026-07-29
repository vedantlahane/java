/*
===============================================================================
                      JAVA ADVANCED CONCURRENCY
===============================================================================

Author : Vedant
Module : Professional Java

===============================================================================
WHY ADVANCED CONCURRENCY?
===============================================================================

Basic Multithreading teaches

✔ Threads

✔ Runnable

✔ Synchronization

Modern Java applications need much more.

Examples

✔ High Traffic REST APIs

✔ Banking Systems

✔ Gaming Servers

✔ Trading Platforms

✔ Search Engines

✔ Cloud Applications

Java provides

java.util.concurrent

to solve these problems efficiently.

===============================================================================
PACKAGE
===============================================================================

java.util.concurrent

Introduced in

Java 5

Contains

Locks

Executors

Atomic Classes

Concurrent Collections

Thread Pools

Synchronization Utilities

===============================================================================
JAVA MEMORY MODEL (JMM)
===============================================================================

One of the most important
interview topics.

Defines rules for

✔ Memory Visibility

✔ Instruction Reordering

✔ Synchronization

Without JMM

Different CPU cores

may observe different values.

===============================================================================
THREAD MEMORY
===============================================================================

Main Memory

        ▲

        │

--------------------------

Thread A Cache

Thread B Cache

--------------------------

A thread may read

cached value

instead of

latest value.

===============================================================================
MEMORY VISIBILITY PROBLEM
===============================================================================

boolean running = true;

Thread A

while(running){

}

Thread B

running = false;

Without synchronization,

Thread A

may never see

false.

===============================================================================
VOLATILE (DEEP DIVE)
===============================================================================

volatile ensures

✔ Visibility

NOT

✔ Atomicity

Example

volatile boolean running;

All threads observe
latest value.

===============================================================================
ATOMICITY
===============================================================================

count++;

Actually means

Read

↓

Increment

↓

Write

Three operations.

Not atomic.

===============================================================================
ATOMIC CLASSES
===============================================================================

Package

java.util.concurrent.atomic

Examples

AtomicInteger

AtomicLong

AtomicBoolean

AtomicReference

===============================================================================
ATOMICINTEGER
===============================================================================

AtomicInteger counter =

new AtomicInteger(0);

counter.incrementAndGet();

counter.decrementAndGet();

counter.compareAndSet(5,10);

===============================================================================
COMPARE AND SWAP (CAS)
===============================================================================

Hardware-level operation.

Read Value

↓

Compare

↓

Update

No locking required.

Atomic classes use CAS.

===============================================================================
LOCKS
===============================================================================

Alternative to synchronized.

Package

java.util.concurrent.locks

More flexible.

===============================================================================
REENTRANTLOCK
===============================================================================

Allows explicit locking.

Example

lock.lock();

try{

}

finally{

    lock.unlock();

}

Advantages

✔ Fairness

✔ Try Lock

✔ Interruptible

===============================================================================
TRYLOCK
===============================================================================

Attempts lock.

Does not block forever.

Example

lock.tryLock();

Returns

true

or

false

===============================================================================
READWRITELOCK
===============================================================================

Two locks

Read Lock

Write Lock

Many readers

↓

One writer

Ideal for

Caches

Configuration

Reference Data

===============================================================================
STAMPEDLOCK
===============================================================================

Introduced in Java 8.

Provides

Optimistic Reading

Higher performance

than ReadWriteLock
for read-heavy workloads.

===============================================================================
SEMAPHORE
===============================================================================

Controls number
of concurrent threads.

Example

Parking Lot

Only

100 Cars

Semaphore

permits = 100

===============================================================================
COUNTDOWNLATCH
===============================================================================

One thread waits

until others finish.

Example

Main Thread

↓

Wait

↓

5 Workers Finish

↓

Continue

===============================================================================
CYCLICBARRIER
===============================================================================

Multiple threads wait
for each other.

Once everyone arrives

↓

All proceed together.

Useful for

Parallel Algorithms

===============================================================================
PHASER
===============================================================================

Advanced version

of

CyclicBarrier

Supports

Dynamic Participants.

===============================================================================
EXCHANGER
===============================================================================

Allows two threads

to exchange objects.

Useful in

Producer Consumer

Algorithms

===============================================================================
BLOCKINGQUEUE
===============================================================================

Thread-safe Queue.

Examples

ArrayBlockingQueue

LinkedBlockingQueue

PriorityBlockingQueue

DelayQueue

===============================================================================
PRODUCER CONSUMER
===============================================================================

Producer

↓

BlockingQueue

↓

Consumer

Queue blocks automatically.

No manual synchronization.

===============================================================================
FORK JOIN FRAMEWORK
===============================================================================

Introduced in Java 7.

Divide

↓

Process

↓

Merge

Suitable for

Recursive Problems

Large Arrays

Sorting

===============================================================================
FORKJOINPOOL
===============================================================================

Uses

Work Stealing Algorithm

Idle threads steal work

from busy threads.

Improves CPU utilization.

===============================================================================
COMPLETABLEFUTURE
===============================================================================

Modern asynchronous programming.

Supports

thenApply()

thenCompose()

thenCombine()

thenAccept()

exceptionally()

handle()

allOf()

anyOf()

===============================================================================
CHAINING
===============================================================================

CompletableFuture

↓

Supply Data

↓

Transform

↓

Store

↓

Return

Without blocking.

===============================================================================
SCHEDULEDEXECUTOR
===============================================================================

Runs tasks

after delay

or periodically.

Replaces

Timer

TimerTask

===============================================================================
THREAD POOL TYPES
===============================================================================

Fixed Thread Pool

Cached Thread Pool

Single Thread Executor

Scheduled Executor

Work Stealing Pool

===============================================================================
CONCURRENT COLLECTIONS
===============================================================================

ConcurrentHashMap

CopyOnWriteArrayList

ConcurrentLinkedQueue

ConcurrentSkipListMap

ConcurrentSkipListSet

===============================================================================
COPYONWRITEARRAYLIST
===============================================================================

Every modification

creates new copy.

Excellent for

Many Reads

Few Writes

===============================================================================
CONCURRENTHASHMAP
===============================================================================

Thread-safe HashMap.

No global synchronization.

Supports high concurrency.

===============================================================================
THREADLOCAL
===============================================================================

Each thread gets

its own copy

of variable.

Useful for

Database Connections

User Context

Transactions

===============================================================================
DEADLOCK PREVENTION
===============================================================================

Acquire locks

in consistent order.

Avoid nested locking.

Use timeout.

Prefer tryLock().

===============================================================================
LIVELOCK
===============================================================================

Threads keep reacting

to each other

without making progress.

===============================================================================
STARVATION
===============================================================================

One thread

never receives CPU time.

Can occur

with unfair scheduling.

===============================================================================
FALSE SHARING
===============================================================================

Multiple threads

modify nearby memory

causing cache contention.

High-performance systems

avoid false sharing.

===============================================================================
VIRTUAL THREADS
===============================================================================

Introduced

Java 21

Project Loom

Thousands

or even millions

of lightweight threads.

Ideal for

Web Servers

Microservices

Database Applications

===============================================================================
PLATFORM THREAD
===============================================================================

OS Thread

Heavyweight

Limited

===============================================================================
VIRTUAL THREAD
===============================================================================

Managed by JVM

Lightweight

Scalable

Massive Concurrency

===============================================================================
STRUCTURED CONCURRENCY
===============================================================================

Modern approach

for managing

multiple concurrent tasks

as one logical unit.

Introduced with

Project Loom.

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Synchronizing everything.

❌ Using volatile
instead of AtomicInteger.

❌ Forgetting unlock().

❌ Creating too many threads.

❌ Blocking inside parallel streams.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Prefer ExecutorService.

✔ Prefer CompletableFuture.

✔ Use Atomic classes.

✔ Use Concurrent Collections.

✔ Keep synchronized blocks small.

✔ Avoid shared mutable state.

✔ Prefer immutable objects.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Spring Boot

↓

Request Thread Pool

----------------------------------------

Kafka

↓

Concurrent Consumers

----------------------------------------

Redis Cache

↓

ConcurrentHashMap

----------------------------------------

Airline Booking

↓

Semaphore

----------------------------------------

Trading Systems

↓

ForkJoin

CompletableFuture

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is Java Memory Model?

Rules governing memory visibility,
ordering, and synchronization.

--------------------------------------------------------

Q2 Difference between

volatile

and

AtomicInteger?

volatile

Visibility only.

AtomicInteger

Visibility + Atomic Operations.

--------------------------------------------------------

Q3 Difference between

synchronized

and

ReentrantLock?

ReentrantLock provides

tryLock()

fair locking

interruptible locking.

--------------------------------------------------------

Q4 What is CAS?

Compare-And-Swap.

Lock-free atomic operation.

--------------------------------------------------------

Q5 Difference between

CountDownLatch

and

CyclicBarrier?

CountDownLatch

One-time use.

CyclicBarrier

Reusable.

--------------------------------------------------------

Q6 Why use BlockingQueue?

Automatically synchronizes
Producer-Consumer communication.

--------------------------------------------------------

Q7 What is ForkJoinPool?

Thread pool using
Work Stealing Algorithm.

--------------------------------------------------------

Q8 What are Virtual Threads?

Lightweight JVM-managed threads
introduced in Java 21.

--------------------------------------------------------

Q9 Which concurrent collection
replaces synchronized HashMap?

ConcurrentHashMap.

--------------------------------------------------------

Q10 Which package contains
advanced concurrency classes?

java.util.concurrent

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Atomic Counter.

2. ReentrantLock Demo.

3. ReadWriteLock Example.

4. Semaphore Parking Lot.

5. CountDownLatch Workers.

6. CyclicBarrier Race.

7. BlockingQueue Producer Consumer.

8. CompletableFuture Chain.

9. ThreadLocal Database Context.

10. Virtual Thread Example (Java 21).

===============================================================================
QUICK REVISION
===============================================================================

✔ JMM defines memory behavior

✔ volatile = Visibility

✔ AtomicInteger = Atomic Operations

✔ ReentrantLock > synchronized (more features)

✔ Semaphore controls permits

✔ CountDownLatch waits once

✔ CyclicBarrier synchronizes groups

✔ CompletableFuture = Async Programming

✔ ConcurrentHashMap = Thread-safe Map

✔ Virtual Threads = Massive Concurrency

===============================================================================
NEXT TOPIC
===============================================================================

33_Java_Networking.java

Topics

• TCP/IP

• UDP

• Socket Programming

• ServerSocket

• DatagramSocket

• URL

• URI

• HttpURLConnection

• Java HttpClient

• REST Communication

• WebSockets

• Interview Questions

===============================================================================
*/