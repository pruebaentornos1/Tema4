
public class Ej1 {

      public static void main(String[] args) {
        
         int diadelmes[];//Declara array de tipo entero
         diadelmes = new int[12];
         diadelmes[0]=31;
         diadelmes[1]=28;
         diadelmes[2]=31;
         diadelmes[3]=30;
         diadelmes[4]=31;
         diadelmes[5]=30;
         diadelmes[6]=31;
         diadelmes[7]=31;
         diadelmes[8]=30;
         diadelmes[9]=31;
         diadelmes[10]=30;
         diadelmes[11]=31;
         
         /*
          * int diadelmes[]={31,28,31,30,31,30,31,31,30,31,30,31};
          */
         
         String nombremeses[];
         nombremeses = new String[12];
         nombremeses[0]="Enero";
         nombremeses[1]="Febrero";
         nombremeses[2]="Marzo";
         nombremeses[3]="Abril";
         nombremeses[4]="Mayo";
         nombremeses[5]="Junio";
         nombremeses[6]="Julio";
         nombremeses[7]="Agosto";
         nombremeses[8]="Septiembre";
         nombremeses[9]="Octubre";
         nombremeses[10]="Noviembre";
         nombremeses[11]="Diciembre";
         
         /*
          * String nombremese[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
          */
         
          System.out.println(nombremeses[0]+" tiene "+diadelmes[0]+" dias");
          System.out.println(nombremeses[1]+" tiene "+diadelmes[1]+" dias");
          System.out.println(nombremeses[2]+" tiene "+diadelmes[2]+" dias");
          System.out.println(nombremeses[3]+" tiene "+diadelmes[3]+" dias");
          System.out.println(nombremeses[4]+" tiene "+diadelmes[4]+" dias");
          System.out.println(nombremeses[5]+" tiene "+diadelmes[5]+" dias");
          System.out.println(nombremeses[6]+" tiene "+diadelmes[6]+" dias");
          System.out.println(nombremeses[7]+" tiene "+diadelmes[7]+" dias");
          System.out.println(nombremeses[8]+" tiene "+diadelmes[8]+" dias");
          System.out.println(nombremeses[9]+" tiene "+diadelmes[9]+" dias");
          System.out.println(nombremeses[10]+" tiene "+diadelmes[10]+" dias");
          System.out.println(nombremeses[11]+" tiene "+diadelmes[11]+" dias");
          
          int sumadias=0;
          for (int i=0;i<=11;i++)
          {
              System.out.println(nombremeses[i]+" tiene "+diadelmes[i]+" dias");
              sumadias+=diadelmes[i];
          }
          System.out.println("La suma de todos los dias es "+sumadias);
    }
}
