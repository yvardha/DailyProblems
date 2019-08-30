package dailyproblems;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;

public class AUG27 {
	
	public static int solution(String str) {
		int len= 0;
		Stack<Integer> s = new Stack<Integer>();
		int count = 0;
		int length = str.length();
		Hashtable<Character,Integer> t = new Hashtable<Character, Integer>();
		
		
		for(int i = 0;i<length;i++) {
			if(t.containsKey(str.charAt(i))) {
				int val=0;
				s.push(len);
				len = i+1;
				val = t.get(str.charAt(i));
				len = len-val;
				t.replace(str.charAt(i),i+1);
				
			}else {
				t.put(str.charAt(i),i+1);
				len++;
	
			}
		}
		s.push(len);
		return len;
	}
	public static void main(String[] args) {
		String str = "abrkaabcdefghijjxxx";
		System.out.println(solution(str));
	}
}
