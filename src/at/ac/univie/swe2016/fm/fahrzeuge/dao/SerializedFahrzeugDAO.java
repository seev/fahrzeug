package at.ac.univie.swe2016.fm.fahrzeuge.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import at.ac.univie.swe2016.fm.fahrzeuge.Fahrzeug;

public class SerializedFahrzeugDAO implements FahrzeugDAO {
	
	public String path;
	
	public SerializedFahrzeugDAO(String path){
		this.path = path;
	}
	
	
	@Override
	public ArrayList<Fahrzeug> getFahrzeugList() {
		
		ObjectOutputStream data = null;
		OutputStream pathOut = null;
		
		try {
			data = new ObjectOutputStream(pathOut);
			pathOut = new FileOutputStream(path);
		}
		catch (IOException p) {
			System.err.println(p);
			}
		
		finally {
			try { pathOut.close(); }
			catch ( Exception p) { p.printStackTrace(); }
		}
		
		return new ArrayList<Fahrzeug>();
	}

	@Override
	public void saveFahrzeug(Fahrzeug fahrzeug) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadFahrzeug(Fahrzeug fahrzeug) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fahrzeug getFahrzeugbyList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
