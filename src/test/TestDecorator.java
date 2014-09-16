	package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import heap.Heap;
import heap.IngHeapDecorator;
import heap.MaxHeap;
import heap.MinHeap;

import org.junit.Test;

public class TestDecorator {
	/* test cases for decorator pattern (ing) */
	@Test
	public void testMinHeap() {

		Heap<String> heapObject = new MinHeap<>();

		IngHeapDecorator<String> decorator = new IngHeapDecorator<String>(heapObject);

		decorator.add("mango");
		decorator.add("eating");
		decorator.add("juice");
		decorator.add("drinking");
		decorator.add("studying");
		decorator.add("having");
		decorator.add("fun");
		
		String actualResult = decorator.toString();
		String expectedResult = " drinking eating having studying";
		assertEquals("Preorder", expectedResult, actualResult);
		
		int actualSize = decorator.size();
		int size = 4;
		assertEquals("Size",size , actualSize);

		String[] actualArray = new String[4];
		actualArray = decorator.toArray(actualArray);
		String[] expectedArray = { "drinking", "eating", "having", "studying" };
		assertArrayEquals("toArray() Decorator Minheap", expectedArray,
				actualArray);
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

		IngHeapDecorator<String> decorator = new IngHeapDecorator<String>(heapObject);
		String actualResult = decorator.toString();
		String expectedResult = " studying having drinking eating";
		assertEquals("Preorder", expectedResult, actualResult);

		String[] actualArray = new String[4];
		actualArray = decorator.toArray(actualArray);
		String[] expectedArray = { "studying", "having", "drinking", "eating" };
		assertArrayEquals("toArray() Decorator Maxheap", expectedArray,
				actualArray);
	}

}
