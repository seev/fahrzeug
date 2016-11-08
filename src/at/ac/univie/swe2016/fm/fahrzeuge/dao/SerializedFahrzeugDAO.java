package at.ac.univie.swe2016.fm.fahrzeuge.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import at.ac.univie.swe2016.fm.fahrzeuge.Fahrzeug;

public class SerializedFahrzeugDAO implements FahrzeugDAO {
	
	public String path;
	OutputStream fileStream;
	ObjectOutputStream stream;
	
	public SerializedFahrzeugDAO(String path){
		this.path = path;
	}
	
	
	@Override
	public ArrayList<Fahrzeug> getFahrzeugList() {
		
		ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();
		
		try {
			FileInputStream fis = new FileInputStream(this.path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            fahrzeuge = (ArrayList<Fahrzeug>) ois.readObject();
            ois.close();
        }
        catch(Exception e) {
        	//e.printStackTrace();
        }
		
		return fahrzeuge;
		
	}

	@Override
	public void saveFahrzeug(Fahrzeug fahrzeug) {
		// TODO Auto-generated method stub
		 ArrayList<Fahrzeug> fahrzeuge = this.getFahrzeugList();
		 fahrzeuge.add(fahrzeug);
		 try {
	            FileOutputStream fos = new FileOutputStream(this.path);
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(fahrzeuge);
	            oos.close();
	        }
	        catch(Exception e) {
	            //e.printStackTrace();
	        }
		
	}

	@Override
	public void loadFahrzeug(Fahrzeug fahrzeug) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void removeFahrzeug(Fahrzeug fahrzeug){
		// TODO Auto-generated method stub
	}

	@Override
	public Fahrzeug getFahrzeugbyList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
