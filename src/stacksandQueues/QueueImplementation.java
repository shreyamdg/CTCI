package stacksandQueues;

import java.util.NoSuchElementException;

public class QueueImplementation<T> {
	private static class QueueNode<T> {
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data) {
			this.data = data;
		}
	}
	
	private QueueNode<T> first;
	private QueueNode<T> last;

	public void add(T item) {
		QueueNode<T> newData = new QueueNode<T>(item);
		if(last != null) {
			last.next = newData;
		}
		last = newData;
		if(first == null) {
			first = last;
		}
	}
	
	public T remove() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		T item = first.data;
		first = first.next;
		if(first == null) {
			last = null;
		}
		return item;
	}
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}