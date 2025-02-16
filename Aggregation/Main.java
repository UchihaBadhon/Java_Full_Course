package org.example;
import java.util.Scanner;

/*
Aggregation represents has a relationship between objects.
One object can contain another object as part of its structure
But the contained object can exist independently
*/

public class Main {
    public static void main(String[] args) {
       
        Student stdnt1 = new Student( "Kashem", "Dhaka", 3.78 );
        Student stdnt2 = new Student( "Motin", "Dhaka", 4.78 );
        Student stdnt3 = new Student( "Lobstar", "Dhaka", 3.89 );
        
        Student[] student = { stdnt1, stdnt2, stdnt3 };
        
        for( Student _student : student ){
            _student.show();
        }
        
        Person person = new Person("Dhaka", student);
        person.show();
    }
}