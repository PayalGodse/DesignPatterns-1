package heap;

import java.util.Iterator;

public class MinHeap<T> extends Heap<T> {
	private Node<T> root;
	private int noOfNodes;

	@SuppressWarnings("unchecked")
	public MinHeap() {
		root = (Node<T>) NullNode.getInstance();
	}

	public String toString() {
		return toString(root);
	}

	private String toString(Node<T> rootNode) {
		String result = "";
		Iterator<T> iterate = iterator();
		while (iterate.hasNext()) {
			String data = iterate.next().toString();
			result = result + " " + data;

		}
		return result;
	}

	/* Adjusts the values in heap according to min heap property */
	private void heapify(Node<T> newNode) {
		Node<T> focusNode = root;
		boolean nodeAdded = false;

		/* while loop executes till the new node is added to bottom of heap */
		while (!nodeAdded) {

			if (focusNode.compareNodes(newNode) <= 0) {

				if (focusNode.smallerDepth()) {

					if (!focusNode.getLeft().isNull()) {
						focusNode = focusNode.getLeft();

					} else {
						focusNode.setLeft(newNode);
						nodeAdded = true;
						noOfNodes++;
					}

				} else {

					if (!focusNode.getRight().isNull()) {
						focusNode = focusNode.getRight();
					} else {
						focusNode.setRight(newNode);
						nodeAdded = true;
						noOfNodes++;
					}
				}
			}

			else if (focusNode.compareNodes(newNode) > 0) {

				T swap = newNode.getData();
				newNode.setData(focusNode.getData());
				focusNode.setData(swap);
			}
		}

	}

	/* Add nodes to heap if existing else creates new heap */
	@Override
	public boolean add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (root.isNull()) {
			root = newNode;
			noOfNodes++;
		} else {
			heapify(newNode);
		}
		return true;
	}

	public int size() {
		return noOfNodes;
	}

	@Override
	public Iterator<T> iterator() {

		HeapIterators<T> it = new HeapIterators<>(root);
		return it;
	}

	@SuppressWarnings({ "unchecked", "hiding" })
	public <T> T[] toArray(T[] heapArray) {
		Iterator<T> iterate = (Iterator<T>) new HeapIterators<>(root);
		int i = 0;
		while (iterate.hasNext()) {
			T data = iterate.next();
			heapArray[i] = data;

		}
		return heapArray;
	}

	@Override
	public T element() {
		return root.getData();
	}

	@Override
	public T peek() {
		return root.getData();
	}

	@Override
	public boolean isEmpty() {
		return root.isNull();
	}

	@Override
	public Object[] toArray() {
		Object[] heapArray = new Object[size()];
		Iterator<T> iterate = (Iterator<T>) new HeapIterators<>(root);
		int i = 0;
		while (iterate.hasNext()) {
			T data = iterate.next();
			heapArray[i] = data;

		}
		return heapArray;
	}

	@Override
	public boolean contains(Object object) {
		Iterator<T> iterate = (Iterator<T>) new HeapIterators<>(root);
		boolean elementFound = false;
		while (iterate.hasNext()) {
			T data = iterate.next();
			if (data.equals(object))
				elementFound = true;

		}
		return elementFound;
	}
}