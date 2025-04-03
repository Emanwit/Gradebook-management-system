import edu.augie.finalProgram.nwite.*;

public class GradeBookTest {
    public static void main(String[] args) {
        // Create a GradeBook instance
        GradeBook gradeBook = new GradeBook();

        // Create Student and Teacher objects
        Student student1 = new Student("S123", "Emmanuel Nwite");
        Student student2 = new Student("S124", "John Doe");
        Teacher teacher1 = new Teacher("T101", "Mr. Smith", "Mathematics");
        Teacher teacher2 = new Teacher("T102", "Mrs. Johnson", "Science");

        // Add students and teachers to the GradeBook with sample grades
        gradeBook.addStudent(student1, 85.5);
        gradeBook.addStudent(student2, 92.0);
        gradeBook.addStudent(teacher1, 0.0);  // Teachers don't have grades, but we can add them to the tree
        gradeBook.addStudent(teacher2, 0.0);

        // Test printSortedGrades() method
        System.out.println("All Records Sorted:");
        gradeBook.printSortedGrades();

        // Test getHighestGrade() method
        System.out.println("\nHighest Grade: " + gradeBook.getHighestGrade());

        // Test getLowestGrade() method
        System.out.println("Lowest Grade: " + gradeBook.getLowestGrade());

        // Test calculateAverageGrade() method
        System.out.println("Average Grade: " + gradeBook.calculateAverageGrade());

        // Test promoteOrRepeat() method (currently a placeholder)
        gradeBook.promoteOrRepeat();
    }
}
