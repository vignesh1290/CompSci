package card;

public class CallingCard extends Card{
	int CardNumber;
	int PIN;
	public CallingCard(String n, int pin, int cardnum) {
		super(n);
		PIN=pin;
		CardNumber=cardnum;
		
	}
	public String format() {
		String name = super.getName();
		return name+":"+" "+CardNumber+", "+PIN;
		
	}
	public int getNumber() {
		return CardNumber;
	}
	
		
	public boolean equals(CallingCard a) {
		if(this.CardNumber==a.getNumber()) {
			return true;
		}
		else {return false;}
	}
	
	
}
