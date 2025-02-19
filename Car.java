
package org.example;

public class Car {
    String name;
    int year;
    Engine engine;
    
    Car( String name, int year, String engine_type ){
        this.name = name;
        this.year = year;
        this.engine = new Engine(engine_type);
    }
    
    void show(){
        this.engine.show();
        System.out.println("THE NAME: "+this.name);
        System.out.println("Released year: " +this.year);
    }
 
    
}
