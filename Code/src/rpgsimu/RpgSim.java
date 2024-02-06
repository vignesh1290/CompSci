package rpgsimu;

public class RpgSim {

	public static void main(String[] args) {
		Hero Jesse = new Hero(40); //Hero level 40     
		Monster Walter = new Monster(12); //monster level 12
		Jesse.attack(Walter);
		System.out.print(Walter.State);
		Npc Gus = new Npc();
		Gus.voiceline();
		Walter.attack(Jesse);

	}
}