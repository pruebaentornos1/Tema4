
package TEMA4;

public class PruebaEquals {

    public static void main(String[] args) {
        int v[]=new int [10];
        int w[]=new int [10];
        Vectores.fill(v, 20);
        Vectores.fill(w, 30);
        System.out.print(" Elementos de v: ");
        Vectores.mostrarVector(v);
        System.out.println(" ");
        System.out.print(" Elementos de w: ");
        Vectores.mostrarVector(w);
        System.out.println(" ");
        
        boolean igual=Vectores.equals(v, w);
        //  1 Forma
        if (igual)
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son distintos");
        }
        // 2 Forma
        if (Vectores.equals(v, w))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son distintos");
        }
        // 3 Forma
        boolean iguales=Vectores.equals(v, w);
        System.out.println((iguales)?"Son iguales":"Son distintos");
        // 4 Forma
        System.out.println(Vectores.equals(v, w)?"Son iguales":"Son distintos");
    }
}
