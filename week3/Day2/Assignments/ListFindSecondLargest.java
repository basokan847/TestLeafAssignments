package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListFindSecondLargest {

	public static void main(String[] args) {
		Set<Integer> text1 = new LinkedHashSet<Integer>();
		text1.add(3);
		text1.add(2);
		text1.add(11);
		text1.add(4);
		text1.add(6);
		text1.add(7);
		System.out.println("Original list value is : "+text1);
		List<Integer> text2 = new ArrayList<Integer>(text1);
		Collections.sort(text2);
		System.out.println("After sorted the original list value : "+text2);
		System.out.println("Second largest value in given list is : "+text2.get(text2.size()-2));
	}
}
