package app.cfg;

public enum SwitchState {
	ON(true),
	OFF(false);
	
	final boolean state;
	
	private SwitchState(boolean state) {
		this.state = state;
	}
	
	public boolean getSwitch() {
		return state;
	}
	
	public SwitchState toggleSwitch() {
		if (this == ON) {
			return OFF;
		} else {
			return ON;
		}
	}
}