package TEMA4;


import java.util.Scanner;

public class Leer {
    
  public static int numEntero()
        {
            Scanner tec=new Scanner (System.in);
            int n;
            n=tec.nextInt();
            return n;
        }
        
        public static float numFloat()
        {
            Scanner tec=new Scanner (System.in);
            float n;
            n=tec.nextFloat();
            return n; 
        }
        
        public static long numLong()
        {
            Scanner tec=new Scanner (System.in);
            long n;
            n=tec.nextLong();
            return n;  
        }
        
        public static short numShort()
        {
            Scanner tec=new Scanner (System.in);
            short n;
            n=tec.nextShort();
            return n; 
        }
        
        public static byte numByte()
        {
            Scanner tec=new Scanner (System.in);
            byte n;
            n=tec.nextByte();
            return n; 
        }
        
        public static double numDouble()
        {
            Scanner tec=new Scanner (System.in);
            double n;
            n=tec.nextDouble();
            return n; 
        }
        
        public static String cadena ()
        {
            Scanner tec=new Scanner (System.in);
            String cad;
            cad=tec.nextLine();
            return cad; 
        }
        
        public static char letra ()
        {
            Scanner tec=new Scanner (System.in);
            String cad;
            char c;
            cad=tec.nextLine();
            c=cad.charAt(0);
            return c; 
        }
}
