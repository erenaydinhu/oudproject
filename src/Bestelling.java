import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Bestelling {

	private Calendar aankomstdatum;
	private int hoeveelheid2;
	private int TSIC;
	Date c = new Date();

	public Bestelling(int TS, int hoev, Calendar aankomst) {
		aankomstdatum = aankomst;
		hoeveelheid2 = hoev;
		TSIC = TS;
	}

	public int getHoeveelheid() {
		return hoeveelheid2;
	}

	public int getTSIC() {
		return TSIC;

	}

	public Calendar getDatum() {
		return aankomstdatum;
	}

	// public boolean voegOnderdeelToe(Onderdeel nieuwOnderdeel ) {
	// if (1 == 1) {
	// onderdelen.add(nieuwOnderdeel);
	// return true;
	// }
	// return false;
	// }

	// private int test(){
	// for(int i = 0; i < onderdelen.size() ; i++){

	// onderdelen.get(i);
	// if(Onderdeel.getHoeveelheid() == 0 ){
	// aankomstdatum.setTime(c);
	// aankomstdatum.add(Calendar.DATE, 5);
	// new Bestelling(onderdelen.get(i), onderdelen.get(i).getArtikelnummer(),
	// deLeverancier, besteld, aankomstdatum);
	// onderdelen.get(i).setHoeveelheid(besteld);

	// }
	// }
	// return 1;
	// }

	// private int test2(){
	// for(int i = 0; i < brandstoffen.size(); i++){
	// if(brandstoffen.get(i).getLiters() < 10){
	// aankomstdatum.setTime(c);
	// aankomstdatum.add(Calendar.DATE, 5);
	// new Bestelling(brandstoffen.get(i), brandstoffen.get(i).getTSIC(),
	// deLeverancier, brandstofbesteld, aankomstdatum);
	// brandstoffen.get(i).setLiters(brandstofbesteld);
	// }
	// }

	// return 1;
	// }

	public void add(Bestelling bestelling) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		String s = " Bestelling van: " + hoeveelheid2 + " met hoeveelheid besteld: " + TSIC + "  -  "
				+ " met verwachte datum: " + aankomstdatum.get(Calendar.DAY_OF_MONTH) + " / "
				+ aankomstdatum.get(Calendar.MONTH) + " / " + aankomstdatum.get(Calendar.YEAR) + " / ";
		return s;

	}

}
