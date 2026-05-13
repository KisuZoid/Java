# Java DSA Questions - Patterns & Hints (Detailed)

---

## Topic 007 - Basic Logic Questions

### Q1: Fibonacci Series
**Problem**: Generate nth Fibonacci number

**Approaches**:
1. **Iterative** - Use two variables (a, b), update in loop
2. **Recursive** - Base case: n=0→0, n=1→1, else `fib(n-1) + fib(n-2)`

**Code - Iterative:**
```java
public static int fibonacci_normal(int n) {
    int a = 0;
    int b = 1;
    while (n >= 2) {
        int temp = b;
        b = a + b;
        a = temp;
        n--;
    }
    return b;
}
```

**Code - Recursive:**
```java
public static int fibonacci_recursive(int n) {
    if (n == 1) return 1;
    else if (n == 0) return 0;
    else return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
}
```

**Pattern**: `f(n) = f(n-1) + f(n-2)` - each term is sum of previous two

**Hint**: Start with a=0, b=1, loop n times, update using temp variable

---

### Q2: Find Largest Number (Method 1)
**Problem**: Find largest among 3 numbers using if-else chain

**Approach**: Compare pairwise using && (AND) operator

```java
public static void Largest_1(int a, int b, int c) {
    if (a >= b && a >= c) {
        System.out.println(a + " is the Largest Number");
    } else if (b >= a && b >= c) {
        System.out.println(b + " is the Largest Number");
    } else {
        System.out.println(c + " is the Largest Number");
    }
}
```

**Key**: Use `>=` not `>` to handle equal numbers properly

---

### Q3: Find Largest Number (Multiple Methods)
**Problem**: Find largest among 3 numbers - different approaches

**Method 2 - Using max variable:**
```java
public static void Largest_2(int a, int b, int c) {
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    System.out.println(max);
}
```

**Method 3 - Using if-else (ternary-like):**
```java
public static int Largest_3(int a, int b, int c) {
    int max = 0;
    if (a > b) max = a;
    else max = b;
    if (c > max) max = c;
    return max;
}
```

**Method 4 - Using Math.max() (Built-in):**
```java
public static int Largest_4(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
}
```

**Hint**: Start with first element as max, compare and update

---

### Q4: Case Check
**Problem**: Check if character is uppercase or lowercase

**Logic**: Use ASCII values
- 'a' to 'z' → ASCII 97 to 122
- 'A' to 'Z' → ASCII 65 to 90

**Code:**
```java
Scanner in = new Scanner(System.in);
char ch = in.next().trim().charAt(0);
// trim() removes extra spaces, charAt(0) gets first character

if (ch >= 'a' && ch <= 'z') {
    System.out.println("LowerCase");
} else {
    System.out.println("upperCase");
}
```

**Key Concepts Used:**
- `.trim()` - Removes leading and trailing spaces
- `.charAt(index)` - Gets character at specific position
- Character comparison uses ASCII values automatically

**Hint**: Compare char with ASCII ranges ('a' to 'z')

---

### Q5: Count Occurrence (String Method)
**Problem**: Count occurrences of each digit in a number (without duplicates)

**Logic**:
1. Convert number to String
2. Outer loop: go through each character
3. Inner loop: check if already counted (skip duplicates)
4. Another inner loop: count frequency of each unique digit

```java
int num = 1234556765;
String Num = String.valueOf(num);  // Convert to string

for (int i = 0; i <= Num.length()-1; i++) {
    char k = Num.charAt(i);

    // Check if already counted (skip duplicates)
    boolean alreadyCounted = false;
    for (int x = 0; x < i; x++) {
        if (Num.charAt(x) == k) {
            alreadyCounted = true;
            break;
        }
    }
    if (alreadyCounted) continue;

    // Count frequency
    int count = 0;
    for (int j = 0; j <= Num.length()-1; j++) {
        if (k == Num.charAt(j)) count++;
    }
    System.out.println("Value of " + k + " is " + count);
}
```

**Pattern**: Two loops - outer for unique, inner for count

**Key Points**:
- `String.valueOf(num)` - Converts number to string
- `.charAt(i)` - Gets character at index i
- Outer loop checks before i to avoid duplicates

**Hint**: Use nested loops, outer tracks unique, inner counts

---

### Q6: Count Occurrence (Math Method)
**Problem**: Count specific digit (e.g., 7) occurrences using / and %

**Core Concept**: 
- `n % 10` → gives last digit
- `n / 10` → removes last digit

**Code:**
```java
int n = 1285757879;
int count = 0;

while (n > 0) {
    int rem = n % 10;      // Extract last digit
    if (rem == 7) count++; // Check if it's 7
    n /= 10;               // Remove last digit
}
System.out.println(count);
```

**Pattern**: Extract last digit → check → remove last digit → repeat

**Hint**: Use modulo to get last digit, divide to remove it

---

### Q7: Reverse Number
**Problem**: Reverse a number (e.g., 12345 → 54321)

### Method 1: Using String
```java
num = 12345;
String result = "";
String x = String.valueOf(num);

for (int i = x.length()-1; i >= 0; i--) {
    result += x.charAt(i);
}
```

### Method 2: Using Modulo (String result)
```java
num = 12345;
String result = "";
while (num > 0) {
    result += num % 10;
    num /= 10;
}
```

### Method 3: Using Modulo (Numeric result) - **BEST**
```java
int num = 12345;
int ans = 0;

while (num > 0) {
    int rem = num % 10;   // Get last digit
    num /= 10;            // Remove last digit
    ans = ans * 10 + rem; // Build reversed number
}
System.out.println(ans);  // 54321
```

**Why Method 3 works**: `ans = ans * 10 + digit`
- Start: ans = 0
- 1st digit 5: ans = 0*10 + 5 = 5
- 2nd digit 4: ans = 5*10 + 4 = 54
- 3rd digit 3: ans = 54*10 + 3 = 543
- And so on...

**Hint**: `ans = ans * 10 + digit` builds reverse mathematically

---

### Q8: Interactive Calculator
**Problem**: Build calculator that takes input until user presses X

**Pattern**:
1. Use while(true) infinite loop
2. Take operator input
3. Use if-else or switch for operations
4. Check for 'x' or 'X' to break

**Key Points**:
- Use `.trim().charAt(0)` for operator
- Handle division by zero (check if divisor != 0)
- Use `next().trim().charAt(0)` to handle whitespace

**Common Issue - Scanner newline**:
After `nextInt()`, the newline character remains. Use `nextLine()` to consume it:
```java
int empId = in.nextInt();
String dummy = in.nextLine();  // Consume newline
String dept = in.nextLine();   // Now works properly
```

---

## Topic 013 - Number Theory

### Q1: Prime Number

**Check if Prime:**
```java
static boolean isPrime(int n) {
    if (n <= 1) return false;  // 0 and 1 are not prime
    
    for (int i = 2; i * i <= n; i++) {  // Check up to √n
        if (n % i == 0) return false;
    }
    return true;
}
```

**Print Primes Between 2 and n:**
```java
static void primeBetween(int n) {
    for (int i = 2; i <= n; i++) {
        if (isPrime(i)) System.out.print(i + " ");
    }
}
```

**Why i*i <= n?**
- Only need to check up to square root of n
- If n has factor > √n, the corresponding factor would be < √n
- Reduces time complexity from O(n) to O(√n)

**Alternative using while:**
```java
int c = 2;
while (c * c <= n) {
    if (n % c == 0) return false;
    c++;
}
return true;
```

**Important**: 1 and 0 are NOT prime numbers

**Hint**: Loop from 2 to √n, if any divisor found → not prime

---

### Q2: Armstrong Number
**Definition**: n-digit number where sum of each digit^n equals original number

**Examples**:
- 153 → 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✓
- 9474 → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474 ✓

**Method 1: Using String to find length**
```java
static void isArmstrong(Integer num) {
    String n = num.toString();
    int length = n.length();
    
    int sum = 0;
    int temp = num;
    while (temp > 0) {
        int digit = temp % 10;
        sum += Math.pow(digit, length);
        temp /= 10;
    }
    
    if (sum == num) System.out.println("Armstrong");
    else System.out.println("Not Armstrong");
}
```

**Method 2: Find first n Armstrong numbers**
```java
static void Armstrong(int n) {
    int count = 0;
    int val = 0;
    
    while (count < n) {
        int sum = 0;
        int temp = val;
        int length = String.valueOf(val).length();
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }
        
        if (sum == val) {
            System.out.println(sum);
            count++;
        }
        val++;
    }
}
```

**Key Steps**:
1. Find number of digits (length)
2. Extract each digit using % 10
3. Calculate digit^length and add to sum
4. Compare sum with original

**Alternate using char approach:**
```java
// Using character ASCII
String n = num.toString();
int length = n.length();
int sum = 0;
int base = 48;  // ASCII of '0'

for (int i = 0; i < length; i++) {
    char d = n.charAt(i);
    int digit = d - base;  // Convert char to int
    sum += Math.pow(digit, length);
}
```

**Hint**: Extract digits, raise to power of total digits, sum equals original

---

## Topic 015 - Array Operations

### Q1: Swap Elements in Array
**Problem**: Swap two elements at given indices

**Solution:**
```java
static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
}
```

**Why it works**: Arrays are objects - passed by reference. Both variables point to same array in heap.

**Bonus - Reverse Entire Array:**
```java
static void reverse(int[] array) {
    int start = 0;
    int end = array.length - 1;
    
    while (start < end) {
        swap(array, start, end);
        start++;
        end--;
    }
}
```

**Hint**: Use temp variable, works because array is passed by reference

---

### Q2: Find Maximum Element

**Approach - Full array:**
```java
static int max(int[] array) {
    int maximum = array[0];  // Start with first element
    
    for (int i = 1; i < array.length; i++) {
        if (array[i] > maximum) {
            maximum = array[i];
        }
    }
    return maximum;
}
```

**Approach - In range [index1, index2):**
```java
static int max(int[] array, int index1, int index2) {
    if (index2 > array.length) {
        System.out.println("Boundary");
        return -1;
    }
    
    int maximum = 0;
    for (int i = index1; i < index2; i++) {
        if (array[i] > maximum) {
            maximum = array[i];
        }
    }
    return maximum;
}
```

**Important**: Always initialize max with first element, not 0 (would fail for negative numbers)

**Hint**: Initialize with first element, compare with rest

---

## Quick Reference Patterns

| Question Type | Key Technique |
|---------------|---------------|
| **Digit extraction** | `n % 10` → last digit, `n / 10` → remove last |
| **Reverse number** | `ans = ans * 10 + digit` |
| **Count occurrences (digit)** | Loop with modulo |
| **Count occurrences (unique)** | Nested loops - outer for unique, inner for count |
| **Prime check** | Loop up to √n |
| **Armstrong** | Extract digits, power by count, sum equals original |
| **Array swap** | Temp variable (works due to reference) |
| **Max in array** | Initialize with first element |
| **Case check** | Compare with ASCII ranges |
| **Fibonacci** | a, b variables, update with temp |

---

## Common Mistakes to Avoid

| Mistake | Correction |
|---------|------------|
| Fibonacci base case forgotten | Remember: fib(0)=0, fib(1)=1 |
| 1 is prime | 1 is NOT prime (≤1 returns false) |
| Armstrong - forgot digit count | First find length, then use it as power |
| Swap primitive variables | Won't work - primitives pass by value |
| Array max initialized to 0 | Use first element instead (fails for negatives) |
| Reverse - string vs number | Use math approach for numeric reverse |
| Division by zero | Always check before dividing |
| Scanner after nextInt() | Use nextLine() to consume newline |

---

## Key Concepts Summary

| Concept | What it Means |
|---------|---------------|
| `% 10` | Gets last digit |
| `/ 10` | Removes last digit |
| `* 10` | Makes room for next digit |
| √n for prime | Only check up to square root |
| String to digits | Use toString(), charAt(), or modulo |
| Array reference | Both variables point to same object |

---

*Last updated: 2026-05-13*
