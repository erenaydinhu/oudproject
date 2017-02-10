import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

public class BestellingsFrame extends JFrame implements ActionListener {

	private JLabel lb1;
	private JLabel lb2;
	private JTextField txf1;
	private JButton bt1;
	private Opslag deOpslag;
	private Date c = new Date();
	private Calendar aankomstdatum = Calendar.getInstance();
	private int hoeveelheid;

	public BestellingsFrame(Opslag deOpslag) {
		this.deOpslag = deOpslag;

		setLayout(new FlowLayout());

		String s = deOpslag.toString();
		String[] parts = s.split("0");


		
		lb1 = new JLabel();
		add(lb1);
		lb2 = new JLabel();
		add(lb2);
		txf1 = new JTextField(6);
		add(txf1);
		bt1 = new JButton("Bestel");
		add(bt1);
		bt1.addActionListener(this);
		lb1.setText("Bestelling voor productnummer " + deOpslag.getNummer());

	
		
		
		setSize(300, 100);
		setVisible(true);
		setTitle("Bestelling aanmaken");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {

		if (txf1.getText() != null) {
			hoeveelheid = Integer.parseInt(txf1.getText());
		}

		if (e.getSource() == bt1) {

			deOpslag.addAlleBestellingen(new Bestelling(deOpslag.getNummer(),
					hoeveelheid, aankomstdatum));
			System.out.println(hoeveelheid);
			System.out.println(deOpslag.getNummer());
			super.dispose();
		}
	}
}