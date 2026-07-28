/*
===============================================================================
                 JAVA STRING, STRINGBUILDER & STRINGBUFFER
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY DO WE NEED STRINGS?
===============================================================================

Computers process numbers efficiently.

However, real-world applications mainly deal with text.

Examples

✔ User Names

✔ Passwords

✔ Email Addresses

✔ JSON

✔ XML

✔ SQL Queries

✔ File Paths

✔ URLs

✔ HTTP Requests

Java stores textual data using

String

===============================================================================
WHAT IS A STRING?
===============================================================================

A String is a sequence of Unicode characters.

Example

String name = "Vedant";

Internally

V e d a n t

Unlike C,

Java Strings are Objects.

String belongs to

java.lang

No import required.

===============================================================================
STRING CREATION
===============================================================================

Method 1

Using String Literal

String s = "Java";

--------------------------------------------

Method 2

Using new Keyword

String s = new String("Java");

Both create String objects

But memory behavior differs.

===============================================================================
STRING POOL
===============================================================================

One of Java's biggest optimizations.

String literals are stored in a special memory area called

String Constant Pool (SCP)

Example

String s1 = "Java";

String s2 = "Java";

Only ONE object is created.

Memory

Stack

s1 -----

         |

s2 ----- |

         |

         ▼

String Pool

+---------------+

| "Java"        |

+---------------+

===============================================================================
USING new STRING()
===============================================================================

String s1 = new String("Java");

String s2 = new String("Java");

Now

Two different heap objects

are created.

Memory

Heap

+---------------+

| "Java"        |

+---------------+

+---------------+

| "Java"        |

+---------------+

Different references.

===============================================================================
WHY STRING POOL?
===============================================================================

Advantages

✔ Saves Memory

✔ Improves Performance

✔ Reuses Objects

Millions of applications use identical strings like

"GET"

"POST"

"true"

"false"

"admin"

Java avoids duplicate storage.

===============================================================================
IMMUTABILITY
===============================================================================

Strings are Immutable.

Meaning

Once created,

they cannot be changed.

Example

String s = "Java";

s.concat(" Programming");

Output

Java

Original String remains unchanged.

===============================================================================
WHY IMMUTABLE?
===============================================================================

Security

Strings store

Passwords

URLs

Database Connections

File Paths

Network Addresses

If Strings were mutable,

security risks would increase.

Other Benefits

✔ Thread Safe

✔ String Pool

✔ HashMap Performance

✔ Safe Sharing

===============================================================================
STRING CONCATENATION
===============================================================================

String a = "Java";

String b = a.concat(" Programming");

a

↓

Java

b

↓

Java Programming

Original object never changes.

===============================================================================
STRING MEMORY
===============================================================================

String s = "Java";

s = s + " 21";

Step 1

"Java"

Step 2

Create

"Java 21"

Step 3

Reference changes

Old object becomes eligible for GC.

===============================================================================
STRING METHODS
===============================================================================

length()

charAt()

substring()

equals()

equalsIgnoreCase()

contains()

startsWith()

endsWith()

replace()

replaceAll()

split()

trim()

toUpperCase()

toLowerCase()

isEmpty()

isBlank()

indexOf()

lastIndexOf()

repeat()

strip()

lines()

===============================================================================
length()
===============================================================================

String name = "Vedant";

System.out.println(name.length());

Output

6

===============================================================================
charAt()
===============================================================================

String language = "Java";

language.charAt(2);

Output

v

===============================================================================
substring()
===============================================================================

String text = "Programming";

text.substring(3);

Output

gramming

--------------------------------------------

text.substring(0,4);

Output

Prog

===============================================================================
equals()
===============================================================================

Compares content.

String a = "Java";

String b = "Java";

a.equals(b)

true

===============================================================================
== OPERATOR
===============================================================================

Compares memory references.

String a = new String("Java");

String b = new String("Java");

a == b

false

Different objects.

===============================================================================
equals() vs ==
===============================================================================

==

Reference comparison

--------------------------------------------

equals()

Content comparison

Always use equals()

for String content.

===============================================================================
compareTo()
===============================================================================

Lexicographical comparison.

"Apple".compareTo("Banana")

Negative

"Dog".compareTo("Cat")

Positive

Same Strings

0

Used in sorting.

===============================================================================
split()
===============================================================================

String csv = "Java,Python,C++";

String[] arr = csv.split(",");

Result

Java

Python

C++

===============================================================================
replace()
===============================================================================

String s = "Java";

s.replace("Java","Spring");

Output

Spring

===============================================================================
trim()
===============================================================================

String s = "  Java  ";

s.trim();

Output

Java

===============================================================================
STRINGBUILDER
===============================================================================

Problem

String concatenation creates
many temporary objects.

Example

String s = "";

for(int i=0;i<1000;i++){

    s += i;

}

Thousands of String objects.

Slow.

===============================================================================
STRINGBUILDER
===============================================================================

Mutable String.

Fast.

Not Thread Safe.

Example

StringBuilder sb =
new StringBuilder();

sb.append("Java");

sb.append(" Spring");

System.out.println(sb);

Output

Java Spring

===============================================================================
COMMON STRINGBUILDER METHODS
===============================================================================

append()

insert()

delete()

replace()

reverse()

length()

capacity()

toString()

===============================================================================
append()
===============================================================================

sb.append("Java");

sb.append("21");

Result

Java21

===============================================================================
insert()
===============================================================================

sb.insert(4," Programming");

===============================================================================
delete()
===============================================================================

sb.delete(0,4);

===============================================================================
reverse()
===============================================================================

StringBuilder sb =
new StringBuilder("Java");

sb.reverse();

Output

avaJ

===============================================================================
STRINGBUFFER
===============================================================================

Same as StringBuilder

BUT

Thread Safe.

Methods are synchronized.

Slower than StringBuilder.

===============================================================================
STRING vs STRINGBUILDER vs STRINGBUFFER
===============================================================================

String

Immutable

Thread Safe

Slow concatenation

--------------------------------------------

StringBuilder

Mutable

Not Thread Safe

Fast

--------------------------------------------

StringBuffer

Mutable

Thread Safe

Slightly slower

===============================================================================
WHEN TO USE WHAT?
===============================================================================

String

Fixed text

Configuration

Keys

File names

--------------------------------------------

StringBuilder

Building JSON

Generating HTML

Loops

Reports

--------------------------------------------

StringBuffer

Multiple threads modifying
same text.

===============================================================================
STRING INTERNING
===============================================================================

intern()

Moves String into String Pool.

Example

String s =
new String("Java");

s = s.intern();

Now

String Pool reference returned.

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

if(a == b)

Use

equals()

--------------------------------------------

Mistake

Using String
inside heavy loops.

Prefer StringBuilder.

--------------------------------------------

Mistake

Ignoring immutability.

concat()

does not modify original String.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use String for fixed text.

✔ Use StringBuilder for concatenation.

✔ Use equals() for comparison.

✔ Avoid unnecessary new String().

✔ Prefer String Pool.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

REST APIs

JSON Construction

----------------------------------------

Log Generation

StringBuilder

----------------------------------------

Configuration Files

String

----------------------------------------

Multithreaded Logging

StringBuffer

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Why are Strings immutable?

Security

Performance

String Pool

Thread Safety

--------------------------------------------------------

Q2 Difference between == and equals()?

==

Reference

equals()

Content

--------------------------------------------------------

Q3 What is String Pool?

Special memory area
storing String literals.

--------------------------------------------------------

Q4 Difference between StringBuilder
and StringBuffer?

StringBuilder

Fast

Not Thread Safe

StringBuffer

Thread Safe

Synchronized

--------------------------------------------------------

Q5 Which is faster?

StringBuilder

--------------------------------------------------------

Q6 Why use StringBuilder in loops?

Avoids creation of multiple
temporary String objects.

--------------------------------------------------------

Q7 What does intern() do?

Returns pooled String reference.

--------------------------------------------------------

Q8 Can Strings be modified?

No.

They are immutable.

--------------------------------------------------------

Q9 Which package contains String?

java.lang

--------------------------------------------------------

Q10 Why does Java use String Pool?

Memory optimization and object reuse.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Reverse String.

2. Palindrome String.

3. Count vowels.

4. Count words.

5. Remove spaces.

6. Replace words.

7. Compare Strings.

8. Sort Strings.

9. Frequency of characters.

10. StringBuilder performance test.

===============================================================================
QUICK REVISION
===============================================================================

✔ String = Immutable

✔ String Pool stores literals

✔ == compares references

✔ equals() compares content

✔ StringBuilder = Mutable + Fast

✔ StringBuffer = Mutable + Thread Safe

✔ StringBuilder preferred for concatenation

✔ intern() returns pooled String

===============================================================================
NEXT TOPIC
===============================================================================

20_Collections_Framework.java

Topics

• Collections Hierarchy

• List

• Set

• Queue

• Map

• ArrayList

• LinkedList

• Vector

• Stack

• HashSet

• LinkedHashSet

• TreeSet

• PriorityQueue

• HashMap

• LinkedHashMap

• TreeMap

• Iterators

• Comparable vs Comparator

• Time Complexity

• Internal Working

• Interview Questions

===============================================================================
*/