package edu.augie.finalProgram.nwite;

import java.io.*;

// CSVReader for Teachers class to read teacher data from a CSV file and add them to the GradeBook
public class TeacherCSVReader {

    // Method to read teacher records from a CSV file and add them to the GradeBook
    public static void readCSVAndAddTeachers(GradeBook gradeBook) {
        try (BufferedReader br = new BufferedReader(new FileReader("teachers.csv"))) { // Open CSV file for reading
            String line;
            br.readLine(); // Skip the header line of the CSV file

            // Read each line of the CSV file and process the teacher data
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Split the line by commas to extract data
                String teacherID = data[0].trim(); // Extract and trim the teacher ID
                String teacherName = data[1].trim(); // Extract and trim the teacher name
                String subject = data[2].trim(); // Extract and trim the subject taught

                // Create a new Teacher object with the extracted data
                Teacher teacher = new Teacher(teacherID, teacherName, subject);
                // Add the teacher to the GradeBook (Here we add the teacher without a grade, but you can add a grade handling system)
                gradeBook.addTeacher(teacher); // Assuming GradeBook has an `addTeacher` method
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle potential I/O errors
        }
    }
}
