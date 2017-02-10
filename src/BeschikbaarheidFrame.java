import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.*;

public class BeschikbaarheidFrame extends JFrame implements ActionListener {
	private JButton bt1, bt2, bt3;
	private JLabel lb1, lb2;
	private JTextField txf1;
	private java.util.Date plandatum;
	private Werkplaats deWerkplaats;
	private ParkeerPlaats deParkeerPlaats;
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	private Opslag deOpslag;

	public BeschikbaarheidFrame(Opslag deOpslag, Werkplaats deWerkplaats,
			ParkeerPlaats deParkeerPlaats) {
		this.deOpslag = deOpslag;
		this.deWerkplaats = deWerkplaats;
		this.deParkeerPlaats = deParkeerPlaats;
		setLayout(new FlowLayout());

		lb1 = new JLabel("Geef datum voor beschikbaarheid ");
		add(lb1);

		lb2 = new JLabel("\n voorbeeld: 2010-12-31");
		add(lb2);

		txf1 = new JTextField(10);
		add(txf1);

		bt1 = new JButton("Reserveer");
		add(bt1);
		bt1.addActionListener(this);

		/*
		 * bt2 = new JButton("test"); add(bt2); bt2.addActionListener(this);
		 */

		bt3 = new JButton("Terug");
		add(bt3);
		bt3.addActionListener(this);

		setSize(300, 200);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) {

			try {
				plandatum = formatter.parse(txf1.getText());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			deParkeerPlaats.planParkeerReservering(plandatum);
		

		}

		/*
		 * if(e.getSource() == bt2 ){
		 * 
		 * }
		 */

		if (e.getSource() == bt3) {
			HoofdFrameParkeergarage hfp = new HoofdFrameParkeergarage(deOpslag,
					deWerkplaats, deParkeerPlaats);
			hfp.setVisible(true);
			this.dispose();

		}

	}

}
