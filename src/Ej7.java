
public class Ej7 {

       public static void main(String[] args) {
        int v[]=new int[20];
        for (int i=0;i<v.length;i++)
        {
            v [i]=i;
        }
        System.out.println("Vector generado");
        
        for (int i=0;i<v.length;i++)
        {  
        System.out.println("v["+i+"]="+v[i]);
        }
        /*
            * sout("vector generado")
            * for (int i=0;i<v.length;i++)
            * {
            * v[i]=i;
            * sout(v[i])
            * }
         */
    }
}
