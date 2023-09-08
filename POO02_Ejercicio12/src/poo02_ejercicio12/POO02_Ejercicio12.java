package poo02_ejercicio12;
import java.util.Scanner;

public class POO02_Ejercicio12 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("nombre");
        String nombre = entrada.nextLine();
        System.out.println("valor hora");
        double v_h = entrada.nextDouble();
        double salario;
        System.out.println("cant horas");
        int h = entrada.nextInt(),h_e2,h_e3;
        if(h > 40){
            h_e2 = h-40;
            if(h_e2>8){
                h_e3 = h_e2 - 8;
                salario = 40*v_h+16*v_h+h_e3*v_h*3;
            }
            else{
                salario=40*v_h+2*h_e2*v_h;
            }
        }
        else{
            salario = h*v_h;
        }
        System.out.println("el trabajador "+nombre+" devengó: $"+salario);
                
    }
    
}
