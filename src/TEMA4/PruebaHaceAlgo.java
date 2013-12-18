package TEMA4;


import java.util.Scanner;

public class PruebaHaceAlgo {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int num1,num2;
        
        System.out.println("Dime el primer numero ");
        num1=tec.nextInt();
        
        System.out.println("Dime el segundo numero ");
        num2=tec.nextInt();
                      
        for (int i=1;i<=15;i++)
        {
            if (num1%2==0)
            {
                System.out.println("Vale, maquina");break;
            }
            else if (num2%i==0)
            {
                System.out.println("Algo bueno");break;
            }
            else 
            {
                System.out.println("Se acabo");break;
            }
        }
        int d,m,a;
        
        System.out.println("Dime el dia");
        d=tec.nextInt();
        
        System.out.println("Dime el mes");
        m=tec.nextInt();
        
        System.out.println("Dime el año");
        a=tec.nextInt();
        
        int diasmeses[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        boolean fecha=true;
        
        if ((m<1 | m>12) || (a<1 || a>3000))
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
        int []tabla5 = new int[10];
        
        /*tabla5[0]=5*1;
         * tabla5[1]=5*2
         * tabla5[2]=5*3
         * .......
         */
        
        
        for (int i=0;i<10;i++)
        {
            tabla5[i]=5*(i+1);
        }
        System.out.println("Tabla de multiplicar del 5");
        
        for (int i=0;i<tabla5.length;i++)
        {
            System.out.println(tabla5[i]);
        }
        
        System.out.println("Dime cuantos hermanos tienes");
        int her=0;
        
        her=tec.nextInt();
        if (her<=5)
        {
            System.out.println("Todo bien");
        }
        else
        {
            System.out.println("Algo pasa");
        }
        
    }
}
