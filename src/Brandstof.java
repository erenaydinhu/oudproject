public class Brandstof {
	private int nummer;
	private double hoeveelheid;

	public Brandstof(int nr) {
		nummer = nr;
	}

	public double getHoeveelheid() {
		return hoeveelheid;
	}

	public int getNummer() {
		return nummer;
	}

	public void setHoeveelheid(double hv) {
		hoeveelheid = hv;
	}

	public void getHoeveelheid(double hv) {
		hoeveelheid = hv;
	}

	public String toString() {
		String s = "Brandstofnummer:  " + nummer + " heeft hoeveelheid "
				+ hoeveelheid;

		return s;
	}
}