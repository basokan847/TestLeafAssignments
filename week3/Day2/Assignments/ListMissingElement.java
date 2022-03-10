package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMissingElement {

	public static void main(String[] args) {
		List<Integer> text1 = new ArrayList<Integer>();
		text1.add(1);
		text1.add(2);
		text1.add(3);
		text1.add(4);
		text1.add(7);
		text1.add(6);
		text1.add(8);
		System.out.println("Size of given array is : "+text1.size());
		System.out.println("List value is : "+text1);
		Collections.sort(text1);
		System.out.println("Sorted list value is : "+text1);
		for (int i = 1; i <= text1.size(); i++) {
			if(i!=text1.get(i-1)) {
				System.out.println("Missing Element in the list is : "+i);
				break;
			}
		}
	}
}
