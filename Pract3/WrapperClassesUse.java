package Pract3;


/**
 * class WrapperClassesUse.
 * 
 * @author LTP 
 * @version 2018-19
 */

public class WrapperClassesUse {        
    public static void main(String[] args) {            
        // Assignment of wrapper variables to elementary types 
        int i = new Integer(123456);    
        double d = new Double(123456);
        long l = new Long(123456);
        float f = new Float(123456);
        byte b = new Byte((byte)123456);
        short s = new Short((short)123456);
        boolean bo = new Boolean(true);
        char c = new Character('a');
        // TO COMPLETE ...
            
        // Writing elementary variables
        System.out.println("int i = " + i);
        System.out.println("Double d = " + d);
        System.out.println("Long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("boolean bo = " + b);
        System.out.println("char c = " + c);
        // TO COMPLETE ...
               
        // Assignment of elementary values to wrapper variables
        Integer eI = 123456; 
        Double eD = 123456D;
        Long eL = 123456L;
        Float eF = 123456F;
        Byte eB = (byte)123456;
        Short eS = (short)123456;
        Boolean eBo = true;
        Character eC = ('a');
        
        // TO COMPLETE ...
            
        // Writing wrapper variables
        System.out.println("Integer I = " + eI);
        System.out.println("Double D= " + eD);
        System.out.println("Long L = " + eL);
        System.out.println("Float F = " + eF);
        System.out.println("Byte B = " + eB);
        System.out.println("Short S = " + eS);
        System.out.println("Boolean Bo = " + eBo);
        System.out.println("Character C= " + eC);
        // TO COMPLETE ...
    }    
}