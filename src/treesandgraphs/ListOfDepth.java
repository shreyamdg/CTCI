package treesandgraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepth {
	// Using pre order tree traversal:
	
	ArrayList<LinkedList<TreeNode>> depthListUsingPreOrder(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		depthListUsingPreOrder(root, lists, 0);
		return lists;
	}
	
	void depthListUsingPreOrder(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
		if(root == null) return;
		LinkedList<TreeNode> newLevel = null;
		if(lists.size() == level) {
			newLevel = new LinkedList<TreeNode>();
			lists.add(newLevel);
		}else {
			newLevel = lists.get(level);
		}
		newLevel.add(root);
		depthListUsingPreOrder(root.left, lists, level+1);
		depthListUsingPreOrder(root.right, lists, level+1);
	}
	
	// using breadth first search algorithm:
	ArrayList<LinkedList<TreeNode>> depthListUsingBFS(TreeNode root){
		ArrayList<LinkedList<TreeNode>> results = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if(root != null) {
			current.add(root);
		}
		
		while(current.size() > 0) {
			results.add(current);
			LinkedList<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();
			for(TreeNode node : parents) {
				if(node.left != null) {
					current.add(node.left);
				}
				if(node.right != null) {
					current.add(node.right);
				}
			}
		}
		
		return results;
	}
}
