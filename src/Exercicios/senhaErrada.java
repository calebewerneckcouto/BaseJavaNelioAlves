package Exercicios;

import java.util.Scanner;

/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada, escreva a mensagem "Senha Invalida! Tente novamente:".
Quando a senha for informada corretamente, imprima "Acesso Permitido" e encerre o algoritmo.
Considere que a senha correta é o valor 2002.
*/

public class senhaErrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (!senha.equals("2002")) {
                System.out.println("Senha Invalida! Tente novamente:");
            }

        } while (!senha.equals("2002"));
        
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
