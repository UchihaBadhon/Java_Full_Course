package org.example;
import java.util.Scanner;

/*
Aggregation represents a part of retionship between objects.
for example an engine is a "part of" of a car.
Allow complex objects to be constructed from smaller objects.
*/

public class Main {
    public static void main(String[] args) {
       
        Car car = new Car("Audi", 2019, "r8");
        
        // System.out.println("Name: "+car.name);
        // System.out.println("Year: "+car.year);
        // System.out.println("Engine Model: "+car.engine.type);
        
        car.show();
}
}