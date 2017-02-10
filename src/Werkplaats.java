import java.util.ArrayList;
import java.util.Date;

public class Werkplaats {

	private ArrayList<Klus> alleKlussen = new ArrayList<Klus>();
	private ArrayList<Monteur> alleMonteurs = new ArrayList<Monteur>();
	private int klusnummer = 0;

	public Werkplaats() {

	}

	public Monteur getMonteur(int index) {
		int i2 = index;

		return alleMonteurs.get(i2);

	}

	public void nieuweKlus(){
		
		klusnummer++;
	}
	
		public int getKlusnummer(){
		
		return klusnummer;
	}
	
	public boolean voegMonteurToe(Monteur nwMonteur) {

		alleMonteurs.add(nwMonteur);
		return true;

	}

	public int monteurSize() {

		return alleMonteurs.size();
	}

	public String getMonteurNaam(int index) {
		int i = index;

		return alleMonteurs.get(i).getNaam();

	}

	public void addAlleKlussen(Klus deKlus) {

		alleKlussen.add(deKlus);
	}

	public String toString() {
		String s = "";

		for (Klus k : alleKlussen) {
			s += k + "\n";
		}

		return s;

	}

}
