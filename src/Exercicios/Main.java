package Exercicios;

import java.util.Scanner;

public class Main {

	/*
	 * Uma operadora de telefonia cobra 50 reais por um plano basico que da direito
	 * a 100 minutos de telefone.Cada minuto que exceder a franquia de 100 minutos
	 * custa 2 reais.Faça um programa para ler a quantidade de minutos que uma
	 * pessoa consumiu,dai mostra o valor a ser pago.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int minutos;
		int valorPago = 0;
		int diferenca;

		System.out.println("Favor informar quanto tempo utilizou em minutos:");
		minutos = scanner.nextInt();

		if (minutos <=100) {
			valorPago = 50;
		}
		if (minutos > 100) {
			diferenca = (minutos - 100)*2;
			valorPago = 50 + diferenca;
		}
		{
			scanner.close();
		}
        System.out.println("Voce deve pagar "+ valorPago + " reais");
		

	}
}
