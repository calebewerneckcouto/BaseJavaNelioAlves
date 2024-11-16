package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Cambio {
           
	

	
	public static void main (String []args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dólar? ");
		
		double dolar = sc.nextDouble();
		
		System.out.println("Quantos dolares serão comprados? ");
		
		double quant = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(quant, dolar);
		
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
		sc.close();
	}
	
	
	
}
