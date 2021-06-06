package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapaMap {

	public static void main(String[] args) {
		
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(123, "Pedro");
		usuarios.put(456, "Juliana");
		usuarios.put(789, "Olivia");
		usuarios.put(741, "Marcelo");
		usuarios.put(741, "Patricia");
		usuarios.put(852, "Pedro");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios);
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		System.out.println(usuarios.get(741));
		
		for(Integer chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
	}

}
