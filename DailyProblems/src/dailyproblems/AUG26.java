package dailyproblems;
public class AUG26 {
	    static class ListNode{
		int data;
		ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		ListNode head;
		public void push(int new_data) {
			ListNode new_node = new ListNode(new_data);
			new_node.next = head;
			head = new_node;
	}
		public void display(ListNode head) {
			ListNode temp = head;
			while (temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		public void sum(ListNode l1, ListNode l2) {
			int sum = 0,carry=0;
			ListNode temp = null;
			ListNode res = null;
			ListNode prev = null;
			while(l1!=null || l2!=null) {
				sum = carry + (l1!=null?l1.data:0) + (l2!=null?l2.data:0);
				carry = (sum>=10) ? 1 : 0;
				sum = sum%10;
				temp = new ListNode(sum);
				if(res==null) {
					res = temp; 
				}
				else {
					prev.next = temp; 
				}
				 prev = temp; 
				if(l1!=null) {
					l1 = l1.next;
				}
				if(l2!=null) {
					l2 = l2.next;
				}
			}
			if(carry>0) {
				temp.next = new ListNode(carry);
			}
			display(res);
		}
}
	public static void main(String[] args) {
			ListNode l1 = new ListNode(3);
			ListNode l2 = new ListNode(4);
			ListNode temp = l1;
			l1.push(3);
			l1.push(4);
			l1.push(2);
			l2.push(4);
			l2.push(6);
			l2.push(5);
			temp.sum(l1.head,l2.head);
		}
}
