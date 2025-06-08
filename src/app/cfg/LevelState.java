package app.cfg;

public enum LevelState {
	OFF(0),
	LOW(1),
	MEDIUM(2),
	HIGH(3);
	
	final int level;
	
	private LevelState(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
}
