package TEMA4;


public class Ej2 {

    public static void main(String[] args) {
        int []tabla5 = new int[10];
        
        /*tabla5[0]=5*1;
         * tabla5[1]=5*2
         * tabla5[2]=5*3
         * .......
         */
        
        
        for (int i=0;i<10;i++)
        {
            tabla5[i]=5*(i+1);
        }
        System.out.println("Tabla de multiplicar del 5");
        
        for (int i=0;i<tabla5.length;i++)
        {
            System.out.println(tabla5[i]);
        }
    }
}
