package Pract3;

import java.util.*;
import java.io.*;

/**
 * class ArrayListUse.
 * 
 * @author LTP
 * @version 2018-19
 */

public class ArrayListUse {       
    public static void main(String[] args) {        
        if (args.length != 1) {
			System.err.print("You must specify an argument: filename");
            System.exit(0);
        }
        
		// Creating File object, Scanner object, ArrayList object
		
		// TO COMPLETE ...
		File f = null;
		Scanner sc = null;
		ArrayList<String> list = null;
        
        try {
            // TO COMPLETE ...
            f = new File("hola");
            sc = new Scanner(f);
            list = new ArrayList<String>();
        } 
        catch (FileNotFoundException e) {
            System.err.println("File does not exists " + e.getMessage());
            System.exit(0);
        }
                
	    // Reading file, adding lines to the list
		
        while ( sc.hasNext()) {
            // TO COMPLETE ...
            list.add(sc.nextLine());
        }
        
		// Sorting the list, writing it to console
        
        // TO COMPLETE ...
    }     
}