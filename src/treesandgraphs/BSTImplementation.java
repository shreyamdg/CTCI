package treesandgraphs;

public class BSTImplementation {
	class Node {
		Node left, right;
		int data;

		Node(int val) {
			this.data = val;
		}

		Node root;

		public void insert(Node root, int val) {
			if (val <= root.data) {
				if (root.left == null) {
					root.left = new Node(val);
				} else {
					root.left.insert(root, val);
				}
			} else {
				if (root.right == null) {
					root.right = new Node(val);
				} else {
					root.right.insert(root, val);
				}
			}
		}

		public boolean contains(Node root, int val) {
			if (val == root.data) {
				return true;
			} else if (val < root.data) {
				if (root.left == null) {
					return false;
				} else {
					root.left.contains(root, val);
				}
			} else {
				if (root.right == null) {
					return false;
				} else {
					root.right.contains(root, val);
				}
			}
			return false;
		}

		public void printInOrder() {
			if (root.left != null) {
				root.left.printInOrder();
			}

			System.out.println(root.data);

			if (root.right != null) {
				root.right.printInOrder();
			}
		}

		public void printPreOrder() {
			System.out.println(root.data);

			if (root.left != null) {
				root.left.printInOrder();
			}

			if (root.right != null) {
				root.right.printInOrder();
			}
		}

		public void printPostOrder() {
			if (root.left != null) {
				root.left.printInOrder();
			}

			if (root.right != null) {
				root.right.printInOrder();
			}

			System.out.println(root.data);
		}

		public Node deleteNode(Node root, int val) {
			if (root == null) {
				return root;
			}

			if (val < root.data) {
				root.left = deleteNode(root.left, val);
			} else if (val > root.data) {
				root.right = deleteNode(root.right, val);
			} else {
				if (root.left == null)
					return root.right;
				else if (root.right == null)
					return root.left;

				root.data = minValue(root.right);

				root.right = deleteNode(root.right, root.data);
			}

			return root;
		}

		int minValue(Node root) {
			int minv = root.data;
			while (root.left != null) {
				minv = root.left.data;
				root = root.left;
			}
			return minv;
		}
	}
}
