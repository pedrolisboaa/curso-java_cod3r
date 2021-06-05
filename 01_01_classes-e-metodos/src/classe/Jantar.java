package classe;

public class Jantar {

	public static void main(String[] args) {
		
		
		Comida arroz = new Comida("Arroz", 0.4);
		Comida carne =  new Comida("Carne", 0.3);
		
		Pessoa pedro = new Pessoa("Pedro", 120.0);
		
		System.out.println(pedro.pesoPessoa);
		pedro.comer(arroz);
		System.out.println(pedro.pesoPessoa);
		pedro.comer(carne);
		System.out.println(pedro.pesoPessoa);

	}

}
