package labb5;

/**
 * Digit button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
public class DigitButton extends CalculatorButton {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates a digit button with text and a situation
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public DigitButton(String text, Situation situation) {
		super(text, situation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transition() {
		switch (getSituation().getState()) {
		case Input1:
		case Input2:
			if (getSituation().getDisplay().getText() == "0") {
				getSituation().getDisplay().setText(this.toString());
			} else {
				getSituation().getDisplay().setText(getSituation().getDisplay().getText() + this.toString());				
			}
			break;
		case OpReady:
			getSituation().setState(State.Input2);
			getSituation().setLeftOperand(Integer.parseInt(getSituation().getDisplay().getText()));
			getSituation().getDisplay().setText(this.toString());
			break;
		case HasResult:
			getSituation().setState(State.Input1);
			getSituation().getDisplay().setText(this.toString());
			break;
		}
	}
	
}
