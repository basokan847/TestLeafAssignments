package week1.Assignment4;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,8,6,5};
		// Print the length of array
		System.out.println("Length of Array : "+a.length);
		Arrays.sort(a);
		// print the sorted value of array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// Missing number in array
		for (int i = 0; i < a.length; i++) {
			int j = i+1;
			if(j!=a[i]) {
				System.out.println("Missing number in Array is : "+j);
				break;
			}
		}
	}
}
