package ForEach;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		List<String> frutas = new ArrayList<>();
		
		String [] vect = new String[] {"Maria", "Bob","Rute"};
		
		frutas.add("maçã");
		frutas.add("laranja");
		frutas.add("pêra");
		frutas.add("uva");
		
		System.out.println("Usando forEach imprimindo a lista");
		for(String lista : frutas) {
		   System.out.println(lista);
		}
		
		
		System.out.println("Usando forEach imprimindo o vetor");
		for(String lista : vect) {
		   System.out.println(lista);
		}
		
		
		System.out.println("Usando for convencional imprimir a lista");
		 for(int x= 0 ; x< frutas.size();x++) {
			 
			 System.out.println(frutas.get(x));
			 
		 }
		 
		 System.out.println("Usando for convencional imprimir o vetor");
		 for(int x= 0 ; x< vect.length;x++) {
			 
			 System.out.println(vect[x]);

			 
		 }

	}

}
