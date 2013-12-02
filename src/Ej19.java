
import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Dime la longitud del vector");
        int num=tec.nextInt();
        int media=0, suma=0;
        
        int x[]=new int[num];
        for(int i=0;i<x.length;i++)
            {
                System.out.println("Dime el elemento "+i+" del vector: ");
                x[i]=tec.nextInt();
            }
        System.out.println("El vector es: ");
        for (int i=0;i<x.length;i++)
        {
        System.out.print(x[i]+" ");
        }
        
        System.out.println(""); // Meter un espacio
        
        for (int i=0;i<x.length;i++)
        {
            suma+=x[i];
        }
        System.out.println("La media es "+suma/x.length);
    }
}
