package assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class TFacts {
	
	public static void main (String[] args)
	{
	
	String ch_item[] = {"Space smells like seared steak.",
			"Kids ask 300 questions a day.",
			"The total weight of ants on earth once equaled the total weight of people.",
			"Pringles aren't actually potato chips.",
			"Showers really do spark creativity." };
	
	Random random = new Random();
	
	Dimension dim = new Dimension(600,100);
	JFrame frame = new JFrame("TFacts");
	JFrame.setDefaultLookAndFeelDecorated(true);
	
	frame.setLocationRelativeTo(null);
	frame.getContentPane().setLayout(null);
	
		
	JButton button1 = new JButton("Press to change the fact");
	frame.add(button1);
	button1.setBounds(10, 10, 200, 30);		
	
	JLabel label1 = new JLabel(ch_item[0]);
	frame.add(label1);
	label1.setBounds(30, 30, 600, 50);
	
	
	ActionListener listener = new ActionListener()
	{
		int j = 0;
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			j++;
			
			label1.setText(ch_item[random.nextInt(5)]);
			
			if(j == 4)
			j = 0;
		}
	};	
	
	button1.addActionListener(listener);
	
	frame.setLocation(200, 400);
	frame.setPreferredSize(dim);
	
	frame.pack();
	frame.setVisible(true);

}
	
}
