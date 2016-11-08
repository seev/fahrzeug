import java.util.Calendar;

import at.ac.univie.swe2016.fm.FahrzeugManagement;
import at.ac.univie.swe2016.fm.fahrzeuge.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FahrzeugManagement mng = new FahrzeugManagement();
		Calendar date = Calendar.getInstance();
		date.set(2015, 02, 30);
		
		PKW pkw = new PKW("Audi", "RS3", 2015,59999.98, 11);
		pkw.setPruefung(date);
		mng.addFahrzeug(pkw);
		System.out.println(pkw.toString());

		LKW lkw = new LKW("Man", "blaBlabla", 2004,18999.95, 2);
        mng.addFahrzeug(lkw);
        System.out.println(lkw.toString());

        System.out.println("LKW:" + mng.gesLKW());
        System.out.println("PKW:" + mng.gesPKW());
        System.out.println("All fahrzeuge:" + mng.gesFahrzeuge());
	}
}