import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

public class HoofdFrame extends JFrame implements ActionListener {

	private JButton bt1, bt2, bt3, bt4, bt5, bt6;
	private int gedaan = 0;
	private Opslag deOpslag;
	private Werkplaats deWerkplaats;
	private Afreken hetBedrag;

	public HoofdFrame(Opslag deOpslag, Werkplaats deWerkplaats) {
		this.deOpslag = deOpslag;
		this.deWerkplaats = deWerkplaats;
		setLayout(new FlowLayout());

		bt1 = new JButton("Opslag en Bestellingen");
		add(bt1);
		bt1.addActionListener(this);
		bt2 = new JButton("Klussen");
		add(bt2);
		bt2.addActionListener(this);
		bt3 = new JButton("Afrekenen");
		add(bt3); bt3.addActionListener(this);
		
		bt4 = new JButton("factuur");
		add(bt4); bt4.addActionListener(this);
		
		bt5 = new JButton("klant aanwezigheid controleren");
		add(bt5); bt5.addActionListener(this);
		
		bt6 = new JButton("Terug");
		add(bt6); bt6.addActionListener(this);
		
     
		setSize(300, 200);
		setTitle("Hoofdscherm");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {

		// ****** Als je iets nieuws wilt toevoegen, maak een knop aan in de
		// HoofdFrame en open daarmee de JFrame waarmee je wilt werken
		// **********

		if (e.getSource() == bt1) {

			OpslagFrame of = new OpslagFrame(deOpslag, deWerkplaats);
			of.setVisible(true);
		
           super.dispose();
		}

		if (e.getSource() == bt2) {

			KlusFrame kf = new KlusFrame(deWerkplaats,deOpslag);
			kf.setVisible(true);
			super.dispose();

		}
	//	if(e.getSource() == bt3){
		//	AfrekenFrame af = new AfrekenFrame(hetBedrag);
	//		af.setVisible(true);
	//		super.dispose();
			
		}
	}


