package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int quantidadeAlunos = sc.nextInt();
		
		System.out.print("Quantas notas? ");
		int quantidadeNotas = sc.nextInt();
		
		double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];
		
		for(int i = 0; i < notasDaTurma.length; i++) {
			for(int j = 0; j < notasDaTurma.length; i++) {
				
			}
		}
		
		
		sc.close();

	}

}
