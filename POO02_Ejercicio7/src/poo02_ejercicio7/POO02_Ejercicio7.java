
package poo02_ejercicio7;
import java.util.Scanner;

public class POO02_Ejercicio7 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer número: ");
        double a = entrada.nextDouble();
        System.out.println("Ingrese el valor del segundo número: ");
        double b = entrada.nextDouble();
        if (a < b){
            System.out.println(a+" es menor que "+b);   
        }
        else if(b == a){
            System.out.println(a+" es igual a "+b);     
        }
        else if(a > b){
            System.out.println(a+" es mayor que "+b);
        }
    }
    
}
