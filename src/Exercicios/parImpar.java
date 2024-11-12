package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class parImpar {

    /*
     * Leia um valor inteiro N. Este valor será a quantidade de números inteiros que
     * serão lidos em seguida. Para cada valor lido, mostre uma mensagem dizendo se
     * este valor lido é PAR ou IMPAR, e também se é POSITIVO ou NEGATIVO. No caso
     * do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO.
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar?");
        int n = sc.nextInt();

        for (int x = 0; x < n; x++) {
            System.out.println("Digite o " + (x + 1) + "º número:");
            int valor = sc.nextInt();

            if (valor == 0) {
                System.out.println("NULO");
            } else if (valor % 2 == 0) {
                if (valor > 0) {
                    System.out.println("PAR POSITIVO");
                } else {
                    System.out.println("PAR NEGATIVO");
                }
            } else {
                if (valor > 0) {
                    System.out.println("IMPAR POSITIVO");
                } else {
                    System.out.println("IMPAR NEGATIVO");
                }
            }
        }

        sc.close();
    }
}
