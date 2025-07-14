# Library Management System

This is a simple console-based **Library Management System** implemented in Java. The system demonstrates basic Object-Oriented Programming (OOP) concepts such as interfaces, classes, and polymorphism.

---

## Features

- Supports multiple item types:  
  - **Book**  
  - **Magazine**  
  - **DVD**  
- Uses an interface `Item` to enforce a common method `displayInfo()` for all item types.
- Stores all library items in a collection (`ArrayList`).
- Displays information about all added items in the library.

---

## Code Structure

### Interface

- `Item`  
  Defines the contract for any library item with the method:  
  `void displayInfo();`

### Classes

- `Book`  
  Contains properties: `title`, `author`, and `year_of_publication`. Implements `Item`.

- `Magazine`  
  Contains properties: `title`, `issue_no`, and `pub_date`. Implements `Item`.

- `DVD`  
  Contains properties: `title`, `director`, and `duration` (in minutes). Implements `Item`.

- `Library`  
  Manages a collection of `Item` objects. Provides methods to add items and display all items.

- `Libeary_Management_System` (Main class)  
  Creates instances of `Book`, `Magazine`, and `DVD`, adds them to the library, and displays their information.

---

## How to Run

1. Make sure you have Java installed on your machine.
2. Compile all `.java` files:
   ```bash
   javac Libeary_Management_System.java
