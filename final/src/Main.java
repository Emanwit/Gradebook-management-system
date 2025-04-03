import edu.augie.finalProgram.nwite.*;

public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        // Read students from CSV and add them to the gradebook
        CSVReader.readCSVAndAddStudents(gradeBook);

        // Print students sorted by grade
        gradeBook.printSortedGrades();

        // Calculate and display average, highest, and lowest grade
        System.out.println("\nAverage Grade: " + gradeBook.calculateAverageGrade());
        System.out.println("Highest Grade: " + gradeBook.getHighestGrade());
        System.out.println("Lowest Grade: " + gradeBook.getLowestGrade());

        // Promote or repeat students
        gradeBook.promoteOrRepeat();
    }
}
