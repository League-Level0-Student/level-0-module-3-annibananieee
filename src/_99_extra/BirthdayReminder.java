
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "September 24th";
		String dadsBirthday = "June 1st";
		String myBirthday = "August 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String JOptionPane.showInputDialog("do you want to choose mom,dad or my birhtday?");
		if("mom") {
			System.out.println(momsBirthday);
		}
		if("dad") {
			System.out.println(dadsBirthday);
		}
		if("yours") {
			System.out.println(myBirthday);
		}
		else {
			JOptionPane.showMessageDialog("sorry i dont remember that persons birthday");
		}
	
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
