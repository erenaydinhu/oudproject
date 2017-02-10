import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;


public class PinContantFrame extends JFrame implements ActionListener{
	private JLabel lb1;
	private JButton bt1, bt2;
	
	public PinContantFrame(){
		
		setLayout(new FlowLayout());
		
		
		lb1 = new JLabel("Contant of pinnen?");
		add(lb1); 
		
		bt1 = new JButton("Pinnen");
		add(bt1); bt1.addActionListener(this);
		
		bt2 = new JButton("Contant");
		add(bt2); bt2.addActionListener(this);
		
		setSize(300, 100);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == bt1){
			this.dispose();
			
		}
		
	}

}
