package TEMA4;


public class Ej11 {

    public static void main(String[] args) {
        int v[]={12,4,5,78,45,67,45,66,77,44};
        int mayor=Integer.MIN_VALUE, posicionmayor=0, auxiliar;
        for (int i=0;i<v.length;i++)
        {
            if (v[i]>mayor)
            {
            mayor=v[i];
            posicionmayor=i;
            }
        }
        auxiliar=v[v.length-1];
        v[v.length-1]=mayor;
        v[posicionmayor]=auxiliar;
    
        for (int i=0;i<v.length;i++)
        {
            System.out.println(v[i]);
        }
    }
}
