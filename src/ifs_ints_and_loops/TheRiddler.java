package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equalsIgnoreCase("A candle")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 6. Add some more riddles
		String answer2 = JOptionPane.showInputDialog("What has hands but can not clap?");
		if (answer2.equalsIgnoreCase("A clock")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		String answer3 = JOptionPane.showInputDialog("What has a head and a tail, but no body? ");
		if (answer3.equalsIgnoreCase("a coin")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		String answer4 = JOptionPane.showInputDialog("What can you catch but not throw? ");
		if (answer4.equalsIgnoreCase("a cold")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		String answer5 = JOptionPane.showInputDialog("Imagine you are in a dark room. How do you get out? ");
		if (answer5.equalsIgnoreCase("stop imagining ")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
	}
}
