//    Copyright (c) The league of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int Y=	new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(Y);
	// 4. Get the user to enter a question for the 8 ball
	String A= 	JOptionPane.showInputDialog("Enter a question.");
	// 5. If the random number is 0
	if (A.equals("0") ) {
		JOptionPane.showMessageDialog(null, "Do you England?");
	}		
	// -- tell the user "Yes"

	// 6. If the random number is 1
	if (A.equals("1")) {
		JOptionPane.showMessageDialog(null, "You're a wizard stupid!");
	}
	// -- tell the user "No"

	// 7. If the random number is 2
	if (A.equals("2")) {
		JOptionPane.showMessageDialog(null, "No you!");
	}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
		if (A.equals("3")) {
			JOptionPane.showMessageDialog(null, "Can you words?");
		}
	// -- write your own answer

}
}