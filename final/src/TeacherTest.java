/**
 * @author Emmanuel Nwite
 * @version  Dec 12 2024
 * COSC 260
 * 
 */

import edu.augie.finalProgram.nwite.*;
public class TeacherTest {
    public static void main(String[] args) {
        // Create Teacher objects
        Teacher teacher1 = new Teacher("T101", "Mr. Smith", "Mathematics");
        Teacher teacher2 = new Teacher("T102", "Mrs. Johnson", "Science");

        // Create a GradeBook instance
        GradeBook gradeBook = new GradeBook();

        // Add Teacher objects to the GradeBook
        // Teachers don't have grades, so we pass a grade of 0.0 for demonstration
        gradeBook.addStudent(teacher1, 0.0);
        gradeBook.addStudent(teacher2, 0.0);

        // Print sorted records (this should print Teacher records)
        System.out.println("All Teacher Records Sorted:");
        gradeBook.printSortedGrades();

        // Get the highest grade from the GradeBook (even though teachers have no grades)
        System.out.println("\nHighest Grade: " + gradeBook.getHighestGrade());

        // Get the lowest grade from the GradeBook (again, only for demonstration)
        System.out.println("Lowest Grade: " + gradeBook.getLowestGrade());

        // Calculate the average grade (should return a value based on student records, if any)
        System.out.println("Average Grade: " + gradeBook.calculateAverageGrade());

        // Print out the promotion or repeat status (this is a placeholder function)
        gradeBook.promoteOrRepeat();
    }
}
