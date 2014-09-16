package heap;

import java.util.Iterator;

public class IngHeapDecorator<T> {
	private Heap<T> heapObject;
	private static int count = 0;

	public IngHeapDecorator(Heap<T> heap) {
		this.heapObject = heap;
	}

	public boolean add(T data) {
		if (data.toString().endsWith("ing"))
			count++;
		return heapObject.add(data);
	}

	public int size() {
		return count;
	}

	public String toString() {
		String result = "";
		Iterator<T> iterate = heapObject.iterator();
		IngFilter<T> ingFilter = new IngFilter<>(iterate);
		while (ingFilter.hasNext()) {
			String data = ingFilter.next().toString();
			result = result + " " + data;

		}
		return result;
	}

	@SuppressWarnings({ "unchecked" })
	public T[] toArray(T[] heapArray) {
		Iterator<T> iterate = heapObject.iterator();
		IngFilter<T> ingFilter = new IngFilter<>(iterate);
		int j = 0;
		while (ingFilter.hasNext()) {
			String data = ingFilter.next().toString();
			heapArray[j++] = (T) data;

		}
		return heapArray;
	}
}
