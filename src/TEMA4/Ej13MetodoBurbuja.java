package TEMA4;


public class Ej13MetodoBurbuja {

    public static void main(String[] args) {
        
     int p[]=new int[10];
     p=Vectores.insertarleerVector(10);
     int x[];
     x=Vectores.ordenarVector(p);
     System.out.println("Mostrar el vector x ");
     Vectores.mostrarVector(x);
     System.out.println(" ");
     System.out.println("Mostrar el vector p ");
     Vectores.mostrarVector(p);
     
    }
}
