package dailyproblems;

public class SEPT08 {	
	
	public static int fact(int n) 
    { 
        int res = 1, i; 
        for (i=2; i<=n; i++) 
            res *= i; 
        return res; 
    } 
	public static void main(String[] args) {
		int n = 6;
		int i = n / 2;
		int j = n % 2;
		int count = 0;
		while(i>0) {
			count = count + fact(i+j)/(fact(i)*fact(j));
			i--;
			j++;
			j++;
		}
		count++;// for adding all 1 condition
		System.out.println(count);
	}
}
