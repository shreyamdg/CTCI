package stacksandQueues;

import java.util.EmptyStackException;

public class FixedMultiStack {
	private int numberOfStacks = 3;
	private int stackCapacity;
	private int[] values;
	private int[] sizes;
	
	public FixedMultiStack(int stackSize) {
		stackCapacity = stackSize;
		values = new int [numberOfStacks * stackSize];
		sizes = new int [numberOfStacks];
	}
	
	public void push(int stackNum, int value) throws FullStackException {
		/* Check that we have space for the next element */
		if (isFull(stackNum)) { 
			throw new FullStackException();
		}
		
		/* Increment stack pointer and then update top value. */		
		sizes[stackNum]++;
		values[indexOfTop(stackNum)] = value;	
	}
	
	public int pop(int stackNum) {
		if (isEmpty(stackNum)) {
			throw new EmptyStackException();
		}
		
		int topIndex = indexOfTop(stackNum);
		int value = values[topIndex]; // Get top
		values[topIndex] = 0; // Clear 
		sizes[stackNum]--; // Shrink
		return value;
	}
	
	public int peek(int stackNum) {
		if (isEmpty(stackNum)) {
			throw new EmptyStackException();
		}		
		return values[indexOfTop(stackNum)];
	}
	
	public boolean isEmpty(int stackNum) {
		return sizes[stackNum] == 0;
	}
	
	public boolean isFull(int stackNum) {
		return sizes[stackNum] == stackCapacity;
	}
	
	private int indexOfTop(int stackNum) {
		int offset = stackNum * stackCapacity;
		int size = sizes[stackNum];
		return offset + size - 1;
	}

}
