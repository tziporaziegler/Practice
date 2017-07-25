package tree;

public class Node {

	public int key;
	
	//don't really need name, but good for testing things like find
	public String name;

	public Node leftChild;
	public Node rightChild;

	public Node(int key, String name) {
		this.key = key;
		this.name = name;
	}
}
