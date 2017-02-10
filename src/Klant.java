public class Klant {
	private String naam, adres, plaats;

	public Klant(String nm, String ad, String pl) {
		naam = nm;
		adres = ad;
		plaats = pl;
	}

	public void setAdres(String ad) {
		adres = ad;
	}

	public void setPlaats(String pl) {
		plaats = pl;
	}

	public String getNaam() {
		return naam;
	}

	public String getAdres() {
		return adres;
	}

	public String getPlaats() {
		return plaats;
	}

	public String toString() {
		return naam + " woont op " + adres + " in " + plaats;
	}
}