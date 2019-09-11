package dailyproblems;

import java.util.HashSet;
import java.util.Set;

public class SEPT02 {
	
	public static boolean solution(int arr[],int k) {
		Set<Integer> s = new HashSet<Integer>();
		for(Integer i:arr) {
			int remaining = k - i;
			if(s.contains(remaining)) {
				return true;
			}
			s.add(i);
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {4, 7, 1 , -3, 2};
		int k = 5;
		System.out.println(solution(arr,k));
	}
}
