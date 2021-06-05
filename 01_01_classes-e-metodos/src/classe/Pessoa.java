package classe;

public class Pessoa {
	
	public String nomePessoa;
	public Double pesoPessoa;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nomePessoa, Double pesoPessoa) {
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	public void comer(Comida comida) {
		pesoPessoa += comida.pesoComida;
	}
	
	

}
