package labb5;

class DigitButton extends CalculatorButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DigitButton(String text, Situation situation) {
		super(text, situation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transition() {
		getSituation().display.setText(getSituation().display.getText() + getText());
	}
	
}
