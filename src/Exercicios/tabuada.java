package Exercicios;

import java.util.Scanner;

public class tabuada {
	/*
	 * Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10,
	 * conforme exemplo. Deseja a tabuada para qual valor? 4 4 x 1 = 4 4 x 2 = 8 4 x
	 * 3 = 12 4 x 4 = 16 4 x 5 = 20 4 x 6 = 24 4 x 7 = 28 4 x 8 = 32 4 x 9 = 36 4 x
	 * 10 = 40
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja a tabuada para qual valor?");
		int x = sc.nextInt();

		for (int n = 1; n <=10; n++) {
			System.out.println(x + "x" + n + "=" + x * n);
		}

		sc.close();
	}
}
