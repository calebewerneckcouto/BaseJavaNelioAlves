package Exercicios;

import java.util.Scanner;

public class quadrante {
	
	
	/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). O
algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem
escrever mensagem alguma).*/
	
	
	public static void main (String []args) {
		
		  Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.print("Digite a coordenada X: ");
	            int x = sc.nextInt();
	            System.out.print("Digite a coordenada Y: ");
	            int y = sc.nextInt();

	            // Condição de saída: encerra o programa se X ou Y for zero
	            if (x == 0 || y == 0) {
	                break;
	            }

	            // Determina o quadrante com base nos valores de X e Y
	            if (x > 0 && y > 0) {
	                System.out.println("Q1");
	            } else if (x < 0 && y > 0) {
	                System.out.println("Q2");
	            } else if (x < 0 && y < 0) {
	                System.out.println("Q3");
	            } else if (x > 0 && y < 0) {
	                System.out.println("Q4");
	            }
	        }

	        sc.close();
	    }
	
		
		
		
		
		
	}


