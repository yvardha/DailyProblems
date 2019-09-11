package dailyproblems;

public class SEPT03 {
	public static void main(String[] args) {
		int arr[] = {4, 3, 2, 4, 1, 3, 2};
		int res = arr[0];
		for(int i=1;i<arr.length;i++) {
			// for using O(1) time complexity we use XOR condition
			res = res ^ arr[i];
		}
		System.out.println(res);
	}
}
