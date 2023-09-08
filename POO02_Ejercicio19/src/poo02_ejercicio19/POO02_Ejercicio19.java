package poo02_ejercicio19;
import java.util.Scanner;

public class POO02_Ejercicio19 {

        
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese el lado del triángulo equilatero: ");
       double lado = entrada.nextDouble();
       double perimetro, area, altura;
       area = Math.pow(lado,2)*Math.sqrt(3)/4;
       perimetro = 3*lado;
       altura = Math.sqrt(3)*lado/2;
       System.out.println("El area del triangulo es: "+area);
       System.out.println("La altura del triangulo es: "+altura);
       System.out.println("El perimetro del triangulo es: "+perimetro);
       
    }
    
}
