package dailyproblems;

public class AUG30 {
	public static void solution(int arr[],int len,int num) {
		int start = 0;
		int end = len-1;
		int mid =0;
		int index[] = new int[2];
		
		
		//last
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid] == num) {
				index[1] = mid;
				start = mid +1;
			}
			else if(arr[mid] > num) {
				end = mid-1;
			}
			else if(arr[mid] < num ) {
				start = mid+1;
			}
		}
		
		// first
		start = 0;
	    end = len-1;
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid]==num) {
				index[0]=mid;
				end = mid -1;
			}
			else if(arr[mid] > num) {
				end = mid-1;
			}
			else if(arr[mid] < num ) {
				start = mid+1;
			}
		}
		System.out.println("first "+index[0]+"   last "+index[1]);
	}
	public static void main(String[] args) {
		int arr[] = {1,2,4,15,15,15,15,69,87};
		solution(arr,arr.length,15);
	}
}
