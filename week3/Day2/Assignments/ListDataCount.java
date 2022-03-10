package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.List;

public class ListDataCount {

	public static void main(String[] args) {
		int count = 0;
		List<String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlies");
		list.add("James");
		list.add("Ben");
		list.add("Adam");
		list.add("Geogre");
		list.add("Adam");
		System.out.println(list);
		for (int i = 0; i <= list.size()-1; i++) {
			if(list.get(i).contains("Adam")) {
				count = count+1;
			}
		}
		System.out.println("Count of given name in list is : "+count);
	}
}
