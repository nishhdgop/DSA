//Not TC efficient

class MinStack {
    ArrayList<Integer> al;
    public MinStack() {
        al = new ArrayList<>();
    }
    
    public void push(int val) {
        al.add(0,val);
    }
    
    public void pop() {
        if(!al.isEmpty()){
         al.remove(0);
        }
    }
    
    public int top() {
        if(!al.isEmpty()){
            return al.get(0);
        }
        return 0;
    }
    
    public int getMin() {
        return Collections.min(al);
    }
}

