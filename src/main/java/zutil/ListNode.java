package main.java.zutil;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public static ListNode generateList(int[] nums) {
		ListNode head = new ListNode(nums[0]);
		ListNode temp = head;
		for (int i = 1; i < nums.length; i++) {
			temp.next = new ListNode(nums[i]);
			temp = temp.next;
		}
		return head;
	}

	public String printNode() {
		String result = String.valueOf(val);
		ListNode node = next;
		while (node != null) {
			result += " -> " + node.val;
			node = node.next;
		}
		return result;
	}

	public String toString() {
		return printNode();
	}
}
