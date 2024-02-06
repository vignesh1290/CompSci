package card;

public class WalletTester {
	public static void main(String[] args) {
		CallingCard c1= new CallingCard("Vignesh",1234, 43214321);
		CallingCard c2= new CallingCard("Vignesh2",4321, 12342134);
		DriverLicense driver = new DriverLicense("Vignesh", 2022);
		System.out.println(driver.isExpired());
		Wallet wall= new Wallet();
		wall.addCard(c1);
		wall.addCard(c2);
	//	System.out.println(wall.format());
	}
}
