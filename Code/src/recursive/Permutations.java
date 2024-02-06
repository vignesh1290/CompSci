
package recursive;

import java.util.ArrayList;

/**
 * This program computes permutations of a string.
 */
public class Permutations {
	public static void main(String[] args) {
		for (String s : permutations("eat")) {
			System.out.println(s);
		}
	}

	public static ArrayList<String> permutations(String word) {
		ArrayList<String> result = new ArrayList<String>();
		if (word.length() == 0) {
			result.add(word);
			return result;
		} else {
			for (int i = 0; i < word.length(); i++) {
				String shorter = word.substring(0, i) + word.substring(i + 1);
				ArrayList<String> shorterPermutations = permutations(shorter);
				
				for (String s : shorterPermutations) {
					result.add(word.charAt(i) + s);
					System.out.println(" "+word.charAt(i) + s);
				}
			}
			return result;
		}
	}
}
