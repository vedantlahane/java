/*
===============================================================================
                             JAVA STREAM API
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY WAS STREAM API INTRODUCED?
===============================================================================

Before Java 8

Processing collections required

Loops

Conditions

Temporary variables

Example

Find all students with marks > 80.

Traditional

for loop

↓

if condition

↓

Store in new list

↓

Print

Large amount of code.

Java 8 introduced

Streams

to process data declaratively.

===============================================================================
WHAT IS A STREAM?
===============================================================================

A Stream is a sequence of elements
that supports functional-style operations
on data.

Important

A Stream does NOT store data.

It processes data from a source.

Source

↓

Operations

↓

Result

===============================================================================
STREAM SOURCES
===============================================================================

Collection

↓

List

Set

Queue

----------------------------------------

Arrays

----------------------------------------

Files

----------------------------------------

Streams.of()

----------------------------------------

Random Numbers

----------------------------------------

Infinite Streams

===============================================================================
STREAM PIPELINE
===============================================================================

Source

↓

Intermediate Operations

↓

Terminal Operation

Example

List

↓

filter()

↓

map()

↓

collect()

===============================================================================
CHARACTERISTICS OF STREAMS
===============================================================================

✔ Functional

✔ Lazy Evaluation

✔ Does not modify original collection

✔ Can be Parallel

✔ One-Time Use

===============================================================================
CREATING STREAMS
===============================================================================

From List

list.stream()

----------------------------------------

From Array

Arrays.stream(arr)

----------------------------------------

Using Stream.of()

Stream.of(1,2,3)

----------------------------------------

Infinite Stream

Stream.generate()

Stream.iterate()

===============================================================================
STREAM LIFE CYCLE
===============================================================================

Collection

↓

Stream Created

↓

Intermediate Operations

↓

Terminal Operation

↓

Stream Closed

===============================================================================
INTERMEDIATE OPERATIONS
===============================================================================

Intermediate operations

Return another Stream.

Lazy.

Examples

filter()

map()

flatMap()

distinct()

sorted()

peek()

limit()

skip()

===============================================================================
TERMINAL OPERATIONS
===============================================================================

Produces final result.

Consumes Stream.

Examples

collect()

count()

forEach()

reduce()

findFirst()

findAny()

min()

max()

toArray()

===============================================================================
FILTER
===============================================================================

Selects matching elements.

Example

List<Integer> numbers =
List.of(10,20,30,40);

numbers.stream()

.filter(n -> n > 20)

.forEach(System.out::println);

Output

30

40

===============================================================================
MAP
===============================================================================

Transforms data.

Example

names.stream()

.map(String::toUpperCase)

.forEach(System.out::println);

Input

Vedant

Rahul

Output

VEDANT

RAHUL

===============================================================================
FLATMAP
===============================================================================

Converts

Stream<Stream<T>>

↓

Stream<T>

Useful for nested collections.

Example

List<List<String>>

↓

Stream<String>

===============================================================================
DISTINCT
===============================================================================

Removes duplicates.

Example

List.of(1,2,2,3,3,4)

↓

distinct()

↓

1 2 3 4

===============================================================================
SORTED
===============================================================================

Natural Sorting

stream.sorted()

----------------------------------------

Custom Sorting

stream.sorted(

Comparator.reverseOrder()

)

===============================================================================
LIMIT
===============================================================================

Returns first

n

elements.

Example

stream.limit(5);

===============================================================================
SKIP
===============================================================================

Skips first

n

elements.

Example

stream.skip(3);

===============================================================================
PEEK
===============================================================================

Used for debugging.

Example

stream.peek(

System.out::println

)

Should not modify data.

===============================================================================
COLLECT
===============================================================================

Most commonly used
terminal operation.

Collects Stream
into collection.

Example

List<String> list =

stream.collect(

Collectors.toList()

);

===============================================================================
COMMON COLLECTORS
===============================================================================

toList()

toSet()

joining()

counting()

mapping()

groupingBy()

partitioningBy()

summarizingInt()

averagingDouble()

===============================================================================
GROUPINGBY
===============================================================================

Groups elements.

Example

Employees

↓

Department

↓

List of Employees

Similar to SQL

GROUP BY

===============================================================================
PARTITIONINGBY
===============================================================================

Splits into

Two Groups

True

False

Example

Age >= 18

Adult

Minor

===============================================================================
REDUCE
===============================================================================

Combines all elements
into one result.

Example

List.of(1,2,3,4)

↓

reduce(Integer::sum)

Output

10

===============================================================================
COUNT
===============================================================================

Returns total elements.

stream.count();

===============================================================================
MIN AND MAX
===============================================================================

stream.min()

stream.max()

Uses Comparator.

===============================================================================
MATCH OPERATIONS
===============================================================================

anyMatch()

allMatch()

noneMatch()

Return

boolean

===============================================================================
FINDFIRST
===============================================================================

Returns

Optional<T>

First matching element.

===============================================================================
FINDANY
===============================================================================

Useful in parallel streams.

May return any matching element.

===============================================================================
OPTIONAL WITH STREAMS
===============================================================================

stream.findFirst()

.ifPresent(

System.out::println

);

===============================================================================
FOREACH
===============================================================================

Executes action
for every element.

Example

stream.forEach(

System.out::println

);

===============================================================================
PARALLEL STREAM
===============================================================================

Uses multiple CPU cores.

Example

list.parallelStream()

.filter(...)

.map(...)

.collect(...)

===============================================================================
WHEN TO USE PARALLEL STREAMS?
===============================================================================

Large datasets

CPU-intensive work

Independent operations

Avoid for

Small collections

Blocking IO

===============================================================================
STREAM VS COLLECTION
===============================================================================

Collection

Stores data

----------------------------------------

Stream

Processes data

----------------------------------------

Collection

Reusable

----------------------------------------

Stream

One-time use

===============================================================================
STREAM REUSE
===============================================================================

Wrong

Stream<String> stream =
list.stream();

stream.count();

stream.forEach(...);

Runtime Error

IllegalStateException

A stream can be consumed only once.

===============================================================================
LAZY EVALUATION
===============================================================================

Intermediate operations
do not execute immediately.

Execution begins only
when terminal operation
is called.

Example

stream.filter(...)

Nothing happens.

Add

collect()

Now processing starts.

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Reusing streams.

----------------------------------------

❌ Using parallel streams
for tiny collections.

----------------------------------------

❌ Modifying source
inside stream.

----------------------------------------

❌ Side effects inside map().

----------------------------------------

❌ Forgetting terminal operation.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Prefer Streams
for collection processing.

✔ Keep pipelines readable.

✔ Use method references.

✔ Avoid modifying external state.

✔ Prefer Collectors.

✔ Use parallel streams carefully.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Filter Products

products.stream()

.filter(p -> p.getPrice() > 1000)

----------------------------------------

Sort Employees

employees.stream()

.sorted(...)

----------------------------------------

Group Students

Collectors.groupingBy()

----------------------------------------

Calculate Total Sales

reduce()

----------------------------------------

Generate Reports

collect()

===============================================================================
STREAM OPERATION FLOW
===============================================================================

Collection

↓

stream()

↓

filter()

↓

map()

↓

sorted()

↓

collect()

↓

Result

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is Stream API?

A functional API
for processing collections.

--------------------------------------------------------

Q2 Does Stream store data?

No.

It processes data.

--------------------------------------------------------

Q3 Difference between
Collection and Stream?

Collection stores data.

Stream processes data.

--------------------------------------------------------

Q4 Difference between
map() and flatMap()?

map()

One-to-one transformation.

flatMap()

Flattens nested structures.

--------------------------------------------------------

Q5 Difference between
Intermediate and Terminal operations?

Intermediate

Return Stream.

Lazy.

Terminal

Produce final result.

--------------------------------------------------------

Q6 Why are Streams lazy?

To improve performance
by avoiding unnecessary work.

--------------------------------------------------------

Q7 Can Streams be reused?

No.

--------------------------------------------------------

Q8 Difference between
findFirst() and findAny()?

findFirst()

First element.

findAny()

Any matching element.

Useful in parallel streams.

--------------------------------------------------------

Q9 What does reduce() do?

Combines all elements
into one value.

--------------------------------------------------------

Q10 When should Parallel Streams
be avoided?

Small collections,

Blocking IO,

Order-sensitive operations.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Filter even numbers.

2. Square all numbers.

3. Convert names to uppercase.

4. Remove duplicates.

5. Sort employees.

6. Find maximum salary.

7. Count students.

8. Group employees by department.

9. Calculate average marks.

10. Join names into one String.

11. Word frequency using Streams.

12. Parallel stream example.

===============================================================================
QUICK REVISION
===============================================================================

✔ Stream processes data

✔ Stream does not store data

✔ Intermediate Operations are lazy

✔ Terminal Operations produce results

✔ filter() selects

✔ map() transforms

✔ flatMap() flattens

✔ reduce() combines

✔ collect() gathers

✔ Parallel Streams use multiple cores

✔ Streams are one-time use

===============================================================================
NEXT TOPIC
===============================================================================

26_Date_Time_API.java

Topics

• LocalDate

• LocalTime

• LocalDateTime

• Instant

• ZonedDateTime

• Duration

• Period

• DateTimeFormatter

• Time Zones

• Legacy Date vs java.time

• Interview Questions

===============================================================================
*/