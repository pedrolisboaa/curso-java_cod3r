package classe;

public class AreaCirc {

	// constante 
	final static double PI = 3.14;
	public double raio;
	
	public AreaCirc() {
		
	}
	
	public AreaCirc(double raio) {
		this.raio = raio;
	}
	
	
	public double area() {
		return raio * raio * PI;
	}
	
	
}
