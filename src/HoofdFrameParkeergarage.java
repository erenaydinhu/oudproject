import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HoofdFrameParkeergarage extends JFrame implements ActionListener {
	private JButton bt1, bt2, bt3;
	private JLabel lb1;
	private Werkplaats deWerkplaats;
	private ParkeerPlaats deParkeerPlaats;
	private Opslag deOpslag;

	// private BeschikbaarheidFrame deBeschikbaarheid;

	public HoofdFrameParkeergarage(Opslag deOpslag, Werkplaats deWerkplaats,
			ParkeerPlaats deParkeerPlaats) {
		this.deOpslag = deOpslag;
		this.deWerkplaats = deWerkplaats;
		this.deParkeerPlaats = deParkeerPlaats;
		setLayout(new FlowLayout());

		lb1 = new JLabel("Maak uw keuze");
		add(lb1);

		bt1 = new JButton("Parkeerplek reserveren");
		add(bt1);
		bt1.addActionListener(this);

		bt2 = new JButton("Overzicht afgelopen maand");
		add(bt2);
		bt2.addActionListener(this);

		bt3 = new JButton("Terug");
		add(bt3);
		bt3.addActionListener(this);

		setTitle("Parkeergarage Beheer");
		setSize(300, 200);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) {
			BeschikbaarheidFrame bhf = new BeschikbaarheidFrame(deOpslag,
					deWerkplaats, deParkeerPlaats);
			bhf.setVisible(true);
			this.dispose();
		}
		if (e.getSource() == bt2) {
			MaandOverzichtFrame mof = new MaandOverzichtFrame(deOpslag,
					deWerkplaats, deParkeerPlaats);
			mof.setVisible(true);
			this.dispose();

		}
		if (e.getSource() == bt3) {
			StartMenu sm = new StartMenu(deOpslag, deWerkplaats,
					deParkeerPlaats);
			sm.setVisible(true);
			this.dispose();
		}

	}

}
