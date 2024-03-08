package labb5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Abstract calculator button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
abstract class CalculatorButton extends JButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int SIZE = 50;
	private Situation situation;
	
	/**
	 * 
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public CalculatorButton(String text, Situation situation) {
		super(text);
		this.setPreferredSize(new Dimension(SIZE, SIZE));
		//this.setBackground(Color.GRAY);
		this.setFont(new Font("Arial", Font.PLAIN, 14));
		this.addActionListener(new ButtonListener(this));
		this.situation = situation;
	}
	
	/**
	 * 
	 * @return An instanece of Situation
	 */
	protected Situation getSituation() {
		return situation;
	}
	
	/**
	 * Invoked when the button is pressed
	 */
	public abstract void transition();
	
	public void setColor(Color color) {
		this.setColor(color);;
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
			System.out.println(e);
			button.transition();
		}
		
	}
}
