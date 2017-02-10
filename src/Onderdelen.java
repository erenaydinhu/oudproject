public class Onderdelen {
	private int artikelnummer;
	private int hoeveelheid;
	private double prijs;

	public Onderdelen(int nr, int hoev) {
		artikelnummer = nr;
		hoeveelheid = hoev;
	}

	public double getSaldo() {
		return hoeveelheid;
	}

	public double getPrijs() {

		return prijs;

	}

	public int getNummer() {
		return artikelnummer;
	}

	public void setHoeveelheid(int bedrag) {
		hoeveelheid = bedrag;
	}

	public void getHoeveelheid(int bedrag) {
		hoeveelheid = bedrag;
	}

	public String toString() {

		String s = "Artikelnummer:  " + artikelnummer + " heeft hoeveelheid "
				+ hoeveelheid + " @";

		return s;
	}
}