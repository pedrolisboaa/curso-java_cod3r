package classe;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner  sc = new Scanner(System.in);
		
		
		Produto p1 = new Produto("Notebook", 4000.0);
		Produto p2 = new Produto("Fone Gamer", 200.0);
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		
		Produto p3 = new Produto("Pc gamer", 6000.0);
		System.out.println(p1.precoComDesconto());
		System.out.println(p3.precoComDesconto(0.5));
		
		
		sc.close();
	}

}
