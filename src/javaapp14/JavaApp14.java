package javaapp14;


public class JavaApp14 {

    
    public static void main(String[] args) {
        
        int a = 1; 
        int b = -6;
        int c = 5;
        
        double delta = Math.pow(-6, 2) - 4 * 1 * 5;       
        System.out.println("Delta: " + delta);
        
        //Encontrar as Raizes x1 & x2        
        double x1 = ( -(-6) + (Math.sqrt(delta))  ) / (2.1);
        System.out.println("X1 vale: " + Math.ceil(x1));
        
        double x2 = ( -(-6) - (Math.sqrt(delta))  ) / (2.1);
        System.out.println("X2 vale: " + Math.ceil(x2));
        
        
       
    }
    
}
