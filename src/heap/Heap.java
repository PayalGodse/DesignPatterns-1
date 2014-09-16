package heap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public abstract class Heap<T> implements Queue<T> {

	public abstract boolean add(T data);

	public abstract int size();

	public abstract Iterator<T> iterator();

	public abstract String toString();

	@SuppressWarnings("hiding")
	public abstract <T> T[] toArray(T[] heapArray);

	@Override
	public abstract T element();

	@Override
	public abstract Object[] toArray();

	@Override
	public abstract T peek();

	@Override
	public abstract boolean isEmpty();

	@Override
	public abstract boolean contains(Object arg0);

	// involves removal not implemented
	@Override
	public T poll() {
		return null;
	}

	@Override
	public T remove() {
		return null;
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return false;
	}

	@Override
	public boolean remove(Object arg0) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		return false;
	}

	@Override
	public boolean offer(T e) {
		return false;
	}

}
