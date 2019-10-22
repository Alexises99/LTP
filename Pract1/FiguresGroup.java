package Pract1;

import java.util.*;
/**
 * class FiguresGroup.
 * 
 * @author LTP 
 * @version 2018-19
 */

public class FiguresGroup implements Printable {
    private static final int NUM_FIGURES = 10;
    private Figure[] figuresList = new Figure[NUM_FIGURES];
    private int numF = 0;
    
    public void add(Figure f) { figuresList[numF++] = f; }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < numF; i++) {
            s += "\n" + figuresList[i];
        }
        return s;
    }

    private boolean found(Figure f) {
        for (int i = 0; i < numF; i++) {
            if (figuresList[i].equals(f)) return true;
        }
        return false;
    }

    private boolean included(FiguresGroup g) {
        for (int i = 0; i < g.numF; i++) {
            if (!found(g.figuresList[i])) return false;
        }
        return true;
    }
    
    public boolean equals(Object o){
        if(!(o instanceof FiguresGroup)) return false;
        FiguresGroup f = (FiguresGroup) o;
        if(f.included(this) && this.included(f)) return true;
        else return false;
    }
    
    public double area(){
        double areaTotal = 0;
        for(int i = 0; i < numF; i++){
            areaTotal = figuresList[i].area();
        }
        return areaTotal;
    }
    
    public Figure greatestFigure(){
        double max = figuresList[0].area();
        int pos = 0;
        for(int i = 1; i < numF; i++){
            if(figuresList[i].area() > max){
                max = figuresList[i].area();
                pos = i;
            }               
        }
        return figuresList[pos];
    }
    
    public List orderedList(){
        List l = new LinkedList();
        if(numF > 0){
            for(int i = 1; i < numF;i++){
                int j = l.size()-1;
                while(j >= 0 && figuresList[i].compareTo(l.get(j)) < 0){
                    j--;
                }
            l.add(j+1,figuresList[i]);
        }
        
    }
    return l;
}

    public void print(char c){
        for (int i = 0; i < numF; i++) {
            figuresList[i].print(c);
        }
    }
}