package week1.Assignment4;

public class IntersectionArray {

	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,7,5};
		int[] b = {1,2,18,4,9,7,11};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					int c = a[i];
					System.out.println(c);
				}
			}
		}
	}
}
