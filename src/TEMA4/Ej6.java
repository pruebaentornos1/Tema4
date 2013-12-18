package TEMA4;


import java.util.Scanner;

public class Ej6 {

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
        boolean fecha=true;
        
        if ((m<1 || m>12) || (a<1 || a>3000))
        {
            fecha=false;
        }
        else
        {
            boolean bisiesto;
            bisiesto=Fecha.comprobarbisiesto(a);
           if(bisiesto)
           {
               diasmeses[2]=29;
           }
        
        if (d>=1 && d<=diasmeses[m])
        {
            fecha=true;
        }
        else
        {
            fecha=false;
        }
        }
        if (fecha)
        {
            System.out.println("La fecha es correcta");
        }
        else
        {
            System.out.println("La fecha es incorrecta");
        }
    }
}
