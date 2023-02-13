import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		valor = teclado.nextInt();
		
		for (int impar = 0 ; impar <= valor ; impar++) {
			if (impar % 2 != 0) {
			System.out.println(impar);
			}
		}
		teclado.close();
		
	}
}
