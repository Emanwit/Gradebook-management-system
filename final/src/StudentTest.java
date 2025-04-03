/**
 * @author Emmanuel Nwite
 * @version  Dec 12 2024
 * COSC 260
 * 
 */

import edu.augie.finalProgram.nwite.*;

public class StudentTest {
    public static void main(String[] args) {
        // Create student objects for testing
        Student student1 = new Student("S123", "Emmanuel Nwite");
        Student student2 = new Student("S124", "John Doe");
        Student student3 = new Student("S123", "Emmanuel Nwite"); // Same ID as student1 for equality test

        // Test getRecordInfo() method
        System.out.println("Student 1 Info: " + student1.getRecordInfo());
        System.out.println("Student 2 Info: " + student2.getRecordInfo());

        // Test compareTo() method (sorting based on ID)
        System.out.println("Comparing student1 and student2: " + student1.compareTo(student2)); // Should return negative value (S123 < S124)
        System.out.println("Comparing student1 and student3: " + student1.compareTo(student3)); // Should return 0 (same ID)

        // Test equals() method (check equality based on ID)
        System.out.println("student1 equals student2: " + student1.equals(student2)); // Should return false
        System.out.println("student1 equals student3: " + student1.equals(student3)); // Should return true

        // Test hashCode() method (should be the same for students with same ID)
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode()); // Same as student1
    }
}
