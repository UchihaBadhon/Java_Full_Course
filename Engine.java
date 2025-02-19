
package org.example;


public class Engine{
    String type;
    
    Engine( String type){
        this.type = type;
    }
    
    void show(){
        
        System.out.println("The model is "+this.type);
    }
  
    
}
