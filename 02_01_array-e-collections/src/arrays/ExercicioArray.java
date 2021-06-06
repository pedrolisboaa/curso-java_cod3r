package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas notas gostaria de gravar: ");
		int n = sc.nextInt();
		System.out.println();

		double[] notas = new double[n];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Nota #%d:", i+1);
			notas[i] = sc.nextDouble();
		}
		
		System.out.println("As notas são: " + Arrays.toString(notas));
		
		double total = 0;
		for(int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		
		System.out.printf("A média do aluno é: %.2f%n ", total/notas.length);
		
		sc.close();

	}

}
