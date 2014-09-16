package heap;

import java.util.Iterator;
import java.util.LinkedList;

public class HeapIterators<T> implements Iterator<T> {
	private LinkedList<Node<T>> childNodes;

	HeapIterators(Node<T> root) {
		childNodes = new LinkedList<>();
		if (!root.isNull())
			childNodes.add(root);
	}

	@Override
	public boolean hasNext() {
		return !childNodes.isEmpty();
	}

	@Override
	public T next() {
		@SuppressWarnings("unchecked")
		Node<T> rootNode = (Node<T>) NullNode.getInstance();
		if (!childNodes.isEmpty()) {
			rootNode = childNodes.remove();
			if (!rootNode.getRight().isNull())
				childNodes.addFirst(rootNode.getRight());
			if (!rootNode.getLeft().isNull())
				childNodes.addFirst(rootNode.getLeft());

		}
		return rootNode.getData();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}
}
