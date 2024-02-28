package labb5;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GUI extends JFrame{
	private JPanel canvas;
	private Container myPane;
	private JLabel display;
	private JPanel keypad;
	private JButton[] button = new JButton[16]; 
	
	public GUI () {
 
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints layoutConstraints = new GridBagConstraints();
		
		this.canvas = new JPanel();
		this.display = new JLabel("thing");
		this.keypad = new JPanel();
		//canvas.setLayout(layout);
		canvas.add(display);
		canvas.add(keypad);
		keypad.setLayout(new GridLayout(4,4,3,3));
		layout.columnWidths = new int []{50, 50, 50, 50, 50};
		layout.rowHeights = new int[] {50, 50, 50, 50};
		//layoutConstraints.gridwidth = 4;
		//layoutConstraints.gridheight = 4;
		
		
		int index = 0;
		
		//i = index från botten uppåt
		for (int i = 2; i > -1; i--) {
			//k = index från vänster till höger
			for(int k = 1; k < 5; k++) {
				
			this.button[index] = new JButton(Integer.toString(k + i*3));
			keypad.add(button[index]);
			
			index++;
				if (k == 4) {
					
				}
			}
			
		}
				
		
		
		setVisible(true);
		pack();
	}

    //myPane.setLayout(new GridBagLayout());

	public static void main(String args[]){
		   
	       GUI frame = new GUI();
	       
	       Container myPane = frame.getContentPane();
	       myPane.setLayout(new GridBagLayout());
	       
	       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	       frame.setSize(600, 600);
	       //frame.setBackground(Color.black);
	       //frame.canvas.setSize(250,500);
	       frame.canvas.setOpaque(true);
	       
	       
	       frame.display.setVisible(true);
	      
	       myPane.add(frame.display); // Adds Button to content pane of frame
	       frame.setVisible(true);
	       myPane.setVisible(true);
	       
	       myPane.add(frame.keypad);
	       frame.keypad.setVisible(true);
	       
	       
	       //for (int i = 0; i < 16; i++) {
	    	   //frame.keypad.add(frame.keypad.getComponent(i));
	    	   
	    	   //frame.button[i].setVisible(true);
			//}
	       
	       


   }
}
