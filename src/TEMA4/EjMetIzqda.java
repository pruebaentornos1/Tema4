
package TEMA4;

public class EjMetIzqda {

    /**
     * Introducir un vector y lo ordena de hacia la izquierda
     */
    public static void main(String[] args) {
        int p[];
        p=Vectores.insertarleerVector(10);
        Vectores.mostrarVector(p);
        System.out.println(" ");
        Vectores.posicionizquierda(p);
        Vectores.mostrarVector(p);
    }
}
