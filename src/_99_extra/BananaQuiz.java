
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog("do you like bananas?");
		
		//2. if they say no, 
		if(answer.equals("no")) {
			JOptionPane.showMessageDialog(null,"you're crazy");
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		if(answer.equals("yes")) {
			String answer1 = JOptionPane.showInputDialog("what's your favorite hobby?" );
			JOptionPane.showMessageDialog(null, answer1 + " is much better with bananas");
		}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
			else {
				JOptionPane.showMessageDialog(null, "you are bananas!");
			}

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	

		
	}

}
