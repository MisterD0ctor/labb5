package labb5;

import javax.swing.JLabel;

/**
 * The situation of a calculator
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
public class Situation {
	private State state = State.Input1;
	private JLabel display;
	private BinOpButton binaryOperator;
	private int leftOperand;
	
	/**
	 * Creates a situation with a display
	 * @param display an instance of JLabel
	 */
	public Situation(JLabel display) {
		this.display = display;
	}
	
	/**
	 * Gets the 
	 * @return an instance of State
	 */
	public State getState() {
		return state;
	}
	
	/**
	 * Gets the display
	 * @return an instance of JLabel
	 */
	public JLabel getDisplay() {
		return display;
	}
	
	/**
	 * Gets the binary operator
	 * @return an instance of BinOpButton
	 */
	public BinOpButton getBinaryOperator() {
		return binaryOperator;
	}
	
	/**
	 * Sets the binary operator
	 * @param binaryOperator an instance of BinOpButton
	 */
	public void setBinaryOperator(BinOpButton binaryOperator) {
		this.binaryOperator = binaryOperator;
	}
	
	public int getLeftOperand() {
		return leftOperand;
	}
	
	public void setLeftOperand(int leftOperand) {
		this.leftOperand = leftOperand;
	}
	
}
