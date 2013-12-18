package TEMA4;


import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {
       Scanner tec=new Scanner(System.in);
       int v[]={4,5,12,44,45,46,66,67,77,78};
       
       System.out.println("Introduce un numero y te dire si se encuentra en el vector ordenado ascendentemente");
       int n=tec.nextInt();
       int izq=0, drcha=v.length-1;
       boolean encontrado=false;
       while (izq<=drcha)
       {
           int centro=(izq+drcha)/2;
           if (n==v[centro])
           {
               encontrado=true;
               break;
           }
           else if (n>v[centro])            //si el vector estuviera ordenado en orden descendente
           {
               izq=centro+1;
           }
       }
       if (encontrado)
       {
           System.out.println("El numero "+n+" se encuentra en el vector");
       }
       else
       {
           System.out.println("El numero "+n+" no se encuentra en el vector");
       }
    }
}
