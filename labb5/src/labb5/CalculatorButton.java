package labb5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * Abstract calculator button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
abstract class CalculatorButton extends JButton {
	
	private static final long serialVersionUID = 1L;
	/**
	 * The size of CalculatorButton
	 */
	public static final int SIZE = 50;
	private static final int BORDER_WIDTH = 5;
	private Situation situation;
	
	/**
	 * 
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public CalculatorButton(String text, Situation situation) {
		super(text);
		this.setPreferredSize(new Dimension(SIZE, SIZE));
		this.setBackground(Color.WHITE);
		this.setColor(Color.GRAY);
		this.setFont(new Font("Arial", Font.PLAIN, 18));
		this.addActionListener(new ButtonListener(this));
		this.situation = situation;
	}
	
	/**
	 * 
	 * @return an instanece of Situation
	 */
	public Situation getSituation() {
		return situation;
	}
	
	/**
	 * Invoked when the button is pressed
	 */
	public abstract void transition();
	
	/**
	 * Sets the color of the button
	 * @param color an instance of Color
	 */
	public void setColor(Color color) {
		this.setBorder(BorderFactory.createLineBorder(color, BORDER_WIDTH));
	}
	
	@Override
	public String toString() {
		return getText();
	}
	
	private class ButtonListener implements ActionListener {

		private CalculatorButton button;
		
		/**
		 * 
		 * @param button An instance of CalculatorButton
		 */
		public ButtonListener(CalculatorButton button) {
			this.button = button;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			button.transition();
		}
		
	}
}
