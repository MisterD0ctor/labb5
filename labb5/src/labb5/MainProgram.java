package labb5;
import java.awt.Container;

import javax.swing.WindowConstants;

import labb5.GUI;

public class MainProgram {

	public static void main (String arg[]) {
		GUI frame = new GUI();
		
		Container myPane = frame.getContentPane();
		//myPane.setLayout(new GridBagLayout());

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
