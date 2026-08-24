/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import java.time.LocalDateTime;

/**
 *
 * @author icbt1
 */
public class Student {
    
    private String studentId;
    private String name;
    private int age;
    private String courseEnrolled;
    private String level;
    private String timestamp;  
    private int arrivalOrder;

    public Student() {
    }

    public Student(String studentId, String name, int age, String courseEnrolled, String level, String timestamp) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.courseEnrolled = courseEnrolled;
        this.level = level;
        this.timestamp = timestamp;
    }

    public Student(String studentId, String name, int age, String courseEnrolled, String level, String timestamp, int arrivalOrder) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.courseEnrolled = courseEnrolled;
        this.level = level;
        this.timestamp = timestamp;
        this.arrivalOrder = arrivalOrder;
    }
    
    

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getArrivalOrder() {
        return arrivalOrder;
    }

    public void setArrivalOrder(int arrivalOrder) {
        this.arrivalOrder = arrivalOrder;
    }
    
    // Convert Student to CSV string
    public String toCSV() {
        return studentId + "," + name + "," + age + "," + courseEnrolled + "," + level + "," + timestamp;
    }
    
    // Convert CSV string to Student
    public static Student fromCSV(String csvLine) {
        String[] parts = csvLine.split(",");
        return new Student(
            parts[0],
            parts[1],
            Integer.parseInt(parts[2]),
            parts[3],
            parts[4],
            parts[5]
        );
    }
    
    public int getPriority() {
        switch (level.toLowerCase()) {
            case "senior": return 3;
            case "junior": return 2;
            case "fresher": return 1;
            default: return 0;
        }
    }
}
