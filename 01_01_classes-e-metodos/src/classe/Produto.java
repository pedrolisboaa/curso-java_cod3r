package classe;

public class Produto {
	
	public static Double desconto = 0.25;

	public String nome;
	public Double preco;
	
	public Produto() {
		
	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public Double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	public Double precoComDesconto(double descontoGerente) {
		return preco * (1 - (desconto + descontoGerente)); 
	}
}
