/*
===============================================================================
                     JAVA FILE HANDLING, IO & NIO
===============================================================================

Author : Vedant
Module : Core Java

===============================================================================
WHY DO WE NEED FILE HANDLING?
===============================================================================

Programs often need to store data permanently.

Variables and objects exist only while the program runs.

After the program ends,

memory is cleared.

To preserve data,

we use files.

Examples

✔ Student Records

✔ Bank Transactions

✔ Application Logs

✔ Configuration Files

✔ Images

✔ PDFs

✔ CSV Files

✔ JSON Files

===============================================================================
WHAT IS FILE HANDLING?
===============================================================================

File Handling is the process of

✔ Creating Files

✔ Reading Files

✔ Writing Files

✔ Updating Files

✔ Deleting Files

Java provides powerful APIs
for performing these operations.

===============================================================================
JAVA IO (INPUT / OUTPUT)
===============================================================================

IO stands for

Input

Output

Input

↓

Reading Data

Output

↓

Writing Data

Examples

Keyboard → Program

File → Program

Program → File

Program → Printer

===============================================================================
JAVA IO HIERARCHY
===============================================================================

                 Object

                    │

        ------------------------

        │                      │

   InputStream          OutputStream

        │                      │

 FileInputStream    FileOutputStream

 BufferedInputStream BufferedOutputStream

--------------------------------------------------

Reader               Writer

FileReader           FileWriter

BufferedReader       BufferedWriter

PrintWriter

===============================================================================
BYTE STREAMS
===============================================================================

Used for

Binary Data

Examples

Images

Videos

PDF Files

ZIP Files

Executable Files

Classes

InputStream

OutputStream

===============================================================================
CHARACTER STREAMS
===============================================================================

Used for

Text Data

Examples

TXT

CSV

JSON

XML

Java Source Files

Classes

Reader

Writer

===============================================================================
FILE CLASS
===============================================================================

Represents files and directories.

Package

java.io

Example

File file = new File("students.txt");

Common Methods

exists()

createNewFile()

delete()

mkdir()

listFiles()

length()

isFile()

isDirectory()

===============================================================================
CREATE FILE
===============================================================================

File file =
new File("notes.txt");

file.createNewFile();

Creates file if it doesn't exist.

===============================================================================
CHECK FILE EXISTS
===============================================================================

if(file.exists()){

    System.out.println("Exists");

}

===============================================================================
DELETE FILE
===============================================================================

file.delete();

Returns

true

or

false

===============================================================================
FILEINPUTSTREAM
===============================================================================

Reads binary files.

Example

FileInputStream fis =
new FileInputStream("image.jpg");

int data;

while((data = fis.read()) != -1){

}

===============================================================================
FILEOUTPUTSTREAM
===============================================================================

Writes binary files.

Example

FileOutputStream fos =
new FileOutputStream("image.jpg");

fos.write(65);

Writes

'A'

===============================================================================
FILEREADER
===============================================================================

Reads text files.

Example

FileReader fr =
new FileReader("notes.txt");

int ch;

while((ch = fr.read()) != -1){

    System.out.print((char) ch);

}

===============================================================================
FILEWRITER
===============================================================================

Writes text files.

Example

FileWriter fw =
new FileWriter("notes.txt");

fw.write("Hello Java");

fw.close();

===============================================================================
BUFFEREDREADER
===============================================================================

Reads efficiently using buffering.

Example

BufferedReader br =
new BufferedReader(

new FileReader("notes.txt")

);

String line;

while((line = br.readLine()) != null){

    System.out.println(line);

}

===============================================================================
BUFFEREDWRITER
===============================================================================

Writes efficiently.

Example

BufferedWriter bw =
new BufferedWriter(

new FileWriter("notes.txt")

);

bw.write("Java");

bw.newLine();

bw.close();

===============================================================================
PRINTWRITER
===============================================================================

Convenient text writing.

Example

PrintWriter pw =
new PrintWriter("output.txt");

pw.println("Java");

pw.println(100);

pw.close();

===============================================================================
WHY BUFFERING?
===============================================================================

Without Buffer

Disk Access

↓

Slow

With Buffer

Memory Buffer

↓

Batch Read/Write

↓

Faster

===============================================================================
TRY-WITH-RESOURCES
===============================================================================

Always preferred.

Example

try(BufferedReader br =
new BufferedReader(

new FileReader("notes.txt")

)){

    System.out.println(br.readLine());

}

Automatically closes resources.

===============================================================================
JAVA NIO
===============================================================================

NIO

New Input Output

Introduced in Java 7.

Advantages

✔ Faster

✔ Better Performance

✔ Non-blocking IO

✔ Better File APIs

===============================================================================
PATH CLASS
===============================================================================

Represents file paths.

Example

Path path =
Paths.get("notes.txt");

===============================================================================
FILES CLASS
===============================================================================

Utility class for modern file operations.

Common Methods

Files.exists()

Files.readAllLines()

Files.readString()

Files.write()

Files.copy()

Files.move()

Files.delete()

Files.createDirectory()

===============================================================================
READ FILE (NIO)
===============================================================================

Path path =
Paths.get("notes.txt");

String text =
Files.readString(path);

===============================================================================
WRITE FILE (NIO)
===============================================================================

Files.writeString(

Paths.get("notes.txt"),

"Hello Java"

);

===============================================================================
COPY FILE
===============================================================================

Files.copy(

source,

destination

);

===============================================================================
MOVE FILE
===============================================================================

Files.move(

source,

destination

);

===============================================================================
DELETE FILE
===============================================================================

Files.delete(path);

===============================================================================
DIRECTORY OPERATIONS
===============================================================================

Files.createDirectory()

Files.createDirectories()

Files.list()

Files.walk()

===============================================================================
READ ALL LINES
===============================================================================

List<String> lines =
Files.readAllLines(path);

===============================================================================
WATCH SERVICE
===============================================================================

NIO provides

WatchService

Detects

✔ File Created

✔ File Deleted

✔ File Modified

Useful for

IDEs

File Sync

Hot Reload

===============================================================================
SERIALIZATION (INTRODUCTION)
===============================================================================

Serialization converts an object
into bytes.

Used for

Saving Objects

Network Transfer

Caching

We'll study this in detail later.

===============================================================================
COMMON EXCEPTIONS
===============================================================================

FileNotFoundException

IOException

AccessDeniedException

NoSuchFileException

EOFException

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use NIO for modern applications.

✔ Always use try-with-resources.

✔ Buffer large reads/writes.

✔ Handle exceptions properly.

✔ Use Paths instead of string paths.

✔ Avoid hardcoded absolute paths.

===============================================================================
COMMON MISTAKES
===============================================================================

Mistake

Not closing streams.

----------------------------------------

Mistake

Using byte streams for text.

----------------------------------------

Mistake

Ignoring IOException.

----------------------------------------

Mistake

Hardcoding platform-specific paths.

Example

C:\\Users\\Vedant\\Desktop

Prefer

Paths.get()

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

✔ Reading CSV Files

✔ Writing Application Logs

✔ Uploading Images

✔ Downloading PDFs

✔ Reading JSON

✔ Configuration Files

✔ Report Generation

✔ Backup Systems

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Difference between Byte Stream and Character Stream?

Byte Stream

Binary Data

Character Stream

Text Data

--------------------------------------------------------

Q2 Difference between FileReader and BufferedReader?

BufferedReader

Uses buffering

Faster

Supports readLine()

--------------------------------------------------------

Q3 Why use try-with-resources?

Automatically closes resources.

--------------------------------------------------------

Q4 Difference between IO and NIO?

IO

Traditional

Blocking

NIO

Modern

Better Performance

Supports non-blocking operations.

--------------------------------------------------------

Q5 What is Path?

Represents file system path.

--------------------------------------------------------

Q6 What does Files class provide?

Utility methods for modern file handling.

--------------------------------------------------------

Q7 Which package contains NIO?

java.nio

java.nio.file

--------------------------------------------------------

Q8 What is WatchService?

Monitors file system changes.

--------------------------------------------------------

Q9 Why use Buffered Streams?

Reduce disk operations
and improve performance.

--------------------------------------------------------

Q10 Which API should be preferred today?

NIO (java.nio.file)

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Create a file.

2. Write text to a file.

3. Read text from a file.

4. Copy a file.

5. Move a file.

6. Delete a file.

7. Read CSV data.

8. Count words in a file.

9. Read directory contents.

10. Monitor directory using WatchService.

===============================================================================
QUICK REVISION
===============================================================================

✔ IO = Input/Output

✔ Byte Streams → Binary Data

✔ Character Streams → Text Data

✔ File class represents files/directories

✔ Buffered streams improve performance

✔ Try-with-resources closes resources automatically

✔ NIO = Modern File API

✔ Path represents paths

✔ Files provides utility methods

✔ WatchService monitors file changes

===============================================================================
NEXT TOPIC
===============================================================================

23_Multithreading.java

Topics

• What is a Process?
• What is a Thread?
• Thread Lifecycle
• Creating Threads
• Runnable
• Thread Class
• Synchronization
• Race Conditions
• Deadlock
• Executor Framework
• Callable & Future
• Concurrent Collections
• Interview Questions

===============================================================================
*/