package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
               List<String> list = new ArrayList<>();
               
               list.add("Maria");
               list.add("Livia");
               list.add("Julia");
               list.add("Juliana");
               list.add("Judite");
               list.add("Jurupira");
               list.add("Hamilton");
               list.add("Samuel");
               list.add("Cristopher");
               list.add("Caio");
               list.add("Cesar");
               
               
               
               
               System.out.println("Percorrendo a lista com forEach antes das operações");
               for(String resultado : list) {
            	   System.out.println(resultado);
               }
               
               
                
               
               
               System.out.println("Removendo o Samuel da Lista " );
               
               list.remove("Samuel");
               
               System.out.println("Removendo o alguem da lista pela posicao ,removi a primeira pessoa da lista, no caso 0" );
               
               list.remove(0);
               
               
               System.out.println("Removendo todas as pessoas, cujo a primeira letra do nome seja j usando funcao lambda ");
               
               list.removeIf(x -> x.charAt(0) == 'J');
               
               
               System.out.println("Adicionando o meu nome no 3 elemento da lista");
               list.add(2,"Calebe");
               
               
               System.out.println("------------------------------------------------------------");
               
               System.out.println("Achar posicao de alguem na lista, no caso hamilton " + "esta na posição : " +  list.indexOf("Hamilton"));
              
               
              
               
               System.out.println("Percorrendo a lista com forEach apos comandos");
               for(String resultado : list) {
            	   System.out.println(resultado);
               }
               
               
               System.out.println("Vendo o tamanho da lista com o comando size() " + list.size() + " itens");
              
               
               List<String> result =  list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
              
               System.out.println("Percorrendo a lista com forEach buscando apenas nomes começados com C:");
               for(String x : result) {
            	   System.out.println(x);
               }
               
               
               System.out.println("-----------------------------------");
               
               System.out.println("Comando para encontrar o primeiro elemento da lista começado com A caso nao exista retorna nulo");
               
               String name =  list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
               
               System.out.println(name);
               
               
               
               
	}

}
