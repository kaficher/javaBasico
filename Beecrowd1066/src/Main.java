import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int valores, pares=0, impares=0, positivos=0, negativos=0;
	
	for (int contador = 0; contador < 5; contador++) {
		valores = teclado.nextInt();
		
		if (valores > 0) {
			positivos++;		
			} else if (valores < 0) { 
				negativos++;
			}
		if (valores % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
	}
	System.out.println(pares + " valor(es) par(es)");
	System.out.println(impares + " valor(es) impar(es)");	
	System.out.println(positivos + " valor(es) positivo(s)");
	System.out.println(negativos + " valor(es) negativo(s)");
	
			teclado.close();
}
}

	
	