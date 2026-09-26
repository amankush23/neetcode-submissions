class MinStack {

    private List<Integer> ll;
    private int size;
    public MinStack() {
        ll= new ArrayList<>();
        size =0;
    }
    
    public void push(int val) {
        ll.add(val);
        size++;
    }
    
    public void pop() {
        if(!ll.isEmpty()){
            ll.remove(ll.size()-1);
            size--;
        }
    }
    
    public int top() {
        if (!ll.isEmpty()) {
            return ll.get(ll.size() - 1);
        }
        throw new EmptyStackException();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i : ll){
            min = Math.min(i, min);
        }
        return min;
    }
}
