package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaStack {
	
	public static void main(String[] args) {
		
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Senhor dos aneis");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
	}

}
