package Exercicios;

import java.util.Scanner;

/*Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
programa deve finalizar quando forem digitados dois valores iguais.*/

public class crescenteDecrescente {

	
	 public static void main (String[]args) {
		 
		  Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.print("Digite o valor de X: ");
	            int x = sc.nextInt();
	            System.out.print("Digite o valor de Y: ");
	            int y = sc.nextInt();

	            if (x == y) {
	                break; // Encerra o loop se os valores forem iguais
	            }

	            if (x > y) {
	                System.out.println("DECRESCENTE!");
	            } else {
	                System.out.println("CRESCENTE!");
	            }
	        }

	        sc.close();
	    }
	}
