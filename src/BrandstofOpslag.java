import java.util.ArrayList;

public class BrandstofOpslag implements OpslagInterface {
	private String naam;
	private static ArrayList<Brandstof> brandStoffen = new ArrayList<Brandstof>();
	private int ingedrukteKnop;
	public char[] getAlleBestellingen;

	public BrandstofOpslag(String nm) {
		naam = nm;
	}

	/* (non-Javadoc)
	 * @see OpslagInterface#voegOnderdeelToe(Onderdelen)
	 */
	@Override
	public boolean voegAanOpslagToe(Object o) {

		brandStoffen.add((Brandstof) o);
		return true;

	}
	
	public static ArrayList<Brandstof> getOpslag(){
		return brandStoffen;
	}

	
	public void setIngedrukteKnop(int ik) {
		ingedrukteKnop = ik;
	}

	public boolean checkOpslag(){
		
		if (brandStoffen == null){
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
		for (Brandstof b : brandStoffen) {
			s += b + "\n";
		}
		return s;
	}






}