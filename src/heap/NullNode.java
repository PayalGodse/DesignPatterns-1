package heap;

public class NullNode<T> extends Node<T> {
	private static Node<Object> uniqInstance;

	private NullNode() {
	}

	public int getHeight() {
		return 0;
	}

	public int height(Node<T> n) {
		return 0;
	}

	public boolean isNull() {
		return true;
	}

	public static NullNode<Object> getInstance() {
		if (uniqInstance == null) {
			uniqInstance = new NullNode<>();
		}
		return (NullNode<Object>) uniqInstance;
	}
}
