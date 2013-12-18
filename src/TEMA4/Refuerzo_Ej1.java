package TEMA4;


import java.util.Scanner;

public class Refuerzo_Ej1 {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        double desviacion;
        double media=0;
        
        int numeros[] = new int [6];
        
        for (int i=0;i<numeros.length;i++)
        {            
            System.out.println("Dime un numero");
            numeros[i]=tec.nextInt();
            media=numeros[i]+media;
        }
        media=media/6;
        double sumatorio=0;
        
        for(int i=0;i<numeros.length;i++)
        {
            sumatorio=sumatorio+Math.pow(numeros[i]-media,2);
        }
        
        System.out.println(media+" media");
        System.out.println(sumatorio+" sumatorio");
        
        desviacion=Math.sqrt(sumatorio*(1.0/(6-1)));
        System.out.println(desviacion+" desviacion");
    }
}
