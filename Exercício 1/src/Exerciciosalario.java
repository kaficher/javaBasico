
import java.util.Scanner;

public class Exerciciosalario {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int hora;
		double salario, INSS, percentual, valorhora;
		  
		System.out.println("Informe o valor da sua hora de trabalho " );	
		valorhora = teclado.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas no mês " );
		hora = teclado.nextInt();
		salario = valorhora * hora;
		System.out.println("Seu salário bruto é " +salario);
		System.out.println("Digite o percentual a ser descontado pelo INSS ");
		percentual = teclado.nextDouble();
		
		INSS = salario * percentual / 100;
				
		System.out.println("O valor descontado é de " +INSS);
		
		System.out.println("Seu salário líquido vale: " +(salario-INSS));
		
		
		
			
	
}
}
