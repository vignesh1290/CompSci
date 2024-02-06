package card;

public class IDCard extends Card{
	int IDNumber;
	public IDCard(String n, int id) {
		super(n);
		IDNumber=id;
		
	}
	public String format() {
		String name = super.getName();
		return name+":"+" "+IDNumber;
		
	}
	
	
}
