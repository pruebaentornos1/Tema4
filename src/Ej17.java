
public class Ej17 {

    public static void main(String[] args) {
        int v[]={7,56,89,23,58,9,99,23,44,22};
        int aux=v[v.length-1];
        
        for (int i=9;i<=1;i--)
        {
            v[i]=v[i-1];
        }
        v[0]=aux;
        System.out.println("Los elementos del vector son: ");
        for (int i=0;i<=v.length-1;i++)
        {
            System.out.println(v[i]+" ");
        }
    }
}
