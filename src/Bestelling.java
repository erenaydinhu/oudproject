import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Bestelling {

	private Calendar aankomstdatum;
	private int hoeveelheid2;
	private int ProductCode;
	Date Datum = new Date();

	public Bestelling(int TS, int hoev, Calendar aankomst) {
		aankomstdatum = aankomst;
		hoeveelheid2 = hoev;
		ProductCode = TS;
	}

	public int getHoeveelheid() {
		return hoeveelheid2;
	}

	public int getProductCode() {
		return ProductCode;

	}

	public Calendar getDatum() {
		return aankomstdatum;
	}

	

	public void add(Bestelling bestelling) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		String s = " Bestelling van: " + ProductCode + " met hoeveelheid besteld: " + hoeveelheid2 + "  -  "
				+ " met verwachte datum: " + aankomstdatum.get(Calendar.DAY_OF_MONTH) + " / "
				+ aankomstdatum.get(Calendar.MONTH) + " / " + aankomstdatum.get(Calendar.YEAR) + " / ";
		return s;

	}

}
