package calculator.state;

import javax.swing.JLabel;

import calculator.buttons.BinOpButton;

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
	 * Gets the state
	 * @return an instance of State
	 */
	public State getState() {
		return state;
	}
	
	/**
	 * Sets the state
	 * @param state an instance of state
	 */
	public void setState(State state) {
		this.state = state;
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
	
	/**
	 * Gets the left operand
	 * @return an instance if int
	 */
	public int getLeftOperand() {
		return leftOperand;
	}
	
	/**
	 * Sets left operand
	 * @param leftOperand an instance of int
	 */
	public void setLeftOperand(int leftOperand) {
		this.leftOperand = leftOperand;
	}
	
}
