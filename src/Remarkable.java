import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
String userName = JOptionPane.showInputDialog("Give your name!");
if(userName.equals("Matt")) {
	JOptionPane.showMessageDialog(null, "Is super tall");
}
	else if(userName.equals("Cathy")) {
	JOptionPane.showMessageDialog(null, "Can kind of draw");	
	}
	else if(userName.equals("Gabriel")) {
		JOptionPane.showMessageDialog(null, "Can not draw");	
		}
	else if(userName.equals("Timmy")) {
		JOptionPane.showMessageDialog(null, "Loves cats");	
		}
	else if(userName.equals("My")) {
		JOptionPane.showMessageDialog(null, "Can't draw either");
		}
	else if(userName.equals("JC")) {
		JOptionPane.showMessageDialog(null, "Can kind of draw too");	
		}
}
}
