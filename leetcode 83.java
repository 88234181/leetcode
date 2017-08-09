/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution{
	public ListNode removeDuplicate(ListNode node){
		if(node == null || node.next == null) return node;
		
		ListNode nextNode = node.next;
		ListNode currentNode = node;
		
		while(nextNode != null){
			while(nextNode != null && currentNode.val == nextNode.val) nextNode = nextNode.next;
			currentNode.next = nextNode;
			currentNode = nextNode;
		}
		
		return node;
	}
}