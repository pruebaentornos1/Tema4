/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TEMA4;

/**
 *
 * @author Alumno_2
 */
public class EjemplosChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array de char
        char nombre[]={'V','i','c','t','o','r'};
	for (int letra=0; letra<nombre.length;letra++)
		{
		    System.out.print(nombre[letra]);
		}
       
        //Array de 2 dimensiones de char
	char alumnos[][]= {
            {'D','a','n','i'},
            {'J','o','s','e'},
            {'A','n','t','o','n','i','o'}
                          };
        System.out.println("Listado de alumnos");
	for( int numAlumno=0;numAlumno<alumnos.length;numAlumno++)
	{
            System.out.println("\n Alumno nº "+numAlumno);
                for (int letra=0; letra < alumnos[numAlumno].length; letra++)
                {
                    System.out.print(alumnos[numAlumno][letra]);
                }
	}
        
        //Mostrar los nombres de las clases por planta del Jose Planes
        
        String Pabellon[][]={
            {"Taller","DAW","SMR","PCPI"},
            {"Idiomas","Tecnologia","Salon"},
            {"1 ESO","2 ESO","3 ESO","4 ESO","Bach"}
                            };
        System.out.println("Listado de las clases por planta del pabellon B del IES");
        for (int planta=0;planta<Pabellon.length;planta++)
        {
            System.out.println("Clases de la planta nº "+planta);
            for (int clase=0; clase<Pabellon[planta].length;clase++)
            {
                System.out.println(Pabellon[planta][clase]);
            }
        }
        
        char Pabellon2[][][]={
            {
            {'T','a','l','l','e','r'},
            {'D','A','W'},
            {'S','M','R'}
            },
                {
                    {'I','d','i','o'}
                },
                {
                    {'1','E','S','O'},
                    {'2','E','S','O'},
                    {'3','E','S','O'},
                    {'4','E','S','O'}
                }
                              };
                System.out.println("Listado de las clases por planta del pabellon B");
                for (int planta=0;planta<Pabellon2[planta].length;planta++)
                {
                    System.out.println("Clases de la planta nº "+planta);
                    for (int clase=0;clase<Pabellon2[planta].length;clase++)
                    {
                        System.out.println("Aula nº "+clase);
                        for (int letra=0;letra<Pabellon2[planta][clase].length;letra++)
                        {
                            System.out.println(Pabellon2[planta][clase][letra]);
                        }
                    }
                }
    }
}
