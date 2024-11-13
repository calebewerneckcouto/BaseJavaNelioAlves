package Funcoes;

import java.util.Scanner;

public class NumerosInteirosMaior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 3 numeros:");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);
		
		showResult(higher);

		/*
		 * forma dificil
		 * 
		 * if(a>b && a>c) { System.out.println("Maior é o :" + a); }else if(b>c) {
		 * System.out.println("Maior é o :" + b);
		 * 
		 * }else { System.out.println("Maior é o: " + c); }
		 * 
		 */
		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}

		return aux;

	}
	
	public static void showResult(int value) {
		System.out.println("Maior numero é: " + value);
	}

}
