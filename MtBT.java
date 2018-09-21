import java.util.LinkedList;

class MtBT implements IBinTree {
	MtBT(){}

	// returns false since empty tree has no elements
	public boolean hasElt(int e) {
		return false;
	}

	// returns 0 since empty tree has no elements
	public int size() {
		return 0;
	}

	// returns 0 since empty tree has no branches
	public int height() {
		return 0;
	}
	
	// returns empty linked list because there are no elements
	public LinkedList<Integer> getTreeList(){
		return new LinkedList<Integer>();
	}
}
