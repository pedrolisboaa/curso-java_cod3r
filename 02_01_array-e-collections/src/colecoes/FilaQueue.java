package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
	
	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");   // retorna falso
		fila.offer("Bia"); // lan�a uma exce��o com a fila cheia
		fila.add("Marcelo");
		fila.offer("Carlos");
		fila.add("Rosangela");
		fila.offer("Manuel");
		fila.add("Ana Luiza");
		fila.offer("Guilherme");
		
		System.out.println(fila.peek()); // retornar null se a fila estviver v�zia.
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma exe��o
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila);
	}

}
