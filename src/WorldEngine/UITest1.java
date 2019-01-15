package WorldEngine;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.net.*;
public class UITest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		JFrame frame = new JFrame();
		JDialog dialog = new JDialog();
		JLabel label1 = new JLabel();
		JOptionPane pane = new JOptionPane();
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("UI Test 1");
		JOptionPane.showMessageDialog(null, "You've been Gnomed... Owo", "Gnomifier" , JOptionPane.ERROR_MESSAGE);
		System.out.println("Enjoy being gnomed?");
		frame.setVisible(true);
	}

}
