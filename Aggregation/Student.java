
package org.example;


public class Student{
    String name;
    String city;
    double gpa;
    
    Student( String name, String city, double gpa ){
        this.name = name;
        this.city = city;
        this.gpa = gpa;
    }
    
  
    String show(){
        return "name: " +this.name + "\nCity: " +this.city + "\nGPA: "+this.gpa; 
    }
    
}
