
package proj;

import java.io.File;

public class FileNamePrinter {

	public static void traverseDir(File dir) {
			File[] files = dir.listFiles();

			if (files != null) {

				for (final File file : files) {
					traverseDir(file);
					System.out.println(dir.getAbsoluteFile());

				}
			}
		
	}
}