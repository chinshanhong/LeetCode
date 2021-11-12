class FrontMiddleBackQueue {
    LinkedList<Integer> list;
    
    public FrontMiddleBackQueue() {
        list = new LinkedList<>();
    }
    
    public void pushFront(int val) {
        list.addFirst(val);
    }
    
    public void pushMiddle(int val) {
        list.add(list.size() / 2, val);
    }
    
    public void pushBack(int val) {
        list.addLast(val);
    }
    
    public int popFront() {
        if(!list.isEmpty()){
            return list.removeFirst();
        }
        else{
            return -1;
        }
    }
    
    public int popMiddle() {
        if(!list.isEmpty()){
            if(list.size() % 2 == 0){
                return list.remove(list.size() / 2 - 1);
            }
            else{
                return list.remove(list.size() / 2);
            }
        }
        else{
            return -1;
        }
    }
    
    public int popBack() {
        if(!list.isEmpty()){
            return list.removeLast();
        }
        else{
            return -1;
        }
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
