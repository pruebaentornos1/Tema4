
package TEMA4;

public class PruebaFill {

    public static void main(String[] args) {
        int v[]=new int[10];
        Vectores.fill(v, 5);
        Vectores.mostrarVector(v);
        System.out.println(" ");
        Vectores.fill(v, 7, 8, -1);
        Vectores.mostrarVector(v);
    }
}
