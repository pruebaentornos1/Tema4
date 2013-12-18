package TEMA4;


import java.util.Scanner;

public class Ej5 {

        public static void main(String[] args) {
        
        Scanner tec=new Scanner(System.in);
        int d,m,a;
        
        System.out.println("Dime el dia");
        d=tec.nextInt();
        
        System.out.println("Dime el mes");
        m=tec.nextInt();
        
        System.out.println("Dime el año");
        a=tec.nextInt();
        
        int diasmeses[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        boolean bisiesto;
        bisiesto=Fecha.comprobarbisiesto(a);
        if (bisiesto) //(((a%4==0) && (a%100!=0)) || (a%400==0))
                {
                    diasmeses[2]=29;
                }
        
        int diastotales=0;
        
          for (int mes=1;mes<m;mes++)
          {
              diastotales+=diasmeses[mes];
          }
          diastotales+=d;
          
            System.out.println("Los dias que han transcurrido desde el 1 de Enero de 2013 hasta: el "+d+" del "+m+" son: "+diastotales);
    }
}
