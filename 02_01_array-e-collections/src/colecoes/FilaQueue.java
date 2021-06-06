package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
	
	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");   // retorna falso
		fila.offer("Bia"); // lança uma exceção com a fila cheia
		fila.add("Marcelo");
		fila.offer("Carlos");
		fila.add("Rosangela");
		fila.offer("Manuel");
		fila.add("Ana Luiza");
		fila.offer("Guilherme");
		
		System.out.println(fila.peek()); // retornar null se a fila estviver vázia.
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exeção
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila);
	}

}
