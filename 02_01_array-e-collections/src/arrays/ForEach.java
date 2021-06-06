package arrays;

public class ForEach {
	
	public static void main(String[] args) {
		
		
		
		String[] nomes = {"pedro", "juliana", "Olívia", "Rosangela", "Marcia"};
		double[] notas = {5.5, 6.6, 1.1, 5.8, 10, 5.89, 9.8};
		
		for(String nome: nomes) {
			System.out.println(nome.toUpperCase());
		}
		
		for(double nota: notas) {
			System.out.println(nota);
		}
	}

}
