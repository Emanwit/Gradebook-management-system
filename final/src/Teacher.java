/**
 * @author Emmanuel Nwite
 * @version  Dec 12 2024
 * COSC 260
 * 
 */

package edu.augie.finalProgram.nwite;

// Teacher class extending AbstractRecord for polymorphism demonstration

public class Teacher extends AbstractRecord {
    private String teacherId;  // Teacher ID
    private String teacherName;  // Teacher Name
    private String subject;  // Subject taught by the teacher

    // Constructor to initialize teacher details
    public Teacher(String teacherId, String teacherName, String subject) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.subject = subject;
    }

    // Getter for teacher ID
    public String getTeacherId() {
        return teacherId;
    }

    // Getter for teacher Name
    public String getTeacherName() {
        return teacherName;
    }

    // Getter for subject taught by the teacher
    public String getSubject() {
        return subject;
    }

    // Implementation of getRecordInfo() to return teacher-specific details(demonstaration of polymorphism)
    @Override
    public String getRecordInfo() {
        return String.format("Teacher ID: %s, Name: %s, Subject: %s", teacherId, teacherName, subject);
    }
}
