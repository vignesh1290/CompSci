package rpgsimu;

public class Monster extends Creature implements PCinterface {
	public Monster(double Level) {
		super(Level);
	}

	public void attack(Creature Opp) {
		if (State == true) {
			if (this.Level > Opp.getLevel()) {
				Opp.State = false;
			} else {
				State = false;
			}
		} else {
			System.out.print("death noises*");
		}
	}
}
