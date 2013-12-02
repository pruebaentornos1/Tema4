
public class Ej18 {

    public static void main(String[] args) {
        int v[]={7,56,89,23,58,9,99,23,44,22};
        
        int a[]=new int[v.length];
        
        int b[]=new int[v.length];
        
        for (int i=0;i<v.length;i++)
        {
            if(i%2==0)
            {
                a[i]=v[i]+15;
            }
            else
            {
                a[i]=v[i];
            }
            b[i]=v[i]%3;
        }
        System.out.println("Elementos del vector generado: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("Elementos del 2 vector");
        for (int i=0;i<b.length;i++)
        {
            System.out.println(b[i]+" ");
        }
    }
}
