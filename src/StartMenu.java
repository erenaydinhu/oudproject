import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StartMenu extends JFrame implements ActionListener {
	private JButton bt1, bt2;
	private JLabel lb1;
	private Opslag deOpslag;
	private int gedaan;
	private Werkplaats deWerkplaats;
	private ParkeerPlaats deParkeerPlaats;
	Opslag b = new Opslag("opslag 1");

	public StartMenu(Opslag deOpslag, Werkplaats deWerkplaats,
			ParkeerPlaats deParkeerPlaats) {
		this.deOpslag = deOpslag;
		this.deWerkplaats = deWerkplaats;
		this.deParkeerPlaats = deParkeerPlaats;
		setLayout(new FlowLayout());

		lb1 = new JLabel("Maak uw keuze");
		add(lb1);

		bt1 = new JButton("ATD beheer");
		add(bt1);
		bt1.addActionListener(this);

		bt2 = new JButton("Parkeergarage beheer");
		add(bt2);
		bt2.addActionListener(this);

		Opslag b = new Opslag("Opslag 1");
		Werkplaats w = new Werkplaats();
		ParkeerPlaats p = new ParkeerPlaats();

		deOpslag = b;
		deWerkplaats = w;
		deParkeerPlaats = p;

		if (gedaan == 0) {
			p.voegParkeerPlekToe(new ParkeerPlek(1));
			p.voegParkeerPlekToe(new ParkeerPlek(2));
			p.voegParkeerPlekToe(new ParkeerPlek(3));
			p.voegParkeerPlekToe(new ParkeerPlek(4));
			Onderdelen r1 = new Onderdelen(12345678, 10);
			b.voegOnderdeelToe(r1);
			Onderdelen r2 = new Onderdelen(13578642, 15);
			b.voegOnderdeelToe(r2);
			b.voegOnderdeelToe(new Onderdelen(33444555, 25));
			Monteur monteur1 = new Monteur("jan", "reparaties");
			Monteur monteur2 = new Monteur("piet", "reparaties");
			w.voegMonteurToe(monteur1);
			w.voegMonteurToe(monteur2);

			gedaan++;
		}

		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Start menu");

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) {
			HoofdFrame hf = new HoofdFrame(deOpslag, deWerkplaats);
			this.dispose();

		}
		if (e.getSource() == bt2) {
			HoofdFrameParkeergarage hfp = new HoofdFrameParkeergarage(deOpslag,
					deWerkplaats, deParkeerPlaats);
			hfp.setVisible(true);
			this.dispose();
		}

	}

}
