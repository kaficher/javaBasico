
import java.util.Scanner;

public class Exerciciodistancia {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int tempo;
		double velocidade, distancia, kmlitro;
		  
		System.out.println("Informe quanto tempo demorou sua viagem " );	
		tempo = teclado.nextInt();
		System.out.println("Informe a velocidade média da viagem " );
		velocidade = teclado.nextDouble();
		distancia = velocidade * tempo;
		System.out.println("A distância percorrida foi de " +distancia+ "km");
		kmlitro = distancia / 12;
		System.out.println("O gasto por lítro na viagem foi de " +kmlitro+ "litro");
	
		}
}
