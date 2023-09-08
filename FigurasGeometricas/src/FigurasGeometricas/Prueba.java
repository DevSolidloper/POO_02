package FigurasGeometricas;

public class Prueba {
	public static void main(String args[]) {
		Circulo f1=new Circulo(2);
		Rectangulo f2= new Rectangulo(1,2);
		Cuadrado f3= new Cuadrado(3);
		TrianguloRectangulo f4=new TrianguloRectangulo(3,5);
		Rombo f5=new Rombo(30,16,17);
		Trapecio f6= new Trapecio(10,4,4,5,5);
		
		System.out.println("El area del circulo es= "+ f1.
				calArea());
		System.out.println("El perimetro del circulo es= "+ f1.
				perimetro());
		System.out.println();
		System.out.println("El area del Rectangulo es= "+ f2.
				area());
		System.out.println("El perimetro del Rectangulo es= "+ f2.
				perimetro());
		System.out.println();
		System.out.println("El area del cuadrado es= "+ f3.
				area());
		System.out.println("El perimetro del cuadrado es= "+ f3.
				perimetro());	
		System.out.println();
		System.out.println("El area del triangulo es= "+ f4.
				area());
		System.out.println("El perimetro del triangulo es= "+ f4.
				perimetro());	
		f4.tipotriangulo();
		System.out.println();
		System.out.println("El area del Rombo es= "+ f5.
				area());
		System.out.println("El perimetro del circulo es= "+ f5.
				perimetro());
		System.out.println();
		System.out.println("El area del Trapecio es= "+ f6.
				area());
		System.out.println("El perimetro del trapecio es= "+ f6.
				perimetro());
		System.out.println();
	}
	

}
