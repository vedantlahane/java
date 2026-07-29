/*
===============================================================================
                          JAVA DATE & TIME API
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY A NEW DATE & TIME API?
===============================================================================

Before Java 8,

Java used

java.util.Date

java.util.Calendar

Problems

❌ Mutable

❌ Not Thread Safe

❌ Confusing API

❌ Poor Time Zone Support

❌ Difficult Date Calculations

Java 8 introduced

java.time

Advantages

✔ Immutable

✔ Thread Safe

✔ Cleaner API

✔ Better Time Zone Handling

✔ ISO-8601 Standard

===============================================================================
MAIN CLASSES
===============================================================================

LocalDate

LocalTime

LocalDateTime

Instant

ZonedDateTime

OffsetDateTime

Duration

Period

DateTimeFormatter

Clock

===============================================================================
LOCALDATE
===============================================================================

Represents only

Date

No Time

Example

LocalDate today =
LocalDate.now();

Example Output

2026-07-29

===============================================================================
CREATING LOCALDATE
===============================================================================

LocalDate.of(2026,7,29);

LocalDate.parse("2026-07-29");

===============================================================================
COMMON LOCALDATE METHODS
===============================================================================

now()

of()

parse()

getDayOfMonth()

getMonth()

getYear()

plusDays()

minusDays()

plusMonths()

minusYears()

isBefore()

isAfter()

isEqual()

lengthOfMonth()

isLeapYear()

===============================================================================
LOCALTIME
===============================================================================

Represents only

Time

No Date

Example

LocalTime.now();

Output

10:30:15

===============================================================================
COMMON LOCALTIME METHODS
===============================================================================

getHour()

getMinute()

getSecond()

plusHours()

minusMinutes()

plusSeconds()

===============================================================================
LOCALDATETIME
===============================================================================

Combines

Date

+

Time

No Time Zone

Example

LocalDateTime.now();

Output

2026-07-29T10:30:15

===============================================================================
INSTANT
===============================================================================

Represents

Machine Timestamp

UTC

Used internally
by servers and databases.

Example

Instant.now();

Output

2026-07-29T05:00:00Z

===============================================================================
ZONEDDATETIME
===============================================================================

Date

+

Time

+

Time Zone

Example

ZonedDateTime.now();

Useful for

International Applications

Airlines

Finance

Cloud Systems

===============================================================================
COMMON TIME ZONES
===============================================================================

Asia/Kolkata

UTC

Europe/London

America/New_York

Australia/Sydney

===============================================================================
ZONEID
===============================================================================

ZoneId.of("Asia/Kolkata");

ZoneId.systemDefault();

===============================================================================
CONVERT TIME ZONES
===============================================================================

ZonedDateTime india =
ZonedDateTime.now(
ZoneId.of("Asia/Kolkata")
);

ZonedDateTime usa =
india.withZoneSameInstant(
ZoneId.of("America/New_York")
);

===============================================================================
PERIOD
===============================================================================

Represents

Difference between Dates

Example

Period age =
Period.between(

birthDate,

today

);

Methods

getYears()

getMonths()

getDays()

===============================================================================
DURATION
===============================================================================

Represents

Time Difference

Hours

Minutes

Seconds

Milliseconds

Example

Duration duration =
Duration.between(

start,

end

);

===============================================================================
DATE CALCULATIONS
===============================================================================

LocalDate today =
LocalDate.now();

today.plusDays(10);

today.minusMonths(2);

today.plusYears(5);

===============================================================================
COMPARING DATES
===============================================================================

date1.isBefore(date2);

date1.isAfter(date2);

date1.isEqual(date2);

===============================================================================
FORMATTING DATES
===============================================================================

DateTimeFormatter formatter =

DateTimeFormatter.ofPattern(

"dd-MM-yyyy"

);

String formatted =
today.format(formatter);

Output

29-07-2026

===============================================================================
COMMON PATTERNS
===============================================================================

dd/MM/yyyy

dd-MM-yyyy

yyyy-MM-dd

HH:mm:ss

hh:mm a

EEEE

MMMM

===============================================================================
PARSING DATES
===============================================================================

LocalDate date =
LocalDate.parse(

"29-07-2026",

formatter

);

===============================================================================
LEGACY DATE CONVERSION
===============================================================================

Date

↓

Instant

↓

LocalDateTime

Conversion supported.

Useful for migration.

===============================================================================
CLOCK
===============================================================================

Provides current time.

Useful for testing.

Example

Clock.systemUTC();

Clock.fixed(...);

===============================================================================
TEMPORAL ADJUSTERS
===============================================================================

Find

First Day

Last Day

Next Monday

Example

today.with(

TemporalAdjusters.lastDayOfMonth()

);

===============================================================================
COMMON USE CASES
===============================================================================

✔ Age Calculation

✔ Booking Systems

✔ Attendance

✔ Payroll

✔ Expiry Dates

✔ Subscription Renewal

✔ Scheduling

✔ Time Zone Conversion

===============================================================================
DATE vs LOCALDATE
===============================================================================

Date

Legacy

Mutable

----------------------------------------

LocalDate

Modern

Immutable

Thread Safe

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Using Date for new projects.

----------------------------------------

❌ Ignoring Time Zones.

----------------------------------------

❌ Hardcoding date formats.

----------------------------------------

❌ Using LocalDateTime
for UTC timestamps.

Prefer

Instant

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use LocalDate for dates.

✔ Use LocalTime for time.

✔ Use LocalDateTime
for local timestamps.

✔ Use Instant
for machine timestamps.

✔ Use ZonedDateTime
for global applications.

✔ Store UTC in databases.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

✔ Flight Booking

ZonedDateTime

----------------------------------------

✔ Employee Age

Period

----------------------------------------

✔ OTP Expiry

Duration

----------------------------------------

✔ Logging

Instant

----------------------------------------

✔ Calendar Applications

LocalDate

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Why was java.time introduced?

To replace the old Date and Calendar APIs
with immutable, thread-safe classes.

--------------------------------------------------------

Q2 Difference between LocalDate
and LocalDateTime?

LocalDate

Date only.

LocalDateTime

Date + Time.

--------------------------------------------------------

Q3 What is Instant?

A UTC timestamp representing
a point on the timeline.

--------------------------------------------------------

Q4 Difference between Duration
and Period?

Duration

Time-based.

Period

Date-based.

--------------------------------------------------------

Q5 Which class handles time zones?

ZonedDateTime

--------------------------------------------------------

Q6 Why is LocalDate immutable?

Immutability makes it thread-safe,
predictable, and easier to reason about.

--------------------------------------------------------

Q7 Which formatter formats dates?

DateTimeFormatter

--------------------------------------------------------

Q8 Which class should be stored
for timestamps in distributed systems?

Instant

--------------------------------------------------------

Q9 How do you compare dates?

isBefore()

isAfter()

isEqual()

--------------------------------------------------------

Q10 Which package contains
the modern Date & Time API?

java.time

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Print today's date.

2. Calculate age using Period.

3. Find days between two dates.

4. Format current date.

5. Parse user-entered date.

6. Add 30 days.

7. Convert UTC to IST.

8. Find last day of month.

9. Build a countdown timer.

10. Subscription expiry calculator.

===============================================================================
QUICK REVISION
===============================================================================

✔ java.time = Modern Date API

✔ LocalDate = Date

✔ LocalTime = Time

✔ LocalDateTime = Date + Time

✔ Instant = UTC Timestamp

✔ ZonedDateTime = Date + Time + Zone

✔ Period = Date Difference

✔ Duration = Time Difference

✔ DateTimeFormatter = Formatting

✔ Immutable & Thread Safe

===============================================================================
NEXT TOPIC
===============================================================================

27_JDBC.java

Topics

• JDBC Architecture

• Drivers

• Connection

• Statement

• PreparedStatement

• CallableStatement

• ResultSet

• Transactions

• Batch Processing

• Connection Pooling

• SQL Injection Prevention

• Interview Questions

===============================================================================
*/