package labb5;

import java.awt.Color;

/**
 * Equals button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
public class EqualsButton extends CalculatorButton {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates an equals button with text and a situation
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public EqualsButton(String text, Situation situation) {
		super(text, situation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transition() {
		switch (getSituation().getState()) {
		case Input1:
			break;
		case OpReady:
			break;
		case Input2:
			getSituation().setState(State.HasResult);
			getSituation().getBinaryOperator().setColor(Color.GRAY);
			switch (getSituation().getBinaryOperator().toString()) {
			case "+":
				getSituation().getDisplay().setText(Integer.toString(getSituation().getLeftOperand() + getDisplayInt()));
				break;
			case "-":
				getSituation().getDisplay().setText(Integer.toString(getSituation().getLeftOperand() - getDisplayInt()));
				break;
			case "*":
				getSituation().getDisplay().setText(Integer.toString(getSituation().getLeftOperand() * getDisplayInt()));
				break;
			case "/":
				if (getDisplayInt() == 0) {
					System.out.println("Cannot divide by zero!");
				} else {
					getSituation().getDisplay().setText(Integer.toString(getSituation().getLeftOperand() / getDisplayInt()));					
				}
				break;
			}
			break;
		case HasResult:
			break;
		}
	}

	private int getDisplayInt() {
		return Integer.parseInt(getSituation().getDisplay().getText());
	}
	
}
