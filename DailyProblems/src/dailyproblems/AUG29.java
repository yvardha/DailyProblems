package dailyproblems;

import java.util.Stack;

public class AUG29 {	

	public static boolean solution(String str) {
		Stack<Character>  s1 = new Stack<Character>();
		int len = str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i) =='{'|| str.charAt(i) == '['|| str.charAt(i) =='(') {
				s1.push(str.charAt(i));
			}
			else {
				if(s1.isEmpty())   //   Handling empty stack exception;
					return false;
				
				char val = s1.pop();
				
				if(str.charAt(i)==')') {
					if(val == '(')
						continue;
				}
				else if(str.charAt(i)=='}') {
					if(val == '{')
						continue;
				}
				else if(str.charAt(i)==']') {
					if(val == '[')
						continue;
				}
				s1.push(val);
			}
		}
		return s1.isEmpty();
	}
	public static void main(String[] args) {
		
		String str = "(()))";
		System.out.println(solution(str));
	}
}
