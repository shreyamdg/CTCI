package stacksandQueues;

public class StackMin2 extends Stack<Integer> {
	Stack<Integer> mins;

	public StackMin2() {
		mins = new Stack<Integer>();
	}

	public void push(int value) {
		if (value <= min()) {
			mins.push(value);
		}
		super.push(value);
	}

	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			mins.pop();
		}
		return value;
	}

	public int min() {
		if (mins.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return mins.peek();
		}
	}
}
