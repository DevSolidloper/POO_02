package poo02_ejercicio11;
import java.util.Scanner;

public class POO02_Ejercicio11 {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un primer numero: ");
        double a = entrada.nextDouble();
        System.out.println("ingrese un segundo numero: ");
        double b = entrada.nextDouble();
        System.out.println("ingrese un tercer numero: ");
        double c = entrada.nextDouble();
        if(a > b && a > c){
            System.out.println("el valor mayor entre "+a+", "+b+", "+c+", es "+a);
        }
        else if(b > a && b > c){
            System.out.println("el valor mayor entre "+a+", "+b+", "+c+", es "+b);
        }
        else if(c > a && c > b){
            System.out.println("el valor mayor entre "+a+", "+b+", "+c+", es "+c);
        }
    }
    
}
