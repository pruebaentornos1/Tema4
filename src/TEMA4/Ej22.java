package TEMA4;


public class Ej22 {

    public static void main(String[] args) {
        int v[]={7,56,89,23,58,9,99,23,0,22};
        int nocero=0;
        for (int i=0;i<v.length;i++)
        {
            if (v[i]!=0)
            {
                nocero++;
            }
            else
            {
                break;
            }
        }
        System.out.println("En el vector hay: "+nocero+" elementos distintos de 0 a partir del elemento que ocupa la primera posicion");
        
        /*
         * WHILE
         * int v[]={7,56,89,23,58,9,99,23,0,22};
         * int nocero=0;
         * int i=0;
         * while(i<v.length)
         * {
         * if (v[i]!=0)
         *  {
         * nocero++;
         *  }
         * else
         *  {
         * break;
         *  }
         * i++;
         * }
         * System.out.println("En el vector hay: "+nocero+" elementos distintos de 0 a partir del elemento que ocupa la primera posicion");
         * 
         */
    }
}
