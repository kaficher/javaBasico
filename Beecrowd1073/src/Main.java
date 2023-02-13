import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
	Scanner teclado = new Scanner (System.in);
	int numero;
	
	do { 
		System.out.println("digite um numero: ");
		numero = teclado.nextInt();
		System.out.println("----> Digitado - " +numero);
	} while (numero!=-1);
	System.out.println("FIM");
	teclado.close();
}
}