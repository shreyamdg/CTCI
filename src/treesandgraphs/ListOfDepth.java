package treesandgraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepth {
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
	
	ArrayList<LinkedList<TreeNode>> depthListUsingPreOrder(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		depthListUsingPreOrder(root, lists, 0);
		return lists;
	}
}
