package heap;

import java.util.Iterator;

public class IngFilter<T> {
	private Iterator<T> iterate;
	private T next;

	public IngFilter(Iterator<T> input) {
		iterate = input;
		getNext();

	}

	private void getNext() {
		boolean gotNext = false;
		while ((!gotNext) && (iterate.hasNext())) {
			next = iterate.next();
			if (next.toString().endsWith("ing")) {
				gotNext = true;
			}
		}
		if (!gotNext)
			next = null;
	}

	public boolean hasNext() {
		return next != null;
	}

	public T next() {
		T current = next;
		getNext();
		return current;
	}

}