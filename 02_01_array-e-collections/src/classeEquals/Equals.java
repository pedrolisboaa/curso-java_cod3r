package classeEquals;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Pedro Lisboa", "phlisboa2000@gmail.com");
		Usuario u2 = new Usuario("Pedro Lisboa", "phlisboa2000@gmail.com");
		
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}

}
