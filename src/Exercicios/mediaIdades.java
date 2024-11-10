package Exercicios;

import java.util.Scanner;

/*
Faça um programa para ler um número indeterminado de dados, contendo cada um a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa.
Calcular e imprimir a idade média deste grupo de indivíduos.
Se for entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSIVEL CALCULAR".
*/

public class mediaIdades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        System.out.print("Digite uma idade (valor negativo para encerrar): ");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            while (idade >= 0) {
                somaIdades += idade;
                contador++;
                System.out.print("Digite uma idade (valor negativo para encerrar): ");
                idade = sc.nextInt();
            }

            double media = (double) somaIdades / contador;
            System.out.printf("Idade média: %.2f%n", media);
        }

        sc.close();
    }
}
