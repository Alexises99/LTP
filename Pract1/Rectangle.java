package Pract1;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Figure implements Printable, ComparableRange{
    // instance variables - replace the example below with your own
    private double base,height;

    
    public Rectangle(double x,double y,double base,double height) {
        super(x,y);
        this.base = base;
        this.height = height;
    }
    
    public boolean equals(Object o){
        if(!(o instanceof Rectangle)) return false;
        Rectangle r = (Rectangle) o;
        if(super.equals(r)) return true;
        else return false;
    }

    public String toString() {
        if(base == height){
            return "Square:\n\t" +
            super.toString() +
            "\n\tBase: " + base;
            
        }
        else {return "Rectangle:\n\t" +
            super.toString() +
            "\n\tBase: " + base +
            "\n\tHeight: " + height;
        }
    }
    
    public double area(){
        return base*height;
    }
    
    public void print(char c){
    int b = (int) base;
    int h = (int) height;
    for (int i = 0; i < h; i++) {
        for (int j = 0; j < b; j++) {
            System.out.print(c);
        }
        System.out.println();
    } 
    }
    
    public int compareToRange(Object o){
        if(!(o instanceof Rectangle)) throw new ClassCastException();
        Rectangle r = (Rectangle) o;
        if((Math.abs(this.area()) - Math.abs(r.area())) <= 0.1*(r.area()+this.area()))return 0;
        else return this.compareTo(r);
        
        
    }
}
