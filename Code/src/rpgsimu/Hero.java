package rpgsimu;

public class Hero extends Creature implements PCinterface {
	public Hero(double Level) {
		super(Level);
	}

	public void attack(Creature Opp) {
		if (State == true) {
			if (this.Level > Opp.getLevel()) {
				Level += Opp.getLevel();
				Opp.State = false;
			} else {
				State = false;
			}
		} else {
			System.out.print("death noises*");
		}

	}
}