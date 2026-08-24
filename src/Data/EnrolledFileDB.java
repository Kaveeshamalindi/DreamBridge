/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import DataStructures.DataItem;
import DataStructures.HashTable;
import DataStructures.DoublyLinkedList;
import DataStructures.Link;
import User.Student;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class EnrolledFileDB{

    private static final String FILE_NAME = "StudentRegistration.txt";
    
    private DoublyLinkedList dll = new DoublyLinkedList();
    
    private HashTable deletedTable = new HashTable(50); // size can be changed

    public EnrolledFileDB() {
    }
    
    // load from file to DLL
    public void loadToMemory() {
        dll = new DoublyLinkedList();

        Path path = Paths.get(FILE_NAME);

        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                dll.insertLast(
                        data[0],
                        data[1],
                        Integer.parseInt(data[2]),
                        data[3],
                        data[4],
                        data[5]
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public boolean deleteStudent(String id) {

        Link deleted = dll.deleteKey(id);

        if (deleted == null)
            return false;

        Student s = new Student(
                deleted.studentId,
                deleted.name,
                deleted.age,
                deleted.courseEnrolled,
                deleted.level,
                deleted.timestamp
        );
        
        DataItem item = new DataItem(s.getStudentId(), s);

        deletedTable.insert(item);        

        // save deleted file
        saveDeletedStudent(s);

        // Rewrite to the StudentRegistration.txt file from DLL
        saveAllToFile();

        return true;
    }
    
    private boolean isHashTableFull() {

        DataItem[] items = deletedTable.getAllItems();

        for (DataItem item : items) {

            if (item == null) {
                return false; // Empty space available
            }
        }

        return true; // No empty space
    }
    
    
    private void saveAllToFile() {

    Path path = Paths.get(FILE_NAME);

        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

            Link current = dll.getFirst();

            while (current != null) {

                bw.write(current.studentId + "," +
                         current.name + "," +
                         current.age + "," +
                         current.courseEnrolled + "," +
                         current.level + "," +
                         current.timestamp);

                bw.newLine();
                current = current.next;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public DoublyLinkedList getDLL() {
        return dll;
    }
    
    private void saveDeletedStudent(Student s) {
        String deletedFile = "DeletedStudents.txt";

        try (BufferedWriter bw = Files.newBufferedWriter(
                Paths.get(deletedFile),
                StandardCharsets.UTF_8,
                StandardOpenOption.APPEND,
                StandardOpenOption.CREATE)) {

            bw.write(s.toCSV());
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public HashTable loadDeletedStudentsToHashTable() {

        HashTable table = new HashTable(50);
        Path path = Paths.get("DeletedStudents.txt");

        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

            String line;

            while ((line = br.readLine()) != null) {

                Student s = Student.fromCSV(line);

                DataItem item = new DataItem(s.getStudentId(), s);
                table.insert(item);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return table;
    }
}
