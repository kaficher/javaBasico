
import java.util.Scanner;

public class Exerciciokw {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double kw, valorkw, salario, kwtotal, kwdesconto,desconto;
		  
		System.out.println("Informe a quantidade de kw gasto no mês na residência " );	
		kw = teclado.nextInt();
		System.out.println("Informe o valor do salário mínimo " );
		salario = teclado.nextInt();
		valorkw = (salario / 7) / 100;
		System.out.println("O valor de cada kw é " +valorkw);
		kwtotal = kw * 60;
		System.out.println("O valor total a pagar é de " +kwtotal);
		kwdesconto = kwtotal * 10 / 100;
		System.out.println("O valor de 10% de desconto é de " +kwdesconto);
		desconto = kwtotal - kwdesconto;
		System.out.println("O valor total com desconto é de " +desconto);
		
}
}
