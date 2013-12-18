package TEMA4;


import java.util.Scanner;

public class Ej10 {
   
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int x;
        int mayores=0,igual=0,menor=0;
        
        int num[]={12,4,5,78,45,67,45,66,77,44};
        
        System.out.println("Introduce un numero");
        x=tec.nextInt();
        
        for (int cont=0;cont<num.length;cont++)
        {
        if (x==num[cont])
            {
            igual++;
            System.out.println("El numero introducido es igual a "+num[cont]); 
            }
        else if (x<num[cont])
            {
            menor++;
            System.out.println("El numero introducido es menor a "+num[cont]);
            }
        else 
            {
            mayores++;
            System.out.println("El numero introducido es mayor a "+num[cont]);
            }
        }
        System.out.println(x+" tiene: "+igual+" numeros iguales, es mayor a "+mayores+" numeros y es menor a "+menor+" numeros");
    }
}
