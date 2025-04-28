package ext.basics;

public class SortingTwoPointerOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 5, 7, 11, 13 };

		System.out.println(sortELement(arr));
		
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	public static int[] sortELement(int[] arr) {

		int s = 0, e = arr.length - 1;
		
		int[] n = new int[arr.length];

		while (s < e) {
			System.out.println("HERE");
			
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
			
		}
		return arr;
	}

}
