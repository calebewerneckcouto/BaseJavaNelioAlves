package Vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Produtos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Para entrada/saída no padrão americano (ponto decimal)
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas produtos? ");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < n; i++) {   /*poderia utilizar vect.lenght no lugar no i<n*/
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double soma = 0.0;

		for (int i = 0; i < n; i++) {
			soma += vect[i].getPrice();
		}
		double avg = soma / n;

		System.out.println("Media: " + avg);

		sc.close(); // Fecha o scanner

	}

}
