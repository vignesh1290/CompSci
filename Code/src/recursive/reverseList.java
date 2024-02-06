package recursive;

import java.util.*;

public class reverseList {
	
	public static ArrayList<Integer> evenlistmaker(ArrayList<Integer> w) {
		ArrayList<Integer> list = (ArrayList<Integer>) w.clone();
		ArrayList<Integer> List2= new ArrayList<Integer>();
		
		if (list.size()==2) {
			list.remove(0);
			return list;
		}
		else if (list.size()==1) {
			return list;
		}
		else if (list.size()==0) {
			return list;
		}
		else {
			int x= list.get(1);
			list.remove(0);
			list.remove(0);
			
			List2 = evenlistmaker(list);
			List2.add(0, x);
			return List2;
		}
		
		
		
		
	}
	
	
}
