package zipreaders;
import java.io.*;
import java.util.Scanner;
public class zipreader {
	public static void main(String[] args) throws FileNotFoundException {
		File zip = new File("C:\\Users\\zwart\\eclipse-workspace\\Code\\src\\zipreaders\\zip.txt");
		Scanner reader = new Scanner(zip);
		

		while(reader.hasNextLine())  {
			Scanner linescanner = new Scanner(reader.nextLine());
			String x = reader.nextLine();
			String y="";
			
			while(! x.matches("\\d{3}-\\d{3}.*")) {
				x=linescanner.next();
				if(x.matches("\\d{3}.*")) {
					 y= x;
				}
				else {
					 y="";
				}
				
				
			}
			System.out.print(y+" "+x+"... ");
		}
	}
}
