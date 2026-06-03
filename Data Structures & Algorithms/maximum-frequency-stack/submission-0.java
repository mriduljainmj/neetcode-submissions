class FreqStack {
    private HashMap<Integer,Integer> cntMap;
    private HashMap<Integer, Stack<Integer>> stacksMap;
    private int maxCnt;

    public FreqStack() {
        cntMap = new HashMap<>();
        stacksMap  = new HashMap<>();
        maxCnt = 0;
    }
    
    public void push(int val) {
        int valCount = cntMap.getOrDefault(val,0) + 1;
        cntMap.put(val, valCount);
        if(valCount > maxCnt){
            maxCnt = valCount;
            stacksMap.putIfAbsent(valCount, new Stack<>());
        }
        stacksMap.get(valCount).push(val);
    }
    
    public int pop() { 
        int val = stacksMap.get(maxCnt).pop();
        cntMap.put(val, cntMap.get(val)-1 );
        if(stacksMap.get(maxCnt).isEmpty()){
            maxCnt--;
        }
        return val;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */