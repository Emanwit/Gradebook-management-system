/**
 * @author Emmanuel Nwite
 * @version  Dec 12 2024
 * COSC 260
 * 
 */

package edu.augie.finalProgram.nwite;
import java.io.*;

// CSVReader class to read student data from a CSV file and add to GradeBook
public class CSVReader {

    // Method to read student records from a CSV file and add them to the provided GradeBook
    public static void readCSVAndAddStudents(GradeBook gradeBook) {
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) { // Open CSV file for reading
            String line;
            br.readLine(); // Skip the header line of the CSV file

            // Read each line of the CSV file and process the student data
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Split the line by commas to extract data
                String studentID = data[0].trim(); // Extract and trim the student ID
                String studentName = data[1].trim(); // Extract and trim the student name
                Double grade = Double.parseDouble(data[2].trim()); // Parse and trim the grade

                // Create a new Student object with the extracted data
                Student student = new Student(studentID, studentName);
                // Add the student and their grade to the GradeBook
                gradeBook.addStudent(student, grade);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle potential I/O errors
        }
    }
}
