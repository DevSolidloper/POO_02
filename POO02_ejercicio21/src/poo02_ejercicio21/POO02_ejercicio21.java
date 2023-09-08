package poo02_ejercicio21;
import java.util.Scanner;

public class POO02_ejercicio21 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el valor del lado 1");
        double lado1 = entrada.nextDouble();  
        System.out.println("ingrese el valor del lado 2");
        double lado2 = entrada.nextDouble();
        System.out.println("ingrese el valor del lado 3");
        double lado3 = entrada.nextDouble();  
        double perimetro = lado1+lado2+lado3;
        double semiperimetro = perimetro/2;
        double area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        System.out.println("el valor del perimetro es: "+perimetro);
        System.out.println("el valor del semiperimetro es: "+semiperimetro);
        System.out.println("el valor del area es: "+area);        
    }
    
}
