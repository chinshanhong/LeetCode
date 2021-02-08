// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

//Credits goes to Vivek Sharma
class PeekingIterator implements Iterator<Integer> {
    
        private Iterator<Integer> itr;
        private Integer next;
        private boolean isDone;
    
	public PeekingIterator(Iterator<Integer> iterator) {
        itr = iterator;
        if(itr.hasNext()){
            next = itr.next();
            isDone = false;
        }
        else{
            next = null;
            isDone = true;
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int val= next;
        //here we will get the next item from iterator
	    if(itr.hasNext()){
            next = itr.next();
            isDone = false;
        }
        else{
            next = null;
            isDone = true;
        }
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return !isDone;
	}
}
