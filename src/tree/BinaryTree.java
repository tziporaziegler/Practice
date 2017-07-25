package tree;

public class BinaryTree {

	private Node root;

	public void insertWithWhile(int key) {
		Node newNode = new Node(key, String.valueOf(key));

		if (root == null) {
			root = newNode;
		}
		else {
			Node parent = root;

			while (true) {
				if (key < parent.key) {
					if (parent.leftChild == null) {
						parent.leftChild = newNode;
						return;
					}

					parent = parent.leftChild;
				}
				else {
					if (parent.rightChild == null) {
						parent.rightChild = newNode;
						return;
					}

					parent = parent.rightChild;
				}
			}
		}
	}

	public void insertWithRecursion(int key) {
		Node newNode = new Node(key, String.valueOf(key));

		if (root == null) {
			root = newNode;
		}
		else {
			insertRecursion(root, newNode);
		}
	}

	private void insertRecursion(Node parent, Node newNode) {
		if (newNode.key < parent.key) {
			if (parent.leftChild == null) {
				parent.leftChild = newNode;
				return;
			}
			insertRecursion(parent.leftChild, newNode);
		}
		else {
			if (parent.rightChild == null) {
				parent.rightChild = newNode;
				return;
			}
			insertRecursion(parent.rightChild, newNode);
		}
	}

	public String inOrderTraveral() {
		StringBuilder builder = new StringBuilder();

		inOrderTraversalRecursion(root, builder);

		return builder.toString();
	}

	private void inOrderTraversalRecursion(Node focus, StringBuilder builder) {
		if (focus != null) {
			inOrderTraversalRecursion(focus.leftChild, builder);

			builder.append(focus.key);
			builder.append(" ");

			inOrderTraversalRecursion(focus.rightChild, builder);
		}
	}

	public String preOrderTraveral() {
		StringBuilder builder = new StringBuilder();

		preorderTraversalRecursion(root, builder);

		return builder.toString();
	}

	private void preorderTraversalRecursion(Node focus, StringBuilder builder) {
		if (focus != null) {
			builder.append(focus.key);
			builder.append(" ");

			preorderTraversalRecursion(focus.leftChild, builder);

			preorderTraversalRecursion(focus.rightChild, builder);
		}
	}

	public String postOrderTraveral() {
		StringBuilder builder = new StringBuilder();

		postOrderTraversalRecursion(root, builder);

		return builder.toString();
	}

	private void postOrderTraversalRecursion(Node focus, StringBuilder builder) {
		if (focus != null) {
			postOrderTraversalRecursion(focus.leftChild, builder);

			postOrderTraversalRecursion(focus.rightChild, builder);

			builder.append(focus.key);
			builder.append(" ");
		}
	}

	public Node findNode(int value) {
		return findNodeRecursion(value, root);
	}

	public Node findNodeRecursion(int value, Node node) {
		if (node == null) {
			return null;
		}

		if (node.key == value) {
			return node;
		}
		if (value < node.key) {
			return findNodeRecursion(value, node.leftChild);
		}
		return findNodeRecursion(value, node.rightChild);
	}

	public boolean remove(int value) {
		return removeRecursion(value, root, null, true);
	}

	private boolean removeRecursion(int value, Node focus, Node parent, boolean isLeftChild) {
		if (focus == null) {
			return false;
		}

		if (focus.key == value) {

			//TODO replace node
			/*if (parent == null) {
				root = null;
			}
			else {
				if(isLeftChild && parent.lef)
				
				Node smallestNode = focus;
				
				while(smallestNode.leftChild != null){
					smallestNode = smallestNode.leftChild;
				}

				focus.rightChild.leftChild = focus.leftChild;
				parent.rightChild = focus.rightChild;
			}*/

			return true;
		}

		if (value < focus.key) {
			return removeRecursion(value, focus.leftChild, focus, true);
		}

		return removeRecursion(value, focus.rightChild, focus, false);
	}
}