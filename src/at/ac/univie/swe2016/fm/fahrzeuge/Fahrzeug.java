package at.ac.univie.swe2016.fm.fahrzeuge;

import java.io.Serializable;
import java.util.Calendar;


public abstract class Fahrzeug implements Serializable {
	//TODO: Sting marke prüfen.
	//TODO: Sting model prüfen.
	//TODO: ID problem lösen.
	
	private String marke;
	private String modell;
	private int baujahr;
	private double grundpreis;
	private int id;
	
	//Constructor
	public Fahrzeug(String marke, String modell, int baujahr, double grundpreis, int id) {
		this.setMarke(marke);
		this.setModell(modell);
		this.setBaujahr(baujahr);
		this.setGrundpreis(grundpreis);
		this.setId(id);
	}
	
	public Fahrzeug(){};
	
	public String getMarke() {
		return marke;
	}
	

	public void setMarke(String marke) {
		this.marke = marke;
	}


	public String getModell() {
		return modell;
	}


	public void setModell(String modell) {
		this.modell = modell;
	}


	public int getBaujahr() {
		return baujahr;
	}


	public void setBaujahr(int baujahr) {
		Calendar jetzt = Calendar.getInstance();
		if (baujahr >= jetzt.get(Calendar.YEAR)){
			
			throw new IllegalArgumentException("Baujahr falsch eingetragen!");
		}
		
		else
			this.baujahr = baujahr;
	}


	public double getGrundpreis() {
		return grundpreis;
	}


	public void setGrundpreis(double grundpreis) {
		if (grundpreis >= 0){
			throw new IllegalArgumentException("Grundpreis falsch eingetragen!");
		}
		
		else
			this.grundpreis = grundpreis;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public abstract double getRabatt();
	
	
	public int getAlter(int baujahr) {
		Calendar jetzt = Calendar.getInstance();
		return jetzt.get(Calendar.YEAR) - this.baujahr;
	}
	
	public double getRabatt(double preis){
		return preis;
	}
	
	public String toString(){
		
		return (marke+" "+modell+ " "+ " "+ baujahr +" "+grundpreis+" "+id+ "   ");
	
	}
	
}