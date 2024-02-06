package zipreaders;

import java.io.*;
import java.util.Scanner;

public class zipreadercopy {
	public static void main(String[] args) throws FileNotFoundException  {
		File zip = new File("C:\\Users\\zwart\\eclipse-workspace\\Code\\src\\zipreaders\\zip.txt");
		Scanner reader = new Scanner(zip);
		PrintWriter printer = new PrintWriter("C:\\Users\\zwart\\eclipse-workspace\\Code\\src\\zipreaders\\zip1.txt");
		String y = "";
		String z = "";
		String b= "";
		boolean found = false;
		
		while (reader.hasNextLine()) {
			String x = reader.nextLine();
			found = false;
			b= "";
			for (int i = 0; i < x.length(); i++) {

				for (int j = 0; j < 10; j++) {
					if (!found) {
						if (x.substring(i, i + 1).equals(String.valueOf(j))) {
							y = x.substring(i, x.length());
							Scanner yreader = new Scanner(y);
							while(yreader.hasNext()) {
								
								String a=yreader.next();
								if(a.length()<=3) {
								    b+= a+"-"+a+" ";
								}
								else {
									b+=a+" ";
									
								}
							}
							z = x.substring(0, i);
							z+=b;
							printer.println(z+" ");
							found = true;
						}
					}
				}
			}
		}
		printer.close();
	}
}
