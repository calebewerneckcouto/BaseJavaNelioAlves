package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class validacaoNotas {
    /*
     * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
     * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
     * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
     * ser validada separadamente.
     */

    public static void main(String[] args) {
    	
    	  Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double n1, n2;
        
        // Validação da primeira nota
        do {
            System.out.println("Digite a primeira nota (entre 0 e 10):");
            n1 = sc.nextDouble();
            if (n1 < 0 || n1 > 10) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (n1 < 0 || n1 > 10);

        // Validação da segunda nota
        do {
            System.out.println("Digite a segunda nota (entre 0 e 10):");
            n2 = sc.nextDouble();
            if (n2 < 0 || n2 > 10) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (n2 < 0 || n2 > 10);

        sc.close();

        // Cálculo da média
        double media = (n1 + n2) / 2;
        System.out.printf("A média semestral é: %.2f\n", media);
    }
}
