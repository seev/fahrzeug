package at.ac.univie.swe2016.fm.fahrzeuge;

import java.util.Calendar;

public class PKW extends Fahrzeug {
	
	private static final long serialVersionUID = 3741171721209353264L;
	private Calendar pruefung;
	
	public Calendar pruefung(){
		return pruefung;
	}
	
	public double getRabatt(double preis, int baujahr) {
		this.getAlter(baujahr);
		
		return 0;
	}
	
	//Constructor
	public PKW(String marke, String modell, int baujahr, double grundpreis, int id) {
		super(marke, modell, baujahr, grundpreis, id);
		}
	
	public void setLetzteUeberpruefung(Calendar ueberpruefung) {
		this.pruefung = ueberpruefung;
		}
	
	public void setLetzteUeberpruefung() {
		Calendar now = Calendar.getInstance();
		this.pruefung = now;
	}
	
	@Override
	public double getRabatt() {
		int prozent = getAlter(getBaujahr())*5+(2* this.pruefung().get(Calendar.YEAR));
		if (prozent >= 15) {
			prozent = 15;
		}
		
		return getGrundpreis()*(prozent/100);
	}

	public PKW(String marke, String modell, int baujahr, double grundpreis, int id, Calendar pruefung) {
		super(marke, modell, baujahr, grundpreis, id);
		setPruefung(pruefung);
	}

	public Calendar getPruefung() {
		return pruefung;
	}

	public void setPruefung(Calendar pruefung) {
		this.pruefung = pruefung;
	}
	
	@Override
	public String toString(){
		String ausgabe = "Typ: PKW\n";
		ausgabe += "Id: " + this.getId() + "\n";
		ausgabe += "Marke: " + this.getMarke() + "\n";
		ausgabe += "Modell: " + this.getModell() + "\n";
		ausgabe += "Baujahr: " + this.getBaujahr() + "\n";
		ausgabe += "Grundpreis: " + this.getGrundpreis() + "\n";
		ausgabe += "Preis: " + this.getGrundpreis() + "\n";

		return ausgabe;
		}
	
}
