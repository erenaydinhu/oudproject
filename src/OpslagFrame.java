import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class OpslagFrame extends JFrame implements ActionListener {

	private ArrayList<JLabel> labelList = new ArrayList<JLabel>();
	private ArrayList<JButton> buttonList = new ArrayList<JButton>();
	private JPanel p1, p2;
	private Opslag deOpslag;
	Date c = new Date();
	private Werkplaats deWerkplaats;
	private int ingedrukteKnop;
	private JButton bt1, bt2;
	private Color c1 = new Color(0, 0, 0, 0);
    private Border thickBorder = new LineBorder(c1, 5);
    
    
    
    
	public OpslagFrame(Opslag deOpslag, Werkplaats deWerkplaats) {
		setLayout(new FlowLayout());
		this.deOpslag = deOpslag;
		this.deWerkplaats = deWerkplaats;
		String s = deOpslag.toString();
		String[] parts = s.split("@");


		p1 = new JPanel();
		add(p1);
		p1.setPreferredSize(new Dimension(300, 500));

		p2 = new JPanel();
		add(p2);
		p2.setPreferredSize(new Dimension(120, 500));


		
		for (int i = 0; i < 4; i++) {

			buttonList.add(new JButton());
			labelList.add(new JLabel());
			p1.add(labelList.get(i));
			p1.add(labelList.get(i));
			labelList.get(i).setBorder(thickBorder);
		
		
		}
		buttonList.remove(3);

		for (int i2 = 0; i2 < (parts.length - 1); i2++) {
			System.out.println(parts[i2] + "test");

			if(labelList.get(i2) != null || parts[i2] != null){
			labelList.get(i2).setText(parts[i2] + "\n");
		}}

		// for (JLabel lb : labelList){
		// lb.setFont(myFont);
		// }

		for (JButton btn : buttonList) {
			btn.setText("BESTEL");
			p2.add(btn);
			btn.addActionListener(this);
		}

		bt1 = new JButton("BESTELLINGEN");
		p2.add(bt1);
		bt1.addActionListener(this);

		bt2 = new JButton("Sluiten"); p2.add(bt2);
		bt2.addActionListener(this);
		
		setSize(450, 200);
		setTitle("Opslag en Bestellingen");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

	
if (e.getSource() == bt1){
	 String s = deOpslag.bestellingsInformatie();
	 
	 if (s.contains("Bestelling")){
	 
	 JOptionPane.showMessageDialog(null, s, "Druk op OK",
		 JOptionPane.PLAIN_MESSAGE);}
	 else{
		 s = "Geen bestellingen momenteel";
		 JOptionPane.showMessageDialog(null, "geen bestellingen beschikbaar", "Druk op OK",
				 JOptionPane.PLAIN_MESSAGE);
	 }
	 
	 
} else if(e.getSource() == bt2){
	super.dispose();
	HoofdFrame hf = new HoofdFrame(deOpslag, deWerkplaats);
	hf.setVisible(true);
	
}else{
	
	int i3 = buttonList.indexOf(e.getSource());
	ingedrukteKnop = i3;
	deOpslag.setIngedrukteKnop(ingedrukteKnop);
	BestellingsFrame bf = new BestellingsFrame(deOpslag);
	bf.setVisible(true);
	
}
	}

	// public int getNummer (){

	// int i = deOpslag.getNummer(ingedrukteKnop);

	// return i;

	// }

	public int getingeGedrukteKnop() {

		return ingedrukteKnop;
	}

	public void setDeOpslag(Opslag b) {
		deOpslag = b;
	}

}