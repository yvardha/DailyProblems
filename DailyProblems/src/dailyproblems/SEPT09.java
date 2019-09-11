package dailyproblems;

import java.util.HashSet;
import java.util.Set;

public class SEPT09 {	
	public static void main(String[] args) {
		int arr[] = {3,5,12,5,13};
		Set<Integer> squares = new HashSet<Integer>();
		for(Integer i :arr) {
			squares.add(i*i);
		}
		int sum = 0 ;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum = (arr[i]*arr[i]) + (arr[j]*arr[j]);
				if(squares.contains(sum)) {
					System.out.println(true);
					return;
				}
			}
		}
		System.out.println(false);
	}
}
