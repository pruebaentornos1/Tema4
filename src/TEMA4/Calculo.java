package TEMA4;


import java.util.Scanner;




public class Calculo {
   
    public static void mostrarTablaMultiplicar (int n)
    {
        for (int cont=1;cont<=10;cont++)
        {
            System.out.println(n+" x "+cont+" = "+(n*cont));
        }
    }
    
    public static long calcularFactorial (int n)
    {
        long fact=1;
        for (int cont=1;cont<=n;cont++)
        {
            fact*=cont;
        }
        return fact;
     }
    
    public static void mostrarDivisores(int n)
    {
        for (int cont=1;cont<=n;cont++)
        {
            if (n%cont==0)
            {
                System.out.println(cont+" es divisor");
            }
        }
    }
    
    public static int contarDivisores(int n)
    {
        int numdivisores=0;
        for (int cont=1;cont<=n;cont++)
        {
            if (n%cont==0)
            {
                numdivisores++;
            }
        }
        return numdivisores;
    }
    
    public static int sumaDivisores(int n)
    {
     int suma=0;
     for (int cont=1;cont<=n;cont++)
     {
         if (n%cont==0)
         {
             suma+=cont;
         }
     }
     return suma;
    }
    
    public static boolean comprobarPrimo(int n)
    {
       boolean primo=true;
       if (n==1)
       {
           return primo==false;
       }
       else
       {
           for (int cont=2;cont<n;cont++)
           {
               if (n%cont==0)
               {
                   primo=false;
                   break;
               }
           }
       }
       return primo;
    }
    
    public static long potencia (int x, int y)
    {
        //no declarar x e y otra vez
        //no leer x, no leer y
        long resultado=1;
        for (int cont=1;cont<=y;cont++)
        {
            resultado=resultado*x;
        }
        return resultado;
    }
    
    public static int maximo (int x, int y)
    {
     int variable;
     if (x>y)
     {
         variable=x;
     }
     else
     {
         variable=y;
     }
     return variable;
    }
    
    public static int minimo (int x, int y)
    {
     int variable;
     if (x<y)
     {
         variable=x;
     }
     else
     {
         variable=y;
     }
     return variable;
    }
    
    public static int absoluto (int x)
    {
       int variable;
       if(x<0)
       {
           variable=-(x);
       }
       else
       {
           variable=x;
       }
       return variable;
    }
    
    public static int suma3 (int x, int y , int z)
    {
        int variable;
        variable=x+y+z;
        return variable;
    }
      
}
