/*
===============================================================================
                      JAVA COLLECTIONS FRAMEWORK (JCF)
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY DO WE NEED COLLECTIONS?
===============================================================================

Suppose you're building an E-Commerce application.

You need to store

✔ Customers

✔ Orders

✔ Products

✔ Payments

Can we use arrays?

Example

Product[] products = new Product[100];

Problems

❌ Fixed Size

❌ Difficult insertion

❌ Difficult deletion

❌ Searching is manual

❌ Poor scalability

Collections solve these problems.

===============================================================================
WHAT IS THE COLLECTIONS FRAMEWORK?
===============================================================================

The Java Collections Framework (JCF) is a unified architecture
for storing and manipulating groups of objects.

It provides

✔ Interfaces

✔ Implementations

✔ Algorithms

✔ Utility Classes

Benefits

✔ Dynamic Size

✔ High Performance

✔ Reusable Data Structures

✔ Standard APIs

===============================================================================
COLLECTIONS HIERARCHY
===============================================================================

                        Iterable
                            │
                       Collection
        ┌──────────────┼──────────────┐
        │              │              │
       List           Set           Queue
        │              │              │
 ┌──────┼──────┐   ┌────┼────┐        │
 │      │      │   │    │    │        │
ArrayList LinkedList Vector HashSet LinkedHashSet TreeSet PriorityQueue
                  │
                Stack

Map is NOT part of Collection.

                 Map
                  │
       ┌──────────┼─────────────┐
       │          │             │
    HashMap LinkedHashMap TreeMap

===============================================================================
COLLECTION vs COLLECTIONS
===============================================================================

Collection

Interface

Represents a group of objects.

--------------------------------------------

Collections

Utility Class

Contains helper methods

sort()

reverse()

shuffle()

binarySearch()

max()

min()

===============================================================================
ITERABLE
===============================================================================

Root interface for iteration.

Provides

iterator()

Every collection implements Iterable.

Allows

for-each loop

===============================================================================
LIST INTERFACE
===============================================================================

List

Ordered Collection

Allows duplicates.

Maintains insertion order.

Examples

ArrayList

LinkedList

Vector

Stack

===============================================================================
ARRAYLIST
===============================================================================

Most commonly used implementation.

Internally uses

Dynamic Array

Example

ArrayList<String> names =
new ArrayList<>();

===============================================================================
HOW ARRAYLIST WORKS
===============================================================================

Initial Capacity

10

When full

↓

Creates larger array

↓

Copies old elements

↓

Adds new element

Growth

Old Capacity

10

↓

New Capacity

15

(Java 8: approximately 1.5x growth)

===============================================================================
ARRAYLIST TIME COMPLEXITY
===============================================================================

Access

O(1)

--------------------------------

Search

O(n)

--------------------------------

Insert End

Amortized O(1)

--------------------------------

Insert Middle

O(n)

--------------------------------

Delete

O(n)

===============================================================================
WHEN TO USE ARRAYLIST?
===============================================================================

✔ Frequent reads

✔ Random access

✔ Rare insertions/deletions

Examples

Student Records

Product Catalog

Movie List

===============================================================================
LINKEDLIST
===============================================================================

Implemented using

Doubly Linked List

Memory

Node

↓

Previous

↓

Data

↓

Next

===============================================================================
LINKEDLIST VISUALIZATION
===============================================================================

NULL

↓

[A]

↔

[B]

↔

[C]

↓

NULL

===============================================================================
LINKEDLIST COMPLEXITY
===============================================================================

Access

O(n)

--------------------------------

Insert Beginning

O(1)

--------------------------------

Insert Middle

O(n)

--------------------------------

Delete Beginning

O(1)

--------------------------------

Delete Middle

O(n)

===============================================================================
WHEN TO USE LINKEDLIST?
===============================================================================

✔ Frequent insertions

✔ Frequent deletions

✔ Queue Implementation

Not ideal for random access.

===============================================================================
VECTOR
===============================================================================

Older synchronized dynamic array.

Thread Safe

Slower than ArrayList.

Rarely used today.

===============================================================================
STACK
===============================================================================

Implements

LIFO

Last In First Out

Operations

push()

pop()

peek()

Example

Books

↓

Top Book removed first.

===============================================================================
QUEUE
===============================================================================

FIFO

First In First Out

Example

Printer Queue

Customers

Task Scheduling

===============================================================================
PRIORITYQUEUE
===============================================================================

Elements ordered by priority.

Smallest element removed first by default.

Internally uses

Binary Heap

Complexity

Insert

O(log n)

Delete

O(log n)

Peek

O(1)

===============================================================================
SET INTERFACE
===============================================================================

Stores

Unique Elements

No duplicates allowed.

Implementations

HashSet

LinkedHashSet

TreeSet

===============================================================================
HASHSET
===============================================================================

Internally backed by

HashMap

Characteristics

✔ No duplicates

✔ No ordering guarantee

✔ Fast lookup

Complexity

Add

O(1)

Search

O(1)

Delete

O(1)

Average case.

===============================================================================
LINKEDHASHSET
===============================================================================

HashSet +

Linked List

Maintains insertion order.

Slightly slower.

===============================================================================
TREESET
===============================================================================

Internally uses

Red-Black Tree

Keeps elements sorted.

Complexity

Add

O(log n)

Search

O(log n)

Delete

O(log n)

===============================================================================
MAP INTERFACE
===============================================================================

Stores

Key → Value

Pairs.

Keys

Unique

Values

May repeat

===============================================================================
HASHMAP
===============================================================================

Most important Map implementation.

Internally uses

Hash Table

(Java 8+

Bucket becomes Red-Black Tree
after threshold.)

===============================================================================
HASHMAP STRUCTURE
===============================================================================

Hash Function

↓

Bucket Index

↓

Bucket

↓

Entry

Key

Value

===============================================================================
HASHMAP COMPLEXITY
===============================================================================

put()

O(1)

Average

--------------------------------

get()

O(1)

Average

--------------------------------

remove()

O(1)

Average

Worst Case

O(n)

(Treeification improves worst-case after threshold)

===============================================================================
HASH COLLISION
===============================================================================

Two keys produce same bucket.

Handled using

Linked List

(Java 7)

↓

Red-Black Tree

(Java 8+

after bucket threshold)

===============================================================================
LINKEDHASHMAP
===============================================================================

HashMap +

Linked List

Maintains insertion order.

Useful for

LRU Cache

===============================================================================
TREEMAP
===============================================================================

Implemented using

Red-Black Tree

Automatically sorts keys.

Complexity

O(log n)

===============================================================================
HASHTABLE
===============================================================================

Legacy Class

Thread Safe

Synchronized

Slower than HashMap.

Mostly replaced by

ConcurrentHashMap

===============================================================================
ITERATOR
===============================================================================

Used to traverse collections.

Example

Iterator<String> it =
list.iterator();

while(it.hasNext()){

    System.out.println(it.next());

}

===============================================================================
LISTITERATOR
===============================================================================

Supports

Forward Traversal

Backward Traversal

Modification

Only for List.

===============================================================================
FOR-EACH LOOP
===============================================================================

for(String name : list){

    System.out.println(name);

}

Internally uses Iterator.

===============================================================================
FAIL-FAST ITERATOR
===============================================================================

If collection changes during iteration,

ConcurrentModificationException

is thrown.

Example

ArrayList

HashMap

HashSet

===============================================================================
FAIL-SAFE ITERATOR
===============================================================================

Works on a copy.

No exception.

Examples

CopyOnWriteArrayList

ConcurrentHashMap iterators

===============================================================================
COMPARABLE
===============================================================================

Natural Ordering.

Implemented inside class.

Example

class Student
implements Comparable<Student>{

}

Method

compareTo()

===============================================================================
COMPARATOR
===============================================================================

External sorting logic.

Allows multiple sorting strategies.

Example

Sort by

Age

Salary

Name

Marks

===============================================================================
COLLECTIONS UTILITY CLASS
===============================================================================

Collections.sort()

Collections.reverse()

Collections.shuffle()

Collections.binarySearch()

Collections.max()

Collections.min()

Collections.frequency()

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Using ArrayList for frequent insertions.

❌ Using HashSet expecting sorted data.

❌ Using HashMap when ordering matters.

❌ Modifying collection while iterating.

❌ Ignoring equals() and hashCode()
when storing custom objects in HashSet or HashMap.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use interfaces in variable declarations.

List<String> list =
new ArrayList<>();

NOT

ArrayList<String> list

unless implementation-specific features are required.

✔ Choose collection based on use case.

✔ Override equals() and hashCode() properly.

✔ Prefer ArrayDeque over Stack for stack behavior.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

ArrayList

Shopping Cart

----------------------------------------

HashMap

Caching

Employee Lookup

----------------------------------------

HashSet

Unique Email Addresses

----------------------------------------

PriorityQueue

Task Scheduling

CPU Scheduling

----------------------------------------

TreeMap

Sorted Leaderboards

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Difference between ArrayList and LinkedList?

ArrayList

Fast Random Access

LinkedList

Fast Insert/Delete

--------------------------------------------------------

Q2 Difference between HashMap and Hashtable?

HashMap

Not synchronized

Allows one null key

Hashtable

Synchronized

No null keys or values

--------------------------------------------------------

Q3 Difference between HashSet and TreeSet?

HashSet

Unordered

O(1)

TreeSet

Sorted

O(log n)

--------------------------------------------------------

Q4 Difference between Comparable and Comparator?

Comparable

Natural ordering

Inside class

Comparator

Custom ordering

Separate class/object

--------------------------------------------------------

Q5 Why is HashMap so fast?

Hashing enables average O(1)
lookup, insertion, and removal.

--------------------------------------------------------

Q6 Why must equals() and hashCode()
be overridden together?

Objects that are equal must produce
the same hash code to ensure correct
behavior in hash-based collections.

--------------------------------------------------------

Q7 What causes ConcurrentModificationException?

Structural modification of a collection
during fail-fast iteration.

--------------------------------------------------------

Q8 Difference between Collection and Collections?

Collection

Interface

Collections

Utility class

--------------------------------------------------------

Q9 Which collection maintains insertion order?

ArrayList

LinkedHashSet

LinkedHashMap

--------------------------------------------------------

Q10 Which collection automatically sorts data?

TreeSet

TreeMap

===============================================================================
TIME COMPLEXITY SUMMARY
===============================================================================

ArrayList

Access        O(1)

Search        O(n)

Insert End    Amortized O(1)

Insert Middle O(n)

--------------------------------------------

LinkedList

Access        O(n)

Insert Head   O(1)

Delete Head   O(1)

--------------------------------------------

HashMap

Put           O(1) Avg

Get           O(1) Avg

Remove        O(1) Avg

--------------------------------------------

TreeMap

Put           O(log n)

Get           O(log n)

Remove        O(log n)

--------------------------------------------

HashSet

Add           O(1) Avg

Contains      O(1) Avg

Remove        O(1) Avg

--------------------------------------------

TreeSet

Add           O(log n)

Contains      O(log n)

Remove        O(log n)

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Student Management using ArrayList.

2. Remove duplicates using HashSet.

3. Word Frequency using HashMap.

4. Sort Employees using Comparable.

5. Sort Employees using Comparator.

6. PriorityQueue demo.

7. LinkedHashMap LRU simulation.

8. Iterate collections using Iterator.

9. Reverse list using Collections.reverse().

10. Frequency counter using HashMap.

11. Phone Book application.

12. Inventory management.

13. Voting system (unique voters).

14. Leaderboard using TreeMap.

15. Library management.

===============================================================================
QUICK REVISION
===============================================================================

✔ Collection = Interface

✔ Collections = Utility Class

✔ List = Ordered + Duplicates

✔ Set = Unique Elements

✔ Queue = FIFO

✔ Map = Key-Value Pairs

✔ ArrayList = Dynamic Array

✔ LinkedList = Doubly Linked List

✔ HashSet = Unique + Fast

✔ TreeSet = Sorted

✔ HashMap = Hash Table

✔ TreeMap = Sorted Map

✔ Comparable = Natural Ordering

✔ Comparator = Custom Ordering

✔ Iterator = Traversal

===============================================================================
NEXT TOPIC
===============================================================================

21_Generics.java

Topics

• What are Generics?
• Why Generics?
• Generic Classes
• Generic Methods
• Bounded Types
• Wildcards (? extends, ? super)
• Type Erasure
• PECS Principle
• Generic Collections
• Interview Questions

===============================================================================
*/