package poo02_ejercicio14;
import java.util.Scanner;

public class POO02_Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vtotal, salario1, salario2, salario3, por_venta;
        System.out.println("ingrese las ventas del departamento 1:");
        double vd1 = entrada.nextDouble();
        System.out.println("ingrese las ventas del departamento 2:");
        double vd2 = entrada.nextDouble();
        System.out.println("ingrese las ventas del departamento 3:");
        double vd3 = entrada.nextDouble();
        System.out.println("ingrese el salario de los empeados: ");
        double salario = entrada.nextDouble();
        
        vtotal = vd1+vd2+vd3;
        por_venta = 0.33*vtotal;
        if(vd1 > por_venta){
            salario1 = salario*1.2;
        } 
        else{
            salario1 = salario;
        }
        if(vd2 > por_venta){
            salario2 = salario*1.2;
        } 
        else{
            salario2 = salario;
        }
        if(vd3 > por_venta){
            salario3 = salario*1.2;
        } 
        else{
            salario3 = salario;
        }
        
        System.out.println("El salario del departamento 1: "+salario1+" el salario del departamento 2: "+salario2+" el salario del departamento 3: "+salario3);
    }
    
}
