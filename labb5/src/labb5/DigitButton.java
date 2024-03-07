package labb5;

/**
 * Digit button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
class DigitButton extends CalculatorButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public DigitButton(String text, Situation situation) {
		super(text, situation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transition() {
		switch (getSituation().state) {
		case Input1:
			if (getSituation().display.getText() == "0") {
				getSituation().display.setText(getText());
			} else {
				getSituation().display.setText(getSituation().display.getText() + getText());				
			}
			break;
		case OpReady:
			break;
		case Input2:
			break;
		case HasResult:
			break;
		}
	}
	
}
