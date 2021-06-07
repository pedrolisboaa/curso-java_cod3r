package oo.herenca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador j = new Jogador();
		j.x = 20;
		j.y = 20;
		
		j.andar(Direcao.NORTE);
		j.andar(Direcao.NORTE);
		j.andar(Direcao.NORTE);
		j.andar(Direcao.NORTE);

		
		System.out.println(j.y);
	}

}
