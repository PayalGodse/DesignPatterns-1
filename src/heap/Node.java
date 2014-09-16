package heap;

public class Node<T> {

	private T data;
	private Node<T> left;
	private Node<T> right;

	public Node() {

	}

	@SuppressWarnings("unchecked")
	public Node(T data) {
		this.left = (Node<T>) NullNode.getInstance();
		this.right = (Node<T>) NullNode.getInstance();
		this.data = data;
	}

	public boolean smallerDepth() {
		if (this.left.isNull())
			return true;
		else if (this.right.isNull())
			return false;
		else {
			if ((this.left).getHeight() <= (this.right).getHeight())
				return true;
			return false;
		}

	}

	public int height(Node<T> n) {
		if (n == null)
			return 0;
		int lHeight = height(n.left);
		int rheight = height(n.right);

		int height = 1 + Math.max(lHeight, rheight);

		return height;
	}

	public Node<T> getLeft() {
		return left;
	}

	public Node<T> getRight() {
		return right;
	}

	public T getData() {
		return data;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public void setData(T data) {
		this.data = data;

	}

	public int getHeight() {

		int lHeight = height(this.left);
		int rheight = height(this.right);

		int height = 1 + Math.max(lHeight, rheight);

		return height;

	}

	/*
	 * Compare nodes compares data stored in node i) returns 0 if both values
	 * are same ii) returns negative integer if first value is less than second
	 * value iii) returns positive integer if first value is greater than 1
	 */

	public int compareNodes(Node<T> otherNode) {
		return (this.data.toString().compareTo(otherNode.data.toString()));
	}

	public String toString() {
		return data.toString();
	}

	public boolean isNull() {
		return false;
	}
}
