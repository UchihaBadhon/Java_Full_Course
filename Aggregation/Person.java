
package org.example;


public class Person {
    String city;
    Student[] _student;
    
    Person( String city, Student[] _student ){
        this.city = city;
        this._student = _student;
    }
    
    void show(){
        System.out.println("This is " +this.city + " where the students are: ");
        for( Student stdnt : _student ){
            System.out.println(stdnt.show());
        }
    }
    
}
