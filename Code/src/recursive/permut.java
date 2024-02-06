package recursive;

import java.util.*;

public class permut {
	public static void main(String[] args) {
		ArrayList<Integer> tempList= permut.makeList(12);
		if (tempList.size()==0) {
			System.out.println("The list is empty");
		}
		else {
			for (Integer i: tempList) {
				System.out.println(i);
			}
		}
	
	}
	public static ArrayList<Integer> makeList(int n){
		ArrayList<Integer> tempList = null;
		if (n<=0) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			return list;
		}
		else {
			tempList= makeList(n-1);
			tempList.add(n);
			return tempList;
		}
	}
}
