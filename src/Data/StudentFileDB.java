/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import DataStructures.DoublyLinkedList;
import User.Student;
import java.io.*;

/**
 *
 * @author USER
 */
public class StudentFileDB{

    private static final String FILE_NAME = "StudentRegistration.txt";

    //Save data in the StudentRegistration.txt File
    public static void saveStudent(String studentId, String name, int age, String courseEnrolled, String level, String timestamp) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {

            writer.write(studentId + "," + name + "," + age + "," + courseEnrolled + "," + level + "," + timestamp);

            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static void loadStudents(DoublyLinkedList list) {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] row = line.split(",");

                list.insertLast(
                        row[0],
                        row[1],
                        Integer.parseInt(row[2]),
                        row[3],
                        row[4],
                        row[5]
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
