import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MaandOverzichtFrame extends JFrame implements ActionListener {
	private JButton bt1, bt2, bt3;
	private JLabel lb1, lb2;
	private JTextField tf1;
	private Werkplaats deWerkplaats;
	private ParkeerPlaats deParkeerPlaats;
	private Opslag deOpslag;

	public MaandOverzichtFrame(Opslag deOpslag, Werkplaats deWerkplaats,
			ParkeerPlaats deParkeerPlaats) {
		this.deOpslag = deOpslag;
		this.deWerkplaats = deWerkplaats;
		this.deParkeerPlaats = deParkeerPlaats;
		setLayout(new FlowLayout());

		lb1 = new JLabel("Overzicht parkeergarage afgelopen maand");
		add(lb1);

		lb2 = new JLabel("Hier komt het overzicht van de afgelopen maand.");
		add(lb2);

		bt1 = new JButton("Print");
		add(bt1);
		bt1.addActionListener(this);

		// bt2 = new JButton("test");
		// add(bt2); bt2.addActionListener(this);

		bt3 = new JButton("Terug");
		add(bt3);
		bt3.addActionListener(this);

		setTitle("Overzicht parkeergarage van afgelopen maan");
		setSize(300, 200);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) {
			JOptionPane.showMessageDialog(null, "under construction");
			// print de ding
		}
		if (e.getSource() == bt2) {

		}
		if (e.getSource() == bt3) {
			HoofdFrameParkeergarage hfp = new HoofdFrameParkeergarage(deOpslag,
					deWerkplaats, deParkeerPlaats);
			hfp.setVisible(true);
			this.dispose();

		}

	}

}
