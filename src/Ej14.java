
import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
       Scanner tec=new Scanner(System.in);
        
        int v[]={12,4,5,78,45,67,45,66,77,44};
        System.out.println("Dime el numero que quieres buscar");
        int n=tec.nextInt();
        boolean encontrado=false;
        for (int i=0;i<v.length && encontrado==false;i++)
        {
            if (n==v[i])
            {
            encontrado=true;
                            //break;
            }
        }
        if (encontrado==true)
        {
            System.out.println(n+" está en el vector");
        }
        else
        {
            System.out.println(n+" no está en el vector");
        }
    }
}
