/*
Reverse a singly linked list.
*/

public class Solution{
	public TreeNode reverseLinkedList(TreeNode head){
		ListNode cur = head;
		ListNode prev = null;
		
		while(cur != null){
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		
		return prev;
	}
}