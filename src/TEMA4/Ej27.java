
package TEMA4;

/**
 *  a. Mostrar por pantalla la temperatura media de cada mes.
    b. Indicar cuál es el día más frío y más cálido de cada mes, para ello, utilizad dos vectores, 
       uno de ellos se utilizará para los días más fríos de cada mes y otro para los más calurosos.
    c. Calcular el día más caluroso del año, indicando el mes y el día.
    d. Mostrad por pantalla las temperaturas de todos los días de un mes determinado (introducir el número), 
       controlad que ese número esté dentro de un rango de mes.
 */
public class Ej27 {

    public static void main(String[] args) {
        int m[][] = {{1, 12, 6, 5, 8, 7, 9, 4, 5, 3, 6, 12, 5, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {1, 12, 6, 5, 8, 7, 9, 4, 5, 3, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {11, 12, 6, 5, 18, 17, 9, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {11, 12, 6, 5, 18, 17, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {11, 12, 6, 5, 18, 17, 9, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 21, 22, 23, 24, 25, 26, 26, 28, 29, 30},
            {25, 26, 26, 24, 25, 26, 24, 25, 27, 28, 29, 30, 31, 32, 30, 31, 32, 31, 32, 31, 32, 31, 32, 32, 32, 32, 32, 32, 32, 32, 32},
            {25, 26, 26, 24, 25, 26, 24, 25, 27, 28, 29, 30, 31, 32, 30, 31, 32, 31, 32, 31, 32, 31, 32, 32, 32, 32, 32, 32, 32, 32, 32},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {11, 12, 6, 5, 18, 17, 9, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {11, 12, 6, 5, 18, 17, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {1, 12, 6, 5, 8, 7, 9, 4, 5, 3, 6, 12, 5, 4, 9, 1, 1, 1, 2, 6, 8, 1, 1, 1, 2, 4, 10, 1, 1, 1, 1}};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        //Apartado A *************************************************
        
        for (int fila=0;fila<m.length;fila++)
        {
            int suma=0;
            
            for(int columna=0;columna<m[fila].length;columna++)
            {
            suma=suma+m[fila][columna];
            
            }System.out.println("Temperatura media de cada mes "+(suma/2)); // MAL
        }
        
        //Apartado B *************************************************
        
        int calor[]=new int[m.length]; //int[12]
        int frio[]=new int [m.length];
        
        for(int mes=0;mes<m.length;mes++)
        {
            int mayor=m[mes][0], indiceMyr=0; //Primer dia de cada mes
            
            for(int dia=0;dia<m[mes].length;dia++)
            {
                if (m[mes][dia]>mayor)
                {
                    mayor=m[mes][dia];
                    indiceMyr=dia;
                }
            }
            calor[mes]=indiceMyr+1;
            
            int menor=m[mes][0], indiceMnr=0;
            
            for(int dia=0;dia<m[mes].length;dia++)
            {
                if (m[mes][dia]<mayor)
                {
                    menor=m[mes][dia];
                    indiceMnr=dia;
                }
            }
            frio[mes]=indiceMnr+1;
        }
        
         System.out.println(" ");
        
         System.out.println("Dia mas caluroso ");
         Vectores.mostrarVector(calor);
         
         System.out.println(" ");
         
         System.out.println("Dia mas frio ");
         Vectores.mostrarVector(frio);
         
         //Apartado C *************************************************
         
         int mt=m[0][0], indMes=0, indDia=0;
         for(int mes=0;mes<m.length;mes++)
         { 
            for(int dia=0;dia<m[mes].length;dia++)
            {
                if (m[mes][dia]>mt)
                {
                    mt=m[mes][dia];
                    indDia=dia;
                    indMes=mes;
                }
            }
         }
         System.out.println(" ");
         System.out.println(" ");
         System.out.println("El dia ms caluroso del año es en el mes "+meses[indMes]+" el dia "+(indDia+1)+" con "+mt+" grados");
         
         //Apartado C *************************************************
         
         
    }
}
