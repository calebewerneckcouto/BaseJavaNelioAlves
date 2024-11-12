package Exercicios;

import java.util.Scanner;

public class paresConsecutivos {

	/*
	 * O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá
	 * parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma
	 * dos 5 pares consecutivos a partir de X, inclusive o X, se for par. Se o valor
	 * de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da
	 * operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por
	 * exemplo, a saída deve ser 80, que é a soma de 12+14+16+18+20.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Informe um valor:");
			n = sc.nextInt();

			// Verifica se n é zero, caso seja, o loop termina
			if (n == 0) {
				break;
			}

			int soma = 0;

			// Se n for ímpar, incrementa para o próximo número par
			if (n % 2 != 0) {
				n++;
			}

			// Calcula a soma dos 5 pares consecutivos a partir de n
			for (int i = 0; i < 5; i++) {
				soma += n;
				n += 2;
			}

			System.out.println("Soma dos 5 pares consecutivos: " + soma);

		} while (n != 0);

		sc.close();
	}
}
