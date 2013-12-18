
package TEMA4;

public class Ej_MetDespDrchaValor {

    public static void main(String[] args) {
        int p[];
        int x=0, indice=0;
        p=Vectores.insertarleerVector(5);
        //x=Leer.numEntero();
        Vectores.mostrarVector(p);
        //indice=Leer.numEntero();
        Vectores.despPosiDrchValor(p, x, indice);
    }
}
