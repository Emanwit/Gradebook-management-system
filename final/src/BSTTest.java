/**
 * @author Emmanuel Nwite
 * @version  Dec 12 2024
 * COSC 260
 * 
 */

import edu.augie.finalProgram.nwite.*;

public class BSTTest {
    public static void main(String[] args) {
        // Create a BST for Student records
        BST<Student> gradeTree = new BST<>();

        // Create Student objects
        Student student1 = new Student("S123", "Emmanuel Nwite");
        Student student2 = new Student("S124", "John Doe");
        Student student3 = new Student("S125", "Alice Smith");

        // Add students and their grades to the BST
        gradeTree.insert(student1, 85.5);
        gradeTree.insert(student2, 92.0);
        gradeTree.insert(student3, 78.5);

        // Test inOrder() method to print sorted students by grade
        System.out.println("Students sorted by grade:");
        gradeTree.inOrder();

        // Test getHighestGrade() method
        System.out.println("\nHighest Grade: " + gradeTree.getHighestGrade());

        // Test getLowestGrade() method
        System.out.println("Lowest Grade: " + gradeTree.getLowestGrade());

        // Test calculateAverageGrade() method
        System.out.println("Average Grade: " + gradeTree.calculateAverageGrade());
    }
}
