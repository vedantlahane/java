/*
===============================================================================
                                  JAVA JDBC
                     (Java Database Connectivity)
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY DO WE NEED JDBC?
===============================================================================

Imagine a Banking Application.

User logs in

↓

Application verifies credentials

↓

Database stores user information

↓

Application retrieves records

Without JDBC

Java cannot communicate with databases.

JDBC provides a standard API for database communication.

Supported Databases

✔ MySQL

✔ PostgreSQL

✔ Oracle

✔ SQL Server

✔ SQLite

✔ MariaDB

===============================================================================
WHAT IS JDBC?
===============================================================================

JDBC

↓

Java Database Connectivity

It is a standard Java API that enables Java applications
to communicate with relational databases.

JDBC allows

✔ Insert Data

✔ Read Data

✔ Update Data

✔ Delete Data

✔ Execute SQL Queries

===============================================================================
JDBC ARCHITECTURE
===============================================================================

        Java Application

               │

               ▼

            JDBC API

               │

               ▼

        JDBC Driver Manager

               │

               ▼

         Database Driver

               │

               ▼

          Database Server

===============================================================================
JDBC COMPONENTS
===============================================================================

Driver

DriverManager

Connection

Statement

PreparedStatement

CallableStatement

ResultSet

SQLException

===============================================================================
JDBC DRIVERS
===============================================================================

Type 1

JDBC-ODBC Bridge

Deprecated

----------------------------------------

Type 2

Native Driver

----------------------------------------

Type 3

Network Driver

----------------------------------------

Type 4

Pure Java Driver

Most Common Today

Example

MySQL Connector/J

===============================================================================
JDBC WORKFLOW
===============================================================================

Load Driver

↓

Create Connection

↓

Create Statement

↓

Execute Query

↓

Process Result

↓

Close Resources

===============================================================================
STEP 1
LOAD DRIVER
===============================================================================

Class.forName(

"com.mysql.cj.jdbc.Driver"

);

Modern JDBC drivers auto-register,
so explicit loading is often unnecessary.

===============================================================================
STEP 2
CREATE CONNECTION
===============================================================================

Connection connection =

DriverManager.getConnection(

"jdbc:mysql://localhost:3306/company",

"root",

"password"

);

===============================================================================
JDBC URL FORMAT
===============================================================================

jdbc:mysql://host:port/database

Example

jdbc:mysql://localhost:3306/studentdb

===============================================================================
STEP 3
CREATE STATEMENT
===============================================================================

Statement statement =

connection.createStatement();

===============================================================================
STEP 4
EXECUTE QUERY
===============================================================================

ResultSet result =

statement.executeQuery(

"SELECT * FROM students"

);

Used for

SELECT

===============================================================================
EXECUTE UPDATE
===============================================================================

statement.executeUpdate(

"INSERT INTO students VALUES(...)"

);

Used for

INSERT

UPDATE

DELETE

Returns

Number of affected rows.

===============================================================================
STEP 5
PROCESS RESULTSET
===============================================================================

while(result.next()){

    System.out.println(

        result.getInt("id")

    );

}

===============================================================================
RESULTSET
===============================================================================

Represents table returned
by SELECT query.

Cursor initially points

Before First Row

Calling

next()

moves cursor.

===============================================================================
COMMON RESULTSET METHODS
===============================================================================

next()

previous()

first()

last()

getInt()

getString()

getDouble()

getBoolean()

getDate()

===============================================================================
STATEMENT
===============================================================================

Executes static SQL.

Example

SELECT * FROM students

Problems

❌ SQL Injection

❌ Slower

===============================================================================
PREPAREDSTATEMENT
===============================================================================

Preferred API.

Supports

✔ Parameters

✔ Precompiled SQL

✔ Better Performance

✔ SQL Injection Protection

Example

PreparedStatement ps =

connection.prepareStatement(

"SELECT * FROM students WHERE id=?"

);

ps.setInt(1,10);

===============================================================================
WHY PREPAREDSTATEMENT?
===============================================================================

Without PreparedStatement

SELECT * FROM users

WHERE username='admin'

AND password='123'

User enters

' OR '1'='1

SQL Injection occurs.

PreparedStatement prevents this.

===============================================================================
CALLABLESTATEMENT
===============================================================================

Used to execute

Stored Procedures

Example

CallableStatement cs =

connection.prepareCall(

"{call getEmployee(?)}"

);

===============================================================================
TRANSACTIONS
===============================================================================

Transaction

Group of SQL operations
treated as one unit.

Example

Transfer Money

Debit Account

↓

Credit Account

Both should succeed

OR

Both should fail.

===============================================================================
ACID PROPERTIES
===============================================================================

Atomicity

Consistency

Isolation

Durability

Foundation of relational databases.

===============================================================================
AUTO COMMIT
===============================================================================

Default

true

Every SQL executes immediately.

Disable

connection.setAutoCommit(false);

===============================================================================
COMMIT
===============================================================================

connection.commit();

Permanently saves changes.

===============================================================================
ROLLBACK
===============================================================================

connection.rollback();

Undo transaction.

Useful when an error occurs.

===============================================================================
BATCH PROCESSING
===============================================================================

Execute multiple SQL statements
together.

PreparedStatement ps =

connection.prepareStatement(...);

ps.addBatch();

ps.executeBatch();

Benefits

✔ Faster

✔ Fewer network calls

===============================================================================
METADATA
===============================================================================

DatabaseMetaData

Information about database.

ResultSetMetaData

Information about query results.

===============================================================================
TRY-WITH-RESOURCES
===============================================================================

Preferred way.

try(

Connection con = ...

PreparedStatement ps = ...

){

}

Resources close automatically.

===============================================================================
CONNECTION POOLING
===============================================================================

Opening database connections
is expensive.

Instead

Reuse connections.

Popular Libraries

HikariCP

Apache DBCP

C3P0

Spring Boot uses

HikariCP by default.

===============================================================================
COMMON SQL EXCEPTIONS
===============================================================================

SQLException

SQLSyntaxErrorException

SQLTimeoutException

BatchUpdateException

===============================================================================
SQL INJECTION
===============================================================================

Wrong

String sql =

"SELECT * FROM users WHERE name='"

+ user +

"'";

Dangerous.

Correct

PreparedStatement

===============================================================================
JDBC vs HIBERNATE
===============================================================================

JDBC

Manual SQL

Manual Mapping

More Boilerplate

----------------------------------------

Hibernate

ORM

Automatic Mapping

Less Code

===============================================================================
JDBC vs JPA
===============================================================================

JDBC

Low Level

----------------------------------------

JPA

Specification

----------------------------------------

Hibernate

JPA Implementation

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

✔ Login System

✔ Employee Management

✔ Banking

✔ Hospital Management

✔ Inventory

✔ Airline Reservation

✔ Library System

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use PreparedStatement.

✔ Always close resources.

✔ Use try-with-resources.

✔ Use transactions.

✔ Never hardcode passwords.

✔ Use connection pools.

✔ Validate user input.

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Forgetting to close ResultSet.

❌ Using Statement instead of PreparedStatement.

❌ Hardcoding credentials.

❌ Ignoring rollback.

❌ Not handling SQLExceptions.

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 What is JDBC?

Standard Java API for database connectivity.

--------------------------------------------------------

Q2 Steps in JDBC?

Load Driver

Create Connection

Create Statement

Execute SQL

Process Result

Close Resources

--------------------------------------------------------

Q3 Difference between Statement
and PreparedStatement?

Statement

Simple SQL

PreparedStatement

Parameterized

Precompiled

Safe

--------------------------------------------------------

Q4 Why is PreparedStatement faster?

SQL is precompiled and reusable.

--------------------------------------------------------

Q5 What is SQL Injection?

Injection of malicious SQL
through user input.

--------------------------------------------------------

Q6 What is ResultSet?

Object representing query results.

--------------------------------------------------------

Q7 Difference between executeQuery()
and executeUpdate()?

executeQuery()

SELECT

executeUpdate()

INSERT

UPDATE

DELETE

--------------------------------------------------------

Q8 What is transaction?

Group of SQL operations
treated as one logical unit.

--------------------------------------------------------

Q9 Difference between commit()
and rollback()?

commit()

Save changes.

rollback()

Undo changes.

--------------------------------------------------------

Q10 What connection pool
does Spring Boot use by default?

HikariCP

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Connect to MySQL.

2. Insert Student Record.

3. Update Employee Salary.

4. Delete Product.

5. Search Student by ID.

6. Login using PreparedStatement.

7. Transfer Money using Transactions.

8. Batch Insert.

9. Read Metadata.

10. CRUD Application.

===============================================================================
QUICK REVISION
===============================================================================

✔ JDBC connects Java to databases

✔ DriverManager creates connections

✔ Connection represents DB connection

✔ Statement executes SQL

✔ PreparedStatement prevents SQL Injection

✔ ResultSet stores query results

✔ Transactions ensure consistency

✔ commit() saves

✔ rollback() undoes

✔ HikariCP is Spring Boot's default pool

===============================================================================
NEXT TOPIC
===============================================================================

28_Annotations_Reflection.java

Topics

• Annotations

• Built-in Annotations

• Custom Annotations

• Reflection API

• Class Object

• Method Reflection

• Field Reflection

• Dynamic Class Loading

• Dependency Injection Basics

• Interview Questions

===============================================================================
*/