/**
 * @author Emmanuel Nwite
 * @version  Dec 12 2024
 * COSC 260
 * 
 */

package edu.augie.finalProgram.nwite;

// Abstract class for student record
abstract class AbstractRecord {
    // Abstract method to get record information
    public abstract String getRecordInfo();
}

// Student class extends AbstractRecord and implements Comparable for sorting
public class Student extends AbstractRecord implements Comparable<Student> {
    private String id;  // Student ID
    private String name;  // Student name

    // Constructor to initialize student with id and name
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for student ID
    public String getId() {
        return id;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Returns student information as a formatted string
    @Override
    public String getRecordInfo() {
        return String.format("ID: %s, Name: %s", id, name);
    }

    // Compare students based on their ID (used for sorting)
    @Override
    public int compareTo(Student other) {
        return this.id.compareTo(other.id);
    }

    // Checks equality based on student ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id.equals(student.id);
    }

    // Generates a hash code based on the student ID
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    // Returns student information in string format
    @Override
    public String toString() {
        return getRecordInfo();
    }
}
