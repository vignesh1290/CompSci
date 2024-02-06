package rpgsimu;

public class Creature {

	protected double Level;
	protected boolean State = true;

	public Creature() {
		this.Level = 0;

	}

	public Creature(double Level) {
		this.Level = Level;
	}

	public double getLevel() {
		return Level;
	}

}