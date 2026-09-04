````markdown
# Java OOPs – Basic Definitions

## 1. Class

A **class** is a blueprint or template used to create objects.
It contains variables and methods.

### Example:
```java
class Student {
    String name;
    int age;
}
````

---

## 2. Object

An **object** is an instance of a class.
It is used to access the variables and methods of a class.

### Example:

```java
Student s1 = new Student();
```

Here, `s1` is an object of the `Student` class.

---

## 3. `this` Keyword

The **`this` keyword** refers to the current object of a class.
It is commonly used to distinguish instance variables from parameters.

### Example:

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

Here, `this.name` refers to the instance variable of the current object.

---

## 4. Constructor

A **constructor** is a special method used to initialize an object.
It has the same name as the class and does not have a return type.

### Example:

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

# Easy Way to Remember

| Term            | Simple Meaning               |
| --------------- | ---------------------------- |
| **Class**       | Blueprint or template        |
| **Object**      | Instance of a class          |
| **this**        | Refers to the current object |
| **Constructor** | Used to initialize an object |

```
```
