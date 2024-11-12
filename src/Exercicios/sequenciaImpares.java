package Exercicios;

import java.util.Scanner;

public class sequenciaImpares {

    /*Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
    se for o caso.*/

    public static void main(String[] args) {

        int y;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de x:");
        y = sc.nextInt();

        for (int x = 0; x <= y; x++) { // Começa de 1 e vai até y, incluindo y
            if (x % 2 != 0) { // Verifica se x é ímpar
                System.out.println(x); // Imprime x se for ímpar
            }
            sc.close();
        }
    }
}
