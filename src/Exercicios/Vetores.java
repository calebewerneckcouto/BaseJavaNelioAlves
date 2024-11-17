package Exercicios;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt(); // Lê o número de elementos que o usuário deseja informar

        int[] vect = new int[n]; // Cria um vetor para armazenar os números

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt(); // Armazena os números no vetor
        }

        System.out.println("Números negativos:");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) { // Verifica se o número é negativo
                System.out.println(vect[i]); // Exibe os números negativos
            }
        }

        sc.close(); // Fecha o scanner
    }
}
