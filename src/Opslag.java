import java.util.ArrayList;

public class Opslag {
	private String naam;
	private ArrayList<Onderdelen> alleOnderdelen = new ArrayList<Onderdelen>();
	private ArrayList<Brandstof> alleBrandstoffen = new ArrayList<Brandstof>();
	private ArrayList<Bestelling> alleBestellingen = new ArrayList<Bestelling>();
	private int ingedrukteKnop;
	public char[] getAlleBestellingen;

	public Opslag(String nm) {
		naam = nm;
	}

	public boolean voegOnderdeelToe(Onderdelen nwOnderdeel) {

		alleOnderdelen.add(nwOnderdeel);
		return true;

	}

	public boolean voegBrandstofToe(Brandstof nwBrandstof) {

		alleBrandstoffen.add(nwBrandstof);
		return true;

	}

	public ArrayList<Bestelling> getAlleBestellingen() {
		return alleBestellingen;
	}

	public void addAlleBestellingen(Bestelling bestelling) {
		alleBestellingen.add(bestelling);
	}

	
	public void setIngedrukteKnop(int ik) {
		ingedrukteKnop = ik;
	}

	public boolean checkBestellingen(){
		
		if (alleBestellingen == null){
			return false;
		}
		else return true;
	}
	
	public int getIngedrukteKnop() {
		return ingedrukteKnop;
	}

	public Onderdelen getOnderdeel(int ond){
		
		return alleOnderdelen.get(ond);
		
	}
	public String getNaam() {
		return naam;
	}

	public int getNummer() {

		return alleOnderdelen.get(ingedrukteKnop).getNummer();
	}

	public String toString() {
		String s = "";

		for (Onderdelen r : alleOnderdelen) {
			s += r + "\n";
		}
		for (Brandstof b : alleBrandstoffen) {
			s += b + "\n";
		}
		return s;
	}

	public String bestellingsInformatie() {
		String s ="";
if (alleBestellingen != null){
		for (Bestelling b : alleBestellingen) {

			s += b + "\n";
		}}
		return s;
	}


}