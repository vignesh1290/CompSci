package card;

public class Card {

	protected String name;

	public Card() {
		name = "";
	}
	public Card(String n) {

		name = n;
	}
	public String getName() {
		return name;
	}
	public boolean isExpired() {
		return false;
	}
	public String format() {
		return "Card holder: " + name;
	}
	public boolean equals(Card a) {
		if (a.getName()==this.name) {
			return true;
			
		}
		else{return false;}
	}
}