
package TEMA4;

public class Ej25 {

    public static void main(String[] args) {
        int m[][]={{7,14,24},{13,9,19},{32,22,25}};
        System.out.println("Elementos de la diagonal principal");
        for(int i=0;i<m.length;i++)
        {
            System.out.print(m[i][i]+" ");
        }
        System.out.println(" ");
        System.out.println("Elementos de la diagonal inversa");
        for(int i=0 , j=m.length-1 ; i<m.length && j>=0 ; i++,j--)
        {
            System.out.print(m[i][j]+" ");
        }
        System.out.println(" ");
        System.out.println("Elementos de la diagonal inversa");
        for(int i=0 ; i<m.length ; i++)
        {
            System.out.print(m[i][(m.length-1)-i]+" ");
        }
    }
}
