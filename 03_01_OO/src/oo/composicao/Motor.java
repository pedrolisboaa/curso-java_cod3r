package oo.composicao;

public class Motor {
	
	public boolean ligado = false;
	public double fatorInjecao = 1.0;
	
	public double giros() {
		if(!ligado) {
			return 0;
		}else {
			return fatorInjecao * 3000.0;
		}
	}

}
	