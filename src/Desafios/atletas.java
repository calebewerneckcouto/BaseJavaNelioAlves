package Desafios;


	
	import java.util.Locale;

/*Fazer um programa para ler uma quantidade N (supor N > 0), depois ler os dados de N atletas (nome,
sexo, altura, peso). Depois, mostrar um relatório contendo:
 Peso médio dos atletas
 Nome do atleta mais alto
 Porcentagem de homens
 Altura média das mulheres
Caso não sejam digitadas mulheres, a altura média não poderá ser calculada (pois divisão por zero não
existe). Neste caso, apenas mostrar a mensagem "Não há mulheres cadastradas".
Fazer validações de dados para altura e peso, não permitindo digitar valores não positivos para esses
dados. Faça também a validação do sexo, não permitindo valores diferentes de F e M.
Dica: para validar o sexo, a lógica é: tem que pedir para o usuário digitar novamente enquanto o valor
digitado for diferente de "F" E diferente de "M"*/
	
	import java.util.Scanner;

	public class atletas {
	    public static void main(String[] args) {
	    	
	    	Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Qual a quantidade de atletas? ");
	        int n = sc.nextInt();
	        sc.nextLine();  

	      
	        double somaPeso = 0;
	        double somaAlturaMulheres = 0;
	        int countHomens = 0;
	        int countMulheres = 0;
	        String atletaMaisAlto = "";
	        double alturaMaisAlta = 0;

	      
	        for (int i = 1; i <= n; i++) {
	            System.out.println("\nDigite os dados do atleta numero " + i + ":");

	           
	            System.out.print("Nome: ");
	            String nome = sc.nextLine();

	            
	            char sexo;
	            while (true) {
	                System.out.print("Sexo (F/M): ");
	                sexo = sc.next().toUpperCase().charAt(0);
	                if (sexo == 'F' || sexo == 'M') break;
	                System.out.println("Valor invalido! Favor digitar F ou M.");
	            }

	           
	            double altura;
	            while (true) {
	                System.out.print("Altura: ");
	                altura = sc.nextDouble();
	                if (altura > 0) break;
	                System.out.println("Valor invalido! Favor digitar um valor positivo.");
	            }

	          
	            double peso;
	            while (true) {
	                System.out.print("Peso: ");
	                peso = sc.nextDouble();
	                if (peso > 0) break;
	                System.out.println("Valor invalido! Favor digitar um valor positivo.");
	            }

	            
	            somaPeso += peso;

	            if (sexo == 'M') {
	                countHomens++;
	            } else if (sexo == 'F') {
	                somaAlturaMulheres += altura;
	                countMulheres++;
	            }

	            
	            if (altura > alturaMaisAlta) {
	                alturaMaisAlta = altura;
	                atletaMaisAlto = nome;
	            }

	            sc.nextLine(); 
	        }

	       
	        double pesoMedio = somaPeso / n;
	        double porcentagemHomens = (countHomens * 100.0) / n;

	      
	        System.out.println("\nRELATÓRIO:");
	        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
	        System.out.println("Atleta mais alto: " + atletaMaisAlto);
	        System.out.printf("Porcentagem de homens: %.1f %%\n", porcentagemHomens);

	        
	        if (countMulheres > 0) {
	            double alturaMediaMulheres = somaAlturaMulheres / countMulheres;
	            System.out.printf("Altura média das mulheres: %.2f\n", alturaMediaMulheres);
	        } else {
	            System.out.println("Não há mulheres cadastradas");
	        }
	    }
	}
