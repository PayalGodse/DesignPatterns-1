package heap;

import java.util.Iterator;

public abstract class Heap<T> {

	public abstract boolean add(T data);

	public abstract int size();

	public abstract Iterator<T> iterator();

	public abstract String toString();

	
	public abstract <T> T[] toArray(T[] heapArray);

	
	public abstract T element();

	
	public abstract Object[] toArray();

	
	public abstract T peek();

	
	public abstract boolean isEmpty();

	public abstract boolean contains(Object object) ;
		
}
