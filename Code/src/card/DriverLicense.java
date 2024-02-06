package card;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DriverLicense extends Card{
	int ExpirationYear;
	public DriverLicense(String n, int exp) {
		super(n);
		ExpirationYear=exp;
	}
	public String format() {
		String name = super.getName();
		return name+":"+" "+ExpirationYear;
		
	}
	public boolean isExpired() {
		GregorianCalendar calendar = new GregorianCalendar();
		if (ExpirationYear<8calendar.get(Calendar.YEAR)) {
		return true;
		}
		else {return false;}
		
	}
	
	
}
