package test;

import static org.junit.Assert.assertEquals;
import heap.Heap;
import heap.MinHeap;

import org.junit.Before;
import org.junit.Test;

public class TestAddingElements {

	Heap<String> object;

	@Before
	public void createHeap() {
		object = new MinHeap<String>();
		object.add("mango");
		object.add("eating");
		object.add("juice");
		object.add("drinking");
		object.add("studying");
		object.add("having");
	}

	@Test
	public void testAdd() {
		String actualResult = object.toString();
		String expectedResult = " drinking eating mango having juice studying";
		assertEquals("Preorder", expectedResult, actualResult);
 
		/* Adding elements to heap*/
		
		object.add("fun");
		actualResult = object.toString();
		expectedResult = " drinking eating fun mango having juice studying";
		assertEquals("Preorder", expectedResult, actualResult);
		
		String data = "mang";
		assertEquals(false, object.contains(data));
		
		data = "mango";
		assertEquals(true, object.contains(data));
		}
	
	@Test
	public void testToString(){
		/* One more input */
		MinHeap<String> heapObject = new MinHeap<String>();
		for (char c = 'z'; c >= 'a'; c--) {

			String nodeData = c + "";
			heapObject.add(nodeData);
		}

		String actualResult = heapObject.toString();
		String expectedResult = " a b i j k z r q v h p x l u c d e f y o n t g m w s";
		assertEquals("Preorder", expectedResult, actualResult);

		/* Adding no elements to heap */
		MinHeap<String> heap = new MinHeap<String>();
		actualResult = heap.toString();
		assertEquals("Preorder", "", actualResult);
	}
	
}
 