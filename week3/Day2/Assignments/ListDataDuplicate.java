package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.List;

public class ListDataDuplicate {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlies");
		list.add("James");
		list.add("Ben");
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					System.out.println("Duplicate name is : "+list.get(i));
					break;
				}
			}
		}
	}
}
