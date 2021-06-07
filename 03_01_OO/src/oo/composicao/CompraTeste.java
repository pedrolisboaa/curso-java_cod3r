package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		
		Compra c1 = new Compra();
		
		c1.cliente = "Pedro";
		c1.itens.add(new Item("Caderno", 3, 5.50));
		c1.itens.add(new Item("Lapis", 5, 2.5));

	}

}
