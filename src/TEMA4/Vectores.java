package TEMA4;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores {
    
    public static void mostrarVector (int v[])
    {
       for (int i=0;i<v.length;i++)
       {
           System.out.print(v[i]+" ");
       }
    }
    
    public static int[] generarVector18 (int v[])
    {
        int w[]=new int[v.length];
        for (int i=0;i<v.length;i++)
        {
            if (i%2==0)
            {
                w[i]=v[i]+15;
            }
            else
            {
                w[i]=v[i];
            }
        }
        return w;
    }
    
    public static int[] insertarleerVector (int tamanyo)
    {
                    int v[]=new int[tamanyo];
                    for (int i=0;i<v.length/* o <tamanyo;*/;i++)
                    {
                        System.out.println("Dime un elemento");
                        v[i]=Leer.numEntero();    
                    }
                    return v;
    }
    public static int[] ordenarVector (int v[])
    {
        for (int pasada=1;pasada<=v.length;pasada++)
        {
        for (int i=0;i<(v.length-pasada);i++)
        {
            if (v[i] > v[i+1])    // Para poner de mayor a menor cambiar el signo > por <
            {
                int aux=v[i];
                v[i]=v[i+1];
                v[i+1]=aux;
            }
        }
        }
      return v;
        } 
    
    public static int sumaVector (int v[])
    {
        int suma=0;
        for (int i=0;i<v.length;i++)
        {
            //Aqui faltan elementos
        }
        return suma;
    }
    
    public static void posicionizquierda (int v[])
    {
        int aux=v[0];
        
        for (int i=0;i<v.length-1;i++)
        {
            v[i]=v[i+1];
        }
        v[v.length-1]=aux;
    }
    
    public static void despPosiDrchValor (int v[], int x, int indice)
    {
        Scanner tec=new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Dime un elemento para introducir en el vector");
        x=Leer.numEntero();
        System.out.println("Dime el indice donde quieres introducirlo");
        indice=Leer.numEntero();
        for (int i=v.length-1;i>indice;i--)
        {
            v[i]=v[i-1];
        }
        v[indice]=x;
        Vectores.mostrarVector(v);
    }
    
    public static int [] prioridadParImpar (int v[])
    {
        int j=0;
        int p[]=new int[v.length];
        for (int i=0;i<v.length;i++)
        {
            if (v[i]%2==0)
            {
                p[j]=v[i];
                j++;
            }
        }         
              
        for (int i=0;i<v.length;i++)
        {
            if (v[i]%2!=0)
            {
                p[j]=v[i];
                j++;
            }
        }         
        return p;
    }
    /////////////////////////////////////////////////////////////////////////////////////
   /* 
    * public static int mayorVector (int v[])
    {
        
    }
    */
    /*
     * public static int menorVector (int v[])
    {
        
    }
    */
    /////////////////////////////////////////////////////////////////////////////////////
    public static int posicionValorVector (int v[], int x) 
            /* Dado un vector devuelve la posicion que 
             * ocupa un valor en el vector, puede devolver -1 (si no esta)
             * o un valor comprendido entre 0 y la longitud del vector
             */ 
    {
        int indice=-1;
        for (int i=0;i<v.length;i++)
        {
            if (v[i]==x)
            {
                indice=i;
                break;
            }
        }
        return indice;
    }
    
    public static int repiteValorVector (int v[],int x)
            /*
             * Dado un vector de enteros, al darle un numero entero devuelve
             * el numero de veces que se repite ese numero en el vector
             */
    {
        int contadorX=0;
        for (int i=0;i<v.length;i++)
        {
            if (v[i]==x)
            {
                contadorX++;
            }
        }
        return contadorX;
    }
    
    public static int[] vectorIndicesVector (int v[], int x)
            /*
             * Dado un vector de enteros y un numero entero, devuelve en un array los 
             * indices que ocupa ese numero en el vector.
             * El array devuelto contendrá los valores de los indices hasta llegar a -1 y eso indica que 
             * ya no hay mas valores repetidos.
             */
    {
       int w[]=new int[v.length];
       for (int i=0;i<v.length;i++)
       {
           w[i]=-1;
       }
       int j=0;
       for (int i=0;i<v.length;i++)
       {
           if (v[i]==x)
           {
               w[j]=i;
               j++;
           }
       }
       return w;
    }
    
    public static void fill (int v[], int x)
    {
        for (int i=0;i<v.length;i++)
        {
            v[i]=x;
        }
    }
    
    public static void fill (int v[], int Comienzo, int Final, int x)
    {
        for (int i=Comienzo; i<Final && i<v.length; i++)
        {
            v[i]=x;
        }			 
    }
    
    public static void fill (float v[], float x)
    {

        for (int i=0;i<v.length;i++)
        {
            v[i]=x;
        }
    }
    
    public static void fill (float v[], int Comienzo, int Final, int x)
    {
        for (int i=Comienzo; i<Final && i<v.length; i++)
        {
            v[i]=x;
        }			 
    }
    
    public static boolean equals (int v[], int w[])
    {
       boolean iguales;
       if (v.length!=w.length)
        {
           iguales=false;
        }
       else
        {
        iguales=true;
        for(int i=0;i<v.length;i++)
            {
             if (v[i]!=w[i])
                {
                 iguales=false;
                 break;
                }
            }
        }
       return iguales;
    }
    
    public static boolean equals (float v[], float w[])
    {
        boolean iguales;
       if (v.length!=w.length)
        {
           iguales=false;
        }
       else
        {
        iguales=true;
        for(int i=0;i<v.length;i++)
            {
             if (v[i]!=w[i])
                {
                 iguales=false;
                 break;
                }
            }
        }
       return iguales;
    }
}