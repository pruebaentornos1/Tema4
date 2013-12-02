
public class Ej12 {

    public static void main(String[] args) {
        
        int v[]={12,4,5,78,45,67,45,66,77,44};
        for (int i=0;i<(v.length-1);i++)
        {
            if (v[i] > v[i+1]) //compara los elementos del vector
             {
            int aux=v[i];
            v[i]=v[i+1];
            v[i+1]=aux;
             }
        }
        for (int i=0;i<v.length;i++)
        {
            System.out.println(v[i]);
        }
    }
}
