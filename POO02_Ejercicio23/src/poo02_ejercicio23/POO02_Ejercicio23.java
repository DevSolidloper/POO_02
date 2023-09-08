package poo02_ejercicio23;
import java.util.Scanner;

public class POO02_Ejercicio23 {

    
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el valor de C: ");
        double c = scanner.nextDouble();

     
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println(String.format("Las soluciones son x1 = %.2f y x2 = %.2f ", x1 , x2));
        } else if (discriminante == 0) {

            double x = -b / (2 * a);
            System.out.println(String.format("La solucion de x1 es: %.2f", x));
        } else {

            System.out.println("La ecuación no tiene soluciones reales.");
        }

        scanner.close();
    }
    
}
