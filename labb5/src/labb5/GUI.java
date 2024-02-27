package labb5;

import java.awt.Canvas;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame{

	JPanel canvas = new JPanel();
	GridBagConstraints layout = new GridBagConstraints();
	
	//Container myPane = canvas.getContentPane();
    //myPane.setLayout(new GridBagLayout());
	
	public static void main(String args[]){
	       JFrame frame = new JFrame();
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JButton button = new JButton("Press");
	       FlowLayout flow_layout = new FlowLayout();
	       frame.getContentPane().add(button); // Adds Button to content pane of frame
	       frame.setVisible(true);
	       
	    }
}
