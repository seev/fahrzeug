import at.ac.univie.swe2016.fm.FahrzeugManagement;
import at.ac.univie.swe2016.fm.fahrzeuge.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FahrzeugManagement mng = new FahrzeugManagement();

        PKW pkw = new PKW("Omer", "Mer", 2000,20000.0, 1);
        mng.addFahrzeug(pkw);

        System.out.println("LKW:" + mng.gesLKW());
        System.out.println("PKW:" + mng.gesPKW());
        System.out.println("All fahrzeuge:" + mng.gesFahrzeuge());
	}
}