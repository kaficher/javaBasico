import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	double valor;
	int valorInt, valorDec, n100, r100, n50, r50, n20, r20, n10, r10, n5, r5, n2, r2, m1, rm1, m50, rm50, m25, rm25, m10, rm10, m5, rm5, mc1, rmc1;
	
	valor = teclado.nextDouble();
	
	valorInt = (int) valor;
	valor = valor - valorInt;
	
	valorDec = (int) (valor * 100);
	
	n100 = valorInt / 100;
	r100 = valorInt % 100;
	
	n50 = r100/50;
	r50 = r100 % 50;
	
	n20 = r50/20;
	r20 = r50 % 20;
	
	n10 = r20/10;
	r10 = r20 % 10;
	
	n5 = r10 / 5;
	r5 = r10 % 5;
	
	n2 = r5 / 2;
	r2 = r5 % 2;
	
	m1 = r2 /1;
	rm1 = r2 % 1;
	
	m50 = valorDec / 50;
	rm50 = valorDec % 50;
	
	m25 = rm50 / 25;
	rm25 = rm50 % 25;
	
	m10 = rm25 / 10 ;
	rm10 = rm25 % 10;
	
	m5 = rm10 / 5;
	rm5 = rm10 % 5;

	mc1 = rm5 / 1;
	rmc1 = rm5 % 1;
	
	System.out.println("NOTAS:");
	System.out.println(n100 + " nota(s) de R$ 100.00");
	System.out.println(n50 + " nota(s) de R$ 50.00");
	System.out.println(n20 + " nota(s) de R$ 20.00");
	System.out.println(n10 + " nota(s) de R$ 10.00");
	System.out.println(n5 + " nota(s) de R$ 5.00");
	System.out.println(n2 + " nota(s) de R$ 2.00");
	
	System.out.println("MOEDAS:");
	System.out.println(m1 + " moeda(s) de R$ 1.00");
	System.out.println(m50 + " moeda(s) de R$ 0.50");
	System.out.println(m25 + " moeda(s) de R$ 0.25");
	System.out.println(m10 + " moeda(s) de R$ 0.10");
	System.out.println(m5 + " moeda(s) de R$ 0.05");
	System.out.println(mc1 + " moeda(s) de R$ 0.01");
	
	teclado.close();
}
}
