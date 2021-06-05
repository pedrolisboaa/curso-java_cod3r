package classe;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner  sc = new Scanner(System.in);
		
		
		Produto p1 = new Produto("Notebook", 5050.00, 0.25);
		Produto p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p2.nome);
		System.out.println(p1.nome);
		
		System.out.println(p1.precoComDesconto(0.25));
		System.out.println(p2.precoComDesconto());
				
		sc.close();
	}

}
