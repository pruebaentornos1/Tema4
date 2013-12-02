
public class Ej13 {

    public static void main(String[] args) {
        int v[]={12,4,5,78,45,67,45,66,77,44};
        for (int pasada=1;pasada<=v.length;pasada++)
        {
        for (int i=0;i<(v.length-pasada);i++)
        {
            if (v[i] > v[i+1])    // Para poner de mayor a menor cambiar el signo > por <
            {
                int aux=v[i];
                v[i]=v[i+1];
                v[i+1]=aux;
            }
        }
      }
        System.out.println("El vector ordenado es ");
        for (int i=0;i<v.length;i++)
        {
            System.out.print(v[i]+" ");
        }
    }
}
