/*
===============================================================================
                           JAVA SERIALIZATION
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY DO WE NEED SERIALIZATION?
===============================================================================

Normally

Objects exist only in memory.

When the program terminates,

Objects disappear.

Sometimes we need to

✔ Save Objects to File

✔ Send Objects over Network

✔ Cache Objects

✔ Transfer Objects between JVMs

Serialization solves this problem.

===============================================================================
WHAT IS SERIALIZATION?
===============================================================================

Serialization is the process of converting

Java Object

↓

Sequence of Bytes

These bytes can be

✔ Stored in File

✔ Sent through Network

✔ Stored in Database

===============================================================================
DESERIALIZATION
===============================================================================

Reverse Process

Sequence of Bytes

↓

Java Object

===============================================================================
VISUAL REPRESENTATION
===============================================================================

Student Object

↓

Serialization

↓

Binary Data

↓

Disk / Network

↓

Deserialization

↓

Student Object

===============================================================================
SERIALIZABLE INTERFACE
===============================================================================

Java provides

java.io.Serializable

It is a

Marker Interface.

Meaning

It contains

NO METHODS.

Example

class Student

implements Serializable{

}

===============================================================================
WHY MARKER INTERFACE?
===============================================================================

Marker interfaces provide metadata.

Examples

Serializable

Cloneable

RandomAccess

The JVM checks

whether an object is serializable.

===============================================================================
OBJECTOUTPUTSTREAM
===============================================================================

Used to serialize objects.

Example

ObjectOutputStream out =

new ObjectOutputStream(

new FileOutputStream("student.ser")

);

out.writeObject(student);

===============================================================================
OBJECTINPUTSTREAM
===============================================================================

Used to deserialize objects.

Example

ObjectInputStream in =

new ObjectInputStream(

new FileInputStream("student.ser")

);

Student s =

(Student) in.readObject();

===============================================================================
COMPLETE FLOW
===============================================================================

Create Object

↓

ObjectOutputStream

↓

student.ser

↓

ObjectInputStream

↓

Object Restored

===============================================================================
SERIALVERSIONUID
===============================================================================

One of the most important
interview topics.

Example

private static final long

serialVersionUID = 1L;

Purpose

Version control
for serialized objects.

===============================================================================
WHY SERIALVERSIONUID?
===============================================================================

Suppose

Version 1

class Student{

    int id;

}

Later

Version 2

class Student{

    int id;

    String name;

}

Serialized object

may become incompatible.

serialVersionUID

helps detect compatibility.

===============================================================================
WITHOUT SERIALVERSIONUID
===============================================================================

Compiler generates one automatically.

Problem

Even small changes

may produce

InvalidClassException

Best Practice

Always declare it explicitly.

===============================================================================
TRANSIENT KEYWORD
===============================================================================

Some fields should NOT
be serialized.

Example

class User

implements Serializable{

    String username;

    transient String password;

}

Password will NOT
be saved.

===============================================================================
STATIC VARIABLES
===============================================================================

Static variables

belong to the class,

not the object.

Therefore,

they are NOT serialized.

===============================================================================
FINAL VARIABLES
===============================================================================

Final fields

ARE serialized

because they belong
to the object.

===============================================================================
EXTERNALIZABLE
===============================================================================

Alternative to Serializable.

Provides complete control
over serialization.

Methods

writeExternal()

readExternal()

More complex.

More efficient in some cases.

===============================================================================
SERIALIZABLE vs EXTERNALIZABLE
===============================================================================

Serializable

Automatic

Easy

Less Control

----------------------------------------

Externalizable

Manual

More Control

Requires more code

===============================================================================
CUSTOM SERIALIZATION
===============================================================================

You can customize serialization
using

private void writeObject()

private void readObject()

Useful for

Encryption

Validation

Compression

===============================================================================
OBJECT GRAPH
===============================================================================

If one object references
another serializable object,

Both are serialized.

Example

Student

↓

Address

↓

City

Entire object graph
is serialized.

===============================================================================
NON-SERIALIZABLE OBJECTS
===============================================================================

If an object contains
a field whose class
is not Serializable,

Serialization fails

unless that field
is marked transient.

===============================================================================
NOTSERIALIZABLEEXCEPTION
===============================================================================

Occurs when attempting
to serialize an object
that does not implement
Serializable.

===============================================================================
INVALIDCLASSEXCEPTION
===============================================================================

Occurs when

serialVersionUID

does not match
between serialization
and deserialization.

===============================================================================
JAVA SERIALIZATION FORMAT
===============================================================================

Java serialization

is Java-specific.

Not suitable for

REST APIs

Microservices

Cross-language communication.

Modern applications use

JSON

XML

Protocol Buffers

Avro

===============================================================================
SECURITY CONCERNS
===============================================================================

Deserializing untrusted data

can be dangerous.

Possible risks

✔ Remote Code Execution

✔ Object Injection

✔ Denial of Service

Never deserialize
untrusted sources.

===============================================================================
SERIALIZATION IN MODERN JAVA
===============================================================================

Still used in

Caching

RMI

Legacy Applications

Session Replication

But

JSON is preferred
for web applications.

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Forgetting Serializable.

----------------------------------------

❌ Ignoring serialVersionUID.

----------------------------------------

❌ Serializing passwords.

----------------------------------------

❌ Deserializing untrusted files.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Declare serialVersionUID.

✔ Mark sensitive fields transient.

✔ Validate deserialized data.

✔ Prefer JSON for APIs.

✔ Keep serialized classes compatible.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

✔ Save Game State

↓

Serialization

----------------------------------------

✔ Desktop Applications

↓

Persist User Preferences

----------------------------------------

✔ Distributed Cache

↓

Serialized Objects

----------------------------------------

✔ Session Replication

↓

Application Servers

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is Serialization?

Conversion of an object
into bytes.

--------------------------------------------------------

Q2 What is Deserialization?

Conversion of bytes
back into an object.

--------------------------------------------------------

Q3 Which interface enables serialization?

Serializable

--------------------------------------------------------

Q4 Is Serializable
a marker interface?

Yes.

It contains no methods.

--------------------------------------------------------

Q5 Why use serialVersionUID?

Version compatibility
between serialized objects.

--------------------------------------------------------

Q6 What is transient?

Marks a field
that should not be serialized.

--------------------------------------------------------

Q7 Are static variables serialized?

No.

--------------------------------------------------------

Q8 Difference between Serializable
and Externalizable?

Serializable

Automatic

Externalizable

Manual

--------------------------------------------------------

Q9 What exception occurs
if a class is not serializable?

NotSerializableException

--------------------------------------------------------

Q10 Why is Java serialization
less common in REST APIs?

Because JSON and Protocol Buffers
are language-independent
and easier to integrate.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Serialize Student object.

2. Deserialize Student object.

3. Use transient password.

4. Demonstrate serialVersionUID.

5. Serialize nested objects.

6. Handle NotSerializableException.

7. Implement Externalizable.

8. Custom writeObject().

9. Custom readObject().

10. Build object persistence demo.

===============================================================================
QUICK REVISION
===============================================================================

✔ Serialization = Object → Bytes

✔ Deserialization = Bytes → Object

✔ Serializable = Marker Interface

✔ ObjectOutputStream writes objects

✔ ObjectInputStream reads objects

✔ serialVersionUID controls compatibility

✔ transient excludes fields

✔ static fields are not serialized

✔ Externalizable gives manual control

✔ Prefer JSON for modern APIs

===============================================================================
NEXT TOPIC
===============================================================================

30_Design_Patterns.java

Topics

• SOLID Principles

• Creational Patterns

• Structural Patterns

• Behavioral Patterns

• Singleton

• Factory

• Builder

• Prototype

• Adapter

• Decorator

• Facade

• Strategy

• Observer

• Command

• Template Method

• Dependency Injection

• Interview Questions

===============================================================================
*/