package TEMA4;


public class Ej18 {

    public static void main(String[] args) {
        /*
         * a) El primero se genera sumando 15 a los elementos que ocupan las posiciones impares del 
         * vector original, dejando igual el resto de los elementos (índices desde el 0 hasta el 8).
         * b) El segundo, se crea calculando el resto de dividir cada elemento del vector original entre 3.
         */
        int v[]={7,56,89,23,58,9,99,23,44,22};
        
        /*int a[]=new int[v.length];
        
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
            System.out.print(a[i]+" ");
        }
        System.out.println("Elementos del 2 vector");
        for (int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        */
        
        // Metodo
        int z[]=new int[v.length];
        
        z=Vectores.generarVector18(v);
        
        for (int i=0;i<z.length;i++)
        {
            System.out.print(z[i]+" ");
        }
    }
}
