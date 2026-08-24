/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import User.Student;

public class DataItem {
    
    private String key;
    private Student student;

    public DataItem(String key, Student student){
        this.key = key;
        this.student = student;
    }

    public String getKey(){
        return key;
    }

    public Student getStudent(){
        return student;
    }
} 
