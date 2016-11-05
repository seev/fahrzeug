
package at.ac.univie.swe2016.fm.fahrzeuge.dao;
import at.ac.univie.swe2016.fm.fahrzeuge.Fahrzeug;
import java.util.ArrayList;

public interface FahrzeugDAO {
	
	public void saveFahrzeug(Fahrzeug fahrzeug);
	public void loadFahrzeug(Fahrzeug fharzeug);
	
	public ArrayList<Fahrzeug> getFahrzeugList();
	public Fahrzeug getFahrzeugbyList(int id);
	
}