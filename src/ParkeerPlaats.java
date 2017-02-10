import java.sql.Date;
import java.util.ArrayList;


public class ParkeerPlaats {
	
	private ArrayList<ParkeerPlek> deParkeerPlek = new ArrayList<ParkeerPlek>();
	
	public ParkeerPlaats(){
		
	}
	
	public void voegParkeerPlekToe(ParkeerPlek p){
		
		deParkeerPlek.add(p);
	}
	
	public void planParkeerReservering(java.util.Date datum){
		int stop = 0;
	for ( int i = 0; i < deParkeerPlek.size(); i++ ){
		System.out.println("TEST");
		if (deParkeerPlek.get(i).getBeschikbaarheid(datum) == true && stop == 0){
			
			deParkeerPlek.get(i).voegDatumToe(datum);
			stop++;
		}
	}

	}
	}
