package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import heap.Heap;
import heap.HeapAlgorithm;
import heap.MaxHeap;
import heap.MinHeap;

import org.junit.Test;

public class TestStrategy {

	/* Test cases for testing strategy pattern */
	@Test
	public void testMinHeap() {

		Heap<String> heapInterface = new MinHeap<>();
		HeapAlgorithm<String> heapObject = new HeapAlgorithm<String>(
				heapInterface);

		heapObject.add("mango");
		heapObject.add("eating");
		heapObject.add("juice");
		heapObject.add("drinking");
		heapObject.add("studying");
		heapObject.add("having");
		heapObject.add("fun");
		int actualSize = heapObject.size();
		int size = 7;

		String actualResult = heapObject.toString();
		String expectedResult = " drinking eating fun mango having juice studying";
		assertEquals("Preorder", expectedResult, actualResult);
		assertEquals("Size",size , actualSize);

		String[] actualArray = new String[7];
		actualArray = heapObject.toArray(actualArray);
		String[] expectedArray = { "drinking", "eating", "fun", "mango",
				"having", "juice", "studying" };
		assertArrayEquals("toArray()  Minheap", expectedArray, actualArray);

	}

	@Test
	public void testMaxHeap() {

		Heap<String> heapInterface = new MaxHeap<>();
		HeapAlgorithm<String> heapObject = new HeapAlgorithm<String>(
				heapInterface);

		heapObject.add("mango");
		heapObject.add("eating");
		heapObject.add("juice");
		heapObject.add("drinking");
		heapObject.add("studying");
		heapObject.add("having");
		heapObject.add("fun");
		heapObject.size();

		String actualResult = heapObject.toString();
		String expectedResult = " studying having fun drinking eating mango juice";
		assertEquals("Preorder", expectedResult, actualResult);

		String[] actualArray = new String[7];
		actualArray = heapObject.toArray(actualArray);
		String[] expectedArray = { "studying", "having", "fun", "drinking",
				"eating", "mango", "juice" };
		assertArrayEquals("toArray() Maxheap", expectedArray, actualArray);
	}

}
