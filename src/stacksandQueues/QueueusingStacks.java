package stacksandQueues;

class QueueusingStacks {
    Stack<Integer> newStack, oldStack;
    /** Initialize your data structure here. */
    public QueueusingStacks() {
        newStack = new Stack<Integer>();
        oldStack = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        newStack.push(x);
    }
    
    public void shiftStacks(){
        if(oldStack.isEmpty()){
            while(!newStack.isEmpty()){
                oldStack.push(newStack.pop());
            }
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        shiftStacks();
        return oldStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        shiftStacks();
        return oldStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        shiftStacks();
        return oldStack.isEmpty();
    }
}