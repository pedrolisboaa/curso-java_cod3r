package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(15, "setembro", 1992);
		Data d2 = new Data();
		Data d3 = new Data();
		
		d2.ano = 2020;
		d2.mes = "agosto";
		d2.dia = 23;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.obterDataFormata());
		System.out.println(d3.obterDataFormata());

	}

}
