import java.util.ArrayList;

public class BestellingOpslag implements OpslagInterface {

	private String naam;
	private static ArrayList<Bestelling> bestellingen = new ArrayList<Bestelling>();
	private int ingedrukteKnop;
	public char[] getAlleBestellingen;

	public BestellingOpslag(String nm) {
		naam = nm;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see OpslagInterface#voegOnderdeelToe(Onderdelen)
	 */
	@Override
	public boolean voegAanOpslagToe(Object o) {

		bestellingen.add((Bestelling) o);
		return true;

	}

	public static ArrayList<Bestelling> getOpslag() {
		return bestellingen;
	}

	public void setIngedrukteKnop(int ik) {
		ingedrukteKnop = ik;
	}

	public boolean checkOpslag() {

		if (bestellingen == null) {
			return false;
		} else
			return true;
	}

	public int getIngedrukteKnop() {
		return ingedrukteKnop;
	}

	public String getNaam() {
		return naam;
	}

	public String toString() {
		String s = "";
		if (bestellingen != null) {
			for (Bestelling b : bestellingen) {

				s += b + "\n";
			}
		}
		return s;
	}
}
