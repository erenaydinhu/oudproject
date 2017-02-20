import java.util.ArrayList;

public class OnderdelenOpslag implements OpslagInterface{
	private String naam;
	private static ArrayList<Onderdelen> onderdelen = new ArrayList<Onderdelen>();
	private int ingedrukteKnop;
	public char[] getAlleBestellingen;

	public OnderdelenOpslag(String nm) {
		naam = nm;
	}

	/* (non-Javadoc)
	 * @see OpslagInterface#voegOnderdeelToe(Onderdelen)
	 */
	@Override
	public boolean voegAanOpslagToe(Object o) {

		onderdelen.add((Onderdelen) o);
		return true;

	}
	
	public static ArrayList<Onderdelen> getOpslag(){
		return onderdelen;
	}

	
	public void setIngedrukteKnop(int ik) {
		ingedrukteKnop = ik;
	}

	public boolean checkOpslag(){
		
		if (onderdelen == null){
			return false;
		}
		else return true;
	}
	
	public int getIngedrukteKnop() {
		return ingedrukteKnop;
	}

	public String getNaam() {
		return naam;
	}


	public String toString() {
		String s = "";
		for (Onderdelen b : onderdelen) {
			s += b + "\n";
		}
		return s;
	}




}
