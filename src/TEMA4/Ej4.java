package TEMA4;


import java.util.Scanner;

public class Ej4 {

        public static void main(String[] args) {
            Scanner tec=new Scanner(System.in);
            String cad;
            float notas[] = new float [10];//length=10
            
            for(int i=0;i<notas.length;i++)
            {
                System.out.println("Dime el elemento "+i+" del vector: ");
                notas[i]=tec.nextFloat();
            }
            
            //2.Calcular la media
            float media;
            float suma=0.0f;
            for(int i=0;i<notas.length;i++)
            {
                suma+=notas[i];
            }
            media=suma/notas.length;
            
            //3.Notas superiores, inferiores o iguales a la media.
            int contsup,continf,contigual;
            contsup=continf=contigual=0;
            
            for (int i=0;i<notas.length;i++)
            {
                if (notas[i]==media)
                {
                    contigual++;
                }
                else
                {
                    if (notas[i]>media)
                    {
                        contsup++;
                    }
                    else
                    {
                        continf++;
                    }
                }
            }
            System.out.println("Hay "+contigual+" notas iguales a la media "+media+" hay "+continf+" notas inferiores y "+contsup+" notas superiores.");
    }
}
