package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoSet2 {
	
	public static void main(String[] args) {
		
		
		//Set<String> conjunto = new HashSet<>();
		Set<String> conjunto = new TreeSet<>();
		Set<Integer> numeros = new HashSet<>();
		
		conjunto.add("Pedro");
		conjunto.add("Juliana");
		conjunto.add("Olívia");
		conjunto.add("Marcela");
		conjunto.add("Marcela");
		conjunto.add("Marico");
		conjunto.add("Ana");
		conjunto.add("Carolina");
		
		numeros.add(1);
		numeros.add(102);
		numeros.add(1231);
		numeros.add(3211);
		numeros.add(2321);
		numeros.add(9031);
		numeros.add(3211);
		
		for(String nome: conjunto) {
			System.out.println(nome);
		}
		
		for(Integer numero: numeros) {
			System.out.println(numero);
		}
		
	}

}
