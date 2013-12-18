package TEMA4;


public class Ej17 {

    public static void main(String[] args) {
        /*
         * Desplazar los elementos una posición a la derecha de tal forma que, 
         * el valor del primer elemento pase a la segunda posición, el segundo a la tercera posición, 
         * y así sucesivamente, ya el último pase a la primera posición.
         */
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
