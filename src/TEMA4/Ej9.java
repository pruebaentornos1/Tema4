package TEMA4;


import java.util.Scanner;

public class Ej9 {

     public static void main(String[] args) {
       Scanner tec=new Scanner(System.in);
       int v[]=new int[10];
       
         //System.out.println("Dime los elementos");
         for (int i=0;i<v.length;i++)
         {
             System.out.println("Dime el elemeto "+i+" del vector");
             v[i]=tec.nextInt();
         }
         
         /*
          * APartado a)
          */
         
         /* 1ª FORMA
          * 
          * int mayor=Integer.MIN_VALUE;
         
         for (int i=0;i<v.length;i++)
         {
             if (mayor<v[i])
             {
                 mayor=v[i];
             }
         }
          2ª FORMA 
         
         /* int mayor=v[0];
          * for (int i=1;i<v.length;i++)
          * {
          * if (mayor<v[i])
          *     {
          *     mayor=v[i];
          *     }
          * }
          */
         
         
         /*
                    
         int repitemayor=0;
         for (int i=0;i<v.length;i++)
         {
             if (v[i]==mayor)
             {
                 repitemayor++;
             }
         }
         System.out.println("El mayor es "+mayor+" y se repite "+repitemayor+" veces");
         
         */
         
           //TODO EN UN SOLO PASO
           
            int mayor=v[0];
           int repitemayor=1;
           
           for (int i=1;i<v.length;i++)
           {
           if (v[i]==mayor)
               {
           repitemayor++;
               }
           else if (v[i]>mayor)
               {
           mayor=v[i];
           repitemayor=1;
               }
           }
           System.out.println("El mayor es "+mayor+" y se repite "+repitemayor+" veces");
          
         
         /*
          * Apartado b)
          */
         
           int menor=v[0];
           int indice=0;
           
           for (int i=1;i<v.length;i++)
           {
               if (menor>v[i])
               {
                   menor=v[i];
                   indice=i;
               }
           }
           System.out.println("El menor es "+menor+" y su posicion es "+(indice+1));
    }
}
