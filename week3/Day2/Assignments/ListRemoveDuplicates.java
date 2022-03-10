package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListRemoveDuplicates {

	public static void main(String[] args) {
		//Input String
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Given original string is : "+text);
		
		//Convert string in to string array
		String[] split = text.split(" ");
		
		//Convert string Array to list
		List<String> list = Arrays.asList(split);
		System.out.println(list);
		
		//Convert list to set
		Set<String> slist = new LinkedHashSet<String>(list);
		System.out.println(slist);
		
		//Again convert set to list after removal of duplicate
		List<String> dupRemList = new ArrayList<String>(slist);
		System.out.println(dupRemList);
		
		//Again convert list to string array after removal of duplicate
		String[] string = new String[dupRemList.size()];
		for (int i = 0; i <= dupRemList.size()-1; i++) {
			string[i] = dupRemList.get(i);
		}
		
		//Again convert string array to string and display the output
		System.out.println("string after removal of duplicate is : ");
		for (String string2 : string) {
			System.out.print(string2+" ");
		}
	}
}
