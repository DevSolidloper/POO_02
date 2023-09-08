package poo02_ejercicio15;
import java.util.Scanner;

public class POO02_Ejercicio15 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("peso de la primera esfera: ");
        double esfera1 = entrada.nextDouble();
        System.out.println("peso de la segunda esfera: ");
        double esfera2 = entrada.nextDouble();
        System.out.println("peso de la tercera esfera: ");
        double esfera3 = entrada.nextDouble();
        System.out.println("peso de la cuarta esfera: ");
        double esfera4 = entrada.nextDouble();
        if(esfera1 == esfera2 && esfera1 == esfera3 ){
            /*La esfera 4 es la diferente*/
            if(esfera4 > esfera1){
                System.out.println("La esfera 4 es la diferente y es de mayor peso ");           
            }
            else{
                System.out.println("La esfera 4 es la diferente y es de menor peso");
            }
        }
        else if(esfera1 == esfera2 && esfera1 == esfera4){
            /*La esfera 3 es la diferente*/
            if(esfera3 > esfera1){
                System.out.println("La esfera 3 es la diferente y es de mayor peso");
            }
            else{
                System.out.println("La esfera 3 es la diferente y es de menor peso");
            }
        }
        else if(esfera1 == esfera3 && esfera1 == esfera4){
            /*La esfera 2 es la diferente*/
            if(esfera2 > esfera1){
                System.out.println("La esfera 2 es la diferente y es de mayor peso");
            }
            else{
                System.out.println("La esfera 2 es la diferente y es de menor peso");
            }
        }
        else if(esfera2==esfera3 && esfera2==esfera4){
            /*La esfera 1 es la diferente*/
            if(esfera1 > esfera2){
                System.out.println("La esfera 1 es la diferente y es de mayor peso");
            }
            else{
                System.out.println("La esfera 1 es la diferente y es de menor peso");
            }
        }
   
    }
    
}