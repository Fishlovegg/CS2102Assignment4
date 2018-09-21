import java.util.LinkedList;

public class HeapTester {
	//consumes a heap, an integer, and a binary tree and returns true if the binary tree is a valid result
	//of adding the given integer to the first Heap.
		boolean addEltTester(IHeap Heap, int elt, IBinTree Tree){
			
			LinkedList<Integer> treeResult = Tree.getTreeList();
			LinkedList<Integer> newHeapList = Heap.getTreeList();
			
			newHeapList.add(elt);
			newHeapList.sort(null);
			treeResult.sort(null);
			
			return ((treeResult.equals(newHeapList)) && Heap.isHeap());
		}
		
		
	//consumes a heap, an integer, and a binary tree and returns true if the binary tree is a valid result
	//of removing the minimum integer of the first Heap.
		boolean remMinEltTester(IHeap Heap, IBinTree Tree){
			LinkedList<Integer> treeResult2 = Tree.getTreeList();
			LinkedList<Integer> newHeapList2 = Heap.getTreeList();
			
			newHeapList2.sort(null);
			
			if (newHeapList2.size() > 0) {
				newHeapList2.remove(0);
			}
			
			treeResult2.sort(null);
			
			
			return ((treeResult2.equals(newHeapList2)) && Heap.isHeap());
		}
}

///How to test that answer returned is a valid answer?
//1. Is it a heap?
//2. Does the result contain all the elements from the original heap (the same number of occurrences)?
//3.The new element has been added
//4. No element in the result that weren't in the original


