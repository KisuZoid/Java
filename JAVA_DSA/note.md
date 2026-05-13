# Java DSA Notes - Quick Revision (In-Depth)

---

## 1. Introduction & Setup

### Basic Structure
```java
package Java.JAVA_DSA;  // Indicates folder structure where this file is located

public class ClassName {  // class is public - accessible from other classes
    public static void main(String[] args) {  // Entry point of the program
        // code here
    }
}
```

### Key Concepts Explained

| Term | Meaning |
|------|---------|
| **class** | Group of properties (variables) and functions (methods) |
| **public** | Access modifier - allows class to be accessible from other classes |
| **static** | Allows main method to be called without creating an instance/object of the class |
| **void** | Indicates that the main method does not return any value |
| **main** | Name of the method that is the entry point of the program |
| **String[] args** | Array of strings that can be passed as command-line arguments |
| **new** | Keyword used to create new objects (allocates memory in heap) |

---

## 2. Input/Output

### Scanner Class
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);  // Create Scanner object
String name = input.nextLine();          // Read entire line
int num = input.nextInt();               // Read integer
String word = input.next();              // Read next token (word)
input.close();                           // Close scanner and release resources
```

### Key Points
- **Scanner**: Class in java.util package used to take primitive type input from user
- **System.out**: Standard output stream - prints to console
- **System.in**: Input stream - reads from user
- **close()**: Closes scanner and releases associated resources

---

## 3. Data Types

### Primitive Types
| Type | Size | Example |
|------|------|---------|
| byte | 8-bit | 100 |
| short | 16-bit | 1000 |
| **int** | 32-bit | 5 (default for whole numbers) |
| long | 64-bit | 150000L (use 'L' suffix) |
| **float** | 32-bit | 5.99f (use 'f' suffix) |
| **double** | 64-bit | 19.99 (default for decimals) |
| char | 16-bit | 'D' (single character) |
| boolean | - | true/false |

### Non-Primitive Types
```java
String str = "Hello";           // String (text)
int[] arr = {1, 2, 3};          // Array (collection of same type)
Student s = new Student();      // Class Object
Day today = Day.MONDAY;         // Enum (predefined constants)
```

### Type Casting

#### Implicit Casting (Widening) - Automatic
```java
int myInt = 9;
double myDouble = myInt;  // int → double (automatic)
// Order: byte → short → int → long → float → double
// Smaller → Larger (safe, no data loss)
```

#### Explicit Casting (Narrowing) - Manual
```java
double myDouble = 9.78;
int myInt = (int) myDouble;  // double → int (manual)
// Larger → Smaller (data loss possible)
```

---

## 4. Memory: Stack vs Heap

### Stack Memory
- Stores **primitive variables** (int, float, etc.)
- Stores **references** (addresses) of non-primitive objects
- Memory allocation/deallocation is **fast**
- Works in **LIFO** (Last In First Out) manner
- Each thread has its own stack

### Heap Memory
- Stores **actual objects** (non-primitive: arrays, ArrayList, class objects)
- Memory is **shared** across threads
- Allocation/deallocation is **slower** than stack
- **Garbage Collector** removes unused objects

### Visual Representation
```
Stack:              Heap:
a = 10              "Java"  ←── s1 points here
b = 20              {1,2,3} ←── arr points here
s1 (reference) ──────────────►
arr (reference) ──────────────►
```

---

## 5. Wrapper Classes

**Purpose**: Gives ability to use primitive types as objects

```java
Byte myByte = 100;
Short myShort = 1000;
Integer myInt = 5;       // Most common wrapper
Float myFloat = 5.99f;
Double myDouble = 19.99;
Long myLong = 150000L;
Character myChar = 'D';
Boolean myBool = true;
```

---

## 6. Conditional Statements

### If-Else
```java
if (condition) {
    // code
} else if (condition) {
    // code
} else {
    // code
}
```

### Switch Statement (Traditional)
```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```

### Switch Statement (Java 14+ New Syntax)
```java
switch (fruit) {
    case "mango" -> System.out.println("small fruit");
    case "water melon" -> System.out.println("Large fruit");
    default -> System.out.println("wrong fruit");
}

// Multiple cases in one line
switch (day) {
    case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
    case 6, 7 -> System.out.println("Weekend");
    default -> { }  // Empty block
}
```

### Important: == vs .equals()

| Operator | What it checks |
|----------|---------------|
| **==** | Reference equality (same memory location) |
| **.equals()** | Content equality (same value) |

```java
String a = "Hello";
String b = new String("Hello");

a == b        // false (different objects in memory)
a.equals(b)   // true (same content)

// Special case with string literals:
String c = "Hello";
String d = "Hello";
c == d        // true (same object in string pool)
```

### Logical & Bitwise Operators

| Operator | Type | Example |
|----------|------|---------|
| `&&` | Logical AND | true && false = false |
| `||` | Logical OR | true \|\| false = true |
| `!` | Logical NOT | !true = false |
| `&` | Bitwise AND | 5 & 3 = 1 |
| `|` | Bitwise OR | 5 \| 3 = 7 |
| `^` | Bitwise XOR | 5 ^ 3 = 6 |
| `~` | Bitwise NOT | ~5 = -6 |

---

## 7. Loops

### For Loop
```java
for (int i = 0; i < 5; i++) {
    // code
}
```

### While Loop
```java
int j = 0;
while (j < 5) {
    // code
    j++;
}
```

### Do-While Loop (Executes at least once)
```java
int k = 0;
do {
    // code
    k++;
} while (k < 5);
```

### Enhanced For Loop (for-each)
```java
int[] arr = {1, 2, 3, 4, 5};

for (int num : arr) {  // 'int' is the DATA TYPE of each element
    System.out.println(num);
}
```

**What does `int num : arr` mean?**
- `int` - Data type of each element in the array
- `num` - Variable name that holds each element during iteration
- `:` - "in" - means "for each element in"
- `arr` - The array to iterate over

**Translation**: "For each integer element called 'num' in 'arr', do something"

---

## 8. Functions/Methods

### Syntax
```
access_modifier return_type methodName(parameters) {
    // body
    return value;
}
```

### Access Modifiers
| Modifier | Access |
|----------|--------|
| **public** | Anywhere |
| **private** | Same class only |
| **protected** | Package + subclasses |
| **default** | Same package only |

### Return Types
- `void` - Returns nothing
- `int`, `String`, etc. - Returns corresponding value

### Static vs Non-Static

```java
public class Demo {
    static void staticMethod() { }  // Called without object
    void nonStaticMethod() { }     // Requires object
}

public static void main(String[] args) {
    staticMethod();                    // Direct call
    Demo obj = new Demo();
    obj.nonStaticMethod();             // Via object
}
```

### Why Static Can't Access Non-Static?
- Static methods run **without any object**
- Non-static members exist **only inside an object**
- Java doesn't know which object's data to use

### Why Non-Static Can Access Static?
- Static members belong to the **class**
- The class exists **before any object** is created

### Method Overloading

Same method name, **different parameters** (number, type, or order)

```java
fun(10);              // calls fun(int)
fun("Hello");         // calls fun(String)
fun(20, "World");     // calls fun(int, String)

static void fun(int a) { }
static void fun(String s) { }
static void fun(int a, String s) { }
```

**Note**: Happens at compile time - compiler determines which to call based on arguments.

---

## 9. Variable Scope

### Block Scope
```java
int a = 10;  // accessible in whole main method

{
    a = 30;         // accessible - defined outside block
    int c = 50;     // only accessible within this block
}
// c not accessible here
```

### Types of Scope
| Type | Description |
|------|-------------|
| **Class scope** | Variables outside methods - accessible by all methods |
| **Method scope** | Variables inside methods - local to method |
| **Block scope** | Variables inside {} - local to block |
| **Loop scope** | Variables in loop - local to loop |

---

## 10. Variable Shadowing

**Definition**: When a variable in inner scope has same name as outer scope variable

```java
static int x = 10;  // Instance variable (class level)

public static void main(String[] args) {
    System.out.println(x);  // 10 (instance variable)

    int x = 20;             // Local variable shadows instance variable
    System.out.println(x); // 20 (local variable)
    
    method();              // 10 (method uses instance variable)
}

static void method() {
    System.out.println(x); // 10 - no local x in scope
}
```

**Important**: If you declare `int y;` but don't initialize, and there's a shadowing instance variable `y = 50`, you'll get error "variable y might not have been initialized" because local variable shadows but doesn't inherit the value.

---

## 11. Variable Arguments (Varargs)

**Purpose**: Accept variable number of arguments of same type

```java
fun(1, 2, 3, 4, 5, 6, 7, 8, 9);  // 9 arguments

static void fun(int ...v) {       // v is treated like an array
    System.out.println(Arrays.toString(v));
}
```

**Rules**:
- Varargs must be the **last parameter** if multiple parameters exist
- `int ...v` means v is an array of integers inside the method

---

## 12. Pass by Value (Important!)

### Java Has NO Pass by Reference!
Java only has **pass by value** - always passes a copy

### Primitive Types (Pass by Value)
```java
int a = 5, b = 6;
swap(a, b);
System.out.println(a + " " + b);  // 5 6 - NOT swapped!

static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    // Changes only affect local copies
}
```

### Reference Types (Arrays/Objects)
```java
int[] arr = {5, 6};
swapArray(arr);
System.out.println(arr[0] + " " + arr[1]);  // 6 5 - SWAPPED!

static void swapArray(int[] arr) {
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
}
```

**Why it works**: Array reference is copied, but both copies point to same object in heap

### Ways to Actually Swap Primitives

**1. Using Array** (works because arrays are objects)
```java
int[] arr = {5, 6};
swapArray(arr);
```

**2. Using Wrapper Class** (Integer is an object)
```java
Integer x = 5, y = 6;
swapWrapper(x, y);  // Still won't work! Wrapper classes are immutable
```

**Key Insight**: `arr` and `nums` are reference variables in **stack** pointing to same array in **heap**

---

## 13. Arrays

### Declaration & Initialization
```java
// Method 1: Specify size
int[] arr = new int[5];  // Default value = 0

// Method 2: Initialize with values
int[] arr = {1, 2, 3, 4, 5};

// Method 3: Using new with values
int[] arr = new int[]{1, 2, 3};
```

### Key Points
- **Index starts from 0**
- **Fixed size** - cannot change after creation
- **Default values**: 0 for int, null for String
- Array object in **heap**, reference in **stack**

### Array Methods
```java
int[] arr = {1, 2, 3, 4, 5};
arr.length          // Get length (5)
Arrays.toString(arr)// Print array as string
Arrays.sort(arr)    // Sort array
```

---

## 14. Multi-Dimensional Arrays

### 2D Array
```java
// Method 1: Create with sizes
int[][] arr = new int[3][2];  // 3 rows, 2 columns

// Method 2: Initialize with values
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Jagged array (different row sizes)
int[][] arr = {
    {1, 2},
    {4, 5, 6},
    {7, 8, 9, 10}
};
```

### Key Properties
- `arr.length` → number of rows
- `arr[row].length` → number of columns in that row

### Accessing Elements
```java
arr[row][col] = 10;
int val = arr[0][1];
```

---

## 15. ArrayList

### Declaration
```java
ArrayList<Integer> list = new ArrayList<>(5);  // Initial capacity 5
```

**Note**: Default size is 10 if not specified. ArrayList auto-resizes when needed.

### Common Methods

| Method | Description |
|--------|-------------|
| `add(element)` | Add element to end |
| `add(index, element)` | Insert at specific index |
| `get(index)` | Get element at index |
| `set(index, element)` | Replace element at index |
| `remove(index)` | Remove element at index |
| `size()` | Get number of elements |
| `contains(element)` | Check if element exists |
| `isEmpty()` | Check if list is empty |
| `clear()` | Remove all elements |

### Syntax with Generics
```java
ArrayList<E> name = new ArrayList<>(size);
// E = element type (must use Wrapper classes for primitives)
// Example: Integer, String, Double, etc.
```

---

## 16. Multi-Dimensional ArrayList

```java
ArrayList<ArrayList<Integer>> list = new ArrayList<>();

// Initialize rows
for (int i = 0; i < 3; i++) {
    list.add(new ArrayList<>());
}

// Add elements
list.get(row).add(element);

// Access elements
int val = list.get(row).get(col);
```

---

## 17. Important Summary Points

| Concept | Key Takeaway |
|---------|--------------|
| String pool | Same string literals share memory |
| == vs equals | == checks reference, equals checks content |
| Static vs non-static | Static belongs to class, non-static to object |
| Pass by value | Primitives pass copy, objects pass copy of reference |
| Array vs ArrayList | Array has fixed size, ArrayList is dynamic |
| Default values | 0 for numbers, null for objects, false for boolean |
| null | Absence of reference/value |

---

*Last updated: 2026-05-13*
