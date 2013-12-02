
import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int a[]=new int[8];
        System.out.println("Introduce un numero entero");
        int num=tec.nextInt();
        
        for (int i=a.length-1;i>=0 && num>0;i--)
        {
            a[i]=num%2;
            num/=2;
        }
        if (num>=1)
        {
            System.out.println("El numero introducido no cabe en 8 bits");
        }
        else
        {
            System.out.println("Binaria");
            for (int i=0;i<a.length;i++)
            {
            System.out.print(a[i]+"|");
            }
        }
    }
}
