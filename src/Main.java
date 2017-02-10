public class Main {
	public static void main(String[] arg) {

		Opslag b = new Opslag("Opslag 1");
		Werkplaats w = new Werkplaats();
		ParkeerPlaats p = new ParkeerPlaats();

		p.voegParkeerPlekToe(new ParkeerPlek(1));
		p.voegParkeerPlekToe(new ParkeerPlek(2));
		p.voegParkeerPlekToe(new ParkeerPlek(3));
		p.voegParkeerPlekToe(new ParkeerPlek(4));
		Onderdelen r1 = new Onderdelen(12345678, 10);
		b.voegOnderdeelToe(r1);
		Onderdelen r2 = new Onderdelen(13578642, 15);
		b.voegOnderdeelToe(r2);
		b.voegOnderdeelToe(new Onderdelen(33444555, 25));
		Monteur monteur1 = new Monteur("jan", "reparaties");
		Monteur monteur2 = new Monteur("piet", "reparaties");
		w.voegMonteurToe(monteur1);
		w.voegMonteurToe(monteur2);

		WelkomstFrame wf = new WelkomstFrame(b, w, p);
		// of.setVisible(true);
		// of.setDeOpslag(b);

	}
}