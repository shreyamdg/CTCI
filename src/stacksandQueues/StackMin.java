package stacksandQueues;

public class StackMin extends Stack<NodeWithMin> {
	public void push(int value) {
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}

	public int min() {
		if (this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}
	}
}

class NodeWithMin {
	public int value;
	public int min;

	NodeWithMin(int value, int min) {
		this.value = value;
		this.min = min;
	}
}