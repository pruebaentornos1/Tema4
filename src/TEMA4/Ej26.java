
package TEMA4;

import java.util.Scanner;

public class Ej26 {
    /*
     *  a. Se desea calcular la suma total de todos los valores de los elementos de la
           matriz.
        b. Se desea calcular la suma de cada una de las filas.
        c. Se desea guardar un vector, la suma de cada una de las filas de la matriz.
           Mostrar posteriormente el valor de los elementos del vector.
        d. Indicar cuál es el valor mayor de todos los elementos de la matriz, junto con la
           posición que ocupa.
        e. Indicar si un número introducido por teclado se encuentra en la matriz.
     */
    public static void main(String[] args) {
        int v[][]={{12,34,56},{45,67,89,23,45},{67,89}};
        
        //Apartado a *************************************************
        int suma=0;
        for(int fila=0;fila<v.length;fila++)
        {
             for(int columna=0;columna<v[fila].length;columna++)
             {
              suma=suma+v[fila][columna];
             }
        }
        System.out.println("Suma total "+suma);
        
        //Apartado b *************************************************
        
        for (int fila=0;fila<v.length;fila++)
        {
            int suma1=0;
            for (int columna1=0;columna1<v[fila].length;columna1++)
            {
                suma1=suma1+v[fila][columna1];
            }
            System.out.println("La suma de la fila "+fila+" es "+suma1);
        }
        /* int suma1;
         * suma=Vectores.sumaVector(m[fila]);
         * System.out.println("La suma de la fila "+fila+" es "+suma1);
         */
        
        //Apartado c *************************************************
         
        int m[]=new int[v.length];
        for (int fila=0;fila<v.length;fila++)
        {
            int suma2=0;
            for (int columna1=0;columna1<v[fila].length;columna1++)
            {
                suma2=suma2+v[fila][columna1];
            }
            m[fila]=suma2;
        }
        
        /*
         * m[fila]=Vectores.sumaVector(v[fila])
         */
        System.out.println("Valor de los elementos del vector ");
        Vectores.mostrarVector(m);
        System.out.println(" "); //Insertar un espacio
        
        //Apartado d *************************************************
        
        int my=v[0][0];
        int filamayor=0, colmayor=0;
        for( int fila=0;fila<v.length;fila++)
        {
            for (int columna=0;columna<v[fila].length;columna++)
            {
                if(v[fila][columna]>my)
                {
                    my=v[fila][columna];
                    filamayor=fila;
                    colmayor=columna;
                }
            }
        }
        System.out.println("El mayor valor es "+my+" que se encuentra en la fila "+filamayor+" columna "+colmayor);
        
        //Apartado e *************************************************
        
        
        /*int w[]={12,34,56,45,67,89,23,45,67,89};
        System.out.println("Introduce un numero");
        Scanner tec=new Scanner(System.in);
        int x=tec.nextInt();
        for (int i=0;i<w.length;i++)
        {
            if(x==w[i])
            {
                System.out.println("Esta en la matriz");
                break;
            }
            else
            {
                System.out.println("No esta en la matriz");
                break;
            }
        }
        */
        System.out.println("Introduce un numero");
        int x=Leer.numEntero();
        boolean encontrado=false;
        for( int fila=0;fila<v.length;fila++)
        {
            for (int columna=0;columna<v[fila].length;columna++)
            {
                if(v[fila][columna]==x)
                {
                    encontrado=true;
                    break;
                }
            }
            if (encontrado)
                    {
                        break;
                    }
        }
        if (encontrado)
        {
            System.out.println(x+" esta en la matriz");
        }
        else
        {
            System.out.println(x+" no esta en la matriz");
        }
    }
}