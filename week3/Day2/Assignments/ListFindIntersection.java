package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.List;

public class ListFindIntersection {

	public static void main(String[] args) {
		List<Integer> text1 = new ArrayList<Integer>();
		text1.add(3);
		text1.add(2);
		text1.add(11);
		text1.add(4);
		text1.add(6);
		text1.add(7);
		System.out.println(text1);
		List<Integer> text2 = new ArrayList<Integer>();
		text2.add(1);
		text2.add(2);
		text2.add(8);
		text2.add(4);
		text2.add(9);
		text2.add(7);
		System.out.println(text2);
		for (int i = 0; i <= text1.size()-1; i++) {
			for (int j = 0; j <= text2.size()-1; j++) {
				if(text1.get(i).equals(text2.get(j))) {
					System.out.println("First intersected array is : "+text2.get(j));
					//break;
				}
			}
		}
	}
}
