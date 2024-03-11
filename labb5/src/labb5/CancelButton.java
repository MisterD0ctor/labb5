package labb5;

import java.awt.Color;

/**
 * Cancel button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
public class CancelButton extends CalculatorButton {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates an cancel button with text and a situation
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public CancelButton(String text, Situation situation) {
		super(text, situation);
	}

	@Override
	public void transition() {
		switch (getSituation().state) {
		case Input1:
			getSituation().display.setText("0");
			break;
		case OpReady:
			getSituation().state = State.Input1;
			getSituation().display.setText("0");
			getSituation().binaryOperator.setColor(Color.GRAY);
			break;
		case Input2:
			getSituation().state = State.Input1;
			getSituation().display.setText("0");
			getSituation().binaryOperator.setColor(Color.GRAY);
			break;
		case HasResult:
			getSituation().state = State.Input1;
			getSituation().display.setText("0");
			break;
		}
	}

}
