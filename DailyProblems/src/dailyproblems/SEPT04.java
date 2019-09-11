package dailyproblems;

public class SEPT04 {
	public static void main(String[] args) {
		int arr[] = {5,1,3,2,5};
		int count = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
					count++;
				}
		}
		if(count<=1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
