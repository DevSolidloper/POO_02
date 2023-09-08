package poo02_ejercicio22;
import java.util.Scanner;

public class POO02_Ejercicio22 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");        
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el salario básico por hora: ");
        double salario = entrada.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas al mes: ");
        int horas = entrada.nextInt();
        double salario_mensual = horas*salario;
        if(salario_mensual>450000){
            System.out.println("nombre : "+nombre+", salario: "+salario_mensual);
        }
        else{
            System.out.println(nombre);
        }
        
        
        
    }
    
}
