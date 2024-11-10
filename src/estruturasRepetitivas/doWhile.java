package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class doWhile {
        
	
	/*Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.Perguntar se o usuario deseja repetir(s/n)
	 * Caso o usuario digite "s. Repetir o programa.   */
	
	
	public static void main (String[]args) {
		
		  Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);

	        char resp;

	        do {
	            System.out.print("Digite a temperatura em Celsius: ");
	            double C = sc.nextDouble();
	            double F = 9.0 * C / 5.0 + 32;

	            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
	            System.out.print("Deseja repetir (s/n)? ");
	            resp = sc.next().toLowerCase().charAt(0);  // Lê a resposta do usuário e converte para minúscula

	        } while (resp == 's');

	        sc.close();
	    }
	}