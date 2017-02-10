import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Klus {

	private int prijs;
	private String bgd, edd;
	private ArrayList<Onderdelen> alleOnderdelen = new ArrayList<Onderdelen>();
	private java.util.Date begindatum;
	private java.util.Date einddatum;
	private Monteur deMonteur;
	private ArrayList<Integer> hoeveelheidGebruikt = new ArrayList<Integer>();
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	private Calendar cal = new GregorianCalendar();
	private Calendar cal2 = new GregorianCalendar();

	// public Klus(Date bg, Date ed, Monteur mont){
	// begindatum = bg;
	// einddatum = ed;
	// deMonteur = mont;
	// }

	public Klus(String date, String date2, Monteur monteur, Integer[] intarray, Onderdelen[] onderdelenarray)
			throws ParseException {

		deMonteur = monteur;

	//	hoeveelheidGebruikt = gekozenints;
		//alleOnderdelen = onderdelen;

		bgd = date;
		edd = date2;

		begindatum = formatter.parse(bgd);
		einddatum = formatter.parse(edd);

		formatter.setCalendar(cal);
		formatter.setCalendar(cal2);

		System.out.println(begindatum + "TEST");
		cal.setTime(begindatum);
		cal2.setTime(einddatum);
		System.out.println(cal.get(Calendar.MONTH));
	}

	public double berekenPrijs() {

		for (int i = 0; i < alleOnderdelen.size(); i++) {
			prijs += alleOnderdelen.get(i).getPrijs()
					* hoeveelheidGebruikt.get(i);

		}
		;

		return prijs;
	}

	public String toString() {

		cal.setTime(begindatum);
		formatter.setCalendar(cal);

		cal.setTime(einddatum);
		formatter.setCalendar(cal2);

		String s = "Monteur: " + deMonteur.getNaam() + " met begindatum: "
				+ cal.get(Calendar.MONTH) + " - " + cal.get(Calendar.YEAR)
				+ "en einddatum: " + cal2.get(Calendar.MONTH) + " - "
				+ cal2.get(Calendar.YEAR);
		return s;
	}

}
