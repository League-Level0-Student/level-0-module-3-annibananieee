package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
	main
	String input = JOptionPane.showInputDialog("you are going on a adventure! are you gonna start by stealing a car or stealing a bike?");
		if(input.equals("steal a bike")/("bike")) {
			 JOptionPane.showMessageDialog(null, "oh no! the bike was to slow and you got in trouble for stealing it!");
		}
			 if(input.equals("steal a car")/("car")) {
					String input1 = JOptionPane.showInputDialog("Congrats you got awayyyy! ok now, do you want to skip town or rob 7/11 first?");
					if(input1.equals("rob 7/11")) {
						 JOptionPane.showMessageDialog(null,"Yayyy you got chips and got the cashier to join youuuu!!");
			if(input1.equals("skip town")) {
				JOptionPane.showMessageDialog(null,"you r so hungry and lonely you go back to town to eat but you get cought and go to jail for 10 years :(");
			}
				
					}
				

		}
}
