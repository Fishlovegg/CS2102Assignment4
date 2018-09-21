import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {
	
	HeapTester heapTester = new HeapTester();
	IHeap HeapEmpty = new MtHeap();

	IHeap Heap2 = new DataHeap(2, HeapEmpty, HeapEmpty);
	IHeap Heap5 = new DataHeap(5, HeapEmpty, HeapEmpty);
	IHeap Heap6 = new DataHeap(6, HeapEmpty, HeapEmpty);
	IHeap Heap7 = new DataHeap(7, HeapEmpty, HeapEmpty);
	IHeap Heap8 = new DataHeap(8, HeapEmpty, HeapEmpty);
	IHeap Heap9 = new DataHeap(9, HeapEmpty, HeapEmpty);
	IHeap Heap27 = new DataHeap(27, HeapEmpty, HeapEmpty);
	
	IHeap Heap1Duplicate2 = new DataHeap (1, Heap7,  Heap8);
	IHeap Heap3 = new DataHeap(3, Heap7, Heap8);
	IHeap Heap4 = new DataHeap(4, Heap9, Heap5);
	IHeap Heap1Duplicate = new DataHeap (1, Heap1Duplicate2, Heap4);
	
	IHeap Heap1 = new DataHeap(1, Heap3, Heap4);
	
	IHeap Heap7swap = new DataHeap(7, Heap27, HeapEmpty);
	IHeap Heap3swap = new DataHeap(3, Heap7swap, Heap8);
	IHeap Heap1swap = new DataHeap(1, Heap4, Heap3swap);
	
	IHeap Heap3sub = new DataHeap(3, Heap7, Heap8);
	IHeap Heap1sub = new DataHeap(1, Heap4, Heap3sub);
	
	//tests adding an element that belongs at the end of the tree
	@Test
	void testAddElt(){
		assertEquals(heapTester.addEltTester(Heap1, 27, Heap1.addElt(27)), true);
	}
	
	//tests same heap but different order, point being that order does not matter
	@Test
	void testAddElt2(){
		assertEquals(heapTester.addEltTester(Heap1, 27 , Heap1swap), true);
	}
	
	//tests adding a value that belongs at the top of the heap
		@Test
		void testAddElt3(){
			assertEquals(heapTester.addEltTester(Heap1, 2, Heap1.addElt(2)), true);
		}

	//tests error case
		@Test
		void testAddElt4(){
			assertEquals(heapTester.addEltTester(Heap1, 8, Heap1swap), false);
		}
		
	//tests adding a duplicate element
	@Test
	void testAddElt5(){
		assertEquals(heapTester.addEltTester(Heap1, 9, Heap1.addElt(9)), true);
	}
	
	//tests adding to an empty heap
	@Test
	void testAddElt6(){
		assertEquals(heapTester.addEltTester(HeapEmpty, 9, HeapEmpty.addElt(9)), true);
	}
	
	//tests subtracting an element
	@Test
	void testRemMinElt7(){
		assertEquals(heapTester.remMinEltTester(Heap1, Heap1.remMinElt()), true);
	}
	
	//tests same heap but different order, point being that order does not matter
	@Test
	void testRemMinElt8(){
		assertEquals(heapTester.remMinEltTester(Heap1, Heap1sub.remMinElt()), true);
	}
	
	//tests removing duplicate elements
	@Test
	void testRemMinElt9(){
		assertEquals (heapTester.remMinEltTester(Heap1Duplicate, Heap1Duplicate.remMinElt()), true);
	}
	
	//tests removing from an empty heap
	@Test
	void testRemMinElt10(){
		assertEquals(heapTester.remMinEltTester(HeapEmpty, HeapEmpty.remMinElt()), true);
	}
	
	//tests error case
	@Test
	void testRemMinElt11(){
		assertEquals(heapTester.remMinEltTester(Heap1, Heap1), false);
	}
}