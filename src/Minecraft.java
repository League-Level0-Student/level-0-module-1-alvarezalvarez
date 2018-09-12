import javax.swing.JOptionPane;

public class Minecraft {

	public static void main(String[] args) {

		int score = 0;
		String answer = JOptionPane
				.showInputDialog("What is the minimal amount of obsidian to create a nether portal?");

		if (answer.equalsIgnoreCase("10")||answer.equalsIgnoreCase("ten")) {

			score++; 
			JOptionPane.showMessageDialog(null, "You smart");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "You dumb");
		}
		
		String answer1 = JOptionPane
				.showInputDialog("Who is the creater of Minecraft?");

		if (answer1.equalsIgnoreCase("Notch")) {

			score++;
			JOptionPane.showMessageDialog(null, "You smart");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "You dumb");
		}
		
		
		
		
		
		
		
		
			JOptionPane.showMessageDialog(null, "Your score is " +score);
			
		}
	}

