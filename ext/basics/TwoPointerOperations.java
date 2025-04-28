package ext.basics;

public class TwoPointerOperations {

	public static void main(String[] args) {

		int[] arr = { 1,5,7, 11, 13 };
		//int[] arr = { 1,2,3,4,5,6,67,7,78,8 };
		int target = 8;

		System.out.println(findSumElement(arr, target));

	}

//	public static boolean findSumElement(int[] arr, int target) {
//
//		int s = 0;
//		int e = arr.length - 1;
//
//		while (s < e) {
//			int sum = arr[s] + arr[e];
//
//			if (sum == target) {
//				System.out.println(" ELementssss --> " + arr[s] + " and " + arr[e]);
//				return true;
//			} else if (arr[s] + arr[e] < target) {
//				System.out.println("Here");
//				s++;
//			} else {
//				e--;
//			}
//		}
//		return false;
//
//	}
	
	
	public static boolean findSumElement(int[] arr, int target) {
		
		int s = 0, e = arr.length-1;
		
		while(s<=e) {
			int sum = arr[s] + arr[e];
			if(sum == target) {
				System.out.println("s-> "+s+"e -> "+e);
				return true;
			}else if(sum < target)
				s++;
			else
				e--;
		}
		return false;
	}
}
