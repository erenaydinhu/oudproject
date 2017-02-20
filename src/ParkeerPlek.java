import java.sql.Date;
import java.util.ArrayList;


public class ParkeerPlek {
	
	
	private int plekNr;
	private boolean isBeschikbaar;
	private ArrayList<java.util.Date> reservedDates = new ArrayList<java.util.Date>();
	
	private ArrayList<String> gereserveerdeKlanten = new ArrayList<String>();
	
	private static final String placeholderString = "null";
	public void voegGereserveerdePlaceholderToe(){
		gereserveerdeKlanten.add(placeholderString);
	}
	

	public ParkeerPlek(int pnr){
		plekNr = pnr;
	}
	
	public void setBeschikbaarheid(boolean bes){
		isBeschikbaar = bes;
		
	}
	

	public void voegDatumToe(java.util.Date datum){
		
		reservedDates.add(datum);
		
	}
	public boolean getBeschikbaarheid(java.util.Date gekozenDate){
		int beschikbaarheid = 0;
		
		for (int i = 0 ; i < reservedDates.size() ; i++){
			if (reservedDates.get(i) == gekozenDate)
					beschikbaarheid++;
					
		}
		if (beschikbaarheid >0){
				
				return false;
						}
		else return true;
		
	}
	
	
	
}

