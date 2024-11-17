package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); // Para entrada/saída no padrão americano (ponto decimal)
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas? ");
        int n = sc.nextInt(); // Número de pessoas
        
        double[] vect = new double[n]; // Vetor para armazenar as alturas
        
        System.out.println("Digite as alturas:");
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble(); // Leitura das alturas
        }
        
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i]; // Soma de todas as alturas
        }
        
        double average = sum / n; // Cálculo da média
        
        System.out.printf("Altura média = %.2f%n", average); // Exibição da média com duas casas decimais
        
        sc.close(); // Fecha o scanner
    }
}
