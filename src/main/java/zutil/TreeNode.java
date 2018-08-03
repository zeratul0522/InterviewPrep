package main.java.zutil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	public static TreeNode generateTreeWithBFS(Integer[] bfs) {
		if (bfs == null || bfs.length == 0)
			return null;

		Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
		TreeNode root = new TreeNode(bfs[0]);
		nodeQueue.offer(root);
		boolean hasAssignedLeftChild = false;
		for (int i = 1; i < bfs.length; i++) {
			TreeNode node = (bfs[i] == null) ? null : new TreeNode(bfs[i]);
			nodeQueue.add(node);
			if (!hasAssignedLeftChild) {
				nodeQueue.peek().left = node;
			}
			else {
				nodeQueue.remove().right = node;
				while (!nodeQueue.isEmpty() && nodeQueue.peek() == null)
					nodeQueue.remove();
			}
			hasAssignedLeftChild = !hasAssignedLeftChild;
		}
		return root;
	}

	public List<Integer> breadthFirstSearchWithNull() {
		List<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(this);
		while (!queue.isEmpty()) {
			TreeNode node = queue.remove();
			if (node != null) {
				list.add(node.val);
				queue.offer(node.left);
				queue.offer(node.right);
			}
			else {
				list.add(null);
			}
		}

		// Remove 'null' in the end
		int index = list.size();
		while (index - 1 >= 0 && list.get(index - 1) == null)
			index--;
		for (int i = list.size() - 1; i >= index; i--)
			list.remove(index);
		return list;
	}

	public List<Integer> preoderTraversalWithNull() {
		List<Integer> list = new ArrayList<Integer>();
		preoderTraversalWithNull(list, this);

		// Remove 'null' in the end
		int index = list.size();
		while (index - 1 >= 0 && list.get(index - 1) == null)
			index--;
		for (int i = list.size() - 1; i >= index; i--)
			list.remove(index);
		return list;
	}

	private void preoderTraversalWithNull(List<Integer> resultList, TreeNode node) {
		if (node != null) {
			resultList.add(node.val);
			if (node.left != null) {
				preoderTraversalWithNull(resultList, node.left);
				if (node.right == null)
					resultList.add(null);
			}
			if (node.right != null) {
				if (node.left == null)
					resultList.add(null);
				preoderTraversalWithNull(resultList, node.right);
			}
		}
	}

	public List<Integer> inorderTraversal() {
		List<Integer> list = new ArrayList<Integer>();
		inorderTraversal(list, this);
		return list;
	}

	private void inorderTraversal(List<Integer> resultList, TreeNode node) {
		if (node != null) {
			if (node.left != null)
				inorderTraversal(resultList, node.left);
			resultList.add(node.val);
			if (node.right != null)
				inorderTraversal(resultList, node.right);
		}
	}
}
