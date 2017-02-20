import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class NieuweKlusFrame extends JFrame implements ActionListener {

	private JPanel p1, p2, p3;
	private ArrayList<JLabel> labelList = new ArrayList<JLabel>();
	private JButton bt3;
	private JTextField txf1, txf2;
	private JLabel lb1, lb2, lb3, lb4;
	private String datum = "2004-03-04";
	private String datum2 = "2005-05-22";
	private Werkplaats deWerkplaats;
	private Opslag deOpslag;
	private ArrayList<JTextField> textfieldList = new ArrayList<JTextField>();
	private JComboBox kiesLijst = new JComboBox();
	private ArrayList<String> monteurList = new ArrayList<String>();
	private ArrayList<Integer> gekozenHoeveelheid = new ArrayList<Integer>();
	private ArrayList<Onderdelen> gekozenOnderdelen = new ArrayList<Onderdelen>();

	private Color c1 = new Color(0, 0, 0, 0);
	private Border thickBorder = new LineBorder(c1, 5);

	public NieuweKlusFrame(Werkplaats deWerkplaats, Opslag deOpslag) {
		this.deWerkplaats = deWerkplaats;
		this.deOpslag = deOpslag;
		setLayout(new FlowLayout());

		String s = deOpslag.toString();
		String[] parts = s.split("@");

		for (int i = 0; i < deWerkplaats.monteurSize(); i++) {
			monteurList.add(deWerkplaats.getMonteurNaam(i));
			System.out.println(deWerkplaats.getMonteurNaam(i));

		}

		String[] monteurArray = monteurList.toArray(new String[monteurList
				.size()]);

		for (String str : monteurArray) {
			kiesLijst.addItem(str);
		}
		
		
		kiesLijst.setSelectedIndex(monteurList.size() - 2);
		
		
		kiesLijst.addActionListener(this);

		txf1 = new JTextField(5);
		txf2 = new JTextField(5);
		lb1 = new JLabel();
		lb2 = new JLabel();
		lb3 = new JLabel();
		lb4 = new JLabel();
		bt3 = new JButton("OK");

		p3 = new JPanel();
		add(p3);
		p3.setPreferredSize(new Dimension(300, 100));
		p3.setBackground(Color.GRAY);
		p1 = new JPanel();
		add(p1);
		p1.setPreferredSize(new Dimension(300, 110));
		p1.setBackground(Color.GRAY);
		p2 = new JPanel();
		add(p2);
		p2.setPreferredSize(new Dimension(50, 110));
		p2.setBackground(Color.GRAY);
		for (int i = 0; i < 3; i++) {

			labelList.add(new JLabel());
			textfieldList.add(new JTextField(2));
			p1.add(labelList.get(i));
			p2.add(textfieldList.get(i));
			labelList.get(i).setBorder(thickBorder);
			textfieldList.get(i).setBorder(thickBorder);

		}

		for (int i2 = 0; i2 < 3; i2++) {
			System.out.println(parts[i2] + "test");

			if (labelList.get(i2) != null || parts[i2] != null) {
				labelList.get(i2).setText(parts[i2] + "\n");
			}
		}
		System.out.println(parts);
		p3.add(lb3);
		lb3.setText("Voer datums in naar voorbeeld:  (yyyy-MM-dd)");
		p3.add(lb1);
		lb1.setText("Begindatum");
		p3.add(txf1);
		datum = txf1.getText();
		p3.add(lb2);
		lb2.setText("Einddatum");
		p3.add(txf2);
		datum2 = txf2.getText();

		p3.add(lb4);
		lb4.setText("Kies monteur: ");
		p3.add(kiesLijst);
		p3.add(bt3);
		bt3.addActionListener(this);

		setSize(500, 300);
		setTitle("Nieuwe Klus");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bt3) {

			datum = txf1.getText();
			datum2 = txf2.getText();

			for (int i = 0; i < textfieldList.size(); i++) {

				if (textfieldList.get(i) != null) {
                  System.out.println(textfieldList.get(i).getText() + "TEST");
                  int testint = Integer.parseInt(textfieldList
							.get(i).getText());
					gekozenHoeveelheid.add(testint);
					gekozenOnderdelen.add(deOpslag.getOnderdeel(i));

				}

			}

			Integer[] integerArray = gekozenHoeveelheid
					.toArray(new Integer[gekozenHoeveelheid.size()]);
			Onderdelen[] onderdelenArray = gekozenOnderdelen
					.toArray(new Onderdelen[gekozenOnderdelen.size()]);

			new ArrayList<Integer>(gekozenHoeveelheid);

			int monteurInteger = kiesLijst.getSelectedIndex();
			System.out.println(datum + "TESTDATUM");
			try {
				deWerkplaats.addAlleKlussen(new Klus(datum, datum2,
						deWerkplaats.getMonteur(monteurInteger), integerArray, onderdelenArray));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			KlusFrame kf = new KlusFrame(deWerkplaats, deOpslag);
			super.dispose();
		}

	}
}
