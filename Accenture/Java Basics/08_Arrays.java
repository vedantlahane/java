/*
===============================================================================
                                 JAVA ARRAYS
===============================================================================

Author : Vedant
Module : Java Basics

===============================================================================
WHY DO WE NEED ARRAYS?
===============================================================================

Suppose a teacher wants to store marks of 100 students.

Without arrays

int mark1 = 95;
int mark2 = 87;
int mark3 = 91;
...
int mark100 = 76;

Problems

❌ Too many variables

❌ Difficult to maintain

❌ Difficult to process

Instead

int[] marks = new int[100];

One variable.

Stores 100 values.

Easy to process using loops.

===============================================================================
WHAT IS AN ARRAY?
===============================================================================

An Array is a collection of similar data types stored in contiguous memory
locations.

Important Properties

✔ Stores similar data

✔ Fixed size

✔ Indexed

✔ Fast random access

===============================================================================
ARRAY CHARACTERISTICS
===============================================================================

• Same Data Type

int[]

double[]

char[]

--------------------------------------------

• Fixed Size

Cannot grow automatically.

--------------------------------------------

• Zero Based Indexing

First element

index = 0

Last element

length - 1

--------------------------------------------

• Contiguous Memory

Elements are stored one after another.

===============================================================================
MEMORY REPRESENTATION
===============================================================================

int[] marks = {85,90,95,88};

Index

     0      1      2      3

+-----+-----+-----+-----+

| 85  | 90  | 95  | 88  |

+-----+-----+-----+-----+

marks

↓

Address of first element

===============================================================================
DECLARING AN ARRAY
===============================================================================

Method 1

int[] numbers;

Recommended

--------------------------------------------

Method 2

int numbers[];

Valid

But rarely used.

===============================================================================
CREATING AN ARRAY
===============================================================================

int[] numbers = new int[5];

Creates

5 integer elements.

Default values

0

0

0

0

0

===============================================================================
DECLARATION + CREATION
===============================================================================

int[] marks;

marks = new int[10];

OR

int[] marks = new int[10];

===============================================================================
ARRAY INITIALIZATION
===============================================================================

Method 1

int[] numbers = {10,20,30,40,50};

--------------------------------------------

Method 2

int[] numbers = new int[]{10,20,30};

===============================================================================
DEFAULT VALUES
===============================================================================

int

0

--------------------------------

double

0.0

--------------------------------

char

'\u0000'

--------------------------------

boolean

false

--------------------------------

String

null

===============================================================================
ACCESSING ELEMENTS
===============================================================================

int[] numbers = {5,10,15};

System.out.println(numbers[0]);

Output

5

--------------------------------

System.out.println(numbers[2]);

Output

15

===============================================================================
MODIFYING ELEMENTS
===============================================================================

numbers[1] = 50;

Before

5 10 15

After

5 50 15

===============================================================================
ARRAY LENGTH
===============================================================================

int[] arr = {1,2,3,4};

System.out.println(arr.length);

Output

4

length

is a property

NOT

a method.

Correct

arr.length

Wrong

arr.length()

===============================================================================
ITERATING USING FOR LOOP
===============================================================================

int[] arr = {10,20,30,40};

for(int i=0;i<arr.length;i++){

    System.out.println(arr[i]);

}

===============================================================================
ITERATING USING ENHANCED FOR LOOP
===============================================================================

for(int value : arr){

    System.out.println(value);

}

Advantages

Cleaner

Readable

No index handling

===============================================================================
WHEN NOT TO USE FOR-EACH
===============================================================================

Cannot modify array

Cannot access index directly

Need index?

Use normal for loop.

===============================================================================
SUM OF ARRAY
===============================================================================

int sum = 0;

for(int value : arr){

    sum += value;

}

===============================================================================
AVERAGE
===============================================================================

double average =
(double)sum / arr.length;

===============================================================================
LARGEST ELEMENT
===============================================================================

int max = arr[0];

for(int value : arr){

    if(value > max)

        max = value;

}

===============================================================================
SMALLEST ELEMENT
===============================================================================

int min = arr[0];

for(int value : arr){

    if(value < min)

        min = value;

}

===============================================================================
LINEAR SEARCH
===============================================================================

int target = 40;

boolean found = false;

for(int value : arr){

    if(value == target){

        found = true;

        break;

    }

}

===============================================================================
REVERSE ARRAY
===============================================================================

for(int i=arr.length-1;i>=0;i--){

    System.out.println(arr[i]);

}

===============================================================================
COPY ARRAY
===============================================================================

int[] copy = new int[arr.length];

for(int i=0;i<arr.length;i++){

    copy[i] = arr[i];

}

===============================================================================
SWAP ELEMENTS
===============================================================================

int temp = arr[0];

arr[0] = arr[4];

arr[4] = temp;

===============================================================================
MULTIDIMENSIONAL ARRAY
===============================================================================

2D Array

Represents rows and columns.

Example

int[][] matrix = {

    {1,2,3},

    {4,5,6},

    {7,8,9}

};

===============================================================================
MEMORY
===============================================================================

        matrix

           │

           ▼

      +---------+

      |   •     |

      +---------+

           │

    -----------------

    │       │      │

   Row0    Row1   Row2

===============================================================================
ACCESSING 2D ARRAY
===============================================================================

matrix[0][0]

1

matrix[1][2]

6

matrix[2][1]

8

===============================================================================
TRAVERSING 2D ARRAY
===============================================================================

for(int i=0;i<matrix.length;i++){

    for(int j=0;j<matrix[i].length;j++){

        System.out.print(matrix[i][j]+" ");

    }

    System.out.println();

}

===============================================================================
JAGGED ARRAY
===============================================================================

Rows have different lengths.

int[][] jagged = {

    {1,2},

    {3,4,5},

    {6}

};

Useful when each row stores different amounts of data.

===============================================================================
ARRAY OF OBJECTS
===============================================================================

String[] cities = {

    "Mumbai",

    "Pune",

    "Delhi"

};

Or

Student[] students =
new Student[10];

===============================================================================
ARRAY CLASS (java.util.Arrays)
===============================================================================

Useful utility methods.

Arrays.sort()

Arrays.binarySearch()

Arrays.fill()

Arrays.copyOf()

Arrays.equals()

Arrays.toString()

===============================================================================
SORTING
===============================================================================

Arrays.sort(arr);

Time Complexity

O(n log n)

(Dual-Pivot QuickSort for primitives)

===============================================================================
BINARY SEARCH
===============================================================================

Arrays.binarySearch(arr,50);

Array must already be sorted.

Time Complexity

O(log n)

===============================================================================
COMMON ALGORITHMS
===============================================================================

✔ Maximum Element

✔ Minimum Element

✔ Second Largest

✔ Reverse Array

✔ Rotate Array

✔ Frequency Count

✔ Duplicate Detection

✔ Linear Search

✔ Binary Search

✔ Sorting

===============================================================================
TIME COMPLEXITY
===============================================================================

Access

O(1)

--------------------------------

Search

O(n)

--------------------------------

Binary Search

O(log n)

(Sorted Array)

--------------------------------

Insertion

O(n)

--------------------------------

Deletion

O(n)

===============================================================================
ARRAY INDEX OUT OF BOUNDS
===============================================================================

int[] arr = {10,20};

System.out.println(arr[5]);

Output

ArrayIndexOutOfBoundsException

Reason

Index does not exist.

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Using

arr.length()

Correct

arr.length

--------------------------------

❌ Accessing invalid index

--------------------------------

❌ Forgetting zero-based indexing

--------------------------------

❌ Confusing array size with last index

Size = 5

Last Index = 4

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use enhanced for when index isn't needed

✔ Validate index before access

✔ Use Arrays utility methods

✔ Prefer collections for dynamic size

✔ Keep arrays immutable if possible

===============================================================================
REAL-WORLD APPLICATIONS
===============================================================================

✔ Student Marks

✔ Sensor Data

✔ Image Pixels

✔ Audio Samples

✔ Matrix Operations

✔ Game Boards

✔ Machine Learning Datasets

✔ Database Result Buffers

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Why are arrays zero indexed?

Because memory address calculation becomes simpler.

--------------------------------------------------------

Q2 Difference between Array and ArrayList?

Array

Fixed Size

Stores primitives

Fast

--------------------------------

ArrayList

Dynamic

Stores Objects

Resizable

--------------------------------------------------------

Q3 Can arrays store different data types?

No.

Only one type.

--------------------------------------------------------

Q4 What is a Jagged Array?

A 2D array where each row has a different length.

--------------------------------------------------------

Q5 Difference between length and length()?

length

Property of arrays.

length()

Method of String.

--------------------------------------------------------

Q6 Why is array access O(1)?

Because the memory address is computed directly using the index.

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Print all elements.

2. Find sum.

3. Find average.

4. Find maximum.

5. Find minimum.

6. Reverse array.

7. Copy array.

8. Merge two arrays.

9. Remove duplicates.

10. Rotate array left.

11. Rotate array right.

12. Binary Search.

13. Linear Search.

14. Bubble Sort.

15. Selection Sort.

16. Insertion Sort.

17. Matrix Addition.

18. Matrix Multiplication.

19. Transpose Matrix.

20. Spiral Matrix Traversal.

===============================================================================
QUICK REVISION
===============================================================================

✔ Fixed Size

✔ Contiguous Memory

✔ Zero Based Index

✔ Fast Access O(1)

✔ Search O(n)

✔ Binary Search O(log n)

✔ Arrays.sort()

✔ Arrays.binarySearch()

✔ Enhanced for loop

✔ Jagged Arrays

===============================================================================
NEXT TOPIC
===============================================================================

09_Methods.java

Topics

• What are Methods?
• Method Declaration
• Parameters
• Arguments
• Return Types
• Method Overloading
• Pass by Value
• Recursion
• Variable Arguments (varargs)
• Stack Memory
• Method Call Lifecycle
• Interview Questions

===============================================================================
*/