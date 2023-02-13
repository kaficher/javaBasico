import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valores, soma = 0;
		int qtd = 0;

		for (int contador = 1; contador <= 6; contador++) {
			valores = teclado.nextDouble();
			if (valores > 0) {
				qtd++;
				soma += valores;

			}
		}
		System.out.println(qtd + " valores positivos");
		System.out.printf("%.1f\n", soma / qtd);
				teclado.close();
	}
}