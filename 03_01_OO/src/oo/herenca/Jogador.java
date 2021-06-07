package oo.herenca;

public class Jogador {
	
	int x;
	int y;
	
	boolean andar(Direcao direcao) {
		if(direcao == direcao.NORTE) {
			y++;
		}
		
		return true;
	}

}
