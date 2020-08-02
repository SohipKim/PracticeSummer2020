package assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SoheePhotoFrame {
	
	public static void main (String[] args)
	{
		
		Dimension dim = new Dimension(400,400);
		
		JFrame frame = new JFrame("Portait options selection");
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		JLabel Name = new JLabel("Sohee's Portaits");
		Name.setBounds(30, 10, 400, 50);
		Name.setFont(new Font("Arial", Font.BOLD, 30));
	
		JLabel Select = new JLabel("Select options");
		Select.setBounds(30, 60, 200, 30);
		Select.setFont(new Font("Arial", Font.BOLD, 15));
		
		ButtonGroup option1 = new ButtonGroup();
		
		JCheckBox one = new JCheckBox("One human subject",false);
		one.setBounds(30, 80, 400, 50);
		JCheckBox twoOrMore = new JCheckBox("Two or more human subject",false);
		twoOrMore.setBounds(30, 100, 400, 50);
		JCheckBox pet = new JCheckBox("Pet subject",false);
		pet.setBounds(30, 120, 400, 50);
		
		ButtonGroup option2 = new ButtonGroup();	
		
		JCheckBox location = new JCheckBox("On location",false);
		location.setBounds(30, 170, 400, 50);
		JCheckBox studio = new JCheckBox("In Studio",false);
		studio.setBounds(30, 190, 400, 50);
		
		JLabel line = new JLabel("----------------------------------------");
		line.setBounds(30, 220, 400, 50);
		
		JLabel fee = new JLabel("Portait fee");
		fee.setBounds(30, 250, 400, 50);

		
		JTextField feeResult = new JTextField("0");
		feeResult.setBounds(200, 265, 150, 20);
		feeResult.setEnabled(false);
	
		
		one.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			if(one.isSelected() == true)
				feeResult.setText(String.valueOf(Integer.valueOf(feeResult.getText())+50));
			
			else if(one.isSelected() == false)
				feeResult.setText(String.valueOf(Integer.valueOf(feeResult.getText())-50));
				
				
			}
		});
		
		twoOrMore.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
								
				if(twoOrMore.isSelected() == true)
					feeResult.setText(String.valueOf(Integer.valueOf(feeResult.getText())+75));	
				
				else if(twoOrMore.isSelected() == false)
					feeResult.setText(String.valueOf(Integer.valueOf(feeResult.getText())-75));
							
			}
		});
		
		pet.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
						
				if(pet.isSelected() == true)
					feeResult.setText(String.valueOf(Integer.valueOf(feeResult.getText())+100));
				
				else if(pet.isSelected() == false)
					feeResult.setText(String.valueOf(Integer.valueOf(feeResult.getText())-100));
				
			}
		});
			
		location.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				if(location.isSelected()==true)
				feeResult.setText(String.valueOf(Integer.valueOf(feeResult.getText())+150));
				
				else if(location.isSelected() == false)
					feeResult.setText(String.valueOf(Integer.valueOf(feeResult.getText())-150));
			}
		});
		
		studio.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				if(studio.isSelected()==true)
				feeResult.setText(String.valueOf(Integer.valueOf(feeResult.getText())+0));
			}
		});
			
		
		
		frame.add(Name);
		frame.add(Select);
		
		option1.add(one);
		option1.add(twoOrMore);
		option1.add(pet);
		
		option2.add(location);
		option2.add(studio);
		
		frame.add(one);
		frame.add(twoOrMore);
		frame.add(pet);
		
		frame.add(location);
		frame.add(studio);
		
		frame.add(line);
		frame.add(fee);
		frame.add(feeResult);
	
		
		
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		frame.pack();
		frame.setVisible(true);
		


		}

		
	}



