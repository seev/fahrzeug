package at.ac.univie.swe2016.fm;

import java.util.ArrayList;

import at.ac.univie.swe2016.fm.fahrzeuge.*;
import at.ac.univie.swe2016.fm.fahrzeuge.dao.FahrzeugDAO;
import at.ac.univie.swe2016.fm.fahrzeuge.dao.SerializedFahrzeugDAO;

public class FahrzeugManagement {

	private FahrzeugDAO fahrzeugDAO;
	
	public FahrzeugManagement(){
		this.fahrzeugDAO = new SerializedFahrzeugDAO("/Users/Rabit/Desktop/fahrzeug.txt");
	}
	
	public void addFahrzeug(Fahrzeug fahrzeug){
		this.fahrzeugDAO.saveFahrzeug(fahrzeug);
	}
	
	public void removeFahrzeug(Fahrzeug fahrzeug){
		this.fahrzeugDAO.removeFahrzeug(fahrzeug);
	}
	
	public void loadFahrzeug(Fahrzeug fahrzeug){
		this.fahrzeugDAO.loadFahrzeug(fahrzeug);
	}
	
	public int gesFahrzeuge(){
		ArrayList<Fahrzeug> fahrzeuge = this.fahrzeugDAO.getFahrzeugList();
		int count = 0;
		
		for(Fahrzeug fahrzeug : fahrzeuge){
			if (fahrzeug instanceof PKW ){
				count++;
			}
		}
		return count;
	}
	
	public int gesLKW(){
		ArrayList<Fahrzeug> fahrzeuge = this.fahrzeugDAO.getFahrzeugList();
		int count = 0;
		
		for(Fahrzeug fahrzeug : fahrzeuge){
			if(fahrzeug instanceof LKW){
				count++;
			}
		}
		return count;
	}
	
	public int gesPKW(){
		ArrayList<Fahrzeug> fahrzeuge = this.fahrzeugDAO.getFahrzeugList();
		int count = 0;
		
		for(Fahrzeug fahrzeug : fahrzeuge){
			if(fahrzeug instanceof PKW){
				count++;
			}
		}
		return count;
	}
	
}