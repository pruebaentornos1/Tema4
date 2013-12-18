package TEMA4;


import java.util.Scanner;

public class Ej6_Fecha {

   public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int dia, mes, anyo;
        boolean fechacorrecta;
        
        System.out.println("Dime el dia");
        dia=tec.nextInt();
        
        System.out.println("Dime el mes");
        mes=tec.nextInt();
        
        System.out.println("Dime el año");
        anyo=tec.nextInt();
        
        fechacorrecta=Fecha.comprobarFecha( dia, mes, anyo);
        
        if (fechacorrecta)
        {
            System.out.println("La fecha introducida es correcta");
        }
        else 
        {
            System.out.println("La fecha introducida es incorrecta");
        }
    }
}
