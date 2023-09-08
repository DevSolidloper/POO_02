package poo02_ejercicio13;
import java.util.Scanner;

public class POO02_Ejercicio13 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el color de la bola (Blanca, Verde, Amarilla, Azul): ");
        String color = entrada.nextLine().toLowerCase();
        System.out.println("Ingrese el valor de la compra:");
        double compra = entrada.nextDouble();
        double descuento = 0.0;

        if (color.equals("blanca")) {
            descuento = 0.0;
        } else if (color.equals("verde")) {
            descuento = 0.10;
        } else if (color.equals("amarilla")) {
            descuento = 0.25;
        } else if (color.equals("azul")) {
            descuento = 0.50;
        } else {
            System.out.println("Color desconocido. Se asume que es roja.");
            descuento = 1.0; 
        }

        System.out.println("El cliente debe de pagar " + (descuento * compra)+"$");
        
    }
    
}
