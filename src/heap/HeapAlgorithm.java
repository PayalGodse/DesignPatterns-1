package heap;

import java.util.Iterator;

public class HeapAlgorithm<T> {

	private Heap<T> heapAlgorithm;

	public HeapAlgorithm(Heap<T> heapAlgorithm) {
		this.heapAlgorithm = heapAlgorithm;
	}

	public void setAlgorithm(Heap<T> heapAlgorithm) {
		this.heapAlgorithm = heapAlgorithm;
	}

	public void add(T data) {
		heapAlgorithm.add(data);
	}

	public String toString() {
		return heapAlgorithm.toString();
	}

	public int size() {
		return heapAlgorithm.size();
	}

	public Iterator<T> iterator() {
		return heapAlgorithm.iterator();
	}

	@SuppressWarnings("hiding")
	public <T> T[] toArray(T[] heapArray) {
		return heapAlgorithm.toArray(heapArray);
	}
}
