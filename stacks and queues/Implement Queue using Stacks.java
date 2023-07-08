//https://leetcode.com/problems/implement-queue-using-stacks/
class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if(st1.size() == 0) return -1;
        while(!st1.isEmpty()) st2.push(st1.pop());
        int last = st2.pop();
        while(!st2.isEmpty()) st1.push(st2.pop());
        return last;
    }
    
    public int peek() {
        if(st1.size() == 0) return -1;
        while(!st1.isEmpty()) st2.push(st1.pop());
        int last = st2.peek();
        while(!st2.isEmpty()) st1.push(st2.pop());
        return last;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}