/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author icbt1
 */
public class Link {
    
    public String studentId;
    public String name;
    public int age;
    public String courseEnrolled;
    public String level;
    public String timestamp;  
    public int arrivalOrder;

    public Link next;
    public Link previous;

    public Link(String studentId, String name, int age, String courseEnrolled, String level, String timestamp) {

        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.courseEnrolled = courseEnrolled;
        this.level = level;
        this.timestamp = timestamp;

        this.arrivalOrder = 0;
        this.next = null;
        this.previous = null;
    }
    
}

