//Main Client

import at.ac.univie.swe2016.fm.fahrzeuge.Fahrzeug;

public class Main extends Fahrzeug {

	public Main(String brand, String model, int year, double price, int number) {
		super(brand, model, year, price, number);
		// TODO Auto-generated constructor stub
	}
	
	static String marke;
	static String modell;
	static int baujahr;
	static double grundpreis;
	static int id;

	public static void main(String[] args){
		Fahrzeug object1 = new Main(marke, modell, baujahr, grundpreis, id);
		
		System.out.println(object1);
		//System.out.println(cal.get(Calendar.YEAR));
	}

	
	@Override
	public double getRabatt() {
		// TODO Auto-generated method stub
		return 0;
	}
}
