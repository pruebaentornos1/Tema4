
public class Ej3 {

        public static void main(String[] args) {
        int v[]={7,56,10,-23,0,9,-99,23,10,12,56,0,88,90,33,-2,28}; //length = 17
        
        /*
         * Apartado a)
         */
        int veces10=0;
        
        for (int i=0;i<v.length;i++) //;i<17;
        {
            if (v[i]==10)
            {
                veces10++;
            }
        }
            System.out.println("En el vector hay "+veces10+" dieces");
            
            /*
             *Apartado b) 
             */
            int contnulos,contposi,contnega;
            contnulos=contposi=contnega=0;
            
            for (int i=0;i<v.length;i++)
            {
                if(v[i]==0)
                {
                    contnulos++;
                }
                else
                {
                    if (v[i]>0)
                    {
                        contposi++;
                    }
                    else
                    {
                        contnega++; 
                    }
                }
            }
            System.out.println("Hay "+contnulos+" numeros nulos, "+contposi+" numeros positivos y "+contnega+" numeros negativos");
    }
}
