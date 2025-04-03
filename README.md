# GradeBook System Documentation

## Overview
The GradeBook system is a Java application that manages student records using a Binary Search Tree (BST). It reads student data from a CSV file, sorts them by grades, and provides functionalities like calculating averages and determining student promotions.

---

## Class Hierarchy & Responsibilities

### **1. GradeBook**
- **Central class** for managing student records and grades.
- **Key Methods**:
  - `addStudent`: Adds a student record with a grade to the BST.
  - `printSortedGrades`: Prints records sorted by grade (ascending).
  - `getHighestGrade` / `getLowestGrade`: Retrieves the highest/lowest grade.
  - `promoteOrRepeat`: Determines promotion (grade ≥ 70) or repetition.
  - `calculateAverageGrade`: Computes the class average.

### **2. BST (Binary Search Tree)**
- **Data structure** for storing records sorted by grade.
- **Key Methods**:
  - `insert`: Adds a record to the BST.
  - `inOrder`: Traverses and prints records in sorted order.
  - `getHighestGrade`: Returns the rightmost node’s grade.
  - `getLowestGrade`: Returns the leftmost node’s grade.

### **3. AbstractRecord (Abstract Class)**
- **Base class** for `Student` and `Teacher`.
- **Key Method**:
  - `getRecordInfo()`: Abstract method to return record details (implemented by subclasses).

### **4. Student (extends AbstractRecord)**
- **Attributes**: `id`, `name`, `grade`.
- **Method**:
  - `getRecordInfo()`: Returns formatted string (e.g., `"ID: 101, Name: Alice, Grade: 85"`).

### **5. Teacher (extends AbstractRecord)**
- **Attributes**: `name`.
- **Method**:
  - `getRecordInfo()`: Returns teacher’s name (e.g., `"Teacher: Mr. Smith"`).

---

## How Classes Work Together
1. **GradeBook** uses **BST** to store and sort records (students/teachers).
2. **BST** nodes contain **AbstractRecord** objects (polymorphism).
3. **Student** and **Teacher** override `getRecordInfo()` for specific details.

---

## Program Execution
### **Steps to Run:**
1. **Compile**:
   ```bash
   javac -d src src/*.java
## Conclusion
The GradeBook system efficiently organizes student records using a BST, enabling:  

- **Automatic sorting** by grades  
- **Statistical analysis** (average, min/max)  
- **Promotion decisions** based on thresholds  
- **Extensible design** for teachers/other record types  