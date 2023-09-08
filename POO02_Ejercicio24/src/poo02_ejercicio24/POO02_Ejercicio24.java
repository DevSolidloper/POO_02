package poo02_ejercicio24;
import java.util.Scanner;

public class POO02_Ejercicio24 {


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de esfera A: ");
        double esferaA = scanner.nextDouble();
        System.out.print("Ingresa el valor de esfera B: ");
        double esferaB = scanner.nextDouble();
        System.out.print("Ingresa el valor de esfera C: ");
        double esferaC = scanner.nextDouble();
        
        if(esferaA > esferaB && esferaA > esferaC){
            System.out.println("La esfera A es la mayor");
        }else if(esferaB > esferaA && esferaB > esferaC){
            System.out.println("La esfera B es la mayor");
        }else{
            System.out.println("La esfera c es la mayor");

        }
    }
    
}
