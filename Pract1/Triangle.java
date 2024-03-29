package Pract1;


/**
 * class Triangle.
 * 
 * @author LTP
 * @version 2018-19
 */

public class Triangle extends Figure {
    private double base; 
    private double height;

    public Triangle(double x, double y, double b, double h) {
        super(x, y);
        base = b;
        height = h;
    }
    
    public boolean equals(Object o){
        if(!(o instanceof Triangle)) return false;
        Triangle t = (Triangle) o;
        if(super.equals(t)) return true;
        else return false;
    }

    public String toString() {
        return "Triangle:\n\t" +
            super.toString() +
            "\n\tBase: " + base +
            "\n\tHeight: " + height;
    }
    
    public double area(){
        return base * height / 2;
    }
}