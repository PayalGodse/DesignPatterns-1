package test;

import static org.junit.Assert.assertEquals;
import heap.Heap;
import heap.IngFilter;
import heap.MaxHeap;
import heap.MinHeap;

import java.util.Iterator;

import org.junit.Test;

public class TestFilter {

	/* Test cases for IngFilter next(), hasNext(), toString() */
	@Test
	public void testMinHeap() {

		Heap<String> heapObject = new MinHeap<>();

		heapObject.add("mango");
		heapObject.add("eating");
		heapObject.add("juice");
		heapObject.add("drinking");
		heapObject.add("studying");
		heapObject.add("having");
		heapObject.add("fun");
		heapObject.size();

		String actualResult = "";
		Iterator<String> iterate = heapObject.iterator();
		IngFilter<String> ingFilter = new IngFilter<>(iterate);
		while (ingFilter.hasNext()) {
			String data = ingFilter.next().toString();
			actualResult = actualResult + " " + data;

		}

		String expectedResult = " drinking eating having studying";
		assertEquals("Preorder ingFilter Minheap", expectedResult, actualResult);
	}

	@Test
	public void testMaxHeap() {

		Heap<String> heapObject = new MaxHeap<>();

		heapObject.add("mango");
		heapObject.add("eating");
		heapObject.add("juice");
		heapObject.add("drinking");
		heapObject.add("studying");
		heapObject.add("having");
		heapObject.add("fun");
		heapObject.size();

		String actualResult = "";
		Iterator<String> iterate = heapObject.iterator();
		IngFilter<String> ingFilter = new IngFilter<>(iterate);
		while (ingFilter.hasNext()) {
			String data = ingFilter.next().toString();
			actualResult = actualResult + " " + data;

		}
		String expectedResult = " studying having drinking eating";
		assertEquals("Preorder ingFilter Maxheap", expectedResult, actualResult);

	}
}
