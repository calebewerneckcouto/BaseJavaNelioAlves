package SaidaDados;

import java.util.Locale;

public class saidaDados {
	
	
	public static void main(String[]args) {
		
		String nome = "Calebe";
		int idade = 36;
		double renda =4000.0;
		int y = 32;
		double x = 10.35784;
		/*println*/
		System.out.println(y);
		System.out.println(x);
		
		/*printf voce imprime formatado  Arredondamento*/
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		
		/*mudei para linguagem americana e saiu . ao inves de ,*/
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		
		/*mudei para linguagem americana e saiu . ao inves de ,*/
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
		
	
	}
}
