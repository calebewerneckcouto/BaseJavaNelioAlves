package estruturasRepetitivas;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        System.out.println("Quantos números você quer informar para somar?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int restantes = n - i; // Calcula quantos números faltam
            System.out.println("Você tem mais " + restantes + " números para informar:");
            
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("A soma total é: " + soma);

        sc.close();
    }
}
