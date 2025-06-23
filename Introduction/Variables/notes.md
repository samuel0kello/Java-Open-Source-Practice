# Java Variables Cheat Sheet

This document covers **all types of variables in Java**, including:

- **Primitive types**
- **Reference types**
- **Variable scopes**
- **Default values**
- **Ranges**
- **How to declare and initialize**

---

## 1. Primitive Data Types

| Type      | Size     | Range                                | Default Value | Example Declaration              |
|-----------|----------|--------------------------------------|----------------|----------------------------------|
| `byte`    | 1 byte   | -128 to 127                          | 0              | `byte b = 100;`                  |
| `short`   | 2 bytes  | -32,768 to 32,767                    | 0              | `short s = 20000;`              |
| `int`     | 4 bytes  | -2³¹ to 2³¹ - 1                      | 0              | `int i = 100000;`               |
| `long`    | 8 bytes  | -2⁶³ to 2⁶³ - 1                      | 0L             | `long l = 10000000000L;`        |
| `float`   | 4 bytes  | ~±3.4e38 (7 decimal digits approx.)  | 0.0f           | `float f = 3.14f;`              |
| `double`  | 8 bytes  | ~±1.7e308 (15 decimal digits approx.)| 0.0d           | `double d = 3.1415926535;`      |
| `char`    | 2 bytes  | 0 to 65,535 (Unicode)                | '\u0000'       | `char c = 'A';`                 |
| `boolean` | 1 bit    | true or false                        | false          | `boolean b = true;`             |

---

## 2. Reference Types

- Hold references to objects (e.g., `String`, arrays, custom classes).
- **Default value**: `null`

```java
String name = "Alice";        // Reference to a String object
int[] numbers = new int[5];   // Reference to an array
MyClass obj = new MyClass();  // Reference to a custom class
