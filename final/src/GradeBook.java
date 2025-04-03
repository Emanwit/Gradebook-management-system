package edu.augie.finalProgram.nwite;



import java.util.HashMap;
// GradeBook class to manage a collection of student records and their grades
public class GradeBook {
    private BST<AbstractRecord> gradeTree;  // Binary Search Tree to store student records and grades
    //private HashMap<Student, Double> studentGrades;

    // Constructor to initialize an empty GradeBook with a BST
    public GradeBook() {
        gradeTree = new BST<>();
        //studentGrades = new HashMap<>();
    }

    public void addTeacher(Teacher teacher){
        gradeTree.insert(teacher, null); //insert teacher record
    }

    // Add a student with their grade to the GradeBook
    public void addStudent(AbstractRecord student, Double grade) {
        gradeTree.insert(student, grade);  // Insert the student record into the BST
    }

    // Print all students' records sorted by their grades
    public void printSortedGrades() {
        gradeTree.inOrder();  // Perform in-order traversal to print records in sorted order
    }

    // Get the highest grade from the GradeBook
    public Double getHighestGrade() {
        return gradeTree.getHighestGrade();  // Retrieve the highest grade from the BST
    }

    // Get the lowest grade from the GradeBook
    public Double getLowestGrade() {
        return gradeTree.getLowestGrade();  // Retrieve the lowest grade from the BST
    }

    // Calculate the average grade of all students in the GradeBook
    public Double calculateAverageGrade() {
        return gradeTree.calculateAverageGrade();  // Calculate the average grade using the BST method
    }

    // Display the promotion or repeat status based on criteria
    public void promoteOrRepeat() {
        System.out.println("\nStudents' Promotion Status:");
        
        // Access the root of the gradeTree and start recursion
        promoteOrRepeatRec(gradeTree.getRoot());
    }

    // Recursive method to check promotion or repetition for each student in the BST
    private void promoteOrRepeatRec(BST.Node root) {
        if (root != null) {
            // Traverse the left subtree first
            promoteOrRepeatRec(root.left);

            // Check if the student's grade is 70 or above to promote them
            if (root.grade >= 70) {
                System.out.println(root.record.getRecordInfo() + " is promoted.");
            } else {
                System.out.println(root.record.getRecordInfo() + " needs to repeat.");
            }

            // Traverse the right subtree
            promoteOrRepeatRec(root.right);
        }
    }
}
