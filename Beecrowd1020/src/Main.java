import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	int anos, meses, dias, idade;
	
	idade = teclado.nextInt();
	
	anos = idade / 365;
	meses = (idade % 365) / 30;
	dias = idade % 365 % 30;
	
	System.out.println(anos + " ano(s)");
	System.out.println(meses + " mes(es)");
	System.out.println(dias + " dia(s)");
	
	teclado.close();			
	
}
}
