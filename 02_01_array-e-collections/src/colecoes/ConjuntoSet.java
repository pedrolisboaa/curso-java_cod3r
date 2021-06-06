package colecoes;

import java.util.HashSet;

public class ConjuntoSet {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		HashSet<Comparable> conjunto = new HashSet();
		HashSet<Comparable> conjunto2 = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add(false);
		conjunto.add("Pedro");
		conjunto.add(1000);
		
		conjunto2.add(1);
		conjunto2.add(2);
		conjunto2.add(3);
		
		/*
		for(Comparable conj: conjunto) {
			System.out.println(conj);
		}*/
		
		System.out.println(conjunto.size());
		System.out.println(conjunto.remove("Pedro"));
		System.out.println(conjunto);
		System.out.println(conjunto.contains(true));
		
		System.out.println(conjunto2);
		conjunto.addAll(conjunto2); // união entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto2.clear();
		System.out.println(conjunto2);
		
		
		
		
	}

}
