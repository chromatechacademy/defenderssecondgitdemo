package com.gitdemotwo;

public class ShomirMain {

    public static void main(String[] args) {
        ShomirMain obj = new ShomirMain(); 
        obj.print("Kevin");
        obj.print("Hello");
        obj.print("Hello Hi");
        
        ShomirMain obj2 = new ShomirMain();
        obj2.print("This is object 2");
    }

    public void print(String name) {
        System.out.println(name);
    }
    
}
