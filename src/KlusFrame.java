import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



import javax.swing.*;

public class KlusFrame extends JFrame implements ActionListener {

	private JButton bt1, bt2, terug;

	private String datum = "11/11/1994";
	private String datum2 = "22/11/1993";
	private Werkplaats deWerkplaats;
	private Opslag deOpslag;

	public KlusFrame(Werkplaats deWerkplaats, Opslag deOpslag) {
		this.deOpslag = deOpslag;
		this.deWerkplaats = deWerkplaats;
		setLayout(new FlowLayout());

		bt1 = new JButton("Nieuwe Klus");
		add(bt1);
		bt1.addActionListener(this);
		bt2 = new JButton("Huidige Klussen");
		add(bt2);
		bt2.addActionListener(this);
		
		

		terug = new JButton("terug");
		add(terug); terug.addActionListener(this);
		
		setSize(300, 100);
		setTitle("Klussen");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bt1) {

			NieuweKlusFrame nk = new NieuweKlusFrame(deWerkplaats, deOpslag);
			super.dispose();

		}
		if (e.getSource() == bt2) {

			String s = deWerkplaats.toString();
			JOptionPane.showMessageDialog(null, s, "Druk op OK",
					JOptionPane.PLAIN_MESSAGE);

		}
		if(e.getSource() == terug){
			this.dispose();
			HoofdFrame hf = new HoofdFrame(deOpslag, deWerkplaats);
			
		}
	}

}
