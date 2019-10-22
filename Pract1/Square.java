package Pract1;

import java.util.*;
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Rectangle {
    // instance variables - replace the example below with your own
    

    
    /**
     * Constructor for objects of class Square
     */
    public Square(double x,double y,double base) {
        super(x,y,base,base);
    }
    
     public boolean equals(Object o){
        if(!(o instanceof Square)) return false;
        Square s = (Square) o;
        if(super.equals(s)) return true;
        else return false;
    }

    public String toString() {
        return super.toString(); 
    }
    
    
}
