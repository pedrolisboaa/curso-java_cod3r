package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		
		List<Usuario> listaDeUsuarios = new ArrayList<>();
		
		
		listaDeUsuarios.add(new Usuario("Pedro"));
		listaDeUsuarios.add(new Usuario("Paulo"));
		listaDeUsuarios.add(new Usuario("Patricia"));
		listaDeUsuarios.add(new Usuario("Juliana"));
		listaDeUsuarios.add(new Usuario("Olivia"));
		
	
		for(Usuario nome: listaDeUsuarios) {
			System.out.println(nome.nome);
		}
		
		System.out.println("-----------------------");
		
		System.out.println(listaDeUsuarios);
	}

}
