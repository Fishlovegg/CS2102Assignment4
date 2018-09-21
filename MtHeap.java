class MtHeap extends MtBT implements IHeap {
	MtHeap(){}

	@Override
	// Since a MtHeap is empty, it does not have the element
	public boolean hasElt(int e) {
		return false;
	}

	@Override
	// A MtHeap has a size of 0
	public int size() {
		return 0;
	}

	@Override
	// A MtHeap has a height of 0
	public int height() {
		return 0;
	}

	@Override
	// If you add an element to a MtHeap, you create a new DataHeap
	public IHeap addElt(int e) {
		return new DataHeap(e, new MtHeap(), new MtHeap());
	}

	@Override
	// The min element of an empty heap returns an empty heap.
	public IHeap remMinElt() {
		return new MtHeap();
	}

	@Override
	// An empty heap should always lose a competition for which root is smaller (for the merge function)
	public boolean isBigger(int e) {
		return true;
	}

	@Override
	// An empty heap merged with another heap is the other heap (identity).
	public IHeap merge(IHeap withHeap) {
		return withHeap;
	}
	
	public boolean isHeap(){
		return true;
	}
}