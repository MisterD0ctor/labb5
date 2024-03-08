package labb5;

import java.awt.Color;

/**
 * Equals button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
class EqualsButton extends CalculatorButton {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public EqualsButton(String text, Situation situation) {
		super(text, situation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transition() {
		switch (getSituation().state) {
		case Input1:
			break;
		case OpReady:
			break;
		case Input2:
			getSituation().state = State.HasResult;
			getSituation().binaryOperator.setColor(Color.GRAY);
			switch (getSituation().binaryOperator.toString()) {
			case "+":
				getSituation().display.setText(Integer.toString(getSituation().leftOperand + getDisplayInt()));
				break;
			case "-":
				getSituation().display.setText(Integer.toString(getSituation().leftOperand - getDisplayInt()));
				break;
			case "*":
				getSituation().display.setText(Integer.toString(getSituation().leftOperand * getDisplayInt()));
				break;
			case "/":
				if (getDisplayInt() == 0) {
					
				}
				getSituation().display.setText(Integer.toString(getSituation().leftOperand / getDisplayInt()));
				break;
			}
			break;
		case HasResult:
			break;
		}
	}

	private int getDisplayInt() {
		return Integer.parseInt(getSituation().display.getText());
	}
	
}
