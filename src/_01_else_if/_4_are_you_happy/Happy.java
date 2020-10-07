package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("are you happy?");
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
		}
		if (input.equals("no")) {
			String input2 = JOptionPane.showInputDialog("do you wanna be happy?");
			if (input2.equals("yes")) {
				JOptionPane.showMessageDialog(null, "then just be happy duh");
			}
			if (input.equals("no")) {
				JOptionPane.showMessageDialog(null, "keep doing what ur doing");

			}
		}
	}
}
