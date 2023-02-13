import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int valor, n100, n50, n20, n10, n5, n2, n1, resto100, resto50, resto20, resto10, resto5, resto2, resto1;
	
	valor = teclado.nextInt();
	
	n100 = valor/100;
	resto100 = valor % 100;
	
	n50 = resto100/50;
	resto50 = resto100 % 50;
	
	n20 = resto50/20;
	resto20 = resto50 % 20;
	
	n10 = resto20/10;
	resto10 = resto20 % 10;
	
	n5 = resto10 / 5;
	resto5 = resto10 % 5;
	
	n2 = resto5 / 2;
	resto2 = resto5 % 2;
	
	n1 = resto2 / 1;
	resto1 = resto2 % 1;
	
	System.out.println("" +valor);
	System.out.println(n100 + " nota(s) de R$ 100,00");
	System.out.println(n50 + " nota(s) de R$ 50,00");
	System.out.println(n20 + " nota(s) de R$ 20,00");
	System.out.println(n10 + " nota(s) de R$ 10,00");
	System.out.println(n5 + " nota(s) de R$ 5,00");
	System.out.println(n2 + " nota(s) de R$ 2,00");
	System.out.println(n1 + " nota(s) de R$ 1,00");
	teclado.close();
}

}
