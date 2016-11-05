package at.ac.univie.swe2016.fm.fahrzeuge;

public class LKW extends Fahrzeug{


	public double getRabatt(double preis, int baujahr) {
		this.getAlter(baujahr);
		
		return 0;
	}


	@Override
	public double getRabatt() {
		int prozent = getAlter(getBaujahr())*5;
		if (prozent >= 20) {
			prozent = 20;
		}
		
		return getGrundpreis()*(prozent/100);
	}

}
