package TEMA4;


public class Fecha {
     public static boolean comprobarbisiesto (int a)
     {
     boolean b;
         if (((a%4==0) && (a%100!=0)) || (a%400==0))
                {
                    b=true;
                }
         else
         {
             b=false;
         }
         return b;
     }
         
     public static boolean comprobarFecha( int d, int m, int a)
    {
        int diasMeses[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        boolean bisiesto;
        bisiesto=Fecha.comprobarbisiesto(a);
        
        if (bisiesto)
        {
            diasMeses[2]=29;
        }
        
        boolean fechabuena=true;
        
        if ((m<1 || m>2) || (a<1900 || a>2100))
        {
            fechabuena=false;
        }
        else if (d<1 || d>diasMeses[m])
        {
            fechabuena=false;
        }
        
        return fechabuena;
     }       
}
